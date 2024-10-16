
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupOne extends JFrame implements ActionListener {
    
    JTextField nameTextField, fatherNameTextField, dateofbirthTextField,
               emailTextField,addressTextField,cityTextField,pincodeTextField,stateTextField;
    JRadioButton male, female, others, married, unmarried;
    JButton next;
    
    SignupOne(){
        
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setBackground(Color.WHITE);
        
        ImageIcon s1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image s2 = s1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon s3 = new ImageIcon(s2);
        JLabel label = new JLabel(s3);
        label.setBounds(10,15,100,100);
        contentPanel.add(label);
                
        Random ran = new Random();
        long randomno = Math.abs(ran.nextLong() % 9000L + 1000L);
        
        JLabel formno = new JLabel("Application Form no:- " + randomno);
        formno.setBounds(120,20,600,100);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        contentPanel.add(formno);
        
        JLabel personaldetails = new JLabel("Page 1: Personal Details");
        personaldetails.setBounds(220,90,400,100);
        personaldetails.setFont(new Font("Raleway", Font.BOLD, 28));
        contentPanel.add(personaldetails); 

//===================================== creating a Form====================================================
        
        JLabel name = new JLabel("Name: ");
        name.setBounds(60, 200, 100,50);
        name.setFont(new Font("Osward", Font.BOLD, 24));
        contentPanel.add(name);
        
        nameTextField = new JTextField();
        nameTextField.setBounds(260, 210,400,30);
        nameTextField.setFont(new Font("Arial", Font.BOLD, 20));
        contentPanel.add(nameTextField);
        
        JLabel fatherName = new JLabel("Father Name: ");
        fatherName.setBounds(60, 260, 300, 50);
        fatherName.setFont(new Font("Osward", Font.BOLD, 24));
        contentPanel.add(fatherName);
        
        fatherNameTextField = new JTextField();
        fatherNameTextField.setBounds(260,270,400,30);
        fatherNameTextField.setFont(new Font("Arial", Font.BOLD,20));
        contentPanel.add(fatherNameTextField);
        
        JLabel dateofbirth = new JLabel("Date Of Birth: ");
        dateofbirth.setBounds(60,320,300,50);
        dateofbirth.setFont(new Font("Osward", Font.BOLD, 24));
        contentPanel.add(dateofbirth);
        
        dateofbirthTextField = new JTextField();
        dateofbirthTextField.setBounds(260,330,400,30);
        dateofbirthTextField.setFont(new Font("Arial", Font.BOLD, 20));
        contentPanel.add(dateofbirthTextField);
        
       
        JLabel gender = new JLabel("Gender: ");
        gender.setBounds(60, 380,300,50);
        gender.setFont(new Font("Osward", Font.BOLD, 24));
        contentPanel.add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(260, 390, 80,30);
        male.setFont(new Font("Osward", Font.BOLD, 20));
        contentPanel.add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(350, 390,100,30);
        female.setFont(new Font("Osward", Font.BOLD, 20));
        contentPanel.add(female);
        
        others = new JRadioButton("Others");
        others.setBounds(470, 390,100,30);
        others.setFont(new Font("Osward", Font.BOLD, 20));
        contentPanel.add(others);
        
        //Group the radio buttons to allow only one selection
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(others);
        
        JLabel emailAddress = new JLabel("Email Address: ");
        emailAddress.setBounds(60,410,300,100);
        emailAddress.setFont(new Font("Osward", Font.BOLD, 24));
        contentPanel.add(emailAddress);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(260,450,400,30);
        emailTextField.setFont(new Font("Arial", Font.BOLD, 20));
        contentPanel.add(emailTextField);
        
        JLabel maritalStatus = new JLabel("Marital Status: ");
        maritalStatus.setBounds(60,470,300,100);
        maritalStatus.setFont(new Font("Osward", Font.BOLD, 24));
        contentPanel.add(maritalStatus);
        
        married = new JRadioButton("Married");
        married.setBounds(260, 510, 100,30);
        married.setFont(new Font("Osward", Font.BOLD, 20));
        contentPanel.add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(380, 510,130,30);
        unmarried.setFont(new Font("Osward", Font.BOLD, 20));
        contentPanel.add(unmarried);
        
        others = new JRadioButton("Others");
        others.setBounds(520, 510,100,30);
        others.setFont(new Font("Osward", Font.BOLD, 20));
        contentPanel.add(others);
        
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(others);
        
        JLabel address = new JLabel("Address: ");
        address.setBounds(60, 560, 120,50);
        address.setFont(new Font("Osward", Font.BOLD, 24));
        contentPanel.add(address);
        
        addressTextField = new JTextField();
        addressTextField.setBounds(260, 570,400,30);
        addressTextField.setFont(new Font("Arial", Font.BOLD, 20));
        contentPanel.add(addressTextField);
        
        JLabel city = new JLabel("City: ");
        city.setBounds(60, 620, 150, 50);
        city.setFont(new Font("Osward", Font.BOLD, 24));
        contentPanel.add(city);
        
        cityTextField = new JTextField();
        cityTextField.setBounds(260,630,400,30);
        cityTextField.setFont(new Font("Arial", Font.BOLD,20));
        contentPanel.add(cityTextField);
        
        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setBounds(60,680,150,50);
        pincode.setFont(new Font("Osward", Font.BOLD, 24));
        contentPanel.add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setBounds(260,690,400,30);
        pincodeTextField.setFont(new Font("Arial", Font.BOLD, 20));
        contentPanel.add(pincodeTextField);
        
        JLabel state = new JLabel("State: ");
        state.setBounds(60,740,300,50);
        state.setFont(new Font("Osward", Font.BOLD, 24));
        contentPanel.add(state);
        
        stateTextField = new JTextField();
        stateTextField.setBounds(260,750,400,30);
        stateTextField.setFont(new Font("Arial", Font.BOLD, 20));
        contentPanel.add(stateTextField);
        
        next = new JButton("Next");
        next.setBounds(700,850,100,30);
        next.setFont(new Font("Osward", Font.BOLD,24));
        next.addActionListener(this);
        contentPanel.add(next);
   
// ------------------------ Set Prferred size for contentPanel(Adjust for scrolling)-----------------------------------------------------
        contentPanel.setPreferredSize(new Dimension(800,1100));
//-------------------- Wrapp the contentPanel inside a JScrollPane---------------------

        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBounds(0,0,850,900);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        add(scrollPane);
        
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setSize(850,900);
        setVisible(true);
        setLocation(350,10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
        nameTextField.setText("");
        }
    
    }
    
    public static void main(String[] args){
        
        new SignupOne();
    }
}
