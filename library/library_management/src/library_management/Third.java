package library_management;
import java.sql.*;
import java.util.Scanner;
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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Third extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JComboBox comboBox=new JComboBox();
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Third frame = new Third();
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
	public Third() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBookRegister = new JLabel("BOOK REGISTER");
		lblBookRegister.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
									.addComponent(lblBookRegister))
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
							.addGap(21))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblBookRegister)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblNewLabel_1 = new JLabel("E-MAIL :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblNewLabel_2 = new JLabel("CONTACT :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblTotalFine = new JLabel("TOTAL FINE :");
		lblTotalFine.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.addItem("COMPUTER");
		comboBox.addItem("ELECTRICAL");
		comboBox.addItem("ELECTRONICS");
		comboBox.addItem("MECHANICAL");
		comboBox.addItem("CIVIL");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2)
						.addComponent(lblTotalFine))
					.addGap(43)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_7)
						.addComponent(textField_6)
						.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
					.addContainerGap(165, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblTotalFine))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JButton btnViewAllData = new JButton("VIEW ALL DATA");
		btnViewAllData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnViewAllData)
				{
					table t=new table();
					t.setVisible(true);
					dispose();
				}
			}
		});
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if(e.getSource()==btnSave)
				{
					
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","deepakshikalra");
						
						String query="INSERT into issuebook values(?,?,?,?,?,?,?,?,?,?)";
						
						String acc=textField.getText();
						String book_id=textField_1.getText();
						String tittle=textField_2.getText();
						
						String eddition=textField_3.getText();
						String no_of_pages=textField_4.getText();
						String issue_date=textField_5.getText();
						String type=comboBox.getSelectedItem().toString();
						String email=textField_6.getText();
						String contact=textField_7.getText();
						String fine=textField_8.getText();
					
					PreparedStatement ps=conn.prepareStatement(query);
					ps.setString(1, acc);
					ps.setString(2,book_id);
					ps.setString(3, type);
					ps.setString(4,tittle);
					ps.setString(5,eddition);
					ps.setString(6,no_of_pages);
					ps.setString(7, issue_date);
					ps.setString(8, email);
					ps.setString(9,contact);
					ps.setString(10, fine);
					
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "BOOK ISSUED");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
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
					Second s=new Second();
					s.setVisible(true);
					dispose();
				}
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnSave, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnViewAllData, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
					.addGap(18))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(21)
					.addComponent(btnViewAllData)
					.addGap(18)
					.addComponent(btnSave)
					.addGap(18)
					.addComponent(btnCancel)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblAccNo = new JLabel("ACC NO. :\r\n");
		lblAccNo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAccNo.setHorizontalAlignment(SwingConstants.LEFT);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblBookTittle = new JLabel("BOOK TITTLE:");
		lblBookTittle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblBookType = new JLabel("BOOK TYPE :");
		lblBookType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblNewLabel = new JLabel(" EDDITION :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNoOfPages = new JLabel("NO. OF PAGES :");
		lblNoOfPages.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblPurchaseDate = new JLabel("ISSUE DATE:");
		lblPurchaseDate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		
		
		JLabel lblBookid = new JLabel("BOOK_ID");
		lblBookid.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(68)
							.addComponent(textField_2))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNoOfPages)
							.addGap(45)
							.addComponent(textField_3))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblAccNo)
										.addComponent(lblBookid)
										.addComponent(lblBookTittle))
									.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblPurchaseDate)
									.addGap(62))
								.addComponent(lblBookType))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
								.addComponent(textField_4, 175, 175, Short.MAX_VALUE)
								.addComponent(comboBox, Alignment.TRAILING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textField_1, Alignment.TRAILING)
								.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAccNo)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBookid)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBookTittle)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBookType))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNoOfPages)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPurchaseDate)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}
}
