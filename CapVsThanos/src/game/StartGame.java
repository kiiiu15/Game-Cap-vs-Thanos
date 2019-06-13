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

       
    public StartGame(){

        setLayout(null);
        setTitle(" Avengers Game");
        getContentPane().setBackground(Color.BLACK);
        setIconImage(new ImageIcon(getClass().getResource("images/icon2.png")).getImage());


    }

    /*public void actionPerformed(ActionEvent e){

    } */
     
 }