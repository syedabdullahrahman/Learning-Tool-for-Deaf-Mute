/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtool;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Taani
 */

public class Score extends JPanel {

    JButton next,quit;
    JLabel l;
    String result;
    int a,b;
    Scanner in=new Scanner(System.in);
    String name;

    public Score(int scr) {
        
        name="Rinky";
        l=new JLabel(name+ " ,Score= "+ scr);
        l.setBounds(200, 100, 300,500);
        l.setSize(300, 100);
        l.setFont(new Font("Monospaced", Font.BOLD, 30));
        
        add(l);
        
        Connection myconobj=null;
        String sql = "INSERT INTO TAANI.SCORE(NAME,SCORE) VALUES (?,?)";
        String sql1 = "SELECT * FROM SCORE";

        try{
             myconobj=DriverManager.getConnection("jdbc:derby://localhost:1527/MyDataBse", "taani","12345");
             
             PreparedStatement statement = myconobj.prepareStatement(sql);
                   statement.setString(1,name);
                       
                       statement.setInt(2, a);
                        
                  int rowsInserted = statement.executeUpdate();
                  if (rowsInserted > 0) {
                   System.out.println("A new record inserted successfully!");               
                 } 
                  
    }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}