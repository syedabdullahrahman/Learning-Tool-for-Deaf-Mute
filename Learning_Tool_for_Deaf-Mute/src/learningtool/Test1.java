package learningtool;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test1 extends JPanel {

    JButton goback, easy, hard, medium;
    JLabel menu;
    ImageIcon img;

    public Test1() {
        super(new FlowLayout());

        /*Initialize Components*/
        easy = new JButton("Easy");
        medium = new JButton("Medium");
        hard = new JButton("Hard");
        goback = new JButton("Go Back");

        img = new ImageIcon("revision.png");
        menu = new JLabel();
        menu.setIcon(img);
        menu.setOpaque(true);
        menu.setBounds(0, 0, 600,500);

        goback.setBounds(50, 100, 95, 30);

        easy.setBounds(200, 100, 200, 50);
        easy.setBackground(Color.red.darker());
        easy.setFont(new Font("Monospaced", Font.BOLD, 20));
        easy.setForeground(Color.white);
        easy.setBorderPainted(false);
        easy.setOpaque(true);

        medium.setBounds(200, 100, 200, 50);
        medium.setBackground(Color.red.darker());
        medium.setFont(new Font("Monospaced", Font.BOLD, 20));
        medium.setForeground(Color.white);
        medium.setBorderPainted(false);
        medium.setOpaque(true);

        hard.setBounds(200, 200, 200, 50);
        hard.setBackground(Color.red.darker());
        hard.setFont(new Font("Monospaced", Font.BOLD, 20));
        hard.setForeground(Color.white);
        hard.setBorderPainted(false);
        hard.setOpaque(true);

        /*Adding Components*/
        add(goback, BorderLayout.NORTH);
        add(easy);
        add(medium);
        add(hard);
        add(menu);

        /* Setting Layout JPanel*/
        //setLayout(null);
        setLocation(0, 0);
        setVisible(true);
        setSize(600, 500);
        setBackground(Color.pink);

        easy.addActionListener((ActionEvent ae) -> {
            LearningTool.main.testJPanel = new Test();
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.test1JPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.testJPanel);
            LearningTool.main.testJPanel.setVisible(true);
        });

        medium.addActionListener((ActionEvent ae) -> {

            LearningTool.main.mediumJPanel = new Medium(0,0);
            LearningTool.main.test1JPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.mediumJPanel);
            LearningTool.main.mediumJPanel.setVisible(true);
        });

        hard.addActionListener((ActionEvent ae) -> {
            LearningTool.main.hardJPanel = new Hard(100, 0,0);
            LearningTool.main.test1JPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.hardJPanel);
            LearningTool.main.hardJPanel.setVisible(true);
        });

        goback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LearningTool.main.test1JPanel.setVisible(false);
                LearningTool.main.jf.setContentPane(LearningTool.main.mainJPanel);
                LearningTool.main.mainJPanel.setVisible(true);
            }
        });
    }

}
