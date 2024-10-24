
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignupThree extends JFrame {
    
    JButton next;
    JRadioButton savingaccount, fixeddeposit,currentaccount,recurringdeposit;
    
    SignupThree(){
        
        JPanel contentPanel3 = new JPanel();
        contentPanel3.setLayout(null);
        contentPanel3.setBackground(Color.WHITE);
        contentPanel3.setPreferredSize(new Dimension(850,1100));
        
        ImageIcon s1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image s2 = s1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon s3 = new ImageIcon(s2);
        JLabel label = new JLabel(s3);
        label.setBounds(0,10,300,100);
        contentPanel3.add(label);
        
        JLabel text = new JLabel("Page 3:Account Details");
        text.setFont(new Font("Raleway", Font.BOLD,28));
        text.setBounds(200,20,400,100);
        contentPanel3.add(text);
        
        JLabel accountType = new JLabel("Account Type: ");
        accountType.setFont(new Font("Osward", Font.BOLD, 24));
        accountType.setBounds(120, 150,200,100);
        contentPanel3.add(accountType);
        
        savingaccount = new JRadioButton("Saving Account");
        savingaccount.setFont(new Font("Osward", Font.BOLD,20));
        savingaccount.setBounds(120, 230, 200, 30);
        contentPanel3.add(savingaccount);
        
        fixeddeposit = new JRadioButton("Fixed Deposit Account");
        fixeddeposit.setFont(new Font("Osward", Font.BOLD,20));
        fixeddeposit.setBounds(420,230,300,30);
        contentPanel3.add(fixeddeposit);
        
        
        currentaccount = new JRadioButton("Current Account");
        currentaccount.setFont(new Font("Osward", Font.BOLD,20));
        currentaccount.setBounds(120, 330, 200, 30);
        contentPanel3.add(currentaccount);
        
        recurringdeposit = new JRadioButton("Recurring Deposit Account");
        recurringdeposit.setFont(new Font("Osward", Font.BOLD,20));
        recurringdeposit.setBounds(420,330,300,30);
        contentPanel3.add(recurringdeposit);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(savingaccount);
        groupaccount.add(fixeddeposit);
        groupaccount.add(currentaccount);
        groupaccount.add(recurringdeposit);
        
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(120,450,200,30);
        contentPanel3.add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(420,450,300,30);
        contentPanel3.add(number);
        
        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(120,480,300,20);
        contentPanel3.add(carddetail);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(120,530,200,30);
        contentPanel3.add(pin);
        
        JLabel pindetail = new JLabel("Your 4 Digit PIN Number");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(120,560,300,20);
        contentPanel3.add(pindetail);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(420,530,300,30);
        contentPanel3.add(pnumber);
        
        
        
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD, 24));
        next.setBounds(680,650,100,30);
        contentPanel3.add(next);
        
        add(contentPanel3);
        
        setSize(900,900);
        setVisible(true);
        setLocation(0,10);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    
    public static void main(String[] args){
        
        new SignupThree();
    
    }
}
