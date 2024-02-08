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
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

public class CinemaPlacePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CinemaPlacePage frame = new CinemaPlacePage();
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
	public CinemaPlacePage() {
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
		
		JLabel movie1NameLabel = new JLabel("MOVIE NAME");
		movie1NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		movie1NameLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		movie1NameLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		movie1NameLabel.setBounds(31, 251, 247, 56);
		contentPane.add(movie1NameLabel);
		
		JLabel movie1TimeLabel = new JLabel("TIME");
		movie1TimeLabel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		movie1TimeLabel.setFont(new Font("Elephant", Font.PLAIN, 12));
		movie1TimeLabel.setBounds(31, 317, 247, 34);
		contentPane.add(movie1TimeLabel);
		
		JButton movie1Button = new JButton("");
		movie1Button.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_cinema (1).png"));
		movie1Button.setBorderPainted(false);
		movie1Button.setContentAreaFilled(false);
		movie1Button.setFocusPainted(false);
		movie1Button.setOpaque(false);
		movie1Button.setBorderPainted(false);
		movie1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CinemaPage cp = new CinemaPage(1);
				cp.setVisible(true);
				cp.setResizable(false);
			}
		});
		movie1Button.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\cinema (1).png"));
		movie1Button.setBounds(55, 162, 165, 99);
		contentPane.add(movie1Button);
		
		JButton movie2Button = new JButton("");
		movie2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CinemaPage cp = new CinemaPage(2);
				cp.setVisible(true);
				cp.setResizable(false);
			}
		});
		movie2Button.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\cinema (1).png"));
		movie2Button.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_cinema (1).png"));
		movie2Button.setOpaque(false);
		movie2Button.setFocusPainted(false);
		movie2Button.setContentAreaFilled(false);
		movie2Button.setBorderPainted(false);
		movie2Button.setBounds(357, 162, 165, 99);
		contentPane.add(movie2Button);
		
		JButton movie3Button = new JButton("");
		movie3Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CinemaPage cp = new CinemaPage(3);
				cp.setVisible(true);
				cp.setResizable(false);
			}
		});
		movie3Button.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\cinema (1).png"));
		movie3Button.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_cinema (1).png"));
		movie3Button.setOpaque(false);
		movie3Button.setFocusPainted(false);
		movie3Button.setContentAreaFilled(false);
		movie3Button.setBorderPainted(false);
		movie3Button.setBounds(55, 380, 165, 99);
		contentPane.add(movie3Button);
		
		JButton movie4Button = new JButton("");
		movie4Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CinemaPage cp = new CinemaPage(4);
				cp.setVisible(true);
				cp.setResizable(false);
			}
		});
		movie4Button.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\cinema (1).png"));
		movie4Button.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_cinema (1).png"));
		movie4Button.setOpaque(false);
		movie4Button.setFocusPainted(false);
		movie4Button.setContentAreaFilled(false);
		movie4Button.setBorderPainted(false);
		movie4Button.setBounds(357, 380, 165, 99);
		contentPane.add(movie4Button);
		
		JLabel movie3NameLabel = new JLabel("MOVIE NAME");
		movie3NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		movie3NameLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		movie3NameLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		movie3NameLabel.setBounds(31, 473, 247, 56);
		contentPane.add(movie3NameLabel);
		
		JLabel movie3TimeLabel = new JLabel("TIME");
		movie3TimeLabel.setFont(new Font("Elephant", Font.PLAIN, 12));
		movie3TimeLabel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		movie3TimeLabel.setBounds(31, 539, 247, 34);
		contentPane.add(movie3TimeLabel);
		
		JLabel movie2NameLabel = new JLabel("MOVIE NAME");
		movie2NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		movie2NameLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		movie2NameLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		movie2NameLabel.setBounds(315, 251, 247, 56);
		contentPane.add(movie2NameLabel);
		
		JLabel movie2TimeLabel = new JLabel("TIME");
		movie2TimeLabel.setFont(new Font("Elephant", Font.PLAIN, 12));
		movie2TimeLabel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		movie2TimeLabel.setBounds(315, 317, 247, 34);
		contentPane.add(movie2TimeLabel);
		
		JLabel movie4NameLabel = new JLabel("MOVIE NAME");
		movie4NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		movie4NameLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		movie4NameLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		movie4NameLabel.setBounds(315, 473, 247, 56);
		contentPane.add(movie4NameLabel);
		
		JLabel movie4TimeLabel = new JLabel("TIME");
		movie4TimeLabel.setFont(new Font("Elephant", Font.PLAIN, 12));
		movie4TimeLabel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		movie4TimeLabel.setBounds(315, 539, 247, 34);
		contentPane.add(movie4TimeLabel);
		if (!visibleCheck(4)) {
			movie4NameLabel.setVisible(false);
			movie4TimeLabel.setVisible(false);
			movie4Button.setVisible(false);
		}
		else {
			movie4NameLabel.setText(CinemaPlace.movies.get(3).getName());
			movie4TimeLabel.setText(CinemaPlace.movies.get(3).getTime());
		}
		if (!visibleCheck(3)) {
			movie3NameLabel.setVisible(false);
			movie3TimeLabel.setVisible(false);
			movie3Button.setVisible(false);
		}
		else {
			movie3NameLabel.setText(CinemaPlace.movies.get(2).getName());
			movie3TimeLabel.setText(CinemaPlace.movies.get(2).getTime());
		}
		if (!visibleCheck(2)) {
			movie2NameLabel.setVisible(false);
			movie2TimeLabel.setVisible(false);
			movie2Button.setVisible(false);
		}
		else {
			movie2NameLabel.setText(CinemaPlace.movies.get(1).getName());
			movie2TimeLabel.setText(CinemaPlace.movies.get(1).getTime());
		}
		if (!visibleCheck(1)) {
			movie1NameLabel.setVisible(false);
			movie1TimeLabel.setVisible(false);
			movie1Button.setVisible(false);
		}
		else {
			movie1NameLabel.setText(CinemaPlace.movies.get(0).getName());
			movie1TimeLabel.setText(CinemaPlace.movies.get(0).getTime());
		}
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\plain-white-background-2.jpg"));
		lblNewLabel_5.setBounds(0, 0, 607, 674);
		contentPane.add(lblNewLabel_5);

	}
	boolean visibleCheck(int id) {
		if (id <= CinemaPlace.movies.size()) {
			return true;
		} else
			return false;
	}
}