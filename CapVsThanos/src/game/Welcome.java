
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
    public static String text = "";

    public Welcome(){
        setLayout(null);
        setTitle("Avengers Game");
        getContentPane().setBackground(new Color(255,0,0));
     
        setIconImage(new ImageIcon(getClass().getResource("images/icon2.png")).getImage());

        ImageIcon image = new ImageIcon(getClass().getResource("images/logo.png"));
        label1 = new JLabel(image);
        label1.setBounds(0,0,1000,700);
        add(label1);

        JLabel label2 = new JLabel("Just For Fun");
        label2.setBounds(25,155,400,80);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(Color.BLACK);
        add(label2);

        JLabel label3 = new JLabel("Enter your name");
        label3.setBounds(0,0,1000,700);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255,255,255));
        add(label3);

        textField1 = new JTextField();
        textField1.setBounds(370,355,255,25);
        textField1.setBackground(new Color(220,220,220));
        label2.setFont(new Font("Andale Mono", 1, 14));
        label2.setForeground(new Color(255,0,0));
        add(textField1);

        button1 = new JButton("Continue");
        button1.setBounds(450,385,100,30);
        button1.setBackground(new Color(255,255,255));
        button1.setFont(new Font("Arial", 3, 14));
        button1.setForeground(new Color(255,0,0));
        button1.addActionListener(this);
        add(button1);
        

       
    }
   
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1) {
            text = textField1.getText().trim(); // trim borra los espacios
            setTitle(text);
            if(text.equals("") ){
                JOptionPane.showMessageDialog(null, "Enter your name first");
            }else{
                ChooseCharacter choose = new ChooseCharacter();
                choose.setBounds(0,0,1000,700);
                choose.setVisible(true);
                choose.setResizable(false);
                choose.setLocationRelativeTo(null);
                this.setVisible(false);
            }
            
        }

    }
    
     
 } 