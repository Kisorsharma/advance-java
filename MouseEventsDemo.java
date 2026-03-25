import javax.swing.*;
import java.awt.event.*;

public class MouseEventsDemo extends JFrame {

    public MouseEventsDemo() {
        setTitle("Mouse Events");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("Interact with the window", SwingConstants.CENTER);
        add(label);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e)  { label.setText("Clicked at: " + e.getX() + ", " + e.getY()); }
            public void mousePressed(MouseEvent e)  { label.setText("Pressed"); }
            public void mouseReleased(MouseEvent e) { label.setText("Released"); }
            public void mouseEntered(MouseEvent e)  { label.setText("Mouse Entered"); }
            public void mouseExited(MouseEvent e)   { label.setText("Mouse Exited"); }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e)   { label.setText("Moved: " + e.getX() + ", " + e.getY()); }
            public void mouseDragged(MouseEvent e) { label.setText("Dragged: " + e.getX() + ", " + e.getY()); }
        });

        setVisible(true);
    }

    public static void main(String[] args) { new MouseEventsDemo(); }
}
