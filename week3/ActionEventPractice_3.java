package week3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionEventPractice_3 extends JFrame {
    int img_x = 150, img_y = 150;
    JButton button;
    
    public ActionEventPractice_3() {
        setSize(600, 300);
        button = new JButton("");
        ImageIcon icon = new ImageIcon("/Users/pental/Desktop/jj-mobile-programming/week3/car.png");
        button.setIcon(icon);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        button.setLocation(img_x, img_y);
        button.setSize(200, 100);
        
        panel.add(button);
        panel.requestFocus();
        
        panel.setFocusable(true);
        panel.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode();
                switch(keycode) {
                    case KeyEvent.VK_UP: img_y -= 10; break;
                    case KeyEvent.VK_DOWN: img_y += 10; break;
                    case KeyEvent.VK_LEFT: img_x -= 10; break;
                    case KeyEvent.VK_RIGHT: img_x += 10; break;
                }
                button.setLocation(img_x, img_y);
            }
            public void keyReleased(KeyEvent arg0) { }
            public void keyTyped(KeyEvent arg0) { }
        });
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new ActionEventPractice_3();
    }
}