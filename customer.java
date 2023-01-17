
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

class customer extends JFrame{
    JLabel user, pass, type, message;
    JTextField username;
    JPasswordField password;

    JFrame secondFrame;

    JButton btnlogin;
    JButton btnreg;


    public customer(){
        setLayout(null);
        setTitle("Grocery Store");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //labels
        type = new JLabel("Customer");
        user = new JLabel("Username");
        pass = new JLabel("Password");
        message = new JLabel("");
      
        //label bounds
        type.setBounds(130,20,80,25);
        type.setFont(new Font("Helvetica", Font.BOLD, 14));
        user.setBounds(30,100,80,25);
        pass.setBounds(30,140,80,25);
        
        //text field
        username = new JTextField(20);
        password = new JPasswordField(20);
        
        //text field bounds
        username.setBounds(100,100,165,25);
        password.setBounds(100,140,165,25);
        
        
        add(user);
        add(pass);
        add(type);
        add(username);
        add(password);
        add(message);
        
        //buttons
        btnlogin = new JButton("Login");
        btnreg = new JButton("Register");
        
        //button bounds
        btnlogin.setBounds(40,200,80,20);
        btnreg.setBounds(200,200,90,20);
        
        add(btnlogin);
        add(btnreg);
        
        btnlogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent b){
                boolean parehas = false;
                String user, passmo;
                user = username.getText().toString();
                passmo = password.getText().toString();
                
                try {               
                    FileReader fr = new FileReader("login.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String pl;
					
                        while((pl = br.readLine())!= null) {
				if(pl.equals(user+"\t"+passmo)) {
                                    parehas = true;
                                    break;
				}
			}
			fr.close();
					
                        if(parehas) {
                            dispose();
                            //dito papasok dapat yung next na mangyayari after pindutin yung login
                            Table t = new Table();
                            t.setBounds(400, 200, 700, 400);
                            t.setVisible(true);
			}
                        else {                          
                            JOptionPane.showMessageDialog(secondFrame, "Invalid Username of Password!");
                        }					
                }catch(Exception e) {}
            }
        });
        btnreg.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ac){
                dispose();
                register rg = new register();
                rg.setBounds(400,200,300,300);
                rg.setVisible(true);
            }
        });
    }
}