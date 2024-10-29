
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.sql.*;

public class FastCash extends JFrame implements ActionListener {
    
    JButton a1,a2,a3,a4,a5,a6,back;
    String pinnumber;
    
    FastCash(String pinnumber){
        
        this.pinnumber = pinnumber;
        
        JPanel contentPanel4 = new JPanel();
        contentPanel4.setLayout(null);
        contentPanel4.setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        contentPanel4.add(image);
        
        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);
        
        a1 = new JButton("Rs 100");
        a1.setBounds(170,415,150,30);
        a1.addActionListener(this);
        image.add(a1);
        
        a2 = new JButton("Rs 500");
        a2.setBounds(355,415,150,30);
        a2.addActionListener(this);
        image.add(a2);
        
        a3 = new JButton("Rs 1000");
        a3.setBounds(170,450,150,30);
        a3.addActionListener(this);
        image.add(a3);
        
        a4 = new JButton("Rs 2000 ");
        a4.setBounds(355,450,150,30);
        a4.addActionListener(this);
        image.add(a4);
        
        a5 = new JButton("Rs 5000");
        a5.setBounds(170,485,150,30);
        a5.addActionListener(this);
        image.add(a5);
        
        a6 = new JButton("Rs 10000");
        a6.setBounds(355, 485,150,30);
        a6.addActionListener(this);
        image.add(a6);
        
        back = new JButton ("back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        
        add(contentPanel4);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
       try{
           String amount = ((JButton)ae.getSource()).getText().substring(3);
           int withdrawlAmount = Integer.parseInt(amount);
           Conn c = new Conn();
           ResultSet rs = c.s.executeQuery("select balance from bank where pin ='"+pinnumber+"' order by date desc limit 1");
           
           
           int balance = 0;
           if (rs.next()){
               balance = rs.getInt("balance");
           }
           
           if(ae.getSource()== back){
               this.setVisible(false);
               new Transactions(pinnumber).setVisible(true);
               return;
               
           }
           if(balance < withdrawlAmount){
               JOptionPane.showMessageDialog(null, "Insufficient Balance");
               return;
           
           }
           
           balance -= withdrawlAmount;
           Date date = new Date();
           c.s.executeUpdate("insert into bank (pin,date,type,amount,balance) values ('"+pinnumber+"','"+date+"','Withdrawl','"+withdrawlAmount+"','"+balance+"')");
           JOptionPane.showMessageDialog(null, "Rs. " + withdrawlAmount +" Debited Successfully ");
           
           setVisible(false);
           new Transactions(pinnumber).setVisible(true);
           
           
       }catch (Exception e){
           System.out.println(e);
       }
    }
    
    public static void main(String[] args){
        new FastCash("");
    }
    
}

