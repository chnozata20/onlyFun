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
import javax.swing.JScrollBar;

public class AdminPage extends JFrame {

	private JPanel contentPane;
	private JLabel contents;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1_3_2 = new JButton("");
		btnNewButton_1_3_2.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_exit (1).png"));
		btnNewButton_1_3_2.setSelected(true);
		btnNewButton_1_3_2.setRolloverSelectedIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\black_exit (1).png"));
		btnNewButton_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				IntroPage ip = new IntroPage();
				ip.setVisible(true);
				ip.setResizable(false);
			}
		});
		btnNewButton_1_3_2.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\exit (1).png"));
		btnNewButton_1_3_2.setOpaque(false);
		btnNewButton_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_3_2.setFocusPainted(false);
		btnNewButton_1_3_2.setContentAreaFilled(false);
		btnNewButton_1_3_2.setBorderPainted(false);
		btnNewButton_1_3_2.setBounds(446, 10, 130, 91);
		contentPane.add(btnNewButton_1_3_2);
		
		
		JLabel tıtle = new JLabel("ADMIN PAGE");
		tıtle.setHorizontalAlignment(SwingConstants.CENTER);
		tıtle.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		tıtle.setFont(new Font("Tahoma", Font.BOLD, 16));
		tıtle.setBounds(31, 37, 423, 45);
		contentPane.add(tıtle);
		
		contents = new JLabel(getContent());
		contents.setHorizontalTextPosition(SwingConstants.LEADING);
		contents.setHorizontalAlignment(SwingConstants.LEFT);
		contents.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contents.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contents.setBounds(31, 124, 545, 410);
		contentPane.add(contents);
		
		JButton confirmButton_1 = new JButton("DELETE");
		confirmButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminDeletePage adc;
				adc = new AdminDeletePage();
				adc.setVisible(true);
				adc.setResizable(false);
			}
		});
		confirmButton_1.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\bin (1) (1).png"));
		confirmButton_1.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\bin (2).png"));
		confirmButton_1.setOpaque(false);
		confirmButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		confirmButton_1.setFocusPainted(false);
		confirmButton_1.setContentAreaFilled(false);
		confirmButton_1.setBorderPainted(false);
		confirmButton_1.setBounds(10, 544, 230, 99);
		contentPane.add(confirmButton_1);
		
		JButton confirmButton_1_1 = new JButton("ADD");
		confirmButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminAddPage ap = new AdminAddPage();
				ap.setVisible(true);
				ap.setResizable(false);
			}
		});
		confirmButton_1_1.setRolloverIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\addition (1).png"));
		confirmButton_1_1.setIcon(new ImageIcon("C:\\Users\\chnoz\\eclipse-workspace\\group21_2018510107_2019510107_2019510075\\images\\add (1).png"));
		confirmButton_1_1.setOpaque(false);
		confirmButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		confirmButton_1_1.setFocusPainted(false);
		confirmButton_1_1.setContentAreaFilled(false);
		confirmButton_1_1.setBorderPainted(false);
		confirmButton_1_1.setBounds(346, 544, 230, 99);
		contentPane.add(confirmButton_1_1);

	}
	String getContent() {
		String content = "";
		content+="<html>COMPUTERS<br/>";
		for(int i = 0; i<ComputerPlace.computers.size(); i++) {
			content+=ComputerPlace.computers.get(i).getPcId()+" ** "+ComputerPlace.computers.get(i).getGraphicCard()+" ** "+
					ComputerPlace.computers.get(i).getMonitor()+" **  "+ComputerPlace.computers.get(i).getProcessor()+" ** "+
					ComputerPlace.computers.get(i).getRam()+"<br/>";
		}
		content+="<html>MOVIES<br/>";
		for(int i = 0; i<CinemaPlace.movies.size(); i++) {
			content+=CinemaPlace.movies.get(i).getId()+" **  "+CinemaPlace.movies.get(i).getName()+" ** "+
		CinemaPlace.movies.get(i).getTime()+"<br/>";

		}
		content+="<html>BOWLINGS<br/>";
		for(int i = 0; i<BowlingPlace.bowlings.size(); i++) {
			content+=BowlingPlace.bowlings.get(i).getBowlingId()+" **  "+BowlingPlace.bowlings.get(i).getPrice()+"$ --- ";
		}
		content+="<br/>";
		content+="<html>OKEYS<br/>";
		for(int i = 0; i<OkeyPlace.okeys.size(); i++) {
			content+=OkeyPlace.okeys.get(i).getOkeyId()+" **  "+OkeyPlace.okeys.get(i).getDeskType()+" **  "+OkeyPlace.okeys.get(i).getPrice()+"$ --- ";
		}
		content+="<br/>";
		content+="<html>PLAYSTATIONS<br/>";
		for(int i = 0; i<PlaystationPlace.playstations.size(); i++) {
			content+=PlaystationPlace.playstations.get(i).getPlaystationId()+" **  "+PlaystationPlace.playstations.get(i).getPrice()+"$ --- ";
		}
		content+="</html>";
		return content;
	}
}