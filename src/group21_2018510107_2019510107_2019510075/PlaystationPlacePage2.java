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

public class PlaystationPlacePage2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlaystationPlacePage2 frame = new PlaystationPlacePage2();
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
	public PlaystationPlacePage2() throws Exception {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton playstation1 = new JButton("PLAYSTATION 1");
		playstation1.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		playstation1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		playstation1.setBorderPainted(false);
		playstation1.setContentAreaFilled(false);
		playstation1.setFocusPainted(false);
		playstation1.setOpaque(false);
		playstation1.setBorderPainted(false);
		playstation1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PlaystationPlace.playstations.get(0).isAvailability()) {
					dispose();
					PlaystationPage2 cp = new PlaystationPage2(0);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(1) && !PlaystationPlace.playstations.get(0).isAvailability()) {
			playstation1.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_playstation (1).png"));
		} else {
			playstation1.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		}
		playstation1.setBounds(31, 148, 230, 99);
		contentPane.add(playstation1);

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
			playstation1.setVisible(false);
		}

		JButton playstation2 = new JButton("PLAYSTATION 2");
		playstation2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PlaystationPlace.playstations.get(1).isAvailability()) {
					dispose();
					PlaystationPage2 cp = new PlaystationPage2(1);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(2) && !PlaystationPlace.playstations.get(1).isAvailability()) {
			playstation2.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_playstation (1).png"));
		} else {
			playstation2.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		}
		playstation2.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		playstation2.setOpaque(false);
		playstation2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		playstation2.setFocusPainted(false);
		playstation2.setContentAreaFilled(false);
		playstation2.setBorderPainted(false);
		playstation2.setBounds(31, 250, 230, 99);
		contentPane.add(playstation2);

		if (!visibleCheck(2))
			playstation2.setVisible(false);

		JButton playstation3 = new JButton("PLAYSTATION 3");
		playstation3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PlaystationPlace.playstations.get(2).isAvailability()) {
					dispose();
					PlaystationPage2 cp = new PlaystationPage2(2);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(3) && !PlaystationPlace.playstations.get(2).isAvailability()) {
			playstation3.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_playstation (1).png"));
		} else {
			playstation3.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		}
		playstation3.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		playstation3.setOpaque(false);
		playstation3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		playstation3.setFocusPainted(false);
		playstation3.setContentAreaFilled(false);
		playstation3.setBorderPainted(false);
		playstation3.setBounds(31, 359, 230, 99);
		contentPane.add(playstation3);

		if (!visibleCheck(3))
			playstation3.setVisible(false);

		JButton playstation4 = new JButton("PLAYSTATION 4");
		playstation4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PlaystationPlace.playstations.get(3).isAvailability()) {
					dispose();
					PlaystationPage2 cp = new PlaystationPage2(3);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(4) && !PlaystationPlace.playstations.get(3).isAvailability()) {
			playstation4.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_playstation (1).png"));
		} else {
			playstation4.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		}
		playstation4.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		playstation4.setOpaque(false);
		playstation4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		playstation4.setFocusPainted(false);
		playstation4.setContentAreaFilled(false);
		playstation4.setBorderPainted(false);
		playstation4.setBounds(31, 455, 230, 99);
		contentPane.add(playstation4);

		if (!visibleCheck(4))
			playstation4.setVisible(false);

		JButton playstation5 = new JButton("PLAYSTATION 5");
		playstation5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PlaystationPlace.playstations.get(4).isAvailability()) {
					dispose();
					PlaystationPage2 cp = new PlaystationPage2(4);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(5) && !PlaystationPlace.playstations.get(4).isAvailability()) {
			playstation5.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_playstation (1).png"));
		} else {
			playstation5.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		}
		playstation5.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		playstation5.setOpaque(false);
		playstation5.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		playstation5.setFocusPainted(false);
		playstation5.setContentAreaFilled(false);
		playstation5.setBorderPainted(false);
		playstation5.setBounds(337, 148, 230, 99);
		contentPane.add(playstation5);

		if (!visibleCheck(5))
			playstation5.setVisible(false);

		JButton playstation6 = new JButton("PLAYSTATION 6");
		playstation6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PlaystationPlace.playstations.get(0).isAvailability()) {
					dispose();
					PlaystationPage2 cp = new PlaystationPage2(5);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(6) && !PlaystationPlace.playstations.get(5).isAvailability()) {
			playstation6.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_playstation (1).png"));
		} else {
			playstation6.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		}
		playstation6.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		playstation6.setOpaque(false);
		playstation6.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		playstation6.setFocusPainted(false);
		playstation6.setContentAreaFilled(false);
		playstation6.setBorderPainted(false);
		playstation6.setBounds(337, 250, 230, 99);
		contentPane.add(playstation6);

		if (!visibleCheck(6))
			playstation6.setVisible(false);

		JButton playstation7 = new JButton("PLAYSTATION 7");
		playstation7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PlaystationPlace.playstations.get(6).isAvailability()) {
					dispose();
					PlaystationPage2 cp = new PlaystationPage2(6);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(7) && !PlaystationPlace.playstations.get(6).isAvailability()) {
			playstation7.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_playstation (1).png"));
		} else {
			playstation7.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		}
		playstation7.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		playstation7.setOpaque(false);
		playstation7.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		playstation7.setFocusPainted(false);
		playstation7.setContentAreaFilled(false);
		playstation7.setBorderPainted(false);
		playstation7.setBounds(337, 359, 230, 99);
		contentPane.add(playstation7);

		if (!visibleCheck(7))
			playstation7.setVisible(false);

		JButton playstation8 = new JButton("PLAYSTATION 8");
		playstation8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PlaystationPlace.playstations.get(7).isAvailability()) {
					dispose();
					PlaystationPage2 cp = new PlaystationPage2(7);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(8) && !PlaystationPlace.playstations.get(7).isAvailability()) {
			playstation8.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_playstation (1).png"));
		} else {
			playstation8.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		}
		playstation8.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		playstation8.setOpaque(false);
		playstation8.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		playstation8.setFocusPainted(false);
		playstation8.setContentAreaFilled(false);
		playstation8.setBorderPainted(false);
		playstation8.setBounds(337, 455, 230, 99);
		contentPane.add(playstation8);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\plain-white-background-2.jpg"));
		lblNewLabel.setBounds(0, 0, 631, 685);
		contentPane.add(lblNewLabel);

		if (!visibleCheck(8))
			playstation8.setVisible(false);

	}

	boolean visibleCheck(int id) {
		if (id <= PlaystationPlace.playstations.size()) {
			return true;
		} else
			return false;
	}
}