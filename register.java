
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class register extends JFrame{
    JLabel name, fname, lname, pass;
    JTextField name1, fname1, lname1;
    JPasswordField pass1;
    
    JButton btnsubmit, btnbacklog;
    
    public register(){
       
        setTitle("Registration Form");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //labels
        fname = new JLabel("First Name");
        lname = new JLabel("Last Name");
        name = new JLabel("Username");
        pass = new JLabel("Password");
        
        //label bounds
        fname.setBounds(30,40,80,25);
        lname.setBounds(30,80,80,25);
        name.setBounds(30,120,80,25);
        pass.setBounds(30,160,80,25);
        
        //text fields
        fname1 = new JTextField(20);
        lname1 = new JTextField(20);
        name1 = new JTextField(20);
        pass1 = new JPasswordField(20);
        
        //text field bounds
        fname1.setBounds(100,40,165,25);
        lname1.setBounds(100,80,165,25);
        name1.setBounds(100,120,165,25);
        pass1.setBounds(100,160,165,25);
        
        add(fname);
        add(lname);
        add(name);
        add(pass);
        add(fname1);
        add(lname1);
        add(name1);
        add(pass1);      
                
        //button 
        btnsubmit = new JButton("Submit");
        btnbacklog = new JButton("Back");
        
        //button bounds
        btnsubmit.setBounds(170,200,90,20);
        btnbacklog.setBounds(40,200,90,20);
        
        add(btnsubmit);
        add(btnbacklog);
        
        btnsubmit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent a){                   
                try {
                    login lg = new login();
                    FileWriter fw = new FileWriter("login.txt", true);
                    if(name1.getText().equals("")||pass1.getText().equals("")){
                        JFrame frame2 = new JFrame();
                        JOptionPane.showMessageDialog(frame2, "Please enter all data.");
                    }
                    else{
                        fw.write(name1.getText()+"\t"+pass1.getText()+"\n");
                        fw.close();
                        JFrame frame1 = new JFrame();
                        JOptionPane.showMessageDialog(frame1, "Registration Complete!");
                        dispose();
                        lg.setBounds(400,200,350,300);
                        lg.setVisible(true);
                    }
                    
                }catch (Exception e){}
                
            }
        });
        btnbacklog.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent a){
                dispose();
                register r = new register();
                r.hide();
                login lg = new login();
                lg.setBounds(400,200,350,300);
                lg.setVisible(true);
            }
        });
    }
}