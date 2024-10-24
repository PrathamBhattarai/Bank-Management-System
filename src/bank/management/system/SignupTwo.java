
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignupTwo extends JFrame implements ActionListener {
    
    JComboBox<String> religionComboBox, categoryComboBox, incomeComboBox,
              qualificationComboBox, occupationComboBox;
    
    JTextField panTextField, adharTextField;
    
    JRadioButton yes1,no1,yes2,no2;
    
    JButton next;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        
        JPanel contentPanel2 = new JPanel();
        contentPanel2.setLayout(null);
        contentPanel2.setBackground(Color.WHITE);
        //contentPanel2.setBounds(0,0,850,900);
        contentPanel2.setPreferredSize(new Dimension(850,1100));
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0,10,300,100);
        contentPanel2.add(label);
        
      
        JLabel text = new JLabel("Page 2: Additional Details");
        text.setBounds(200,20,400,100);
        text.setFont(new Font("Raleway", Font.BOLD,28));
        contentPanel2.add(text);
        
        JLabel religion = new JLabel("Religion: ");
        religion.setBounds(100,150,150,100);
        religion.setFont(new Font("Osward", Font.BOLD,24));
        contentPanel2.add(religion);
        
        String[] items1= {"Hindu", "Mulsim", "Buddhist", "Jain", "Atheist"};
        religionComboBox = new JComboBox<>(items1);
        religionComboBox.setBounds(400,185,400,30);
        religionComboBox.setFont(new Font("Osward", Font.BOLD, 20));
        contentPanel2.add(religionComboBox);
        
        JLabel category = new JLabel("Category: ");
        category.setFont(new Font("Osward", Font.BOLD,24));
        category.setBounds(100,210,150,100);
        contentPanel2.add(category);
        
        String[] items2 = {"General", "OBC", "SC", "ST", "Other"};
        categoryComboBox = new JComboBox<>(items2);
        categoryComboBox.setFont(new Font("Osward", Font.BOLD,20));
        categoryComboBox.setBounds(400,240,400,30);
        contentPanel2.add(categoryComboBox);
        
        
        
        JLabel income = new JLabel("Income: ");
        income.setFont(new Font("Osward",Font.BOLD,24));
        income.setBounds(100,270,150,100);
        contentPanel2.add(income);
        
        String[] items3 = {"Null", "< 1,50,000","< 2,50,000","< 5,00,000","10,00,000"};
        incomeComboBox = new JComboBox<>(items3);
        incomeComboBox.setFont(new Font("Osward", Font.BOLD,20));
        incomeComboBox.setBounds(400,300,400,30);
        contentPanel2.add(incomeComboBox);
        
         JLabel qualification = new JLabel("Qualification: ");
        qualification.setBounds(100,330,200,100);
        qualification.setFont(new Font("Osward", Font.BOLD,24));
        contentPanel2.add(qualification);
        
        String[] items4= {"Non-Graduate", "Graduate", "Post Graduate", "Doctrate", "others"};
        qualificationComboBox = new JComboBox<>(items4);
        qualificationComboBox.setBounds(400,360,400,30);
        qualificationComboBox.setFont(new Font("Osward", Font.BOLD, 20));
        contentPanel2.add(qualificationComboBox);
        
        JLabel occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Osward", Font.BOLD,24));
        occupation.setBounds(100,390,200,100);
        contentPanel2.add(occupation);
        
        String[] items5 = {"Salaried", "Self_Employed", "Bussiness", "Student", "Retired" , "Other"};
        occupationComboBox = new JComboBox<>(items5);
        occupationComboBox.setFont(new Font("Osward", Font.BOLD,20));
        occupationComboBox.setBounds(400,420,400,30);
        contentPanel2.add(occupationComboBox);
        
        
        
        JLabel pan = new JLabel("Pan Number: ");
        pan.setFont(new Font("Osward",Font.BOLD,24));
        pan.setBounds(100,450,200,100);
        contentPanel2.add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Osward", Font.BOLD,20));
        panTextField.setBounds(400,480,400,30);
        contentPanel2.add(panTextField);
        
        JLabel adharnumber = new JLabel("Adhar Number: ");
        adharnumber.setFont(new Font("Osward",Font.BOLD,24));
        adharnumber.setBounds(100,510,200,100);
        contentPanel2.add(adharnumber);
        
        adharTextField = new JTextField();
        adharTextField.setFont(new Font("Osward", Font.BOLD,20));
        adharTextField.setBounds(400,540,400,30);
        contentPanel2.add(adharTextField);
        
        JLabel seniorCitizen = new JLabel("Senior Citizen: ");
        seniorCitizen.setFont(new Font("Osward",Font.BOLD,24));
        seniorCitizen.setBounds(100,570,200,100);
        contentPanel2.add(seniorCitizen);
        
        yes1 = new JRadioButton("Yes");
        yes1.setFont(new Font("Osward", Font.BOLD,20));
        yes1.setBounds(400,600,100,30);
        contentPanel2.add(yes1);
        
        no1 = new JRadioButton("No");
        no1.setFont(new Font("Osward", Font.BOLD,20));
        no1.setBounds(600,600,100,30);
        contentPanel2.add(no1);
        
        ButtonGroup seniorgrp= new ButtonGroup();
        seniorgrp.add(yes1);
        seniorgrp.add(no1);
        
        JLabel existingAccount = new JLabel("Existing Account: ");
        existingAccount.setFont(new Font("Osward",Font.BOLD,24));
        existingAccount.setBounds(100,630,300,100);
        contentPanel2.add(existingAccount);
        
        yes2 = new JRadioButton("Yes");
        yes2.setFont(new Font("Osward", Font.BOLD,20));
        yes2.setBounds(400,660,100,30);
        contentPanel2.add(yes2);
        
        no2 = new JRadioButton("No");
        no2.setFont(new Font("Osward", Font.BOLD,20));
        no2.setBounds(600,660,100,30);
        contentPanel2.add(no2);
        
        ButtonGroup accountgrp= new ButtonGroup();
        accountgrp.add(yes1);
        accountgrp.add(no1);
        
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,24));
        next.setBounds(700,850,100,30);
        next.addActionListener(this);
        contentPanel2.add(next);
        
        
        
        
        
        JScrollPane scrollPane2 = new JScrollPane(contentPanel2);
        scrollPane2.setBounds(0,0,850,900);
        scrollPane2.getVerticalScrollBar().setUnitIncrement(16);
       
        add(scrollPane2);
        
        setLayout(null);
        setSize(850,900);
        setVisible(true);
        setLocation(350,10);
        setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == next){
             
             String sreligion = (String) religionComboBox.getSelectedItem();
             String scategory = (String) categoryComboBox.getSelectedItem();
             String sincome = (String) incomeComboBox.getSelectedItem();
             String squalification = (String) qualificationComboBox.getSelectedItem();
             String soccupation = (String ) occupationComboBox.getSelectedItem();
             String span = panTextField.getText();
             String sadhar = adharTextField.getText();
             String scitizen = null;
             if(yes1.isSelected()){
                scitizen = "Senior Citizen";
             }else if(no1.isSelected()){
                scitizen = "Not Senior Citizen";
             }
             String sexistingaccount = null;
             if(yes2.isSelected()){
                 sexistingaccount = "YES acount Exists";
             }else if (no2.isSelected()){
                 sexistingaccount = "NO account Doesnot Exist";
             }
             
             try{
                 if(span.equals("") || sadhar.equals("") || scitizen == null || sexistingaccount == null)
                 {
                    JOptionPane.showMessageDialog(null, "Pls fill out each and every boxes");
                 } else {
                     Conn c = new Conn();
                     String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+squalification+"','"+soccupation+"','"+span+"','"+sadhar+"','"+scitizen+"','"+sexistingaccount+"')";
                    c.s.executeUpdate(query);
                 }
             
             }catch (Exception e){
                 System.out.println(e);
             }
         }
            
    }
    
    public static void main(String[] args){
        
        new SignupTwo("");
    
    }
    }
    
