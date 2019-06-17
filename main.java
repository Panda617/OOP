package team2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.Dialog;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class main extends JFrame{
	int i = 0;
	int j;
	String total;
	private JPanel contentPane;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
					frame.setTitle("Ž©“®”Ì”„‹@");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		final JLabel label_6 = new JLabel("0");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("MS UI Gothic", Font.PLAIN, 34));
		label_6.setBounds(430, 138, 230, 56);
		contentPane.add(label_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(12, 199, 15, -5);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		
		JLabel label = new JLabel("\u81EA\u52D5\u8CA9\u58F2\u6A5F");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("MS UI Gothic", Font.BOLD, 40));
		label.setBounds(121, 36, 240, 70);
		contentPane.add(label);
		
		
		JButton button_5 = new JButton("\u8CA9\u58F2\u8005");
		button_5.setBackground(Color.YELLOW);
		button_5.setFont(new Font("MS UI Gothic", Font.PLAIN, 18));
		button_5.setBounds(538, 10, 134, 39);
		contentPane.add(button_5);
		
		JLabel label_1 = new JLabel("\u91D1\u984D\u8868\u793A");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("MS UI Gothic", Font.PLAIN, 30));
		label_1.setBounds(430, 78, 230, 50);
		contentPane.add(label_1);
		
		
		
		JButton btnNewButton = new JButton("\uFF11\uFF10\uFF10\uFF10\u5186");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i = i +1000;
				total = String.valueOf(i);
				label_6.setText(total);
			}
		});
		
		btnNewButton.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		btnNewButton.setBounds(430, 220, 100, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uFF15\uFF10\uFF10\u5186");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i = i + 500;
				total = String.valueOf(i);
				label_6.setText(total);
			}
		});
		btnNewButton_1.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		btnNewButton_1.setBounds(560, 220, 100, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uFF11\uFF10\uFF10\u5186");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i = i + 100;
				total = String.valueOf(i);
				label_6.setText(total);
			}
		});
		btnNewButton_2.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		btnNewButton_2.setBounds(430, 290, 100, 50);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uFF15\uFF10\u5186");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i = i + 50;
				total = String.valueOf(i);
				label_6.setText(total);	
			}
		});
		btnNewButton_3.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		btnNewButton_3.setBounds(560, 290, 100, 50);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uFF11\uFF10\u5186");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i = i +10;
				total = String.valueOf(i);
				label_6.setText(total);
				
			}
		});
		btnNewButton_4.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		btnNewButton_4.setBounds(430, 360, 100, 50);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("\\\\file-svr\\\u5B66\u751F\u7528\\\u63D0\u51FA\u7528\\oop\\2018\\R2\\2\\\u25A0\u25A0\u7D0D\u54C1\u7269\u25A0\u25A0\\2.\u30BD\u30FC\u30B9\u30D5\u30A1\u30A4\u30EB\\\u753B\u50CF\\tya.jpg"));
		lblNewLabel.setBounds(25, 138, 55, 170);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("\\\\file-svr\\\u5B66\u751F\u7528\\\u63D0\u51FA\u7528\\oop\\2018\\R2\\2\\\u25A0\u25A0\u7D0D\u54C1\u7269\u25A0\u25A0\\2.\u30BD\u30FC\u30B9\u30D5\u30A1\u30A4\u30EB\\\u753B\u50CF\\cora.jpg"));
		lblNewLabel_1.setBounds(100, 138, 55, 170);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("\\\\file-svr\\\u5B66\u751F\u7528\\\u63D0\u51FA\u7528\\oop\\2018\\R2\\2\\\u25A0\u25A0\u7D0D\u54C1\u7269\u25A0\u25A0\\2.\u30BD\u30FC\u30B9\u30D5\u30A1\u30A4\u30EB\\\u753B\u50CF\\fannta.jpg"));
		lblNewLabel_2.setBounds(175, 138, 55, 170);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("\\\\file-svr\\\u5B66\u751F\u7528\\\u63D0\u51FA\u7528\\oop\\2018\\R2\\2\\\u25A0\u25A0\u7D0D\u54C1\u7269\u25A0\u25A0\\2.\u30BD\u30FC\u30B9\u30D5\u30A1\u30A4\u30EB\\\u753B\u50CF\\blendyblack.jpg"));
		lblNewLabel_3.setBounds(250, 138, 55, 170);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("\\\\file-svr\\\u5B66\u751F\u7528\\\u63D0\u51FA\u7528\\oop\\2018\\R2\\2\\\u25A0\u25A0\u7D0D\u54C1\u7269\u25A0\u25A0\\2.\u30BD\u30FC\u30B9\u30D5\u30A1\u30A4\u30EB\\\u753B\u50CF\\kotokotot.png"));
		lblNewLabel_4.setBounds(325, 139, 55, 170);
		contentPane.add(lblNewLabel_4);
		
		JLabel Label_1 = new JLabel("\u304A\u8336");
		Label_1.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		Label_1.setHorizontalAlignment(SwingConstants.CENTER);
		Label_1.setBounds(25, 320, 55, 30);
		contentPane.add(Label_1);
		
		JLabel label_2 = new JLabel("\u30B3\u30FC\u30E9");
		label_2.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(100, 320, 55, 30);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u30D5\u30A1\u30F3\u30BF");
		label_3.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(175, 320, 55, 30);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u30B3\u30FC\u30D2\u30FC");
		label_4.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(250, 320, 55, 30);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u30B3\u30C8\u30B3\u30C8");
		label_5.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(325, 320, 55, 30);
		contentPane.add(label_5);
		
		JButton button_6 = new JButton("\u30AF\u30EA\u30A2");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				label_6.setText("0");
				i =0;
				
			}
		});
		button_6.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		button_6.setBounds(560, 360, 100, 50);
		contentPane.add(button_6);
		
		final JButton button = new JButton("100");
		button.setForeground(Color.BLACK);
		button.setBackground(Color.CYAN);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				j =  Integer.parseInt(button.getActionCommand());
				i = i - j;
				if ( i < 0){
					JOptionPane.showMessageDialog(main.this, "‚¨‹à‚ð“Š“ü‚µ‚Ä‚­‚¾‚³‚¢");
					i = i + j;
				}else{
					total = String.valueOf(i);
					label_6.setText(total);
					
					JOptionPane.showMessageDialog(main.this, "w“üŠ®—¹");
				}
			}
		});
		
		final JButton button_1 = new JButton("120");
		button_1.setBackground(Color.CYAN);
		button_1.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		button_1.setBounds(100, 360, 55, 50);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				j =  Integer.parseInt(button_1.getActionCommand());
				i = i - j;
				if ( i < 0){
					JOptionPane.showMessageDialog(main.this, "‚¨‹à‚ð“Š“ü‚µ‚Ä‚­‚¾‚³‚¢");
					i = i + j;
				}else{
				total = String.valueOf(i);
				label_6.setText(total);
				JOptionPane.showMessageDialog(main.this, "w“üŠ®—¹");
				}
			}
		});
		
		final JButton button_2 = new JButton("130");
		button_2.setBackground(Color.CYAN);
		button_2.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		button_2.setBounds(175, 360, 55, 50);
		contentPane.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				j =  Integer.parseInt(button_2.getActionCommand());
				i = i - j;
				if ( i < 0){
					JOptionPane.showMessageDialog(main.this, "‚¨‹à‚ð“Š“ü‚µ‚Ä‚­‚¾‚³‚¢");
					i = i + j;
				}else{
				total = String.valueOf(i);
				label_6.setText(total);
				JOptionPane.showMessageDialog(main.this, "w“üŠ®—¹");
				}
			}
		});
		
		final JButton button_3 = new JButton("100");
		button_3.setBackground(Color.CYAN);
		button_3.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				j =  Integer.parseInt(button_3.getActionCommand());
				i = i - j;
				if ( i < 0){
					JOptionPane.showMessageDialog(main.this, "‚¨‹à‚ð“Š“ü‚µ‚Ä‚­‚¾‚³‚¢");
					i = i + j;
				}else{
				total = String.valueOf(i);
				label_6.setText(total);
				JOptionPane.showMessageDialog(main.this, "w“üŠ®—¹");
				}
			}
		});
		button_3.setBounds(250, 360, 55, 50);
		contentPane.add(button_3);
		
		final JButton button_4 = new JButton("100");
		button_4.setBackground(Color.CYAN);
		button_4.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				j =  Integer.parseInt(button_4.getActionCommand());
				i = i - j;
				if ( i < 0){
					JOptionPane.showMessageDialog(main.this, "‚¨‹à‚ð“Š“ü‚µ‚Ä‚­‚¾‚³‚¢");
					i = i + j;
				}else{
				total = String.valueOf(i);
				label_6.setText(total);
				JOptionPane.showMessageDialog(main.this, "w“üŠ®—¹");
				}
				
			}
			
		});
		button_4.setBounds(325, 360, 55, 50);
		contentPane.add(button_4);
		
		button.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		button.setBounds(25, 360, 55, 50);
		contentPane.add(button);
		
		
			button_5.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent e) {
					Login next = new Login();
					next.setVisible(true);
					setVisible(false);
					
				}
			});
	}

	
	
}