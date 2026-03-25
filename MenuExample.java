import javax.swing.*;

public class MenuExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu Example");
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        
        menu.add(new JMenuItem("Item 1"));
        menu.add(new JMenuItem("Item 2"));
        
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(200, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
