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

public class BowlingPlacePage2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BowlingPlacePage2 frame = new BowlingPlacePage2();
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
	 * 
	 * @throws Exception
	 */
	public BowlingPlacePage2() throws Exception {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton bowling1 = new JButton("BOWLING 1");
		bowling1.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_bowling (1).png"));
		bowling1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		bowling1.setBorderPainted(false);
		bowling1.setContentAreaFilled(false);
		bowling1.setFocusPainted(false);
		bowling1.setOpaque(false);
		bowling1.setBorderPainted(false);
		bowling1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (BowlingPlace.bowlings.get(0).isAvailability()) {
					dispose();
					BowlingPage2 cp = new BowlingPage2(0);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(1) && !BowlingPlace.bowlings.get(0).isAvailability()) {
			bowling1.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_bowling (1).png"));
		} else {
			bowling1.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\bowling (1).png"));
		}
		bowling1.setBounds(31, 148, 230, 99);
		contentPane.add(bowling1);

		JButton btnNewButton_1_3_2 = new JButton("");
		btnNewButton_1_3_2.setSelected(true);
		btnNewButton_1_3_2.setRolloverSelectedIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_back (1).png"));
		btnNewButton_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainPage mp;
				try {
					mp = new MainPage();
					mp.setVisible(true);
					mp.setResizable(false);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

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

		if (!visibleCheck(1)) {
			bowling1.setVisible(false);
		}

		JButton bowling2 = new JButton("BOWLING 2");
		bowling2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (BowlingPlace.bowlings.get(1).isAvailability()) {
					dispose();
					BowlingPage2 cp = new BowlingPage2(1);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(2) && !BowlingPlace.bowlings.get(1).isAvailability()) {
			bowling2.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_bowling (1).png"));
		} else {
			bowling2.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\bowling (1).png"));
		}
		bowling2.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_bowling (1).png"));
		bowling2.setOpaque(false);
		bowling2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		bowling2.setFocusPainted(false);
		bowling2.setContentAreaFilled(false);
		bowling2.setBorderPainted(false);
		bowling2.setBounds(31, 250, 230, 99);
		contentPane.add(bowling2);

		if (!visibleCheck(2))
			bowling2.setVisible(false);

		JButton bowling3 = new JButton("BOWLING 3");
		bowling3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (BowlingPlace.bowlings.get(2).isAvailability()) {
					dispose();
					BowlingPage2 cp = new BowlingPage2(2);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(3) && !BowlingPlace.bowlings.get(2).isAvailability()) {
			bowling3.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_bowling (1).png"));
		} else {
			bowling3.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\bowling (1).png"));
		}
		bowling3.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_bowling (1).png"));
		bowling3.setOpaque(false);
		bowling3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		bowling3.setFocusPainted(false);
		bowling3.setContentAreaFilled(false);
		bowling3.setBorderPainted(false);
		bowling3.setBounds(31, 359, 230, 99);
		contentPane.add(bowling3);

		if (!visibleCheck(3))
			bowling3.setVisible(false);

		JButton bowling4 = new JButton("BOWLING 4");
		bowling4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (BowlingPlace.bowlings.get(3).isAvailability()) {
					dispose();
					BowlingPage2 cp = new BowlingPage2(3);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(4) && !BowlingPlace.bowlings.get(3).isAvailability()) {
			bowling4.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_bowling (1).png"));
		} else {
			bowling4.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\bowling (1).png"));
		}
		bowling4.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_bowling (1).png"));
		bowling4.setOpaque(false);
		bowling4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		bowling4.setFocusPainted(false);
		bowling4.setContentAreaFilled(false);
		bowling4.setBorderPainted(false);
		bowling4.setBounds(31, 455, 230, 99);
		contentPane.add(bowling4);

		if (!visibleCheck(4))
			bowling4.setVisible(false);

		JButton bowling5 = new JButton("BOWLING 5");
		bowling5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (BowlingPlace.bowlings.get(4).isAvailability()) {
					dispose();
					BowlingPage2 cp = new BowlingPage2(4);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(5) && !BowlingPlace.bowlings.get(4).isAvailability()) {
			bowling5.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_bowling (1).png"));
		} else {
			bowling5.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\bowling (1).png"));
		}
		bowling5.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_bowling (1).png"));
		bowling5.setOpaque(false);
		bowling5.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		bowling5.setFocusPainted(false);
		bowling5.setContentAreaFilled(false);
		bowling5.setBorderPainted(false);
		bowling5.setBounds(337, 148, 230, 99);
		contentPane.add(bowling5);

		if (!visibleCheck(5))
			bowling5.setVisible(false);

		JButton bowling6 = new JButton("BOWLING 6");
		bowling6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (BowlingPlace.bowlings.get(0).isAvailability()) {
					dispose();
					BowlingPage2 cp = new BowlingPage2(5);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(6) && !BowlingPlace.bowlings.get(5).isAvailability()) {
			bowling6.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_bowling (1).png"));
		} else {
			bowling6.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\bowling (1).png"));
		}
		bowling6.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_bowling (1).png"));
		bowling6.setOpaque(false);
		bowling6.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		bowling6.setFocusPainted(false);
		bowling6.setContentAreaFilled(false);
		bowling6.setBorderPainted(false);
		bowling6.setBounds(337, 250, 230, 99);
		contentPane.add(bowling6);

		if (!visibleCheck(6))
			bowling6.setVisible(false);

		JButton bowling7 = new JButton("BOWLING 7");
		bowling7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (BowlingPlace.bowlings.get(6).isAvailability()) {
					dispose();
					BowlingPage2 cp = new BowlingPage2(6);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(7) && !BowlingPlace.bowlings.get(6).isAvailability()) {
			bowling7.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_bowling (1).png"));
		} else {
			bowling7.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\bowling (1).png"));
		}
		bowling7.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_bowling (1).png"));
		bowling7.setOpaque(false);
		bowling7.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		bowling7.setFocusPainted(false);
		bowling7.setContentAreaFilled(false);
		bowling7.setBorderPainted(false);
		bowling7.setBounds(337, 359, 230, 99);
		contentPane.add(bowling7);

		if (!visibleCheck(7))
			bowling7.setVisible(false);

		JButton bowling8 = new JButton("BOWLING 8");
		bowling8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (BowlingPlace.bowlings.get(7).isAvailability()) {
					dispose();
					BowlingPage2 cp = new BowlingPage2(7);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(8) && !BowlingPlace.bowlings.get(7).isAvailability()) {
			bowling8.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_bowling (1).png"));
		} else {
			bowling8.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\bowling (1).png"));
		}
		bowling8.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_bowling (1).png"));
		bowling8.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		bowling8.setFocusPainted(false);
		bowling8.setContentAreaFilled(false);
		bowling8.setBorderPainted(false);
		bowling8.setBounds(337, 455, 230, 99);
		contentPane.add(bowling8);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\plain-white-background-2.jpg"));
		lblNewLabel.setBounds(0, 0, 631, 685);
		contentPane.add(lblNewLabel);

		if (!visibleCheck(8))
			bowling8.setVisible(false);

	}

	boolean visibleCheck(int id) {
		if (id <= BowlingPlace.bowlings.size()) {
			return true;
		} else
			return false;
	}
}