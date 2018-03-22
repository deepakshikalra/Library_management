package library_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Table1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblAcc;
	private JLabel lblNewLabel;
	private JLabel lblType;
	private JLabel lblTittle;
	private JLabel lblEddition;
	private JLabel lblPages;
	private JLabel lblIssuedate;
	private JLabel lblEmail;
	private JLabel lblContact;
	private JLabel lblFine;
	private JLabel lblLibrarySystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table1 frame = new Table1();
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
	public Table1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnBack)
				{
					Second t=new Second();
					t.setVisible(true);
					dispose();
				}

			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnClickHereTo = new JButton("CLICK HERE TO VIEW");
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnClickHereTo)
				{
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","deepakshikalra");
						String query="select * from issuebook ";
						PreparedStatement ps=conn.prepareStatement(query);
						ResultSet res=ps.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(res));
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
			}
		});
		btnClickHereTo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		table = new JTable();
		
		lblAcc = new JLabel("ACC");
		
		lblNewLabel = new JLabel("BOOK_ID\r\n");
		
		lblType = new JLabel("TYPE");
		
		lblTittle = new JLabel("TITTLE");
		
		lblEddition = new JLabel("EDDITION");
		
		lblPages = new JLabel("PAGES");
		
		lblIssuedate = new JLabel("ISS_DT");
		
		lblEmail = new JLabel("EMAIL");
		
		lblContact = new JLabel("CON");
		
		lblFine = new JLabel("FINE");
		
		lblLibrarySystem = new JLabel("LIBRARY SYSTEM");
		lblLibrarySystem.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(47)
							.addComponent(btnBack)
							.addGap(60)
							.addComponent(btnClickHereTo))
						.addComponent(table, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblAcc)
							.addGap(18)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblType)
							.addGap(18)
							.addComponent(lblTittle)
							.addGap(18)
							.addComponent(lblEddition)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblPages)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblIssuedate)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblEmail)
							.addGap(18)
							.addComponent(lblContact)
							.addGap(18)
							.addComponent(lblFine))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(212)
							.addComponent(lblLibrarySystem)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLibrarySystem)
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAcc)
						.addComponent(lblNewLabel)
						.addComponent(lblType)
						.addComponent(lblTittle)
						.addComponent(lblEddition)
						.addComponent(lblPages)
						.addComponent(lblIssuedate)
						.addComponent(lblEmail)
						.addComponent(lblContact)
						.addComponent(lblFine))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBack)
						.addComponent(btnClickHereTo))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}

}
