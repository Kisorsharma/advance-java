import javax.sql.rowset.*;

public class RowSetExample {
    public static void main(String[] args) {
        try {
            // Registering MySQL Driver explicitly
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Create a JdbcRowSet object
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

            // Setting connection details
            rowSet.setUrl("jdbc:mysql://localhost:3306/college_db");
            rowSet.setUsername("root");
            rowSet.setPassword("password");

            // Setting query and executing
            rowSet.setCommand("SELECT * FROM students");
            rowSet.execute();

            // Iterating through the RowSet
            System.out.println("ID\tName\tRoll\tGrade");
            while (rowSet.next()) {
                System.out.print(rowSet.getInt("id") + "\t");
                System.out.print(rowSet.getString("name") + "\t");
                System.out.print(rowSet.getInt("roll_no") + "\t");
                System.out.println(rowSet.getString("grade"));
            }

            rowSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
