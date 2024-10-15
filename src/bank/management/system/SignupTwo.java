
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignupTwo extends JFrame {
    
    SignupTwo(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0,10,100,100);
        add(label);
        
        setSize(850,900);
        setVisible(true);
        setLocation(350,10);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    
    
    public static void main(String[] args){
        
        new SignupTwo();
    
    }
    }
    
