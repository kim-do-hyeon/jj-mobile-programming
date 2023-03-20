package week3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionEventPractice_1 extends JFrame {
    private JButton button1;
    private JButton button2;
    private JPanel panel;
    
    public ActionEventPractice_1() {
        panel = new JPanel();
        button1 = new JButton("Yellow");
        button2 = new JButton("Pink");
        
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.yellow);
            }
        });
        
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.pink);
            }
        });
    
    	panel.add(button1);
        panel.add(button2);
    	add(panel);
        setSize(500, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new ActionEventPractice_1();
    }
}
