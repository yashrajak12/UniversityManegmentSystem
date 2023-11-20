
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class AddStudent extends JFrame{
    
    JTextField tfname,tffname, tfaddress, tfphone, tfemail, tfX, tfXII;
    JLabel labelrollno;
    JDateChooser dcdob;
    
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);
    
    AddStudent(){
        setSize(900,700);
        setLocation(350,50);
        setLayout(null);
        
        JLabel heading = new JLabel("New Students Details");
        heading.setBounds(310,30,500,50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);
        
        JLabel lb1name = new JLabel("Name");
        lb1name.setBounds(50,150,100,30);
        lb1name.setFont(new Font("serif", Font.BOLD, 20));
        add(lb1name);
        
        tfname = new JTextField();
        tfname.setBounds(200,160,150,30);
        add(tfname);
        
        JLabel lbfname = new JLabel(" Father's Name");
        lbfname.setBounds(400,150,200,30);
        lbfname.setFont(new Font("serif", Font.BOLD, 20));
        add(lbfname);
        
        tffname = new JTextField();
        tffname.setBounds(600,150,150,30);
        add(tffname);
        
        JLabel lb1rollno = new JLabel("Roll Number");
        lb1rollno.setBounds(50,200,200,30);
        lb1rollno.setFont(new Font("serif", Font.BOLD, 20));
        add(lb1rollno);
        
        labelrollno = new JLabel("3155"+first4);
        labelrollno.setBounds(200,200,200,30);
        labelrollno.setFont(new Font("serif", Font.BOLD,20));
        add(labelrollno);
        
        JLabel lb1dob = new JLabel(" Date of Birth");
        lb1dob.setBounds(400,200,200,30);
        lb1dob.setFont(new Font("serif", Font.BOLD, 20));
        add(lb1dob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(600,200,150,30);
        add(dcdob);
        
        JLabel lb1address = new JLabel("Address");
        lb1address.setBounds(400,250,200,30);
        lb1address.setFont(new Font("serif", Font.BOLD, 20));
        add(lb1address);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(600,250,150,30);
        add(tfaddress);
        
        JLabel lb1phone = new JLabel("Phone no.");
        lb1phone.setBounds(50,250,200,30);
        lb1phone.setFont(new Font("serif", Font.BOLD, 20));
        add(lb1phone);
        
        tfphone = new JTextField();
        tfphone.setBounds(200,250,150,30);
        add(tfphone);
        
        JLabel lb1email = new JLabel("Email ID");
        lb1email.setBounds(50,300,200,30);
        lb1email.setFont(new Font("serif", Font.BOLD, 20));
        add(lb1email);
        
        tfemail = new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        
        JLabel lb1X = new JLabel("Class X (%)");
        lb1X.setBounds(400,300,200,30);
        lb1X.setFont(new Font("serif", Font.BOLD, 20));
        add( lb1X);
        
        tfX = new JTextField();
        tfX.setBounds(600,300,150,30);
        add(tfX);
        
        JLabel lb1XII= new JLabel("Class XII (%)");
        lb1XII.setBounds(50,350,200,30);
        lb1XII.setFont(new Font("serif", Font.BOLD, 20));
        add(lb1XII);
        
        tfXII = new JTextField();
        tfXII.setBounds(200,350,150,30);
        add(tfXII);
        
        setVisible(true);
    }
    
    public static void main(String args[]){
        new AddStudent();
        
    }
}
