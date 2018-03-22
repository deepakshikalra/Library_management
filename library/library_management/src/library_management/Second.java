package library_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Second extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Second frame = new Second();
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
	public Second() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnIssueBooks = new JButton("Issue Books ");
		btnIssueBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnIssueBooks)
				{
					Third t=new Third();
					t.setVisible(true);
					setVisible(false);
					dispose();
				
				}
			}
		});
		
		JButton btnAddBooks = new JButton("Add Books");
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnAddBooks)
				{
					Fifth f=new Fifth();
					f.setVisible(true);
					dispose();
				}
			}
		});
		
		JButton btnViewBooks = new JButton("View Books");
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnViewBooks)
				{
					Fourth f=new Fourth();
					f.setVisible(true);
					dispose();
				}
			}
		});
		
		JButton btnReturnBooks = new JButton("Return Books");
		btnReturnBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnReturnBooks)
				{
					
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","deepakshikalra");
						String s=JOptionPane.showInputDialog("ENTER BOOK ID");
						String query="DELETE from issuebook where book_id=?";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1, s);
						JOptionPane.showMessageDialog(null, "BOOK RETURNED");
						ps.executeUpdate();
						con.close();
						ps.close();
						
					}
					
					catch(Exception e)
					{
						
					}
				}
			}
		});
		
		JLabel lblWelcomeToLibrary = new JLabel("Welcome to Library System");
		lblWelcomeToLibrary.setFont(new Font("Traditional Arabic", Font.PLAIN, 30));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(58, Short.MAX_VALUE)
					.addComponent(lblWelcomeToLibrary)
					.addGap(44))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(160)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnReturnBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnAddBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnIssueBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnViewBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
					.addGap(167))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblWelcomeToLibrary)
					.addGap(18)
					.addComponent(btnIssueBooks)
					.addGap(18)
					.addComponent(btnAddBooks)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnViewBooks)
					.addGap(18)
					.addComponent(btnReturnBooks)
					.addContainerGap(79, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}
}
