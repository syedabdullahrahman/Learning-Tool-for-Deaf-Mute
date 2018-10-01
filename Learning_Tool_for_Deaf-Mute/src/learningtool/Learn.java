
package learningtool;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Learn extends JPanel {

    JButton shoreo, shorea, shorte, longe, shortu, longu, hrii, ae, oii, oo, oou;
    JButton ko,kho,go,gho,umo,cho,chho,jo,jho,neo,tto,ttho,ddo,ddho,mono,to,tho,doo,dho,no;
    JButton po,pho,bo,bho,mo;
    ImageIcon img, img1, img2, img3, img4, img5,img6;
    ImageIcon img7, img8, img9, img10, img11;
    ImageIcon img12,img13,img14,img15,img16,img17,img18,img19,img20,img21,img22,img23;
    ImageIcon img24,img25,img26,img27,img28,img29,img30,img31,img32,img33,img34,img35;

    


    JButton goback;

    public Learn() {
        super(new BorderLayout());
        /*Initialize Components*/
        goback = new JButton("Go Back");
        goback.setBounds(50, 100, 95, 30);

        img11 = new ImageIcon("back2.jpg");

        img = new ImageIcon(new ImageIcon("shoreo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        shoreo = new JButton();
        shoreo.setBounds(50, 50, 100, 100);
        shoreo.setIcon(img);
        shoreo.setBorderPainted(false);
        shoreo.setOpaque(true);
        shoreo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("shoreo");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(shoreo);

        img1 = new ImageIcon(new ImageIcon("shorea.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        shorea = new JButton();
        shorea.setBounds(50, 50, 100, 100);
        shorea.setIcon(img1);
        shorea.setBorderPainted(false);
        shorea.setOpaque(true);
        shorea.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("shorea");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(shorea);

        img2 = new ImageIcon(new ImageIcon("shorte.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        shorte = new JButton();
        shorte.setBounds(50, 50, 100, 100);
        shorte.setIcon(img2);
        shorte.setBorderPainted(false);
        shorte.setOpaque(true);
        shorte.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("shorte");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(shorte);

        img3 = new ImageIcon(new ImageIcon("longe.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        longe = new JButton();
        longe.setBounds(50, 50, 100, 100);
        longe.setIcon(img3);
        longe.setBorderPainted(false);
        longe.setOpaque(true);
        longe.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("longe");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(longe);

        img4 = new ImageIcon(new ImageIcon("shortu.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        shortu = new JButton();
        shortu.setBounds(50, 50, 100, 100);
        shortu.setIcon(img4);
        shortu.setBorderPainted(false);
        shortu.setOpaque(true);
        shortu.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("shortu");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(shortu);

        img5 = new ImageIcon(new ImageIcon("longu.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        longu = new JButton();
        longu.setBounds(50, 50, 100, 100);
        longu.setIcon(img5);
        longu.setBorderPainted(false);
        longu.setOpaque(true);
        longu.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("longu");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(longu);

        img6 = new ImageIcon(new ImageIcon("hrii.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        hrii = new JButton();
        hrii.setBounds(50, 50, 100, 100);
        hrii.setIcon(img6);
        hrii.setBorderPainted(false);
        hrii.setOpaque(true);
        hrii.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("hrii");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(hrii);

        img7 = new ImageIcon(new ImageIcon("ae.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        ae = new JButton();
        ae.setBounds(50, 50, 100, 100);
        ae.setIcon(img7);
        ae.setBorderPainted(false);
        ae.setOpaque(true);
        ae.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("ae");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(ae);

        img8 = new ImageIcon(new ImageIcon("oii.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        oii = new JButton();
        oii.setBounds(50, 50, 100, 100);
        oii.setIcon(img8);
        oii.setBorderPainted(false);
        oii.setOpaque(true);
        oii.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("oii");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(oii);

        img9 = new ImageIcon(new ImageIcon("oo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        oo = new JButton();
        oo.setBounds(50, 50, 100, 100);
        oo.setIcon(img9);
        oo.setBorderPainted(false);
        oo.setOpaque(true);
        oo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("oo");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(oo);

        img10 = new ImageIcon(new ImageIcon("oou.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        oou = new JButton();
        oou.setBounds(50, 50, 100, 100);
        oou.setIcon(img10);
        oou.setBorderPainted(false);
        oou.setOpaque(true);
        oou.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("oou");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(oou);
        
         img12 = new ImageIcon(new ImageIcon("ko.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         ko = new JButton();
         ko.setBounds(50, 50, 100, 100);
         ko.setIcon(img12);
         ko.setBorderPainted(false);
         ko.setOpaque(true);
         ko.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("ko");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(ko);
        
        img13 = new ImageIcon(new ImageIcon("kho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         kho = new JButton();
         kho.setBounds(50, 50, 100, 100);
         kho.setIcon(img13);
         kho.setBorderPainted(false);
         kho.setOpaque(true);
         kho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("kho");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(kho);
        
        
         img14 = new ImageIcon(new ImageIcon("go.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         go = new JButton();
         go.setBounds(50, 50, 100, 100);
         go.setIcon(img14);
         go.setBorderPainted(false);
         go.setOpaque(true);
         go.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("go");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(go);
         img15 = new ImageIcon(new ImageIcon("gho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         gho = new JButton();
         gho.setBounds(50, 50, 100, 100);
         gho.setIcon(img15);
         gho.setBorderPainted(false);
         gho.setOpaque(true);
         gho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("gho");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(gho);
        
         img16 = new ImageIcon(new ImageIcon("umo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         umo = new JButton();
         umo.setBounds(50, 50, 100, 100);
         umo.setIcon(img16);
         umo.setBorderPainted(false);
         umo.setOpaque(true);
         umo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("umo");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(umo);
        
         img17 = new ImageIcon(new ImageIcon("cho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         cho = new JButton();
         cho.setBounds(50, 50, 100, 100);
         cho.setIcon(img17);
         cho.setBorderPainted(false);
         cho.setOpaque(true);
         cho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("cho");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(cho);
        
         img18 = new ImageIcon(new ImageIcon("chho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         chho = new JButton();
         chho.setBounds(50, 50, 100, 100);
         chho.setIcon(img18);
         chho.setBorderPainted(false);
         chho.setOpaque(true);
         chho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("chho");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(chho);

         img19 = new ImageIcon(new ImageIcon("jo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         jo = new JButton();
         jo.setBounds(50, 50, 100, 100);
         jo.setIcon(img19);
         jo.setBorderPainted(false);
         jo.setOpaque(true);
         jo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("jo");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(jo);
        
        img20 = new ImageIcon(new ImageIcon("jho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         jho = new JButton();
         jho.setBounds(50, 50, 100, 100);
         jho.setIcon(img20);
         jho.setBorderPainted(false);
         jho.setOpaque(true);
         jho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("jho");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(jho);
        
         img21 = new ImageIcon(new ImageIcon("neo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         neo = new JButton();
         neo.setBounds(50, 50, 100, 100);
         neo.setIcon(img21);
         neo.setBorderPainted(false);
         neo.setOpaque(true);
         neo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("neo");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });

        /*Adding Components*/
        add(neo);
        
        img22 = new ImageIcon(new ImageIcon("tto.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         tto = new JButton();
         tto.setBounds(50, 50, 100, 100);
         tto.setIcon(img22);
         tto.setBorderPainted(false);
         tto.setOpaque(true);
         tto.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("tto");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(tto);
        
        img23 = new ImageIcon(new ImageIcon("ttho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         ttho = new JButton();
         ttho.setBounds(50, 50, 100, 100);
         ttho.setIcon(img23);
         ttho.setBorderPainted(false);
         ttho.setOpaque(true);
         ttho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("ttho");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(ttho);
        
        img24 = new ImageIcon(new ImageIcon("ddo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         ddo = new JButton();
         ddo.setBounds(50, 50, 100, 100);
         ddo.setIcon(img24);
         ddo.setBorderPainted(false);
         ddo.setOpaque(true);
         ddo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("ddo");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(ddo);
        
        img25 = new ImageIcon(new ImageIcon("ddho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         ddho = new JButton();
         ddho.setBounds(50, 50, 100, 100);
         ddho.setIcon(img25);
         ddho.setBorderPainted(false);
         ddho.setOpaque(true);
         ddho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("ddho");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(ddho);
        
        img26 = new ImageIcon(new ImageIcon("mono.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         mono = new JButton();
         mono.setBounds(50, 50, 100, 100);
         mono.setIcon(img26);
         mono.setBorderPainted(false);
         mono.setOpaque(true);
         mono.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("mono");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(mono);
        
        img27 = new ImageIcon(new ImageIcon("to.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         to = new JButton();
         to.setBounds(50, 50, 100, 100);
         to.setIcon(img27);
         to.setBorderPainted(false);
         to.setOpaque(true);
         to.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("to");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(to);
        
        img28 = new ImageIcon(new ImageIcon("tho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         tho = new JButton();
         tho.setBounds(50, 50, 100, 100);
         tho.setIcon(img28);
         tho.setBorderPainted(false);
         tho.setOpaque(true);
         tho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("tho");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(tho);
        
        img29 = new ImageIcon(new ImageIcon("doo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         doo = new JButton();
         doo.setBounds(50, 50, 100, 100);
         doo.setIcon(img29);
         doo.setBorderPainted(false);
         doo.setOpaque(true);
         doo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("doo");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(doo);
        
        img30 = new ImageIcon(new ImageIcon("dho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         dho = new JButton();
         dho.setBounds(50, 50, 100, 100);
         dho.setIcon(img28);
         dho.setBorderPainted(false);
         dho.setOpaque(true);
         dho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("dho");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(dho);
         img31 = new ImageIcon(new ImageIcon("no.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         no = new JButton();
         no.setBounds(50, 50, 100, 100);
         no.setIcon(img31);
         no.setBorderPainted(false);
         no.setOpaque(true);
         no.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("no");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        
        
        add(no);
        
        img32 = new ImageIcon(new ImageIcon("po.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         po = new JButton();
         po.setBounds(50, 50, 100, 100);
         po.setIcon(img32);
         po.setBorderPainted(false);
         po.setOpaque(true);
         po.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("po");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(po);
        
        img33 = new ImageIcon(new ImageIcon("pho.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         pho = new JButton();
         pho.setBounds(50, 50, 100, 100);
         pho.setIcon(img33);
         pho.setBorderPainted(false);
         pho.setOpaque(true);
         pho.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("pho");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(pho);
        
        img34 = new ImageIcon(new ImageIcon("bo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
         bo = new JButton();
         bo.setBounds(50, 50, 100, 100);
         bo.setIcon(img34);
         bo.setBorderPainted(false);
         bo.setOpaque(true);
         bo.addActionListener((ActionEvent ae) -> {
            LearningTool.main.matchJPanel = new Match("bo");
            //LearningTool.main.matchJPanel.setLetter("shoreo");

            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.matchJPanel);
            LearningTool.main.matchJPanel.setVisible(true);
        });
         

        /*Adding Components*/
        add(bo);
        
        
        
        //goback.setLocation(0,0);
        add(goback, BorderLayout.SOUTH);

        /* Setting Layout JPanel*/
        //setLayout(null);
        setLocation(0, 0);
        setVisible(true);
        setSize(1000, 1000);
        setLayout(new FlowLayout());
        setBackground(Color.pink);

        goback.addActionListener((ActionEvent e) -> {
            LearningTool.main.learnJPanel.setVisible(false);
            LearningTool.main.jf.setContentPane(LearningTool.main.mainJPanel);
            LearningTool.main.mainJPanel.setVisible(true);
        });

    }
}
