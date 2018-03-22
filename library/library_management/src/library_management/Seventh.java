package library_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;

public class Seventh extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seventh frame = new Seventh();
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
	public Seventh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnAddLibrarian = new JButton("ADD LIBRARIAN");
		btnAddLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnAddLibrarian)
				{
					Eight e=new Eight();
					e.setVisible(true);
					dispose();
				}
			}
		});
		
		JButton btnViewBooks = new JButton("VIEW BOOKS");
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnViewBooks)
				{
				Fourth e=new Fourth();
					e.setVisible(true);
					dispose();
				}

				
			}
		});
		
		JButton btnAddBooks = new JButton("ADD BOOKS");
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnAddBooks)
				{
				Fifth e=new Fifth();
					e.setVisible(true);
					dispose();
				}

				
			}
		});
		
		JLabel lblWelcomeToLibrary = new JLabel("WELCOME TO LIBRARY SYSTEM");
		lblWelcomeToLibrary.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(152)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnViewBooks, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
								.addComponent(btnAddBooks, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnAddLibrarian, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(81)
							.addComponent(lblWelcomeToLibrary)))
					.addContainerGap(54, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addComponent(lblWelcomeToLibrary)
					.addGap(49)
					.addComponent(btnAddLibrarian)
					.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
					.addComponent(btnViewBooks)
					.addGap(28)
					.addComponent(btnAddBooks)
					.addGap(32))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}

}
