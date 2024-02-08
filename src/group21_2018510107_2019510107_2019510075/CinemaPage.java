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
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.UIManager;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class CinemaPage extends JFrame {

	private JPanel contentPane;
	public static int movieId = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CinemaPage frame = new CinemaPage(movieId);
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
	public CinemaPage(int movieId) {
		CinemaPage.movieId = movieId;
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton_1_3_2 = new JButton("");
		btnNewButton_1_3_2.setSelected(true);
		btnNewButton_1_3_2.setRolloverSelectedIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_back (1).png"));
		btnNewButton_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CinemaPlacePage cpp = new CinemaPlacePage();
				cpp.setVisible(true);
				cpp.setResizable(false);
			}
		});
		btnNewButton_1_3_2.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\back (1).png"));
		btnNewButton_1_3_2.setOpaque(false);
		btnNewButton_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_3_2.setFocusPainted(false);
		btnNewButton_1_3_2.setContentAreaFilled(false);
		btnNewButton_1_3_2.setBorderPainted(false);
		btnNewButton_1_3_2.setBounds(31, 23, 130, 91);
		contentPane.add(btnNewButton_1_3_2);

		JLabel lblNewLabel_1_1 = new JLabel("SCENE");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBackground(new Color(169, 169, 169));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1.setBounds(56, 501, 505, 45);
		contentPane.add(lblNewLabel_1_1);

		JButton c1 = new JButton("");
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 15)) {
					dispose();
					SeatPage sp = new SeatPage("c1",15);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		c1.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 15)) {
			c1.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			c1.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		c1.setSelected(true);
		c1.setOpaque(false);
		c1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		c1.setFocusPainted(false);
		c1.setContentAreaFilled(false);
		c1.setBorderPainted(false);
		c1.setBounds(56, 148, 76, 91);
		contentPane.add(c1);

		JButton c2 = new JButton("");
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 16)) {
					dispose();
					SeatPage sp = new SeatPage("c2",16);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		c2.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 16)) {
			c2.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			c2.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		c2.setSelected(true);
		c2.setOpaque(false);
		c2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		c2.setFocusPainted(false);
		c2.setContentAreaFilled(false);
		c2.setBorderPainted(false);
		c2.setBounds(128, 148, 76, 91);
		contentPane.add(c2);

		JButton c4 = new JButton("");
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 18)) {
					dispose();
					SeatPage sp = new SeatPage("c4",18);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		c4.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 18)) {
			c4.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			c4.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		c4.setSelected(true);
		c4.setOpaque(false);
		c4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		c4.setFocusPainted(false);
		c4.setContentAreaFilled(false);
		c4.setBorderPainted(false);
		c4.setBounds(273, 148, 76, 91);
		contentPane.add(c4);

		JButton c3 = new JButton("");
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 17)) {
					dispose();
					SeatPage sp = new SeatPage("c3",17);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		c3.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 17)) {
			c3.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			c3.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		c3.setSelected(true);
		c3.setOpaque(false);
		c3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		c3.setFocusPainted(false);
		c3.setContentAreaFilled(false);
		c3.setBorderPainted(false);
		c3.setBounds(200, 148, 76, 91);
		contentPane.add(c3);

		JButton c7 = new JButton("");
		c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 21)) {
					dispose();
					SeatPage sp = new SeatPage("c7",21);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		c7.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 21)) {
			c7.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			c7.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		c7.setSelected(true);
		c7.setOpaque(false);
		c7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		c7.setFocusPainted(false);
		c7.setContentAreaFilled(false);
		c7.setBorderPainted(false);
		c7.setBounds(485, 148, 76, 91);
		contentPane.add(c7);

		JButton c6 = new JButton("");
		c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 20)) {
					dispose();
					SeatPage sp = new SeatPage("c6",20);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		c6.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 20)) {
			c6.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			c6.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		c6.setSelected(true);
		c6.setOpaque(false);
		c6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		c6.setFocusPainted(false);
		c6.setContentAreaFilled(false);
		c6.setBorderPainted(false);
		c6.setBounds(416, 148, 76, 91);
		contentPane.add(c6);

		JButton c5 = new JButton("");
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 19)) {
					dispose();
					SeatPage sp = new SeatPage("c5",19);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		c5.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 19)) {
			c5.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			c5.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		c5.setSelected(true);
		c5.setOpaque(false);
		c5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		c5.setFocusPainted(false);
		c5.setContentAreaFilled(false);
		c5.setBorderPainted(false);
		c5.setBounds(345, 148, 76, 91);
		contentPane.add(c5);

		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 8)) {
					dispose();
					SeatPage sp = new SeatPage("b1",8);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		b1.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 8)) {
			b1.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			b1.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		b1.setSelected(true);
		b1.setOpaque(false);
		b1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b1.setFocusPainted(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		b1.setBounds(56, 266, 76, 91);
		contentPane.add(b1);

		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 9)) {
					dispose();
					SeatPage sp = new SeatPage("b2",9);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		b2.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 9)) {
			b2.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			b2.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		b2.setSelected(true);
		b2.setOpaque(false);
		b2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b2.setFocusPainted(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		b2.setBounds(128, 266, 76, 91);
		contentPane.add(b2);

		JButton b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 10)) {
					dispose();
					SeatPage sp = new SeatPage("b3",10);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		b3.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 10)) {
			b3.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			b3.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		b3.setSelected(true);
		b3.setOpaque(false);
		b3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b3.setFocusPainted(false);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		b3.setBounds(200, 266, 76, 91);
		contentPane.add(b3);

		JButton b4 = new JButton("");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 11)) {
					dispose();
					SeatPage sp = new SeatPage("b4",11);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		b4.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 11)) {
			b4.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			b4.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		b4.setSelected(true);
		b4.setOpaque(false);
		b4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b4.setFocusPainted(false);
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(false);
		b4.setBounds(273, 266, 76, 91);
		contentPane.add(b4);

		JButton b5 = new JButton("");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 12)) {
					dispose();
					SeatPage sp = new SeatPage("b5",12);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		b5.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 12)) {
			b5.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			b5.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		b5.setSelected(true);
		b5.setOpaque(false);
		b5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b5.setFocusPainted(false);
		b5.setContentAreaFilled(false);
		b5.setBorderPainted(false);
		b5.setBounds(345, 266, 76, 91);
		contentPane.add(b5);

		JButton b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 13)) {
					dispose();
					SeatPage sp = new SeatPage("b6",13);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		b6.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 13)) {
			b6.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			b6.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		b6.setSelected(true);
		b6.setOpaque(false);
		b6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b6.setFocusPainted(false);
		b6.setContentAreaFilled(false);
		b6.setBorderPainted(false);
		b6.setBounds(416, 266, 76, 91);
		contentPane.add(b6);

		JButton b7 = new JButton("");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 14)) {
					dispose();
					SeatPage sp = new SeatPage("b7",14);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		b7.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 14)) {
			b7.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			b7.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		b7.setSelected(true);
		b7.setOpaque(false);
		b7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b7.setFocusPainted(false);
		b7.setContentAreaFilled(false);
		b7.setBorderPainted(false);
		b7.setBounds(485, 266, 76, 91);
		contentPane.add(b7);

		JButton a1 = new JButton("");
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 1)) {
					dispose();
					SeatPage sp = new SeatPage("a1",1);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		a1.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 1)) {
			a1.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			a1.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		a1.setSelected(true);
		a1.setOpaque(false);
		a1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		a1.setFocusPainted(false);
		a1.setContentAreaFilled(false);
		a1.setBorderPainted(false);
		a1.setBounds(56, 382, 76, 91);
		contentPane.add(a1);

		JButton a2 = new JButton("");
		a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 2)) {
					dispose();
					SeatPage sp = new SeatPage("a1",2);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		a2.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 2)) {
			a2.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			a2.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		a2.setSelected(true);
		a2.setOpaque(false);
		a2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		a2.setFocusPainted(false);
		a2.setContentAreaFilled(false);
		a2.setBorderPainted(false);
		a2.setBounds(128, 382, 76, 91);
		contentPane.add(a2);

		JButton a3 = new JButton("");
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 3)) {
					dispose();
					SeatPage sp = new SeatPage("a3",3);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		a3.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 3)) {
			a3.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			a3.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		a3.setSelected(true);
		a3.setOpaque(false);
		a3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		a3.setFocusPainted(false);
		a3.setContentAreaFilled(false);
		a3.setBorderPainted(false);
		a3.setBounds(200, 382, 76, 91);
		contentPane.add(a3);

		JButton a4 = new JButton("");
		a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 4)) {
					dispose();
					SeatPage sp = new SeatPage("a4",4);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		a4.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 4)) {
			a4.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			a4.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		a4.setSelected(true);
		a4.setOpaque(false);
		a4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		a4.setFocusPainted(false);
		a4.setContentAreaFilled(false);
		a4.setBorderPainted(false);
		a4.setBounds(273, 382, 76, 91);
		contentPane.add(a4);

		JButton a5 = new JButton("");
		a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 5)) {
					dispose();
					SeatPage sp = new SeatPage("a5",5);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		a5.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 5)) {
			a5.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			a5.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		a5.setSelected(true);
		a5.setOpaque(false);
		a5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		a5.setFocusPainted(false);
		a5.setContentAreaFilled(false);
		a5.setBorderPainted(false);
		a5.setBounds(345, 382, 76, 91);
		contentPane.add(a5);

		JButton a6 = new JButton("");
		a6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 6)) {
					dispose();
					SeatPage sp = new SeatPage("a6",6);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		a6.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 6)) {
			a6.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			a6.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		a6.setSelected(true);
		a6.setOpaque(false);
		a6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		a6.setFocusPainted(false);
		a6.setContentAreaFilled(false);
		a6.setBorderPainted(false);
		a6.setBounds(416, 382, 76, 91);
		contentPane.add(a6);

		JButton a7 = new JButton("");
		a7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkAvailability(movieId, 7)) {
					dispose();
					SeatPage sp = new SeatPage("a7",7);
					sp.setVisible(true);
					sp.setResizable(false);
				}
			}
		});
		a7.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_armchair (2).png"));
		if (checkAvailability(movieId, 7)) {
			a7.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\armchair (2).png"));
		}
		else {
			a7.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\notavailable_armchair (1) (1).png"));
		}
		a7.setSelected(true);
		a7.setOpaque(false);
		a7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		a7.setFocusPainted(false);
		a7.setContentAreaFilled(false);
		a7.setBorderPainted(false);
		a7.setBounds(485, 382, 76, 91);
		contentPane.add(a7);

		JLabel lblNewLabel = new JLabel("C");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(25, 168, 21, 52);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("B");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(25, 277, 21, 52);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("A");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(25, 394, 21, 52);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("1");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2_1.setBounds(83, 98, 21, 52);
		contentPane.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("2");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2_1_1.setBounds(155, 98, 21, 52);
		contentPane.add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_1_2 = new JLabel("3");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2_1_2.setBounds(225, 98, 21, 52);
		contentPane.add(lblNewLabel_2_1_2);

		JLabel lblNewLabel_2_1_3 = new JLabel("4");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2_1_3.setBounds(300, 98, 21, 52);
		contentPane.add(lblNewLabel_2_1_3);

		JLabel lblNewLabel_2_1_4 = new JLabel("5");
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2_1_4.setBounds(372, 98, 21, 52);
		contentPane.add(lblNewLabel_2_1_4);

		JLabel lblNewLabel_2_1_5 = new JLabel("6");
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2_1_5.setBounds(440, 98, 21, 52);
		contentPane.add(lblNewLabel_2_1_5);

		JLabel lblNewLabel_2_1_6 = new JLabel("7");
		lblNewLabel_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2_1_6.setBounds(513, 98, 21, 52);
		contentPane.add(lblNewLabel_2_1_6);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\plain-white-background-2.jpg"));
		lblNewLabel_3.setBounds(0, 0, 610, 673);
		contentPane.add(lblNewLabel_3);

	}

	boolean checkAvailability(int movieId, int seatId) {
		if (CinemaPlace.movies.get(movieId - 1).seats.get(seatId - 1).isAvailability()) {
			return true;
		}
		return false;
	}
}