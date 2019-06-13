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
    private JLabel label1, label2;

       
    public StartGame(){

        setLayout(null);
        setTitle(" Avengers Game");
        getContentPane().setBackground(Color.BLACK);
        setIconImage(new ImageIcon(getClass().getResource("images/icon2.png")).getImage());
        
        ImageIcon image = new ImageIcon(getClass().getResource("images/antorxa.png"));
        label1 = new JLabel(image);
        label1.setBounds(0,0,1000,700);
        add(label1);
    }

    public void actionPerformed(ActionEvent e){

    } 
     
 }