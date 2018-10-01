package learningtool;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.lang.reflect.Method;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static learningtool.LearningTool.openURL;

public class LearningTool {

    public static LearningTool main;
    public final int width = 600, height = 500;
    JPanel mainJPanel;
    Learn learnJPanel;
    Info infoJPanel;
    Match matchJPanel;
    Match1 match1JPanel;    
    Test testJPanel;
    Test1 test1JPanel;
    Medium mediumJPanel;
    MediumMatch mediumMJPanel;
    Hard hardJPanel;
    HardMatch hardMJPanel; 
    Score scoreJPanel;
    JFrame jf;
    JButton learn, match, info,test;
    JLabel menu;
    ImageIcon img;
    DeveloperInfo devInfo;
     public static void openURL(String url) {
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Mac OS")) {
                Class fileMgr = Class.forName("com.apple.eio.FileManager");
                Method openURL = fileMgr.getDeclaredMethod("openURL",
                        new Class[]{String.class});
                openURL.invoke(null, new Object[]{url});
            } else if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            } else { //assume Unix or Linux
                String[] browsers = {
                    "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape"};
                String browser = null;
                for (int count = 0; count < browsers.length && browser == null; count++) {
                    if (Runtime.getRuntime().exec(
                            new String[]{"which", browsers[count]}).waitFor() == 0) {
                        browser = browsers[count];
                    }
                }
                if (browser == null) {
                    throw new Exception("Could not find web browser");
                } else {
                    Runtime.getRuntime().exec(new String[]{browser, url});
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ":\n" + e.getLocalizedMessage());
        }
    }

    public LearningTool() {
        fakeLearningTool();
    }

    public void fakeLearningTool() {
        manageJPanel();
        mangeJFrame(mainJPanel);
    }

    public static void main(String[] args) {
        LearningTool.main = new LearningTool();
    }

    public void manageJPanel() {
        mainJPanel = new JPanel();
        img = new ImageIcon("back.jpg");
        learn = new JButton("Learn");
        match = new JButton("How to use");
        info = new JButton("About us");
        test = new JButton("Test");
        
        

        menu = new JLabel("Menu", SwingConstants.CENTER);
        menu.setIcon(img);
        menu.setOpaque(true);
        menu.setBounds(0, 0, width, height);

        learn.setBounds(200, 100, 200, 50);
        learn.setBackground(Color.red.darker());
        learn.setFont(new Font("Monospaced", Font.BOLD, 20));
        learn.setForeground(Color.white);
        learn.setBorderPainted(false);
        learn.setOpaque(true);
        
        test.setBounds(200, 200, 200, 50);
        test.setBackground(Color.red.darker());
        test.setFont(new Font("Monospaced", Font.BOLD, 20));
        test.setForeground(Color.white);
        test.setBorderPainted(false);
        test.setOpaque(true);

        match.setBounds(200, 300, 200, 50);
        match.setBackground(Color.red.darker());
        match.setFont(new Font("Monospaced", Font.BOLD, 20));
        match.setForeground(Color.white);
        match.setBorderPainted(false);
        match.setOpaque(true);

        info.setBounds(200, 400, 200, 50);
        info.setBackground(Color.red.darker());
        info.setFont(new Font("Monospaced", Font.BOLD, 20));
        info.setForeground(Color.white);
        info.setBorderPainted(false);
        info.setOpaque(true);

        mainJPanel.add(learn);
        mainJPanel.add(test);
        mainJPanel.add(match);
        mainJPanel.add(info);
        mainJPanel.add(menu);

        learn.addActionListener((ActionEvent e) -> {
            mainJPanel.setVisible(false);
            learnJPanel = new Learn();
            learnJPanel.setVisible(true);
            jf.setContentPane(learnJPanel);
        });
        
        test.addActionListener((ActionEvent e) -> {
            mainJPanel.setVisible(false);
            test1JPanel = new Test1();
            test1JPanel.setVisible(true);
            jf.setContentPane(test1JPanel);
        });
        
        

        match.addActionListener((ActionEvent e) -> {
            openURL("test\\index.html");
        });
        

        info.addActionListener((ActionEvent e) -> {
            mainJPanel.setVisible(false);
            infoJPanel = new Info();
            infoJPanel.setVisible(true);
            jf.setContentPane(new Info());
        });
        
        mainJPanel.setLayout(null);
        mainJPanel.setLocation(0, 0);
        mainJPanel.setVisible(true);
        mainJPanel.setSize(width, height);

    }

    public void mangeJFrame(JPanel jp) {
        jf = new JFrame();
        jf.setTitle("Learning Tool");
        jf.setLayout(null);
        jf.setLocation(100, 0);
        jf.setVisible(true);
        jf.setSize(1000, 700);
        //jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(jp);
        jf.setVisible(true);
    }
}
