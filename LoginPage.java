import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPage extends JFrame implements ActionListener
{
	
  ArrayList<User>users=new ArrayList<User>();
  JButton btnRegister=new JButton("Forgot my password!");
  JButton btnLogin=new JButton("Login");
  JTextField txtUsername=new JTextField();
  JTextField txtPassword=new JTextField();
  
  public LoginPage() 
  {
	 super("Login");
	 setDefaultCloseOperation(HIDE_ON_CLOSE);
	 setSize(400,200);
	 //setLayout(new GridLayout(3,2));
	 setLayout(new BorderLayout());
	 btnRegister.setBackground(Color.BLUE);
	 btnRegister.setForeground(Color.white);
     btnLogin.setBackground(Color.darkGray);
     btnLogin.setForeground(Color.white);
     
	 JPanel pnlCenter=new JPanel(new GridLayout(3,2));
	 pnlCenter.add(new JLabel("Username:"));
	 pnlCenter.add(txtUsername);
	 pnlCenter.add(new JLabel("Password:"));
	 pnlCenter.add(txtPassword);
	 pnlCenter.add(btnRegister);
	 pnlCenter.add(btnLogin);	 
	 add(pnlCenter,BorderLayout.CENTER);

	 btnRegister.addActionListener(this); 
	 btnLogin.addActionListener(this);
	 users.add(new User("Zafer Demir","123456"));
	 users.add(new User("Hasan Pasali","1234567"));
	 users.add(new User("Onur Ozkinaci","12345"));
  }

  @Override
  public void actionPerformed(ActionEvent e)
 {
	boolean flag=false;
	if(e.getSource()==btnRegister)
	{
	//register sayfasini acicak.
	 JOptionPane.showMessageDialog
	  (null, "Register page gonna open soon!");
	}
	
	if(e.getSource()==btnLogin)
	{
	//login sonrasi ana sayfayi acicak.
	 //OptionPane.showMessageDialog
	  //(null, "After login page gonna open soon!");
	 for (int i = 0; i <users.size(); i++) 
	 {
	   if(users.get(i).getUserName().equals(txtUsername.getText())
		  &&users.get(i).getPassword().equals(txtPassword.getText()))
	   {
		   JOptionPane.showMessageDialog
			 (null, "Welcome to the Car Design system!");
		   flag=true;
		   break;
	   }
	 }
	 if(flag==false)
	 JOptionPane.showMessageDialog
	 (null, "Please enter a valid username and password or register first!"); 
  }
	
 }
  
  public static void main(String[]args)
  {
	 new LoginPage().setVisible(true);
  }
  
}
