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

public class ComputerPlacePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComputerPlacePage frame = new ComputerPlacePage();
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
	public ComputerPlacePage() throws Exception {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton computer1 = new JButton("COMPUTER 1");
		computer1.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_desktop (1).png"));
		computer1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		computer1.setBorderPainted(false);
		computer1.setContentAreaFilled(false);
		computer1.setFocusPainted(false);
		computer1.setOpaque(false);
		computer1.setBorderPainted(false);
		computer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ComputerPlace.computers.get(0).isAvailability()) {
					dispose();
					ComputerPage cp = new ComputerPage(0);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(1) && !ComputerPlace.computers.get(0).isAvailability()) {
			computer1.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_desktop (1).png"));
		} else {
			computer1.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\desktop (1).png"));
		}
		computer1.setBounds(31, 148, 230, 99);
		contentPane.add(computer1);

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
			computer1.setVisible(false);
		}

		JButton computer2 = new JButton("COMPUTER 2");
		computer2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ComputerPlace.computers.get(1).isAvailability()) {
					dispose();
					ComputerPage cp = new ComputerPage(1);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(2) && !ComputerPlace.computers.get(1).isAvailability()) {
			computer2.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_desktop (1).png"));
		} else {
			computer2.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\desktop (1).png"));
		}
		computer2.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_desktop (1).png"));
		computer2.setOpaque(false);
		computer2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		computer2.setFocusPainted(false);
		computer2.setContentAreaFilled(false);
		computer2.setBorderPainted(false);
		computer2.setBounds(31, 250, 230, 99);
		contentPane.add(computer2);

		if (!visibleCheck(2))
			computer2.setVisible(false);

		JButton computer3 = new JButton("COMPUTER 3");
		computer3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ComputerPlace.computers.get(2).isAvailability()) {
					dispose();
					ComputerPage cp = new ComputerPage(2);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(3) && !ComputerPlace.computers.get(2).isAvailability()) {
			computer3.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_desktop (1).png"));
		} else {
			computer3.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\desktop (1).png"));
		}
		computer3.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_desktop (1).png"));
		computer3.setOpaque(false);
		computer3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		computer3.setFocusPainted(false);
		computer3.setContentAreaFilled(false);
		computer3.setBorderPainted(false);
		computer3.setBounds(31, 359, 230, 99);
		contentPane.add(computer3);

		if (!visibleCheck(3))
			computer3.setVisible(false);

		JButton computer4 = new JButton("COMPUTER 4");
		computer4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ComputerPlace.computers.get(3).isAvailability()) {
					dispose();
					ComputerPage cp = new ComputerPage(3);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(4) && !ComputerPlace.computers.get(3).isAvailability()) {
			computer4.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_desktop (1).png"));
		} else {
			computer4.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\desktop (1).png"));
		}
		computer4.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_desktop (1).png"));
		computer4.setOpaque(false);
		computer4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		computer4.setFocusPainted(false);
		computer4.setContentAreaFilled(false);
		computer4.setBorderPainted(false);
		computer4.setBounds(31, 455, 230, 99);
		contentPane.add(computer4);

		if (!visibleCheck(4))
			computer4.setVisible(false);

		JButton computer5 = new JButton("COMPUTER 5");
		computer5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ComputerPlace.computers.get(4).isAvailability()) {
					dispose();
					ComputerPage cp = new ComputerPage(4);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(5) && !ComputerPlace.computers.get(4).isAvailability()) {
			computer5.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_desktop (1).png"));
		} else {
			computer5.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\desktop (1).png"));
		}
		computer5.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_desktop (1).png"));
		computer5.setOpaque(false);
		computer5.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		computer5.setFocusPainted(false);
		computer5.setContentAreaFilled(false);
		computer5.setBorderPainted(false);
		computer5.setBounds(337, 148, 230, 99);
		contentPane.add(computer5);

		if (!visibleCheck(5))
			computer5.setVisible(false);

		JButton computer6 = new JButton("COMPUTER 6");
		computer6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ComputerPlace.computers.get(0).isAvailability()) {
					dispose();
					ComputerPage cp = new ComputerPage(5);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(6) && !ComputerPlace.computers.get(5).isAvailability()) {
			computer6.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_desktop (1).png"));
		} else {
			computer6.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\desktop (1).png"));
		}
		computer6.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_desktop (1).png"));
		computer6.setOpaque(false);
		computer6.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		computer6.setFocusPainted(false);
		computer6.setContentAreaFilled(false);
		computer6.setBorderPainted(false);
		computer6.setBounds(337, 250, 230, 99);
		contentPane.add(computer6);

		if (!visibleCheck(6))
			computer6.setVisible(false);

		JButton computer7 = new JButton("COMPUTER 7");
		computer7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ComputerPlace.computers.get(6).isAvailability()) {
					dispose();
					ComputerPage cp = new ComputerPage(6);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(7) && !ComputerPlace.computers.get(6).isAvailability()) {
			computer7.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_desktop (1).png"));
		} else {
			computer7.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\desktop (1).png"));
		}
		computer7.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_desktop (1).png"));
		computer7.setOpaque(false);
		computer7.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		computer7.setFocusPainted(false);
		computer7.setContentAreaFilled(false);
		computer7.setBorderPainted(false);
		computer7.setBounds(337, 359, 230, 99);
		contentPane.add(computer7);

		if (!visibleCheck(7))
			computer7.setVisible(false);

		JButton computer8 = new JButton("COMPUTER 8");
		computer8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ComputerPlace.computers.get(7).isAvailability()) {
					dispose();
					ComputerPage cp = new ComputerPage(7);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(8) && !ComputerPlace.computers.get(7).isAvailability()) {
			computer8.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_desktop (1).png"));
		} else {
			computer8.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\desktop (1).png"));
		}
		computer8.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_desktop (1).png"));
		computer8.setOpaque(false);
		computer8.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		computer8.setFocusPainted(false);
		computer8.setContentAreaFilled(false);
		computer8.setBorderPainted(false);
		computer8.setBounds(337, 455, 230, 99);
		contentPane.add(computer8);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\plain-white-background-2.jpg"));
		lblNewLabel.setBounds(0, 0, 631, 685);
		contentPane.add(lblNewLabel);

		if (!visibleCheck(8))
			computer8.setVisible(false);

	}

	boolean visibleCheck(int id) {
		if (id <= ComputerPlace.computers.size()) {
			return true;
		} else
			return false;
	}
}