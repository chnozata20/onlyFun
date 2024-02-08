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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AddCreditPage extends JFrame {

	private JPanel contentPane;
	private JTextField cardNoTextField;
	private JTextField expirationDateTextField;
	private JTextField securityCodetextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCreditPage frame = new AddCreditPage();
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
	public AddCreditPage() {
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
				MainPage bpp;
				try {
					bpp = new MainPage();
					bpp.setVisible(true);
					bpp.setResizable(false);
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
		
		JLabel lblNewLabel_1_1 = new JLabel("EXPIRATION DATE");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1.setBounds(56, 297, 149, 45);
		contentPane.add(lblNewLabel_1_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		spinner.setToolTipText("");
		spinner.setModel(new SpinnerNumberModel(10, 10, 1000, 10));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 16));
		spinner.setBounds(218, 187, 94, 45);
		spinner.setEditor(new JSpinner.DefaultEditor(spinner));
		contentPane.add(spinner);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("CARD NO");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_2.setBounds(56, 242, 149, 45);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("SECURITY CODE");
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_3.setBounds(56, 352, 149, 45);
		contentPane.add(lblNewLabel_1_1_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MASTERCARD", "VISA"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(56, 407, 324, 45);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("YOUR CREDIT");
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_2_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_2_1.setBounds(182, 69, 149, 45);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JLabel your_credit_textField = new JLabel(String.valueOf(Login.user.getCredit()));
		your_credit_textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		your_credit_textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		your_credit_textField.setBounds(341, 69, 201, 45);
		contentPane.add(your_credit_textField);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("AMOUNT($)");
		lblNewLabel_1_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_2_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_2_2.setBounds(56, 187, 149, 45);
		contentPane.add(lblNewLabel_1_1_2_2);
		
		cardNoTextField = new JTextField();
		cardNoTextField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		cardNoTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cardNoTextField.setOpaque(false);
		cardNoTextField.setBounds(215, 242, 324, 45);
		contentPane.add(cardNoTextField);
		cardNoTextField.setColumns(10);
		
		expirationDateTextField = new JTextField();
		expirationDateTextField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		expirationDateTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		expirationDateTextField.setOpaque(false);
		expirationDateTextField.setColumns(10);
		expirationDateTextField.setBounds(215, 299, 327, 45);
		contentPane.add(expirationDateTextField);
		
		securityCodetextField = new JTextField();
		securityCodetextField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		securityCodetextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		securityCodetextField.setOpaque(false);
		securityCodetextField.setColumns(10);
		securityCodetextField.setBounds(215, 354, 327, 45);
		contentPane.add(securityCodetextField);
		
		JButton confirmButton = new JButton("CONFIRM");
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.user.setCredit(Login.user.getCredit()+(int) spinner.getValue());
				your_credit_textField.setText((String.valueOf(Login.user.getCredit())));
				JOptionPane.showMessageDialog(null, "TRANSACTION SUCCESFUL!");
			}
		});
		confirmButton.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\confirm (1) (1).png"));
		confirmButton.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\confirm (2).png"));
		confirmButton.setOpaque(false);
		confirmButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		confirmButton.setFocusPainted(false);
		confirmButton.setContentAreaFilled(false);
		confirmButton.setBorderPainted(false);
		confirmButton.setBounds(184, 492, 230, 99);
		contentPane.add(confirmButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("\r\n");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\plain-white-background-2.jpg"));
		lblNewLabel.setBounds(0, 0, 605, 677);
		contentPane.add(lblNewLabel);

	}
}