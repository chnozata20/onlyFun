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
import javax.swing.JOptionPane;
import javax.swing.Box;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.UIManager;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class SeatPage extends JFrame {

	private JPanel contentPane;
	private static String seatId = "";
	private static int seatNumber = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeatPage frame = new SeatPage(seatId,seatNumber);
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
	public SeatPage(String seatId, int seatNumber) {
		SeatPage.seatId=seatId;
		SeatPage.seatNumber=seatNumber;
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton back_button = new JButton("");
		back_button.setSelected(true);
		back_button.setRolloverSelectedIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_back (1).png"));
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CinemaPage cp = new CinemaPage(CinemaPage.movieId);
				cp.setVisible(true);
				cp.setResizable(false);
			}
		});
		back_button.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\back (1).png"));
		back_button.setOpaque(false);
		back_button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		back_button.setFocusPainted(false);
		back_button.setContentAreaFilled(false);
		back_button.setBorderPainted(false);
		back_button.setBounds(31, 23, 130, 91);
		contentPane.add(back_button);
		
		JLabel lblNewLabel = new JLabel("SEAT INFORMATION");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 16));
		lblNewLabel.setBounds(171, 87, 303, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MOVIE NAME");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(56, 307, 149, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SEAT NO");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		lblNewLabel_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1.setBounds(56, 142, 149, 45);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("PRICE");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1_1.setBounds(56, 252, 149, 45);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("AVAILABILITY");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1_1_1.setBounds(56, 197, 149, 45);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("TIME");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1_1_1_1.setBounds(56, 362, 149, 45);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel(seatId);
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1_2.setBounds(218, 142, 324, 45);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel(String.valueOf(CinemaPlace.movies.get(CinemaPage.movieId-1).
				seats.get(seatNumber-1).isAvailability()));
		lblNewLabel_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1_2_1.setBounds(218, 197, 324, 45);
		contentPane.add(lblNewLabel_1_1_1_2_1);
		
		JLabel price = new JLabel(String.valueOf(CinemaPlace.movies.get(CinemaPage.movieId-1).
				seats.get(seatNumber-1).getPrice()));
		price.setHorizontalAlignment(SwingConstants.CENTER);
		price.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		price.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		price.setBounds(218, 252, 324, 45);
		contentPane.add(price);
		
		JLabel lblNewLabel_1_1_1_2_3 = new JLabel(String.valueOf(CinemaPlace.movies.get(CinemaPage.movieId-1).getName()));
		lblNewLabel_1_1_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1_2_3.setBounds(218, 307, 324, 45);
		contentPane.add(lblNewLabel_1_1_1_2_3);
		
		JLabel lblNewLabel_1_1_1_2_4 = new JLabel(String.valueOf(CinemaPlace.movies.get(CinemaPage.movieId-1).getTime()));
		lblNewLabel_1_1_1_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1_2_4.setBounds(218, 362, 324, 45);
		contentPane.add(lblNewLabel_1_1_1_2_4);

		JButton confirm_button = new JButton("CONFIRM");
		confirm_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkEnoughCredit(Integer.parseInt(price.getText()))) {
					Login.user.setCredit(Login.user.getCredit() - Integer.parseInt(price.getText()));
					CinemaPlace.movies.get(CinemaPage.movieId-1).seats.get(seatNumber-1).rent(0);
					JOptionPane.showMessageDialog(null, "TRANSACTION SUCCESFUL!");
					dispose();
					CinemaPage cpp;
					try {
						cpp = new CinemaPage(CinemaPage.movieId);
						cpp.setVisible(true);
						cpp.setResizable(false);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "NOT ENOUGH MONEY");
				}

			}
		});
		confirm_button.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\confirm (1) (1).png"));
		confirm_button.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\confirm (2).png"));
		confirm_button.setOpaque(false);
		confirm_button.setFont(new Font("Showcard Gothic", Font.PLAIN, 16));
		confirm_button.setFocusPainted(false);
		confirm_button.setContentAreaFilled(false);
		confirm_button.setBorderPainted(false);
		confirm_button.setBounds(192, 430, 230, 99);
		contentPane.add(confirm_button);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\plain-white-background-2.jpg"));
		lblNewLabel_2.setBounds(0, 0, 610, 669);
		contentPane.add(lblNewLabel_2);

	}
	boolean checkEnoughCredit(int price) {
		if (Login.user.getCredit() >= price)
			return true;
		else
			return false;
	}
}