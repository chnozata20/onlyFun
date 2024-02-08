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

public class AdminAddComputerPage extends JFrame {

	static Connection connection = null;
	private JPanel contentPane;
	private JTextField graphic_card_textField;
	private JTextField monitor_textField;
	private JTextField processor_textField_2;
	private JTextField ram_textField_3;
	private JTextField price_textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAddComputerPage frame = new AdminAddComputerPage();
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
	public AdminAddComputerPage() {
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

		JLabel Graphic_Card = new JLabel("Graphic Card");
		Graphic_Card.setHorizontalAlignment(SwingConstants.CENTER);
		Graphic_Card.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Graphic_Card.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Graphic_Card.setBounds(45, 138, 153, 54);
		contentPane.add(Graphic_Card);

		graphic_card_textField = new JTextField();
		graphic_card_textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		graphic_card_textField.setColumns(10);
		graphic_card_textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		graphic_card_textField.setBounds(208, 138, 342, 54);
		contentPane.add(graphic_card_textField);

		monitor_textField = new JTextField();
		monitor_textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		monitor_textField.setColumns(10);
		monitor_textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		monitor_textField.setBounds(208, 202, 342, 54);
		contentPane.add(monitor_textField);

		JLabel monitor = new JLabel("Monitor");
		monitor.setHorizontalAlignment(SwingConstants.CENTER);
		monitor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		monitor.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		monitor.setBounds(45, 202, 153, 54);
		contentPane.add(monitor);

		processor_textField_2 = new JTextField();
		processor_textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		processor_textField_2.setColumns(10);
		processor_textField_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		processor_textField_2.setBounds(208, 266, 342, 54);
		contentPane.add(processor_textField_2);

		JLabel cpu = new JLabel("Processor");
		cpu.setHorizontalAlignment(SwingConstants.CENTER);
		cpu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cpu.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		cpu.setBounds(45, 266, 153, 54);
		contentPane.add(cpu);

		ram_textField_3 = new JTextField();
		ram_textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ram_textField_3.setColumns(10);
		ram_textField_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		ram_textField_3.setBounds(208, 330, 342, 54);
		contentPane.add(ram_textField_3);

		JLabel ram = new JLabel("RAM");
		ram.setHorizontalAlignment(SwingConstants.CENTER);
		ram.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ram.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		ram.setBounds(45, 330, 153, 54);
		contentPane.add(ram);

		price_textField_4 = new JTextField();
		price_textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		price_textField_4.setColumns(10);
		price_textField_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		price_textField_4.setBounds(208, 394, 342, 54);
		contentPane.add(price_textField_4);

		JLabel lblNewLabel_1_3_1 = new JLabel("Price");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_3_1.setBounds(45, 394, 153, 54);
		contentPane.add(lblNewLabel_1_3_1);

		JButton btnNewButton_1_3_2_1 = new JButton("ADD");
		btnNewButton_1_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (ComputerPlace.computers.size() < 8) {

						Connection con = Test.connection;
						String sql = "INSERT INTO computers (idcomputers, graphic_card, monitor, cpu, ram, price, availability) VALUES (?, ?, ?, ?, ?, ?, ?)";
						PreparedStatement statement = con.prepareStatement(sql);
						statement.setInt(1, ComputerPlace.computers.size() + 1);
						statement.setString(2, graphic_card_textField.getText());
						statement.setString(3, monitor_textField.getText());
						statement.setString(4, processor_textField_2.getText());
						statement.setString(5, ram_textField_3.getText());
						statement.setString(6, price_textField_4.getText());
						statement.setInt(7, 1);
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
						JOptionPane.showMessageDialog(null, "TRANSACTION FAILED(MAX COMPUTER NUMBER)");
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
		btnNewButton_1_3_2_1.setBounds(186, 498, 227, 91);
		contentPane.add(btnNewButton_1_3_2_1);

	}
}