import javax.swing.JOptionPane;

public class AdditionDialog {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Enter first number:");
        String n2 = JOptionPane.showInputDialog("Enter second number:");

        if (n1 != null && n2 != null) {
            try {
                double v1 = Double.parseDouble(n1);
                double v2 = Double.parseDouble(n2);
                double sum = v1 + v2;
                JOptionPane.showMessageDialog(null, "The sum is: " + sum);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter numbers.");
            }
        }
    }
}
