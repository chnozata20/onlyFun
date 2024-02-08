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

public class AdminAddPlaystation extends JFrame {

	static Connection connection = null;
	private JPanel contentPane;
	private JTextField price_textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAddPlaystation frame = new AdminAddPlaystation();
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
	public AdminAddPlaystation() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton_1_3_2 = new JButton("");
		btnNewButton_1_3_2.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_back (1).png"));
		btnNewButton_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminAddPage ap = new AdminAddPage();
				ap.setVisible(true);
				ap.setResizable(false);
			}
		});
		btnNewButton_1_3_2.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\back (1).png"));
		btnNewButton_1_3_2.setOpaque(false);
		btnNewButton_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_3_2.setFocusPainted(false);
		btnNewButton_1_3_2.setContentAreaFilled(false);
		btnNewButton_1_3_2.setBorderPainted(false);
		btnNewButton_1_3_2.setBounds(10, 10, 130, 91);
		contentPane.add(btnNewButton_1_3_2);

		price_textField_4 = new JTextField();
		price_textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		price_textField_4.setColumns(10);
		price_textField_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		price_textField_4.setBounds(210, 283, 342, 54);
		contentPane.add(price_textField_4);

		JLabel lblNewLabel_1_3_1 = new JLabel("Price");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_3_1.setBounds(47, 283, 153, 54);
		contentPane.add(lblNewLabel_1_3_1);

		JButton btnNewButton_1_3_2_1 = new JButton("ADD");
		btnNewButton_1_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (PlaystationPlace.playstations.size() < 8) {

						Connection con = Test.connection;
						String sql = "INSERT INTO playstation (idplaystation, price, availability) VALUES (?, ?, ?)";
						PreparedStatement statement = con.prepareStatement(sql);
						statement.setInt(1, PlaystationPlace.playstations.size() + 1);
						statement.setString(2, price_textField_4.getText());
						statement.setInt(3, 1);
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
						JOptionPane.showMessageDialog(null, "TRANSACTION FAILED(MAX PLAYSTATION NUMBER)");
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton_1_3_2_1.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\addition (1).png"));
		btnNewButton_1_3_2_1.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\add (1).png"));
		btnNewButton_1_3_2_1.setOpaque(false);
		btnNewButton_1_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_3_2_1.setFocusPainted(false);
		btnNewButton_1_3_2_1.setContentAreaFilled(false);
		btnNewButton_1_3_2_1.setBorderPainted(false);
		btnNewButton_1_3_2_1.setBounds(198, 405, 227, 91);
		contentPane.add(btnNewButton_1_3_2_1);

	}
}