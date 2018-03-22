package library_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class table extends JFrame {

	private JPanel contentPane;
	private JTable table;

	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					table frame = new table();
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
	public table() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		
		JButton btnNewButton = new JButton("CLICK HERE TO VIEW DATA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnNewButton)
				{
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","deepakshikalra");
						String query="select * from newbbook ";
						PreparedStatement ps=conn.prepareStatement(query);
						
						ResultSet res=ps.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(res));
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnBack)
				{
					Second t=new Second();
					t.setVisible(true);
					dispose();
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblName = new JLabel("NAME");
		
		JLabel lblAuthorname = new JLabel("AUTHOR");
		
		JLabel lblNewLabel = new JLabel("EDDITION");
		
		JLabel lblPublisher = new JLabel("PUBLISHER");
		
		JLabel lblBookid = new JLabel("BOOK_ID");
		
		JLabel lblLibrarySystem = new JLabel("LIBRARY SYSTEM");
		lblLibrarySystem.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(65)
							.addComponent(btnBack)
							.addGap(48)
							.addComponent(btnNewButton))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(28)
							.addComponent(lblName)
							.addGap(38)
							.addComponent(lblAuthorname)
							.addGap(29)
							.addComponent(lblNewLabel)
							.addGap(27)
							.addComponent(lblPublisher)
							.addGap(18)
							.addComponent(lblBookid))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(146)
							.addComponent(lblLibrarySystem)))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblLibrarySystem)
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(lblBookid)
						.addComponent(lblNewLabel)
						.addComponent(lblPublisher)
						.addComponent(lblAuthorname))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBack)
						.addComponent(btnNewButton))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
		setResizable(false);
	}
}
