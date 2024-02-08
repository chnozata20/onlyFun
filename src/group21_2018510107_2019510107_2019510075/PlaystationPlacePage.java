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

public class PlaystationPlacePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlaystationPlacePage frame = new PlaystationPlacePage();
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
	public PlaystationPlacePage() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton_1 = new JButton("PLAYSTATION 1");
		btnNewButton_1.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PlaystationPage pp = new PlaystationPage();
				pp.setVisible(true);
				pp.setResizable(false);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		btnNewButton_1.setBounds(31, 148, 230, 99);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_3_2 = new JButton("");
		btnNewButton_1_3_2.setSelected(true);
		btnNewButton_1_3_2.setRolloverSelectedIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_back (1).png"));
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
		btnNewButton_1_3_2.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\back (1).png"));
		btnNewButton_1_3_2.setOpaque(false);
		btnNewButton_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_3_2.setFocusPainted(false);
		btnNewButton_1_3_2.setContentAreaFilled(false);
		btnNewButton_1_3_2.setBorderPainted(false);
		btnNewButton_1_3_2.setBounds(31, 23, 130, 91);
		contentPane.add(btnNewButton_1_3_2);
		
		JButton btnNewButton_1_1 = new JButton("PLAYSTATION 2");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PlaystationPage pp = new PlaystationPage();
				pp.setVisible(true);
				pp.setResizable(false);
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		btnNewButton_1_1.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		btnNewButton_1_1.setOpaque(false);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBounds(31, 250, 230, 99);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("PLAYSTATION 3");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PlaystationPage pp = new PlaystationPage();
				pp.setVisible(true);
				pp.setResizable(false);
			}
		});
		btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		btnNewButton_1_2.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		btnNewButton_1_2.setOpaque(false);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_2.setFocusPainted(false);
		btnNewButton_1_2.setContentAreaFilled(false);
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.setBounds(31, 359, 230, 99);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_4 = new JButton("PLAYSTATION 4");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PlaystationPage pp = new PlaystationPage();
				pp.setVisible(true);
				pp.setResizable(false);
			}
		});
		btnNewButton_1_4.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		btnNewButton_1_4.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		btnNewButton_1_4.setOpaque(false);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_4.setFocusPainted(false);
		btnNewButton_1_4.setContentAreaFilled(false);
		btnNewButton_1_4.setBorderPainted(false);
		btnNewButton_1_4.setBounds(31, 479, 230, 99);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("PLAYSTATION 5");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PlaystationPage pp = new PlaystationPage();
				pp.setVisible(true);
				pp.setResizable(false);
			}
		});
		btnNewButton_1_5.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		btnNewButton_1_5.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		btnNewButton_1_5.setOpaque(false);
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_5.setFocusPainted(false);
		btnNewButton_1_5.setContentAreaFilled(false);
		btnNewButton_1_5.setBorderPainted(false);
		btnNewButton_1_5.setBounds(337, 148, 230, 99);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("PLAYSTATION 6");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PlaystationPage pp = new PlaystationPage();
				pp.setVisible(true);
				pp.setResizable(false);
			}
		});
		btnNewButton_1_6.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		btnNewButton_1_6.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		btnNewButton_1_6.setOpaque(false);
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_6.setFocusPainted(false);
		btnNewButton_1_6.setContentAreaFilled(false);
		btnNewButton_1_6.setBorderPainted(false);
		btnNewButton_1_6.setBounds(337, 250, 230, 99);
		contentPane.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("PLAYSTATION 7");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PlaystationPage pp = new PlaystationPage();
				pp.setVisible(true);
				pp.setResizable(false);
			}
		});
		btnNewButton_1_7.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		btnNewButton_1_7.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		btnNewButton_1_7.setOpaque(false);
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_7.setFocusPainted(false);
		btnNewButton_1_7.setContentAreaFilled(false);
		btnNewButton_1_7.setBorderPainted(false);
		btnNewButton_1_7.setBounds(337, 359, 230, 99);
		contentPane.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("PLAYSTATION 8");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PlaystationPage pp = new PlaystationPage();
				pp.setVisible(true);
				pp.setResizable(false);
			}
		});
		btnNewButton_1_8.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\playstation (1).png"));
		btnNewButton_1_8.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_playstation (1).png"));
		btnNewButton_1_8.setOpaque(false);
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_8.setFocusPainted(false);
		btnNewButton_1_8.setContentAreaFilled(false);
		btnNewButton_1_8.setBorderPainted(false);
		btnNewButton_1_8.setBounds(337, 479, 230, 99);
		contentPane.add(btnNewButton_1_8);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\plain-white-background-2.jpg"));
		lblNewLabel.setBounds(0, 0, 631, 685);
		contentPane.add(lblNewLabel);

	}
}