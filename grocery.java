import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.swing.JOptionPane;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


class type extends JFrame {
    
    JLabel choose;
    
    JButton btntype1, btntype2;
    
    public type (){
        setTitle("Account Type");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //label
        choose = new JLabel("Please choose your account");
        choose.setFont(new Font("Century Gothic", Font.BOLD, 14));
        
        //label bound
        choose.setBounds(100,40,200,100);
        
        add(choose);
        
        //buttons
        btntype1 = new JButton("Employee");
        btntype2 = new JButton("Customer");
        
        //button bounds
        btntype1.setBounds(80,150,90,30);
        btntype2.setBounds(210,150,90,30);
        
        add(btntype1);
        add(btntype2);
        
        btntype1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ab){
                dispose();
                login l = new login();
                l.setBounds(400,200,350,300);
                l.setVisible(true);
            }
        });
        btntype2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ef){
                dispose();
                loginForCustomer lc = new loginForCustomer();
                lc.setBounds(400,200,350,300);
                lc.setVisible(true);
            }
        });
    }
}
public class grocery {
    //main method
    public static void main(String[] args) {
       
        type t = new type();
        t.setBounds(100,150,400,300);
        t.setVisible(true);
    }
}
