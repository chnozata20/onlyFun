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
import javax.swing.JOptionPane;
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
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1;
	private JTextField usernameField;
	private JButton button;
	private JTextField eMailField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\user (2) (1).png"));
		lblNewLabel_2.setBounds(77, 416, 50, 50);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\padlock (1).png"));
		lblNewLabel_1.setBounds(77, 536, 50, 50);
		contentPane.add(lblNewLabel_1);

		usernameField = new JTextField();
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		usernameField.setOpaque(false);
		usernameField.setColumns(10);
		usernameField.setBounds(137, 416, 354, 50);
		contentPane.add(usernameField);

		button = new JButton("");
		button.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_back (1).png"));
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setFocusPainted(false);
		button.setOpaque(false);
		button.setBorderPainted(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				IntroPage ip = new IntroPage();
				ip.setVisible(true);
				ip.setResizable(false);
			}
		});
		button.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\back (1).png"));
		button.setBounds(-13, 0, 123, 83);
		contentPane.add(button);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\mail (1).png"));
		lblNewLabel_1_1.setBounds(77, 476, 50, 50);
		contentPane.add(lblNewLabel_1_1);

		eMailField = new JTextField();
		eMailField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		eMailField.setOpaque(false);
		eMailField.setColumns(10);
		eMailField.setBounds(137, 476, 354, 50);
		contentPane.add(eMailField);

		JComboBox genderComboBox = new JComboBox();
		genderComboBox.setBorder(null);
		genderComboBox.setAutoscrolls(true);
		genderComboBox.setInheritsPopupMenu(true);
		genderComboBox.setIgnoreRepaint(true);
		genderComboBox.setBackground(Color.LIGHT_GRAY);
		genderComboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		genderComboBox.setModel(new DefaultComboBoxModel(new String[] { "WOMEN", "MEN", "OTHER" }));
		genderComboBox.setBounds(226, 597, 162, 50);
		contentPane.add(genderComboBox);

		JButton btnNewButton = new JButton("");
		btnNewButton.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_signup (2).png"));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkInfo(usernameField.getText(),passwordField.getText(),eMailField.getText())) {
					User user = new User(usernameField.getText(),passwordField.getText(),eMailField.getText(),genderComboBox.getActionCommand(),0);
					if(user.add()) {
						JOptionPane.showMessageDialog(null, "REGISTER IS SUCCESFULL");
					}
					else {
						JOptionPane.showMessageDialog(null, "INCORRECT REGISTER INFORMATION!!");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "INCORRECT REGISTER INFORMATION!!");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\signup (2).png"));
		btnNewButton.setBounds(170, 10, 276, 170);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(137, 536, 354, 51);
		passwordField.setOpaque(false);
		contentPane.add(passwordField);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\BACK.png"));
		lblNewLabel.setBounds(-3, -179, 611, 976);
		contentPane.add(lblNewLabel);

	}
	boolean checkInfo(String username, String password, String eMail){
		if(username.equals("")||password.equals("")||eMail.equals("")) {
			return false;
		}
		return true;
	}
}