
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    
    JTextField pin, repin;
    JButton change,back;
    String pinnumber;
    
    
    PinChange(String pinnumber){
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        JPanel contentPanel5 = new JPanel();
        contentPanel5.setLayout(null);
        contentPanel5.setBackground(Color.WHITE);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        text.setBounds(250,280,500,35);
        image.add(text);
        
        JLabel pintext = new JLabel("New PIN");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        pintext.setBounds(165,320,180,25);
        image.add(pintext);
        
        pin = new JTextField();
        pin.setFont(new Font("Raleway", Font.BOLD,25));
        pin.setBounds(330,320,180,25);
        image.add(pin);
                
        
        
        JLabel repintext = new JLabel("Re-Enter New PIN");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,16));
        repintext.setBounds(165,360,180,25);
        image.add(repintext);
        
        repin = new JTextField();
        repin.setFont(new Font("Raleway", Font.BOLD,25));
        repin.setBounds(330,360,180,25);
        image.add(repin);
        
        
        change = new JButton("CHANGE");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        add(contentPanel5);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
   
    @Override
    public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource()== change){
            
                String npin = pin.getText();
                String rpin = repin.getText();
            
                if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null, "Entered PIN doesnot match");
                    return;
                }
                
                if(npin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter new PIN");
                    return;
                }
                
                if(rpin.equals("")){
                    JOptionPane.showMessageDialog(null, "Pls Re-Enter new PIN ");
                    return;
                }
                
                Conn conn = new Conn();
                String query1 = "update bank set pin = '"+rpin+"' where pin ='"+pinnumber+"'";
                String query2 = "update login set pin = '"+rpin+"' where pin ='"+pinnumber+"'";
                String query3 = "update signupthree set pin = '"+rpin+"' where pin ='"+pinnumber+"'";
                
                
                System.out.println("Executing query: " + query1);
                System.out.println("Executing query: " + query2);
                System.out.println("Executing query: " + query3);
                
                int rowsUpdated1 = conn.s.executeUpdate(query1);
                int rowsUpdated2 = conn.s.executeUpdate(query2);
                int rowsUpdated3 = conn.s.executeUpdate(query3);
                
                
                System.out.println("Rows updated in bank: " + rowsUpdated1);
                System.out.println("Rows updated in login: " + rowsUpdated2);
                System.out.println("Rows updated in signupthree: " + rowsUpdated3);

                // Success message if rows were updated
                if (rowsUpdated1 > 0 || rowsUpdated2 > 0 || rowsUpdated3 > 0) {
                    JOptionPane.showMessageDialog(null, "PIN Changed Successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "PIN Change Failed. Please try again.");
                }
                
                JOptionPane.showMessageDialog(null, "PIN Changed ");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            
            }else{
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
        
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
    
    public static void main(String[] args){
        
         new PinChange("");
    }
    
}
