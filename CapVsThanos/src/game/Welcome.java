
package game;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * @since Tu Vieja
 * @author Marikena
 */
 public class Welcome extends JFrame implements ActionListener{
   
    private JTextField textField1;
    private JLabel label1;
    JButton button1;

    public Welcome(){
        setLayout(null);
        setTitle(" Advengers Game");
        getContentPane().setBackground(new Color(255,0,0));
     
       // setIconImage(new ImageIcon(getClass().getResource("C:\\Users\\Marikena\\Desktop\\Game-Cap-vs-Thanos\\Game-Cap-vs-Thanos\\CapVsThanos\\images/icon.png")).getImage());

        ImageIcon image = new ImageIcon("images/logo.png");
        label1 = new JLabel(image);
        label1.setBounds(25,15,300,150);
        add(label1);

        JLabel label2 = new JLabel("Just For Fun");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(255,255,255));
        add(label2);

        JLabel label3 = new JLabel("Enter your name");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255,255,255));
        add(label3);

        textField1 = new JTextField();
        textField1.setBounds(40,240,255,255);
        textField1.setBackground(new Color(220,220,220));
        label2.setFont(new Font("Andale Mono", 1, 14));
        label2.setForeground(new Color(255,0,0));
        add(textField1);

        button1 = new JButton("Accept");
        button1.setBounds(125,280,100,30);
        button1.setBackground(new Color(255,255,255));
        button1.setFont(new Font("Arial", 3, 14));
        button1.setForeground(new Color(255,0,0));
        button1.addActionListener(this);
        add(button1);
        

       
    }
   
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1) {
            String text = textField1.getText();
            setTitle(text);
        }

    }
     
 } 