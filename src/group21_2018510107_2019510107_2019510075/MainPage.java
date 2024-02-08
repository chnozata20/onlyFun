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
import javax.swing.Box;

public class MainPage extends JFrame {

	static Connection connection = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	 * @throws Exception 
	 */
	public MainPage() throws Exception {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton_1 = new JButton("COMPUTER");
		btnNewButton_1.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_desktop (1).png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ComputerPlacePage cpp;
				try {
					cpp = new ComputerPlacePage();
					cpp.setVisible(true);
					cpp.setResizable(false);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton_1.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\desktop (1).png"));
		btnNewButton_1.setBounds(59, 166, 222, 99);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("OKEY");
		btnNewButton_1_1.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_unnamed (1).png"));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				OkeyPlacePage2 opp;
				try {
					opp = new OkeyPlacePage2();
					opp.setVisible(true);
					opp.setResizable(false);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unnamed (1).png"));
		btnNewButton_1_1.setOpaque(false);
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBounds(39, 263, 212, 99);
		contentPane.add(btnNewButton_1_1);

		JButton btnNewButton_1_1_1 = new JButton("BOWLING");
		btnNewButton_1_1_1.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_bowling (1).png"));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				BowlingPlacePage2 bpp;
				try {
					bpp = new BowlingPlacePage2();
					bpp.setVisible(true);
					bpp.setResizable(false);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_1_1.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\bowling (1).png"));
		btnNewButton_1_1_1.setOpaque(false);
		btnNewButton_1_1_1.setFocusPainted(false);
		btnNewButton_1_1_1.setContentAreaFilled(false);
		btnNewButton_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1.setBounds(39, 353, 249, 99);
		contentPane.add(btnNewButton_1_1_1);

		JButton btnNewButton_1_1_1_1 = new JButton("BILLIARDS");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1_1.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_billiard (1).png"));
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1_1_1.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\billiard (1).png"));
		btnNewButton_1_1_1_1.setOpaque(false);
		btnNewButton_1_1_1_1.setFocusPainted(false);
		btnNewButton_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_1_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1_1.setBounds(59, 446, 232, 99);
		contentPane.add(btnNewButton_1_1_1_1);

		JButton btnNewButton_1_1_1_1_1 = new JButton("TABLE TENNIS");
		btnNewButton_1_1_1_1_1.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_table-tennis (1).png"));
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1_1_1_1.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\table-tennis (1).png"));
		btnNewButton_1_1_1_1_1.setOpaque(false);
		btnNewButton_1_1_1_1_1.setFocusPainted(false);
		btnNewButton_1_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_1_1_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1_1_1.setBounds(337, 365, 222, 75);
		contentPane.add(btnNewButton_1_1_1_1_1);

		JButton btnNewButton_1_1_1_1_1_1 = new JButton("CINEMA");
		btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CinemaPlacePage cpp = new CinemaPlacePage();
				cpp.setVisible(true);
				cpp.setResizable(false);
			}
		});
		btnNewButton_1_1_1_1_1_1.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_cinema (1).png"));
		btnNewButton_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1_1_1_1_1.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\cinema (1).png"));
		btnNewButton_1_1_1_1_1_1.setOpaque(false);
		btnNewButton_1_1_1_1_1_1.setFocusPainted(false);
		btnNewButton_1_1_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_1_1_1_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1_1_1_1.setBounds(321, 166, 211, 99);
		contentPane.add(btnNewButton_1_1_1_1_1_1);

		JButton btnNewButton_1_1_1_1_1_2 = new JButton("ICE HOCKEY");
		btnNewButton_1_1_1_1_1_2.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_hockey (1).png"));
		btnNewButton_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1_1_1_1_2.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\hockey (1).png"));
		btnNewButton_1_1_1_1_1_2.setOpaque(false);
		btnNewButton_1_1_1_1_1_2.setFocusPainted(false);
		btnNewButton_1_1_1_1_1_2.setContentAreaFilled(false);
		btnNewButton_1_1_1_1_1_2.setBorderPainted(false);
		btnNewButton_1_1_1_1_1_2.setBounds(337, 458, 222, 75);
		contentPane.add(btnNewButton_1_1_1_1_1_2);

		JButton btnNewButton_1_2 = new JButton("PLAYSTATION");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PlaystationPlacePage2 ppp;
				try {
					ppp = new PlaystationPlacePage2();
					ppp.setVisible(true);
					ppp.setResizable(false);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton_1_2.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		btnNewButton_1_2.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		btnNewButton_1_2.setOpaque(false);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_2.setFocusPainted(false);
		btnNewButton_1_2.setContentAreaFilled(false);
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.setBounds(337, 263, 222, 99);
		contentPane.add(btnNewButton_1_2);

		JButton btnNewButton_1_3 = new JButton("ADD CREDIT");
		btnNewButton_1_3.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_credit-card (1).png"));
		btnNewButton_1_3.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\credit-card (1).png"));
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AddCreditPage acp = new AddCreditPage();
				acp.setVisible(true);
				acp.setResizable(false);
			}
		});
		btnNewButton_1_3.setOpaque(false);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_3.setFocusPainted(false);
		btnNewButton_1_3.setContentAreaFilled(false);
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBounds(10, 31, 212, 66);
		contentPane.add(btnNewButton_1_3);

		JButton btnNewButton_1_3_1 = new JButton("SETTINGS");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SettingsPage sp = new SettingsPage();
				sp.setVisible(true);
				sp.setResizable(false);
			}
		});
		btnNewButton_1_3_1.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_settings (1).png"));
		btnNewButton_1_3_1.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\settings (1).png"));
		btnNewButton_1_3_1.setOpaque(false);
		btnNewButton_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_3_1.setFocusPainted(false);
		btnNewButton_1_3_1.setContentAreaFilled(false);
		btnNewButton_1_3_1.setBorderPainted(false);
		btnNewButton_1_3_1.setBounds(224, 27, 201, 75);
		contentPane.add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_3_2 = new JButton("");
		btnNewButton_1_3_2.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_exit (1).png"));
		btnNewButton_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Login.updateDataBase();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
				IntroPage ip = new IntroPage();
				ip.setVisible(true);
				ip.setResizable(false);
			}
		});
		btnNewButton_1_3_2.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\exit (1).png"));
		btnNewButton_1_3_2.setOpaque(false);
		btnNewButton_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_3_2.setFocusPainted(false);
		btnNewButton_1_3_2.setContentAreaFilled(false);
		btnNewButton_1_3_2.setBorderPainted(false);
		btnNewButton_1_3_2.setBounds(435, 23, 130, 91);
		contentPane.add(btnNewButton_1_3_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\plain-white-background-2.jpg"));
		lblNewLabel.setBounds(0, 0, 620, 699);
		contentPane.add(lblNewLabel);

	}
}