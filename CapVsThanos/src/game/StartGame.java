package game;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Feuereisen
 */

 /**
  * StartGame
  */
 public class StartGame extends JFrame implements ActionListener, ChangeListener {
    private JLabel label0 ,label1, label2, label3, label4 , label5, label6;
    private String name = "";
    
       
    public  StartGame(){

        setLayout(null);
        setTitle(" Avengers Game");
        getContentPane().setBackground(Color.BLACK);


        setIconImage(new ImageIcon(getClass().getResource("images/icon2.png")).getImage());
        Welcome welcome = new Welcome();
        name = welcome.text;
        setTitle(name); 

        ImageIcon image0 = new ImageIcon(getClass().getResource("images/thanos2.png"));
        label0 = new JLabel(image0);
        label0.setBounds(225,-20,1000,700);
        add(label0);

        ChooseCharacter character = new ChooseCharacter();

        if( character.getChoosed() == "thor"){
            ImageIcon image = new ImageIcon(getClass().getResource("images/thorC.png"));
            label1 = new JLabel(image);
            label1.setBounds(-250,-10,1000,700);
            add(label1);

            ImageIcon image6 = new ImageIcon(getClass().getResource("images/fire2.jpg"));
            label6 = new JLabel(image6);
            label6.setBounds( 0, 0,1000,700);
            add(label6);

        }if(character.getChoosed() == "xika"){
            ImageIcon image = new ImageIcon(getClass().getResource("images/xika.png"));
            label1 = new JLabel(image);
            label1.setBounds(-150,-10,1000,700);
            add(label1);

            ImageIcon image3 = new ImageIcon(getClass().getResource("images/antorxa.png"));
            label3 = new JLabel(image3);
            label3.setBounds(350,-200,1000,700);
            add(label3);
    
            ImageIcon image4 = new ImageIcon(getClass().getResource("images/antorxa2.png"));
            label4 = new JLabel(image4);
            label4.setBounds(-360,-200,1000,700);
            add(label4);

            ImageIcon image2 = new ImageIcon(getClass().getResource("images/cloud.png"));
            label2 = new JLabel(image2);
            label2.setBounds(0,-300,1000,700);
            add(label2);

            ImageIcon image5 = new ImageIcon(getClass().getResource("images/stones.png"));
            label5 = new JLabel(image5);
            label5.setBounds( 0,50,1000,700);
            add(label5);

        }if(character.getChoosed() == "robert"){

            ImageIcon image = new ImageIcon(getClass().getResource("images/robertC.png"));
            label1 = new JLabel(image);
            label1.setBounds(-200,0,1000,700);
            add(label1);
            ImageIcon image5 = new ImageIcon(getClass().getResource("images/stormPlace.jpg"));
            label5 = new JLabel(image5);
            label5.setBounds(0,-20,1000,700);
            add(label5);

        }if(character.getChoosed() == "captain"){
            ImageIcon image = new ImageIcon(getClass().getResource("images/capitan2.png"));
            label1 = new JLabel(image);
            label1.setBounds(-200,-30,1000,700);
            add(label1);

            ImageIcon image5 = new ImageIcon(getClass().getResource("images/city2.jpg"));
            label5 = new JLabel(image5);
            label5.setBounds(0,0,1000,700);
            add(label5);
            
        }

      
      
    

   
    }
    
   

    public void actionPerformed(ActionEvent e){

    } 
     
 }