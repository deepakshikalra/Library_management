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
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Fifth extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fifth frame = new Fifth();
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
	public Fifth() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 461);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblPleaseFillDetails = new JLabel("Please fill details of new book");
		lblPleaseFillDetails.setFont(new Font("Traditional Arabic", Font.PLAIN, 25));
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblAuthorName = new JLabel("AUTHOR NAME :");
		lblAuthorName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblEddition = new JLabel("EDDITION :");
		lblEddition.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblPublisherName = new JLabel("PUBLISHER NAME :");
		lblPublisherName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblBookid = new JLabel("BOOK_ID :");
		lblBookid.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnAdd)
				{
					
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","deepakshikalra");
						
						String query="INSERT into newbbook values(?,?,?,?,?)";
						
						String name=textField.getText();
						String authorname=textField_1.getText();
						String eddition=textField_2.getText();
						
						String pname=textField_3.getText();
						String book_id=textField_4.getText();
											
					PreparedStatement ps=conn.prepareStatement(query);
					ps.setString(1, name);
					ps.setString(2,authorname);
					ps.setString(3,eddition);
					ps.setString(4,pname);
					ps.setString(5,book_id);
										
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "NEW BOOK ADDED");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
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
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnBack)
				{
					Second s=new Second();
					s.setVisible(true);
					dispose();
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnCancel)
				{
					Second s=new Second();
					s.setVisible(true);
					dispose();
				}

				
			
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(49)
							.addComponent(lblPleaseFillDetails))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName)
								.addComponent(lblAuthorName)
								.addComponent(lblEddition)
								.addComponent(lblPublisherName)
								.addComponent(lblBookid))
							.addGap(49)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_4)
								.addComponent(textField_3)
								.addComponent(textField_2)
								.addComponent(textField_1)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(58)
							.addComponent(btnBack)
							.addGap(42)
							.addComponent(btnAdd)
							.addGap(45)
							.addComponent(btnCancel)))
					.addContainerGap(124, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(45)
					.addComponent(lblPleaseFillDetails)
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAuthorName)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEddition)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPublisherName)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBookid)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdd)
						.addComponent(btnBack)
						.addComponent(btnCancel))
					.addGap(20))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}
}
