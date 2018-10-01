/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtool;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HardMatch extends JPanel {

    JButton next, quit;
    JLabel l;
    String result;
    int a, b, failed;

    public HardMatch(String result, int num, int scr, int failed) {
        super(new BorderLayout());
        this.result = result;
        this.failed = failed;

        /*Initialize Components*/
        
        a = num;
        next = new JButton("Next");
        quit = new JButton("Quit");
        l = new JLabel(result);

        if (result == "Matched!") {
            b = scr + 1;
        } else {
            b = scr;
        }

        l.setBounds(200, 100, 300, 500);
        l.setSize(300, 100);
        l.setFont(new Font("Monospaced", Font.BOLD, 30));

        next.setBounds(200, 300, 200, 50);
        next.setBackground(Color.red.darker());
        next.setFont(new Font("Monospaced", Font.BOLD, 20));
        next.setForeground(Color.white);
        next.setBorderPainted(false);
        next.setOpaque(true);

        quit.setBounds(200, 400, 200, 50);
        quit.setBackground(Color.red.darker());
        quit.setFont(new Font("Monospaced", Font.BOLD, 20));
        quit.setForeground(Color.white);
        quit.setBorderPainted(false);
        quit.setOpaque(true);
        /* Setting Layout JPanel*/
        setLayout(null);
        setLocation(0, 0);
        setVisible(true);
        setSize(600, 500);
        setBackground(Color.pink.brighter());

        /*Adding Components*/
        add(l, BorderLayout.NORTH);
        add(next);
        add(quit);

        quit.addActionListener((ActionEvent ae) -> {
            LearningTool.main.scoreJPanel = new Score(b);
            LearningTool.main.hardMJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.scoreJPanel);
            LearningTool.main.scoreJPanel.setVisible(true);
        });

        next.addActionListener((ActionEvent ae) -> {

            if (this.failed > 3) {
                JOptionPane.showMessageDialog(this,"3 times Failed. Try Again....","Alert",JOptionPane.WARNING_MESSAGE);     
                LearningTool.main.scoreJPanel = new Score(b);
                LearningTool.main.test1JPanel.setVisible(false);
                LearningTool.main.jf.setContentPane(LearningTool.main.testJPanel);
                LearningTool.main.testJPanel.setVisible(true);
            }
            else
            {
                LearningTool.main.hardJPanel = new Hard(a, b, failed);
                LearningTool.main.hardMJPanel.setVisible(false);
                LearningTool.main.jf.setContentPane(LearningTool.main.hardJPanel);
                LearningTool.main.hardJPanel.setVisible(true);
            }

            
        });

    }

}
