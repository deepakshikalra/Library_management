package library_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class First extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private final JLabel lblWelcome = new JLabel("Welcome");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First frame = new First();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public First() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame j=new JFrame("Welcome");
		j.setTitle("WELCOME");
		setBounds(100, 100, 506, 300);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(50, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Traditional Arabic", Font.PLAIN, 13));
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Traditional Arabic", Font.PLAIN, 13));
		
		passwordField = new JPasswordField();
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("ADMIN");
		comboBox.addItem("LIBRARIAN");
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnLogin)
				{
					
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","deepakshikalra");
						String query=" SELECT * from forgot  where uname=? and password=?";
						PreparedStatement ps=conn.prepareStatement(query);
						String value=comboBox.getSelectedItem().toString();
						String pwd=new String(passwordField.getPassword());
						ps.setString(1, value);
						ps.setString(2,pwd );
						ResultSet res=ps.executeQuery();
						
						if(res.next())
						{
							if(value.equals("LIBRARIAN"))
							{
							Second s=new Second();
							s.setVisible(true);
							dispose();
							}
							else
							{
								Seventh s=new Seventh();
								s.setVisible(true);
								dispose();
							}
							
						}
						
						else
						{
							JOptionPane.showMessageDialog(null, "INAVALID USERNAME OR PASSWORD");;
						}
					conn.close();
					ps.close();
					}
					
					catch(Exception ex)
					{
						System.out.println(ex);
					}
					
				}
				
							}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnForgotPassword = new JButton("Forgot Password");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnForgotPassword)
				{
					try
					{
						
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","deepakshikalra");
					String query="UPDATE forgot set password='12345' where uname=?";
					PreparedStatement ps=con.prepareStatement(query);
					
					String uname=JOptionPane.showInputDialog("ENTER USENAME");
					JOptionPane.showMessageDialog(null,"YOUR NEW PASSWORD IS 12345");

					ps.setString(1,uname);
				//ps.setString(2,password);
					
					ps.executeUpdate();
					
					
					con.close();
					ps.close();
					}
					catch(Exception ex)
					{
					   ex.printStackTrace();
					}
				}
			}
		});
		btnForgotPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnCancel)
				{
					System.exit(0);
				}
			}
		});
		
		JLabel lblWelcomeToLibrary = new JLabel("WELCOME TO LIBRARY");
		lblWelcomeToLibrary.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(51)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblUsername)
										.addComponent(lblPassword))
									.addGap(52))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnLogin)
									.addGap(34)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(btnForgotPassword)
									.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
									.addComponent(btnCancel))
								.addComponent(passwordField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
								.addComponent(comboBox, 0, 236, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblWelcome, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)))
					.addGap(77))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(60)
					.addComponent(lblWelcomeToLibrary)
					.addContainerGap(169, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblWelcome, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(lblWelcomeToLibrary)
					.addGap(54)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsername)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancel)
						.addComponent(btnForgotPassword)
						.addComponent(btnLogin))
					.addGap(31))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}
}
