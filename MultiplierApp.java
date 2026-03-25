import javax.swing.*;
import java.awt.*;

public class MultiplierApp extends JFrame {
    public MultiplierApp() {
        setTitle("Multiplication Program");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        JButton multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(num1Field.getText());
                double n2 = Double.parseDouble(num2Field.getText());
                resultField.setText(String.valueOf(n1 * n2));
            } catch (Exception ex) {
                resultField.setText("Invalid Input");
            }
        });

        add(new JLabel("  Enter Number 1:")); add(num1Field);
        add(new JLabel("  Enter Number 2:")); add(num2Field);
        add(new JLabel("  Result:")); add(resultField);
        add(new JLabel("")); add(multiplyButton);

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new MultiplierApp().setVisible(true);
    }
}

