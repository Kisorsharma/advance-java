import javax.swing.*;
import java.awt.*;

public class LayoutManagerDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout(5, 5));

        frame.add(new JButton("NORTH"),  BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"),  BorderLayout.SOUTH);
        frame.add(new JButton("EAST"),   BorderLayout.EAST);
        frame.add(new JButton("WEST"),   BorderLayout.WEST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
