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

public class AdminDeleteMoviePanel extends JFrame {

	private JPanel contentPane;
	private static int movieNumber = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDeleteMoviePanel frame = new AdminDeleteMoviePanel(movieNumber);
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
	public AdminDeleteMoviePanel(int movieNumber) {
		AdminDeleteMoviePanel.movieNumber = movieNumber;
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
				AdminDeleteMovie cp = new AdminDeleteMovie();
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
		
		JLabel lblNewLabel = new JLabel("MOVIE INFORMATION");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(166, 161, 303, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MOVIE NAME");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(56, 307, 149, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("TIME");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1_1_1_1.setBounds(56, 362, 149, 45);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_3 = new JLabel(String.valueOf(CinemaPlace.movies.get(movieNumber-1).getName()));
		lblNewLabel_1_1_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1_2_3.setBounds(218, 307, 324, 45);
		contentPane.add(lblNewLabel_1_1_1_2_3);
		
		JLabel lblNewLabel_1_1_1_2_4 = new JLabel(String.valueOf(CinemaPlace.movies.get(movieNumber-1).getTime()));
		lblNewLabel_1_1_1_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1_2_4.setBounds(218, 362, 324, 45);
		contentPane.add(lblNewLabel_1_1_1_2_4);

		JButton delete_button = new JButton("DELETE");
		delete_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = Test.connection;
					String sql = "delete from usersdatabase.movies where idmovies = " + (movieNumber);
					PreparedStatement st = con.prepareStatement(sql);
					st.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "TRANSACTION SUCCESFUL!");
					Login.checkDatabase();
					dispose();
					AdminDeleteMovie adc;
					adc = new AdminDeleteMovie();
					adc.setVisible(true);
					adc.setResizable(false);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		delete_button.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\bin (1) (1).png"));
		delete_button.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\bin (2).png"));
		delete_button.setOpaque(false);
		delete_button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		delete_button.setFocusPainted(false);
		delete_button.setContentAreaFilled(false);
		delete_button.setBorderPainted(false);
		delete_button.setBounds(183, 455, 230, 99);
		contentPane.add(delete_button);
		
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