package game;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Marikeins
 * 
 */

 public class ChooseCharacter extends JFrame implements ActionListener, ChangeListener{
   private JLabel label1, label2, label3, label4, label5;

   public ChooseCharacter(){
      
    setLayout(null);
    setTitle(" Avengers Game");
    getContentPane().setBackground(Color.BLACK);
    setIconImage(new ImageIcon(getClass().getResource("images/icon2.png")).getImage());

    ImageIcon image1 = new ImageIcon(getClass().getResource("images/thanos3.png"));
    label2 = new JLabel(image1);
    label2.setBounds(0,0,800,700);
    add(label2);

    ImageIcon image2 = new ImageIcon(getClass().getResource("images/thor3.png"));
    label3 = new JLabel(image2);
    label3.setBounds(0,0,700,400);
    add(label3);

    /*ImageIcon image3 = new ImageIcon(getClass().getResource("images/.png"));
    label4 = new JLabel(image3);
    label4.setBounds(0,0,700,400);
    add(label4);

    ImageIcon image4 = new ImageIcon(getClass().getResource("images/.png"));
    label5 = new JLabel(image4);
    label5.setBounds(0,0,700,400);
    add(label5);*/
        
    JButton button1 = new JButton("P1");
    button1.setBounds(10,290,100,30);
    button1.addActionListener(this);
    add(button1);
 
    JButton button2 = new JButton("P2");
    button2.setBounds(10,290,100,30);
    button2.addActionListener(this);
    add(button2);
    
    ImageIcon image = new ImageIcon("images/logo2.png");
    label1 = new JLabel(image);
    label1.setBounds(25,15,300,150);
    add(label1);
   }
    


     /*public void actionPerformed(ActionEvent e){
        if(e.getSource ==  button1){
               StartGame start = new StartGame();
                start.setBounds(0,0,1000,700);
                start.setVisible(true);
                start.setResizable(false);
                start.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
     } */
 }