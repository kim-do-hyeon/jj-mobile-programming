package week3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ActionEventPractice_2 extends JFrame implements ActionListener { 
    final int SCISSOR = 0;
    final int ROCK = 1;
    final int PAPER = 2;
    private JPanel panel;
    private JLabel output, information;
    private JButton rock, paper, scissor;
    public ActionEventPractice_2() {
        setSize(400, 150);
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(0, 3));
        
        information = new JLabel("아래의 버튼 중 하나를 선택하세요.");
        output = new JLabel("");
        
        scissor = new JButton("0: 가위");
        rock = new JButton("1: 바위");
        paper = new JButton("2: 보");
        
        scissor.addActionListener(this);
        rock.addActionListener(this);
        paper.addActionListener(this);
        
        panel.add(scissor);
        panel.add(rock);
        panel.add(paper);
        
        add(information, "North");
        add(panel, "Center");
        add(output, "South");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        int user = Integer.parseInt(""+b.getText().charAt(0));
        Random random = new Random();
        int computer = random.nextInt(3);
        
        if(user == computer)
            output.setText("비김");
        else if(user == (computer + 1) % 3)
            output.setText("인간: " + user + " 컴퓨터: " + computer + " 인간 승리");
        else
            output.setText("인간: " + user + " 컴퓨터: " + computer + " 컴퓨터 승리");
    }
    
    public static void main(String[] args) {
        new ActionEventPractice_2();
    }
}