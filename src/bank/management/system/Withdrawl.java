
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.*;



public class Withdrawl extends JFrame implements ActionListener{
    JButton withdraw,back;
    String pinnumber;
    JTextField amount;
    
    Withdrawl(String pinnumber){
        this.pinnumber = pinnumber;
        
        JPanel contentPanel4 = new JPanel();
        contentPanel4.setLayout(null);
        contentPanel4.setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        contentPanel4.add(image);
        
        JLabel text = new JLabel("Enter the amount you want to Withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        text.setBounds(180,300,400,20);
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170,350,320,25);
        contentPanel4.add(amount);
        
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355,485,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        
        add(contentPanel4);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== withdraw){
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to withdraw");
                }else {
                try {
                    Conn conn = new Conn();
                    
                     // Step 1: Calculate the current balance
                    ResultSet rs = conn.s.executeQuery("SELECT balance FROM bank WHERE pin = '" + pinnumber + "' ORDER BY date DESC LIMIT 1");
                    int balance = 0;
                    if (rs.next()) {
                        balance = rs.getInt("balance");
                    }

                    // Step 2: Check if there's enough balance to withdraw
                    int withdrawAmount = Integer.parseInt(number);
                    if (balance < withdrawAmount) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                    }

                    // Step 3: Deduct withdrawal amount from balance
                    balance -= withdrawAmount;
                    
                
                    
                    String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+number+"', '" + balance + "')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "RS"+number+" withdraw Successfully");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                    
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
           
            
        }if(ae.getSource()== back){
        
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    
    
    public static void main(String[] args){
    
        new Withdrawl("");
    }
    
}
