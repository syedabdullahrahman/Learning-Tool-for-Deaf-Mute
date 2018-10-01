package learningtool;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Match extends JPanel {
    JButton goback,mb;
    String letter;
    ImageIcon img;
    JLabel menu1,menu2,menu3;
    

    public Match(String letter){
        super(new BorderLayout());
        
         /*Initialize Components*/
        
        
        goback = new JButton("Go Back");
        goback.setBounds(50, 50, 50, 50);
        mb = new JButton("Match");
        mb.setBounds(50, 50, 5, 50);
        
        this.letter = letter;
        img = new ImageIcon(new ImageIcon(letter+".png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        menu3 = new JLabel("",SwingConstants.CENTER);
        menu3.setIcon(img);
        menu3.setOpaque(true);
        menu3.setBounds(100, 100, 300, 300);
        menu3.setBorder(new EmptyBorder(25,0,0,0));
        
        img = new ImageIcon(new ImageIcon(letter+"1.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        //img = new ImageIcon(letter+"1.jpg");
        menu1 = new JLabel("");
        menu1.setIcon(img);
        menu1.setOpaque(true);
        menu1.setBounds(0, 0, 300, 300);
        menu1.setBorder(new EmptyBorder(0,50,0,0));
        
        img = new ImageIcon(new ImageIcon(letter+"2.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        menu2 = new JLabel("");
        menu2.setIcon(img);
        menu2.setOpaque(true);
        menu2.setBounds(0, 0, 300, 300);
        menu2.setBorder(new EmptyBorder(0,0,0,50));
        
        goback.setBackground(Color.RED);
        mb.setBackground(Color.RED);
        menu1.setBackground(Color.ORANGE);
        menu2.setBackground(Color.ORANGE);
        menu3.setBackground(Color.ORANGE);
        setBackground(Color.ORANGE);
        
        
        /*Adding Components*/
        add(goback,BorderLayout.SOUTH);
        add(menu1,BorderLayout.WEST);
        add(menu2,BorderLayout.EAST);
        add(menu3,BorderLayout.NORTH);
        add(mb,BorderLayout.SOUTH);
        
        /* Setting Layout JPanel*/
        //setLayout(null);
        setLocation(0,0);
        setVisible(true);
        setSize(600, 500);
        
        mb.addActionListener((ActionEvent ae) -> {
            mb.setBackground(Color.red);
            mb.setText("Match");
            PortReader pr = new PortReader("COM3");
            matchSign(pr);
        });
        
        goback.addActionListener((ActionEvent e) -> {
            LearningTool.main.matchJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.learnJPanel);
            LearningTool.main.learnJPanel.setVisible(true);
        });
    }
    
    public void matchSign(PortReader pr){
        boolean matched = false; 
        int count = 0;
        while(matched==false && count<10){
                pr.readPort();
                 if (pr.thumb>=70 && pr.thumb<=170 && pr.index>=100 && pr.index<=180 && pr.middle>=167 && pr.middle<=197 && pr.ring>=119 && pr.ring<=160 && pr.little>=97 && pr.little<=200 && letter.equals("shoreo")){
                    //System.out.println("ooooo");
                    matched = true;
                }
                if (pr.thumb>=25 && pr.thumb<=70 && pr.index>=23 && pr.index<=53 && pr.middle>=33 && pr.middle<=63 && pr.ring>=25 && pr.ring<=55 && pr.little>=46 && pr.little<=86 && letter.equals("shorea"))
                    //System.out.println("aaaaa");
                    matched = true;
                if (pr.thumb>=40 && pr.thumb<=200 && pr.index>=120 && pr.index<=160 && pr.middle>=200 && pr.middle<=243 && pr.ring>=200 && pr.ring<=243 && pr.little>=200 && pr.little<=240  && letter.equals("shorte"))
                    //System.out.println("eeeee");
                    matched = true;
                if (pr.thumb>=40 && pr.thumb<=200 && pr.index>=120 && pr.index<=160 && pr.middle>=200 && pr.middle<=243 && pr.ring>=200 && pr.ring<=243 && pr.little>=200 && pr.little<=240  && letter.equals("longe"))
                    matched = true;
                    //System.out.println("eeeee");
                if (pr.thumb>=40 && pr.thumb<=150 && pr.index>=43 && pr.index<=80 && pr.middle>=200 && pr.middle<=240 && pr.ring>=200 && pr.ring<=241 && pr.little>=200 && pr.little<=240 && letter.equals("shortu"))
                    matched = true;
                    //System.out.println("uuuuu");
                if (pr.thumb>=40 && pr.thumb<=150 && pr.index>=43 && pr.index<=80 && pr.middle>=200 && pr.middle<=240 && pr.ring>=200 && pr.ring<=241 && pr.little>=200 && pr.little<=240 && letter.equals("longu"))
                    matched = true;
                    //System.out.println("uuuuu");
                if (pr.thumb>=100 && pr.thumb<=173 && pr.index>=50 && pr.index<=100 && pr.middle>=50 && pr.middle<=120 && pr.ring>=170 && pr.ring<=220 && pr.little>=180 && pr.little<=220 && letter.equals("hrii"))
                    matched = true;
                    //System.out.println("riii");
                if (pr.thumb>=26 && pr.thumb<=76 && pr.index>=200 && pr.index<=232 && pr.middle>=200 && pr.middle<=252 && pr.ring>=200 && pr.ring<=238 && pr.little>=199 && pr.little<=240 && letter.equals("ae"))
                    matched = true;
                    //System.out.println("aaaee");
                if (pr.thumb>=30 && pr.thumb<=77 && pr.index>=200 && pr.index<=230 && pr.middle>=200 && pr.middle<=252 && pr.ring>=200 && pr.ring<=240 && pr.little>=90 && pr.little<=150 && letter.equals("oii"))
                    matched = true;
                    //System.out.println("oiii");
                if (pr.thumb>=152 && pr.thumb<=200 && pr.index>=160 && pr.index<=220 && pr.middle>=180 && pr.middle<=240 && pr.ring>=180 && pr.ring<=228 && pr.little>=190 && pr.little<=230 && letter.equals("oo"))
                    matched = true;
                    //System.out.println("OOOO");
                if (pr.thumb>=90 && pr.thumb<=150 && pr.index>=160 && pr.index<=230 && pr.middle>=200 && pr.middle<=240 && pr.ring>=180 && pr.ring<=220 && pr.little>=80 && pr.little<=130 && letter.equals("oou"))
                    matched = true;
                    //System.out.println("oouu");
                                      if (pr.thumb>=155 && pr.thumb<=195 && pr.index>=175 && pr.index<=215 && pr.middle>=205 && pr.middle<=235 && pr.ring>=190 && pr.ring<230 && pr.little>=150 && pr.little<=200 && letter.equals("ko"))
                      matched = true;
                      //System.out.println("ko");
                  if (pr.thumb>=15 && pr.thumb<=75 && pr.index>=185 && pr.index<=225 && pr.middle>=205 && pr.middle<=245 && pr.ring>=195 && pr.ring<=235 && pr.little>=195 && pr.little<=235 && letter.equals("kho"))
                    matched = true;
                      //System.out.println("kho");
                  if (pr.thumb>=120 && pr.thumb<=160 && pr.index>=95 && pr.index<=115 && pr.middle>=130 && pr.middle<=170 && pr.ring>=90 && pr.ring<=130 && pr.little>=50 && pr.little<=80 && letter.equals("go"))
                    matched = true;
                  //System.out.println("go");
                  if (pr.thumb>=130 && pr.thumb<=170 && pr.index>=130 && pr.index<=170 && pr.middle>=210 && pr.middle<=250 && pr.ring>=195 && pr.ring<=235 && pr.little>=195 && pr.little<=235 && letter.equals("gho"))
                    matched = true;
                  //System.out.println("gho");
                  if (pr.thumb>=20 && pr.thumb<=80 && pr.index>=205 && pr.index<=245 && pr.middle>=90 && pr.middle<=130 && pr.ring>=45 && pr.ring<=85 && pr.little>=55 && pr.little<=95 && letter.equals("umo"))
                    matched = true;
                  //System.out.println("umo");
                  if (pr.thumb>=130 && pr.thumb<=190 && pr.index>=170 && pr.index<=230 && pr.middle>=100 && pr.middle<=160 && pr.ring>=45 && pr.ring<=105 && pr.little>=45 && pr.little<=105 && letter.equals("cho"))
                    matched = true;
                  //System.out.println("cho");
                  if (pr.thumb>=140 && pr.thumb<=200 && pr.index>=30 && pr.index<=90 && pr.middle>=190 && pr.middle<=250 && pr.ring>=155 && pr.ring<=215 && pr.little>=60 && pr.little<=120 && letter.equals("chho"))
                    matched = true;
                  //System.out.println("chho");
                  if (pr.thumb>=140 && pr.thumb<=220 && pr.index>=160 && pr.index<=230 && pr.middle>=210 && pr.middle<=270 && pr.ring>=160 && pr.ring<=230 && pr.little>=190 && pr.little<=230 && letter.equals("jo"))
                    matched = true;
                  //System.out.println("jo");
                  if (pr.thumb>=0 && pr.thumb<=70 && pr.index>=0 && pr.index<=60 && pr.middle>=25 && pr.middle<=85 && pr.ring>=155 && pr.ring<=215 && pr.little>=130 && pr.little<=190 && letter.equals("jho"))
                    matched = true;
                  //System.out.println("jho");
                  if (pr.thumb>100 && pr.thumb<=160 && pr.index>=145 && pr.index<=205 && pr.middle>=140 && pr.middle<=200 && pr.ring>=65 && pr.ring<=135 && pr.little>=95 && pr.little<=155 && letter.equals("neo"))
                    matched = true;
                  //System.out.println("neo");
                  if (pr.thumb>=100 && pr.thumb<=140 && pr.index>=165 && pr.index<=195 && pr.middle>=210 && pr.middle<=230 && pr.ring>=195 && pr.ring<=235 && pr.little>=185 && pr.little<=215 && letter.equals("tto"))
                    matched = true;
                  //System.out.println("tto");
                  if (pr.thumb>=45 && pr.thumb<=105 && pr.index>=50 && pr.index<=110 && pr.middle>=185 && pr.middle<=245 && pr.ring>=190 && pr.ring<=250 && pr.little>=190 && pr.little<=250 && letter.equals("ttho"))
                    matched = true;
                  //System.out.println("ttho");
                  if (pr.thumb>=30 && pr.thumb<=100 && pr.index>=40 && pr.index<=100 && pr.middle>=70 && pr.middle<=130 && pr.ring>=170 && pr.ring<=230 && pr.little>=160 && pr.little<=220 && letter.equals("ddo"))
                    matched = true;
                  //System.out.println("ddo");
                  if (pr.thumb>=135 && pr.thumb<=195 && pr.index>=50 && pr.index<=110 && pr.middle>=190 && pr.middle<=205 && pr.ring>=145 && pr.ring<=205 && pr.little>=160 && pr.little<=230 && letter.equals("ddho"))
                    matched = true;
                  //System.out.println("ddho");
                  if (pr.thumb>=80 && pr.thumb<=150 && pr.index>=120 && pr.index<=180 && pr.middle>=155 && pr.middle<=215 && pr.ring>=55 && pr.ring<=115 && pr.little>=30 && pr.little<=90 && letter.equals("no"))
                    matched = true;
                  //System.out.println("no");
                  if (pr.thumb>=180 && pr.thumb<=210 && pr.index>=170 && pr.index<=230 && pr.middle>=190 && pr.middle<=250 && pr.ring>=195 && pr.ring<=255 && pr.little>=200 && pr.little<=260 && letter.equals("to"))
                    matched = true;
                  //System.out.println("to");
                  if (pr.thumb>=15 && pr.thumb<=75 && pr.index>=5 && pr.index<=65 && pr.middle>=165 && pr.middle<=225 && pr.ring>=185 && pr.ring<=245 && pr.little>=180 && pr.little<=240 && letter.equals("tho"))
                    matched = true;
                  //System.out.println("tho");
                  if (pr.thumb>=10 && pr.thumb<=80 && pr.index>=170 && pr.index<=230 && pr.middle>=185 && pr.middle<=245 && pr.ring>=195 && pr.ring<=255 && pr.little>=190 && pr.little<=250 && letter.equals("do"))
                    matched = true;
                  //System.out.println("do");
                  if (pr.thumb>=135 && pr.thumb<=195 && pr.index>=175 && pr.index<=235 && pr.middle>=205 && pr.middle<=265 && pr.ring>=190 && pr.ring<=250 && pr.little>=195 && pr.little<=255 && letter.equals("dho"))
                    matched = true;
                  //System.out.println("dho");
                  if (pr.thumb>=140 && pr.thumb<=210 && pr.index>=30 && pr.index<=90 && pr.middle>=40 && pr.middle<=100 && pr.ring>=115 && pr.ring<=175 && pr.little>=145 && pr.little<=205 && letter.equals("po"))
                    matched = true;
                  //System.out.println("po");
                  if (pr.thumb>=165 && pr.thumb<=225 && pr.index>=190 && pr.index<=250 && pr.middle>=85 && pr.middle<=145 && pr.ring>=10 && pr.ring<=70 && pr.little>=30 && pr.little<=90 && letter.equals("pho"))
                    matched = true;
                  //System.out.println("pho");
                  if (pr.thumb>=210 && pr.thumb<=280 && pr.index>=30 && pr.index<=90 && pr.middle>=85 && pr.middle<=145 && pr.ring>=30 && pr.ring<=90 && pr.little>=10 && pr.little<=70 && letter.equals("bo"))
                    matched = true;
                  //System.out.println("bo");
                  if (pr.thumb>=140 && pr.thumb<=200 && pr.index>=40 && pr.index<=100 && pr.middle>=95 && pr.middle<=155 && pr.ring>=80 && pr.ring<=140 && pr.little>=125 && pr.little<=185 && letter.equals("mo"))
                    matched = true;
                  //System.out.println("mo");
                  if (pr.thumb>=0 && pr.thumb<=70 && pr.index>=15 && pr.index<=75 && pr.middle>=175 && pr.middle<=235 && pr.ring>=195 && pr.ring<=255 && pr.little>=180 && pr.little<=230 && letter.equals("lo"))
                    matched = true;
                  //System.out.println("lo");
                  if (pr.thumb>=210 && pr.thumb<=270 && pr.index>=200 && pr.index<=260 && pr.middle>=215 && pr.middle<=275 && pr.ring>=205 && pr.ring<=265 && pr.little>=190 && pr.little<=230 && letter.equals("sho"))
                    matched = true;
                  //System.out.println("sho");
                  if (pr.thumb>=180 && pr.thumb<=230 && pr.index>=5 && pr.index<=75 && pr.middle>=60 && pr.middle<=120 && pr.ring>=180 && pr.ring<=240 && pr.little>=170 && pr.little<=230 && letter.equals("ho"))
                    matched = true;
                  //System.out.println("ho");
                  if (pr.thumb>=70 && pr.thumb<=130 && pr.index>=40 && pr.index<=100 && pr.middle>=185 && pr.middle<=245 && pr.ring>=200 && pr.ring<=260 && pr.little>=170 && pr.little<=230 && letter.equals("onu"))
                    matched = true;
                  //System.out.println("onu");
                  if (pr.thumb>=10 && pr.thumb<=80 && pr.index>=60 && pr.index<=130 && pr.middle>=190 && pr.middle<=250 && pr.ring>=195 && pr.ring<=255 && pr.little>=185 && pr.little<=245 && letter.equals("bindu"))
                    matched = true;
                  //System.out.println("bindu");
                    count++;
            }
        if (matched==true){
            mb.setBackground(Color.green);
            mb.setText("Matched!");
        }
        else{
            mb.setBackground(Color.blue);
            mb.setText("Not Matched!"); 
        }
    }
}
