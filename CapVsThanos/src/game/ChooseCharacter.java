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
   private JLabel label1, label2, label3, label4, label5, label6 ;
   JButton button;

   public ChooseCharacter(){
      
    setLayout(null);
    setTitle(" Avengers Game");
    getContentPane().setBackground(Color.BLACK);
    setIconImage(new ImageIcon(getClass().getResource("images/icon2.png")).getImage());

    ImageIcon image = new ImageIcon(getClass().getResource("images/ray.png"));
    label1 = new JLabel(image);
    label1.setBounds(0,0,1000,1000);
    add(label1);

    ImageIcon image1 = new ImageIcon(getClass().getResource("images/thanos3.png"));
    label2 = new JLabel(image1);
    label2.setBounds(0, 50, 303, 303);
    add(label2);

    ImageIcon image2 = new ImageIcon(getClass().getResource("images/thor3.png"));
    label3 = new JLabel(image2);
    label3.setBounds(200,150,500,400);
    add(label3);

    ImageIcon image3 = new ImageIcon(getClass().getResource("images/chica.png"));
    label4 = new JLabel(image3);
    label4.setBounds(400,500,500,400);
    add(label4);

    ImageIcon image4 = new ImageIcon(getClass().getResource("images/robert.png"));
    label5 = new JLabel(image4);
    label5.setBounds(0,0,700,400);
    add(label5);

    ImageIcon image5 = new ImageIcon(getClass().getResource("images/robert.png"));
    label6 = new JLabel(image5);
    label6.setBounds(0,0,700,400);
    add(label5);
        
    button = new JButton("P1");
    button.setBounds(0, 0, 70, 30);;
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