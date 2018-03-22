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
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Fourth extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fourth frame = new Fourth();
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
	public Fourth() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBooks = new JLabel("BOOKS");
		lblBooks.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnAllBooks = new JButton("ALL BOOKS");
		btnAllBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnAllBooks)
				{
					table t=new table();
					t.setVisible(true);
					dispose();
				}
			}
		});
		
		JButton btnIssuedBooks = new JButton("ISSUED BOOKS");
		btnIssuedBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnIssuedBooks)
				{
					Table1 t=new Table1();
					t.setVisible(true);
					dispose();
				}					

			}
		});
		
		JButton btnAvailableBooks = new JButton("AVAILABLE BOOKS");
		btnAvailableBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnAvailableBooks)
				{
					table t=new table();
					t.setVisible(true);
					dispose();
				}
			}
		});
		
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
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(153, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addGap(47)
					.addComponent(btnCancel)
					.addGap(147))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(228, Short.MAX_VALUE)
					.addComponent(lblBooks, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(185))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(185)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnAllBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnIssuedBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAvailableBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(179, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addComponent(lblBooks)
					.addGap(30)
					.addComponent(btnAllBooks)
					.addGap(27)
					.addComponent(btnIssuedBooks)
					.addGap(36)
					.addComponent(btnAvailableBooks)
					.addPreferredGap(ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBack)
						.addComponent(btnCancel))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}

}
