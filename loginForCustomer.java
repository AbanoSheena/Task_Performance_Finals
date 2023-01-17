
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class loginForCustomer extends JFrame{
    JLabel user, pass, type, message;
    JTextField username;
    JPasswordField password;

    JFrame secondFrame;

    JButton btnlogin;
    JButton btnreg;


    public loginForCustomer(){
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
                    FileReader fr = new FileReader("registerForCustomer.txt");
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
                            Table1 t1 = new Table1();
                            t1.setBounds(400, 200, 700, 400);
                            t1.setVisible(true);
			}    
                        else {
                            JOptionPane.showMessageDialog(secondFrame, "Invalid Username or Password!");
                        }					
                }catch(Exception e) {}
            }
        });
        btnreg.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ac){              
                
                boolean match = false;
                String user1, pass1;
                user1 = username.getText().toString();
                pass1 = password.getText().toString();
                
                try {
                   FileReader fr = new FileReader("registerForCustomer.txt");
                   BufferedReader br = new BufferedReader(fr);
                   String hl;
                   
                        while((hl = br.readLine())!= null) {
				if(hl.equals(user1+"\t"+pass1)) {
                                    match = true;
                                    break;
				}
			}
                        fr.close();
                        
                        if(match){
                            
                            JOptionPane.showMessageDialog(secondFrame, "Username and Password already existing.");
                        }
                        else{
                            JOptionPane.showMessageDialog(secondFrame, "Register first.");
                            dispose();
                            registerForCustomer rfc = new registerForCustomer();
                            rfc.setBounds(400,200,300,300);
                            rfc.setVisible(true);
                        }

                } catch (Exception ex) {}   
            }
        });
    }
}