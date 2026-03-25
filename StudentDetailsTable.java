import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;

public class StudentDetailsTable extends JFrame {
    private JTable studentTable;
    private DefaultTableModel model;

    public StudentDetailsTable() {
        setTitle("Student Details");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Columns: ID, Name, Roll, Grade
        String[] columns = {"ID", "Name", "Roll", "Grade"};
        model = new DefaultTableModel(columns, 0);
        studentTable = new JTable(model);
        add(new JScrollPane(studentTable));

        loadStudentData();
    }

    private void loadStudentData() {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/college_db";
        String user = "root";
        String password = "password";

        try {
            // Registering MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // Adding rows from ResultSet to Table Model
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(rs.getInt("id"));
                row.add(rs.getString("name"));
                row.add(rs.getInt("roll_no"));
                row.add(rs.getString("grade"));
                model.addRow(row);
            }

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentDetailsTable().setVisible(true));
    }
}
