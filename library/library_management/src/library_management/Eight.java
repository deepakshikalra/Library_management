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

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Eight extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eight frame = new Eight();
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
	public Eight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblEmail = new JLabel("E-MAIL :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblContactNo = new JLabel("CONTACT NO. :");
		lblContactNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblAddress = new JLabel("ADDRESS :");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblGender = new JLabel("GENDER :");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("MALE");
		comboBox.addItem("FEMALE");

		
		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnConfirm)
				{
					
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","deepakshikalra");
						
						String query="INSERT into librarian values(?,?,?,?,?)";
						
						String name=textField.getText();
						String email=textField_1.getText();
						String cno=textField_2.getText();
						String address=textField_3.getText();
						String gender=comboBox.getSelectedItem().toString();
											
					PreparedStatement ps=conn.prepareStatement(query);
					ps.setString(1, name);
					ps.setString(2,email);
					ps.setString(3,cno);
					ps.setString(4,address);
					ps.setString(5,gender);
										
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "NEW MEMBER ADDED");
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
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			   if(arg0.getSource()==btnCancel)
			   {
				   Seventh s=new Seventh();
				   s.setVisible(true);
				dispose();
			   }
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
				
		JLabel lblPleaseFillDetails = new JLabel("PLEASE FILL DETAILS :-");
		lblPleaseFillDetails.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblName)
										.addComponent(lblEmail)
										.addComponent(lblContactNo)
										.addComponent(lblAddress)
										.addComponent(lblGender))
									.addGap(33)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(textField_3)
										.addComponent(textField_2)
										.addComponent(textField_1)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
								.addComponent(lblPleaseFillDetails)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(90)
							.addComponent(btnConfirm)
							.addGap(74)
							.addComponent(btnCancel)))
					.addContainerGap(116, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addComponent(lblPleaseFillDetails)
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContactNo)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddress)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGender)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConfirm)
						.addComponent(btnCancel))
					.addGap(22))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}
}
