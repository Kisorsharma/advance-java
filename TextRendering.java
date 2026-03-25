import javax.swing.*;
import java.awt.*;

public class TextRendering extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Font(name, style, size)
        g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 40));
        g.setColor(Color.BLUE);

        g.drawString("Prithvi Narayan Campus", 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Text Rendering");
        f.add(new TextRendering());
        f.setSize(500, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
