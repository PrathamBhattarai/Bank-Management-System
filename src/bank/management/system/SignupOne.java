
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;


public class SignupOne extends JFrame implements ActionListener {
    
    long randomno;
    JTextField nameTextField, fatherNameTextField,
               emailTextField,addressTextField,cityTextField,pincodeTextField,
                stateTextField;
    JDateChooser dateChooser;
    
    JRadioButton male, female, others1, married, unmarried, others2;
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
        randomno = Math.abs(ran.nextLong() % 9000L + 1000L);
        
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
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(260,330,400,30);
        dateChooser.setFont(new Font("Arial", Font.BOLD, 20));
        contentPanel.add(dateChooser);
        
       
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
        
        others1 = new JRadioButton("Others");
        others1.setBounds(470, 390,100,30);
        others1.setFont(new Font("Osward", Font.BOLD, 20));
        contentPanel.add(others1);
        
        //Group the radio buttons to allow only one selection
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(others1);
        
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
        
        others2 = new JRadioButton("Others");
        others2.setBounds(520, 510,100,30);
        others2.setFont(new Font("Osward", Font.BOLD, 20));
        contentPanel.add(others2);
        
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(others2);
        
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
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            String formno ="" + randomno;
            String name = nameTextField.getText();
            String fname = fatherNameTextField.getText();
            String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
            String gender = null;
            if(male.isSelected()){
                gender = "Male";
            }else if(female.isSelected()){
                gender = "Female";
            }else if(others1.isSelected()){
                gender = "Others";
            }
            
            String email = emailTextField.getText();
            String marital = null;
            if(married.isSelected()){
                marital = "Married";
            }else if (unmarried.isSelected()){
                marital = "Unmarried";
            }else if (others2.isSelected()){
                marital = "Others";
            }
            
            String address = addressTextField.getText();
            String city = cityTextField.getText();
            String pin = pincodeTextField.getText();
            String state = stateTextField.getText();
            
            
            try {
                if (name.equals("")) {
                    JOptionPane.showMessageDialog(null,"Name is Required");
                }else if(fname.equals("")){
                    JOptionPane.showMessageDialog(null, "Father Name is Required");
                    
                }else if (dob.equals("")){
                    JOptionPane.showMessageDialog(null, "Date of Birth is Required");
                }else if (gender == null){
                    JOptionPane.showMessageDialog(null, "Gender is Required");
                }else if (email.equals("")){
                    JOptionPane.showMessageDialog(null, "Email is Required");
                }else if (marital == null){
                    JOptionPane.showMessageDialog(null, "Marital Status is Required");
                    
                }else if (address.equals("")){
                    JOptionPane.showMessageDialog(null, "Address is Required");
                }else if (city.equals("")){
                    JOptionPane.showMessageDialog(null, "City is Required");
                }else if (pin.equals("")){
                    JOptionPane.showMessageDialog(null, "Pin is Required");
                }else if (state.equals("")){
                    JOptionPane.showMessageDialog(null, "State is Required");
                } else {
                    Conn c = new Conn();
                    String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                    c.s.executeUpdate(query);
                }
                
            }catch (Exception e){
                System.out.println(e);
            }
            setVisible(false);
            new SignupTwo(formno).setVisible(true);
 
            
        }
    
    }
    
    public static void main(String[] args){
        
        new SignupOne();
    }
}
