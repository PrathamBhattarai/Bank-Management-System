
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame {
    
    Transactions(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResources("icons/atm.jpg"));
        
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        new Transactions();
    }
    
}
