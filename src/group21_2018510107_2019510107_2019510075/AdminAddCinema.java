package group21_2018510107_2019510107_2019510075;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.Box;
import javax.swing.border.MatteBorder;

public class AdminAddCinema extends JFrame {

	static Connection connection = null;
	private JPanel contentPane;
	private JTextField name_textField;
	private JTextField time_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAddCinema frame = new AdminAddCinema();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// going to borrow code from a gist to move frame.

	/**
	 * Create the frame.
	 */
	public AdminAddCinema() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1_3_2 = new JButton("");
		btnNewButton_1_3_2.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_back (1).png"));
		btnNewButton_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminAddPage ap = new AdminAddPage();
				ap.setVisible(true);
				ap.setResizable(false);
			}
		});
		btnNewButton_1_3_2.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\back (1).png"));
		btnNewButton_1_3_2.setOpaque(false);
		btnNewButton_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_3_2.setFocusPainted(false);
		btnNewButton_1_3_2.setContentAreaFilled(false);
		btnNewButton_1_3_2.setBorderPainted(false);
		btnNewButton_1_3_2.setBounds(10, 10, 130, 91);
		contentPane.add(btnNewButton_1_3_2);
		
		JLabel name = new JLabel("Movie Name");
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		name.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		name.setBounds(45, 275, 153, 54);
		contentPane.add(name);
		
		name_textField = new JTextField();
		name_textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		name_textField.setColumns(10);
		name_textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		name_textField.setBounds(208, 275, 342, 54);
		contentPane.add(name_textField);
		
		time_textField = new JTextField();
		time_textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		time_textField.setColumns(10);
		time_textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		time_textField.setBounds(208, 339, 342, 54);
		contentPane.add(time_textField);
		
		JLabel time = new JLabel("Time");
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setFont(new Font("Tahoma", Font.PLAIN, 16));
		time.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		time.setBounds(45, 339, 153, 54);
		contentPane.add(time);
		
		JButton btnNewButton_1_3_2_1 = new JButton("ADD");
		btnNewButton_1_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(CinemaPlace.movies.size()<4) {
						Connection con = Test.connection;
						String sql = "INSERT INTO movies (idmovies, name, time) VALUES (?, ?, ?)";
						PreparedStatement statement = con.prepareStatement(sql);
						statement.setInt(1, CinemaPlace.movies.size()+1);
						statement.setString(2, name_textField.getText());
						statement.setString(3, time_textField.getText());
						JOptionPane.showMessageDialog(null, "TRANSACTION SUCCESFUL!");
						statement.executeUpdate();
						try {
							Login.checkDatabase();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						dispose();
						AdminAddPage su = new AdminAddPage();
						su.setVisible(true);
						su.setResizable(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "TRANSACTION FAILED(MAX MOVIE NUMBER)");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1_3_2_1.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\addition (1).png"));
		btnNewButton_1_3_2_1.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\add (1).png"));
		btnNewButton_1_3_2_1.setOpaque(false);
		btnNewButton_1_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_3_2_1.setFocusPainted(false);
		btnNewButton_1_3_2_1.setContentAreaFilled(false);
		btnNewButton_1_3_2_1.setBorderPainted(false);
		btnNewButton_1_3_2_1.setBounds(186, 498, 227, 91);
		contentPane.add(btnNewButton_1_3_2_1);

	}
}