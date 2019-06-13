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
   private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10 ;
   JButton button;

   public ChooseCharacter(){
      
    setLayout(null);
    setTitle(" Avengers Game");
    getContentPane().setBackground(Color.BLACK);
    setIconImage(new ImageIcon(getClass().getResource("images/icon2.png")).getImage());



    ImageIcon image1 = new ImageIcon(getClass().getResource("images/thanos3.png"));
    label2 = new JLabel(image1);
    label2.setBounds(-400, 0, 1000, 700);
    add(label2);

    ImageIcon image3 = new ImageIcon(getClass().getResource("images/chica1.png"));
    label4 = new JLabel(image3);
    label4.setBounds(200,0,1000,700);
    add(label4);

    ImageIcon image2 = new ImageIcon(getClass().getResource("images/thor.png"));
    label3 = new JLabel(image2);
    label3.setBounds(70,0,1000,700);
    add(label3);


    ImageIcon image4 = new ImageIcon(getClass().getResource("images/robert.png"));
    label5 = new JLabel(image4);
    label5.setBounds(-200,0,1000,700);
    add(label5);  
    
    ImageIcon image = new ImageIcon(getClass().getResource("images/ray.png"));
    label1 = new JLabel(image);
    label1.setBounds(0,-20,1000,700);
    add(label1);

    ImageIcon image5 = new ImageIcon(getClass().getResource("images/evans.png"));
    label6 = new JLabel(image5);
    label6.setBounds(400,0,950,650);
    add(label6);

    ImageIcon image7 = new ImageIcon(getClass().getResource("images/thunder.png"));
    label7 = new JLabel(image7);
    label7.setBounds(-300,-20,1000,700);
    add(label7);
        
    ImageIcon image8 = new ImageIcon(getClass().getResource("images/cloud.png"));
    label8 = new JLabel(image8);
    label8.setBounds(-300,0,1000,700);
    add(label8);

    ImageIcon image9 = new ImageIcon(getClass().getResource("images/cloud1.png"));
    label9 = new JLabel(image9);
    label9.setBounds(-100,-150,2000,700);
    add(label9);

   /* ImageIcon image10 = new ImageIcon(getClass().getResource("images/cloud2.png"));
    label10 = new JLabel(image10);
    label10.setBounds(0,-100,2000,1500);
    add(label10);*/

    button = new JButton("Start");
    button.setBounds(0, 0, 70, 30);
    button.setBackground(new Color(0,0,0));
    button.setFont(new Font("Arial", 3, 14));
    button.setForeground(new Color(255,0,0));
    button.addActionListener(this);
    add(button);
 
  

    Toolkit toolkit = Toolkit.getDefaultToolkit();
    System.out.println("ancho/ "+toolkit.getScreenSize().getWidth());
   }
    


  public void actionPerformed(ActionEvent e){
      if(e.getSource() ==  button){
            StartGame start = new StartGame();
            start.setBounds(0,0,1000,700);
            start.setVisible(true);
            start.setResizable(false);
            start.setLocationRelativeTo(null);
            this.setVisible(false);
            }
  }
    
 }