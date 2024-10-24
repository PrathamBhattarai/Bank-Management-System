
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignupThree extends JFrame implements ActionListener {
    
    JButton submit, cancel;
    JRadioButton savingaccount, fixeddeposit,currentaccount,recurringdeposit;
    JCheckBox c1, c2,c3,c4,c5,c6,c7;
    
    SignupThree(String formno){
        
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
        
        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("Raleway", Font.BOLD,24));
        services.setBounds(120,620,300,30);
        contentPanel3.add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Ralseway", Font.BOLD,16));
        c1.setBounds(120,660,200,30);
        contentPanel3.add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Ralseway", Font.BOLD,16));
        c2.setBounds(420,660,200,30);
        contentPanel3.add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Ralseway", Font.BOLD,16));
        c3.setBounds(120,700,200,30);
        contentPanel3.add(c3);
        
        c4 = new JCheckBox("Email Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Ralseway", Font.BOLD,16));
        c4.setBounds(420,700,200,30);
        contentPanel3.add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Ralseway", Font.BOLD,16));
        c5.setBounds(120,740,200,30);
        contentPanel3.add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Ralseway", Font.BOLD,16));
        c6.setBounds(420,740,200,30);
        contentPanel3.add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct to the best of my Knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Ralseway", Font.BOLD,16));
        c7.setBounds(120,820,700,30);
        contentPanel3.add(c7);
        
        
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD, 24));
        submit.setBounds(680,1000,150,30);
        submit.addActionListener(this);
        submit.setEnabled(false);
        contentPanel3.add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 24));
        cancel.setBounds(440,1000,150,30);
        cancel.addActionListener(this);
        contentPanel3.add(cancel);
        
        
        
        add(contentPanel3);
        
        JScrollPane scrollPane = new JScrollPane(contentPanel3);
        scrollPane.setBounds(0,0,900,900);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        
        add(scrollPane);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(900,900);
        setVisible(true);
        setLocation(0,10);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        c7.addItemListener(new ItemListener(){
        @Override
        public void itemStateChanged(ItemEvent e){
            if (c7.isSelected()){
                submit.setEnabled(true);
            }else{
                submit.setEnabled(false);
            }
        
        }
    });
        
        

        
    
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
          String accountType = null;
          if (savingaccount.isSelected()){
              accountType = "Saving Account";
          }else if (fixeddeposit.isSelected()){
              accountType = "Fixed Deposit Account";
          }else if (currentaccount.isSelected()){
              accountType = "Current Account";
          }else if (recurringdeposit.isSelected()){
              accountType = "Recurring Deposit Account";           
          }
          
          Random random = new Random();
          String cardnumber =""+ Math.abs((random.nextLong()%90000000L)) + 5040936000000000L;
          String pinnumber =""+ Math.abs((random.nextLong()%9000L)) + 1000L;
          
          String facility = "";
          if(c1.isSelected()){
              facility = facility + "ATM Card";
          }else if(c2.isSelected()){
              facility = facility + "Internet Banking";
          }else if(c3.isSelected()){
              facility = facility + "Mobile Banking";
          }else if(c4.isSelected()){
              facility = facility + "Email & SMS Alerts";
          }else if(c5.isSelected()){
              facility = facility + "Cheque Book";
          }else if(c6.isSelected()){
              facility = facility + "E-Statement";
          }
          
          try{
              
              if(accountType.equals("")){
                  JOptionPane.showMessageDialog(null, "Account Type is Required");
              }else {
                  Conn conn = new Conn();
                  String query1 = "insert into signup values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                  conn.s.executeUpdate(query1);
              }
            
          } catch (Exception e){
              System.out.println(e);
          }
          
         
          
          
        }else if (ae.getSource()== cancel){
            setVisible(false);
        }
        
        

    }
    
    public static void main(String[] args){
        
        new SignupThree("");
    
    }
}
