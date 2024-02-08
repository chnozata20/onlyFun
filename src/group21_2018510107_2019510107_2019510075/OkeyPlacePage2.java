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

public class OkeyPlacePage2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OkeyPlacePage2 frame = new OkeyPlacePage2();
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
	public OkeyPlacePage2() throws Exception {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton okey1 = new JButton("OKEY 1");
		okey1.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_unnamed (1).png"));
		okey1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		okey1.setBorderPainted(false);
		okey1.setContentAreaFilled(false);
		okey1.setFocusPainted(false);
		okey1.setOpaque(false);
		okey1.setBorderPainted(false);
		okey1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OkeyPlace.okeys.get(0).isAvailability()) {
					dispose();
					OkeyPage2 cp = new OkeyPage2(0);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(1) && !OkeyPlace.okeys.get(0).isAvailability()) {
			okey1.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_unnamed (1).png"));
		} else {
			okey1.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unnamed (1).png"));
		}
		okey1.setBounds(31, 148, 230, 99);
		contentPane.add(okey1);

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
			okey1.setVisible(false);
		}

		JButton okey2 = new JButton("OKEY 2");
		okey2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OkeyPlace.okeys.get(1).isAvailability()) {
					dispose();
					OkeyPage2 cp = new OkeyPage2(1);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(2) && !OkeyPlace.okeys.get(1).isAvailability()) {
			okey2.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_unnamed (1).png"));
		} else {
			okey2.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unnamed (1).png"));
		}
		okey2.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_unnamed (1).png"));
		okey2.setOpaque(false);
		okey2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		okey2.setFocusPainted(false);
		okey2.setContentAreaFilled(false);
		okey2.setBorderPainted(false);
		okey2.setBounds(31, 250, 230, 99);
		contentPane.add(okey2);

		if (!visibleCheck(2))
			okey2.setVisible(false);

		JButton okey3 = new JButton("OKEY 3");
		okey3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OkeyPlace.okeys.get(2).isAvailability()) {
					dispose();
					OkeyPage2 cp = new OkeyPage2(2);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(3) && !OkeyPlace.okeys.get(2).isAvailability()) {
			okey3.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_unnamed (1).png"));
		} else {
			okey3.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unnamed (1).png"));
		}
		okey3.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_unnamed (1).png"));
		okey3.setOpaque(false);
		okey3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		okey3.setFocusPainted(false);
		okey3.setContentAreaFilled(false);
		okey3.setBorderPainted(false);
		okey3.setBounds(31, 359, 230, 99);
		contentPane.add(okey3);

		if (!visibleCheck(3))
			okey3.setVisible(false);

		JButton okey4 = new JButton("OKEY 4");
		okey4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OkeyPlace.okeys.get(3).isAvailability()) {
					dispose();
					OkeyPage2 cp = new OkeyPage2(3);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(4) && !OkeyPlace.okeys.get(3).isAvailability()) {
			okey4.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_unnamed (1).png"));
		} else {
			okey4.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unnamed (1).png"));
		}
		okey4.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_unnamed (1).png"));
		okey4.setOpaque(false);
		okey4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		okey4.setFocusPainted(false);
		okey4.setContentAreaFilled(false);
		okey4.setBorderPainted(false);
		okey4.setBounds(31, 455, 230, 99);
		contentPane.add(okey4);

		if (!visibleCheck(4))
			okey4.setVisible(false);

		JButton okey5 = new JButton("OKEY 5");
		okey5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OkeyPlace.okeys.get(4).isAvailability()) {
					dispose();
					OkeyPage2 cp = new OkeyPage2(4);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(5) && !OkeyPlace.okeys.get(4).isAvailability()) {
			okey5.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_unnamed (1).png"));
		} else {
			okey5.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unnamed (1).png"));
		}
		okey5.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_unnamed (1).png"));
		okey5.setOpaque(false);
		okey5.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		okey5.setFocusPainted(false);
		okey5.setContentAreaFilled(false);
		okey5.setBorderPainted(false);
		okey5.setBounds(337, 148, 230, 99);
		contentPane.add(okey5);

		if (!visibleCheck(5))
			okey5.setVisible(false);

		JButton okey6 = new JButton("OKEY 6");
		okey6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OkeyPlace.okeys.get(0).isAvailability()) {
					dispose();
					OkeyPage2 cp = new OkeyPage2(5);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(6) && !OkeyPlace.okeys.get(5).isAvailability()) {
			okey6.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_unnamed (1).png"));
		} else {
			okey6.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unnamed (1).png"));
		}
		okey6.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_unnamed (1).png"));
		okey6.setOpaque(false);
		okey6.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		okey6.setFocusPainted(false);
		okey6.setContentAreaFilled(false);
		okey6.setBorderPainted(false);
		okey6.setBounds(337, 250, 230, 99);
		contentPane.add(okey6);

		if (!visibleCheck(6))
			okey6.setVisible(false);

		JButton okey7 = new JButton("OKEY 7");
		okey7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OkeyPlace.okeys.get(6).isAvailability()) {
					dispose();
					OkeyPage2 cp = new OkeyPage2(6);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(7) && !OkeyPlace.okeys.get(6).isAvailability()) {
			okey7.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_unnamed (1).png"));
		} else {
			okey7.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unnamed (1).png"));
		}
		okey7.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_unnamed (1).png"));
		okey7.setOpaque(false);
		okey7.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		okey7.setFocusPainted(false);
		okey7.setContentAreaFilled(false);
		okey7.setBorderPainted(false);
		okey7.setBounds(337, 359, 230, 99);
		contentPane.add(okey7);

		if (!visibleCheck(7))
			okey7.setVisible(false);

		JButton okey8 = new JButton("OKEY 8");
		okey8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (OkeyPlace.okeys.get(7).isAvailability()) {
					dispose();
					OkeyPage2 cp = new OkeyPage2(7);
					cp.setVisible(true);
					cp.setResizable(false);
				}
			}
		});
		if (visibleCheck(8) && !OkeyPlace.okeys.get(7).isAvailability()) {
			okey8.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unavilable_unnamed (1).png"));
		} else {
			okey8.setIcon(new ImageIcon(
					"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\unnamed (1).png"));
		}
		okey8.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_unnamed (1).png"));
		okey8.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		okey8.setFocusPainted(false);
		okey8.setContentAreaFilled(false);
		okey8.setBorderPainted(false);
		okey8.setBounds(337, 455, 230, 99);
		contentPane.add(okey8);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\plain-white-background-2.jpg"));
		lblNewLabel.setBounds(0, 0, 631, 685);
		contentPane.add(lblNewLabel);

		if (!visibleCheck(8))
			okey8.setVisible(false);

	}

	boolean visibleCheck(int id) {
		if (id <= OkeyPlace.okeys.size()) {
			return true;
		} else
			return false;
	}
}