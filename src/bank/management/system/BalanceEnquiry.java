
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener {
    
    JButton back;
    String pinnumber;
    
    public BalanceEnquiry(String pinnumber){
            this.pinnumber = pinnumber;
            setLayout(null);
            
            
           JPanel contentPanel6 = new JPanel();
           contentPanel6.setLayout(null);
           
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
           Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
           ImageIcon i3 = new ImageIcon(i2);
           JLabel image = new JLabel(i3);
           image.setBounds(0,0,900,900);
           add(image);
           
           back = new JButton("Back");
           back.setBounds(355,520,150,30);
           back.addActionListener(this);
           image.add(back);
           
           try{
           Conn c = new Conn();
    
           ResultSet rs = c.s.executeQuery("select balance from bank where pin = '"+pinnumber+"' order by date desc limit 1");
           
           if(rs.next()){
               String balance = rs.getString("balance");
               JLabel text1 = new JLabel("Your Current Account Balance is "+ balance);
               text1.setForeground(Color.WHITE);
               text1.setFont(new Font("Raleway",Font.BOLD,16));
               text1.setBounds(170,300,400,30);
               image.add(text1);
               
           }
           
           
           
           
           }catch(Exception e){
               e.printStackTrace();
           }
            
            
            add(contentPanel6);
            
            setSize(900,900);
            setLocation(300,0);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource()==back){
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
        
        }catch(Exception e){
            System.out.println(e);
        }
    
    }
    
    public static void main(String[] args){
        
        new BalanceEnquiry("");
    
    }
    
}
