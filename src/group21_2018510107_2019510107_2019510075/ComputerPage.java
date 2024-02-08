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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.UIManager;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class ComputerPage extends JFrame {

	private JPanel contentPane;
	private static int computerId = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComputerPage frame = new ComputerPage(computerId);
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
	public ComputerPage(int computerId) {
		ComputerPage.computerId = computerId;
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
		btnNewButton_1_3_2.setRolloverSelectedIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_back (1).png"));
		btnNewButton_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ComputerPlacePage cpp;
				try {
					cpp = new ComputerPlacePage();
					cpp.setVisible(true);
					cpp.setResizable(false);
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

		JLabel lblNewLabel = new JLabel("COMPUTER INFORMATION");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 16));
		lblNewLabel.setBounds(171, 87, 303, 45);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("CPU");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(56, 307, 149, 45);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("AVAILABILITY");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblNewLabel_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1.setBounds(56, 142, 149, 45);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("PRICE(per hour)");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1.setBounds(56, 417, 149, 45);
		contentPane.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("MONITOR");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1_1.setBounds(56, 252, 149, 45);
		contentPane.add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("GRAPHIC CARD");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1_1_1.setBounds(56, 197, 149, 45);
		contentPane.add(lblNewLabel_1_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("RAM");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1_1_1_1.setBounds(56, 362, 149, 45);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);

		JLabel availabilityLabel = new JLabel(String.valueOf(ComputerPlace.computers.get(1).isAvailability()));
		availabilityLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		availabilityLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		availabilityLabel.setBounds(218, 142, 324, 45);
		contentPane.add(availabilityLabel);

		JLabel graphicLabel = new JLabel(ComputerPlace.computers.get(computerId).getGraphicCard());
		graphicLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		graphicLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		graphicLabel.setBounds(218, 197, 324, 45);
		contentPane.add(graphicLabel);

		JLabel monitorLabel = new JLabel(ComputerPlace.computers.get(computerId).getMonitor());
		monitorLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		monitorLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		monitorLabel.setBounds(218, 252, 324, 45);
		contentPane.add(monitorLabel);

		JLabel cpuLabel = new JLabel(ComputerPlace.computers.get(computerId).getProcessor());
		cpuLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		cpuLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		cpuLabel.setBounds(218, 307, 324, 45);
		contentPane.add(cpuLabel);

		JLabel ramLabel = new JLabel(ComputerPlace.computers.get(computerId).getRam());
		ramLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		ramLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		ramLabel.setBounds(218, 362, 324, 45);
		contentPane.add(ramLabel);

		JLabel prıceLabel = new JLabel(String.valueOf(ComputerPlace.computers.get(computerId).getPrice()));
		prıceLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		prıceLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		prıceLabel.setBounds(218, 417, 324, 45);
		contentPane.add(prıceLabel);

		JSpinner spinner = new JSpinner();
		spinner.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		spinner.setOpaque(false);
		spinner.setToolTipText("");
		spinner.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		spinner.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		spinner.setBounds(131, 472, 77, 45);
		spinner.setOpaque(false);
		spinner.setEditor(new JSpinner.DefaultEditor(spinner));
		contentPane.add(spinner);

		JLabel totalPrıceLabel = new JLabel(
				String.valueOf(ComputerPlace.computers.get(computerId).getPrice() * (int) spinner.getValue()));
		totalPrıceLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		totalPrıceLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		totalPrıceLabel.setBounds(218, 472, 324, 45);
		contentPane.add(totalPrıceLabel);

		ChangeListener listener = new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				totalPrıceLabel.setText(
						String.valueOf(ComputerPlace.computers.get(computerId).getPrice() * (int) spinner.getValue()));
			}
		};

		spinner.addChangeListener(listener);

		JButton confirmButton = new JButton("CONFIRM");
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkEnoughCredit(Integer.parseInt(totalPrıceLabel.getText()))) {
					Login.user.setCredit(Login.user.getCredit() - Integer.parseInt(totalPrıceLabel.getText()));
					ComputerPlace.computers.get(computerId).rent((int) spinner.getValue() * 60);
					JOptionPane.showMessageDialog(null, "TRANSACTION SUCCESFUL!");
					dispose();
					ComputerPlacePage cpp;
					try {
						cpp = new ComputerPlacePage();
						cpp.setVisible(true);
						cpp.setResizable(false);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
				else
					JOptionPane.showMessageDialog(null, "NOT ENOUGH MONEY");

			}
		});
		confirmButton.setRolloverIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\confirm (1) (1).png"));
		confirmButton.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\confirm (2).png"));
		confirmButton.setOpaque(false);
		confirmButton.setFont(new Font("Showcard Gothic", Font.PLAIN, 16));
		confirmButton.setFocusPainted(false);
		confirmButton.setContentAreaFilled(false);
		confirmButton.setBorderPainted(false);
		confirmButton.setBounds(187, 527, 230, 99);
		contentPane.add(confirmButton);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(
				"C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\plain-white-background-2.jpg"));
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