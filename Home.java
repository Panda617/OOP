package team2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.Color;

public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7BA1\u7406\u8005\u7BA1\u7406\u753B\u9762");
		label.setFont(new Font("MS UI Gothic", Font.PLAIN, 40));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(200, 40, 300, 70);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("\u30ED\u30B0\u30A2\u30A6\u30C8");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("MS UI Gothic", Font.BOLD, 24));
		btnNewButton.setBounds(525, 40, 130, 70);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u7BA1\u7406\u8005\u8FFD\u52A0\u753B\u9762");
		button.setBackground(Color.GREEN);
		button.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
		button.setBounds(106, 179, 192, 174);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u7BA1\u7406\u8005\u524A\u9664\u753B\u9762");
		button_1.setBackground(Color.GREEN);
		button_1.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
		button_1.setBounds(395, 179, 192, 174);
		contentPane.add(button_1);
		
			button.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent e) {
				
				kanrishatuikagamen next = new kanrishatuikagamen();
				next.setVisible(true);
				setVisible(false);
				}
			});
			
		
		button_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				kanrisyasakujo next = new kanrisyasakujo();
				next.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Login next = new Login();
				next.setVisible(true);
				setVisible(false);
				
			}
		});
	}

}
