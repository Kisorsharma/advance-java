import javax.swing.*;
import java.awt.*;

public class ShapeDrawingDrawing extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.RED);
        g.drawLine(50, 50, 350, 50);

        g.setColor(Color.BLUE);
        g.drawRect(50, 100, 150, 100);

        g.setColor(Color.GREEN);
        g.drawOval(250, 100, 150, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new ShapeDrawingDrawing());
        f.setSize(450, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
