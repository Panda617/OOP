package team2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class kanrishatuikagamen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kanrishatuikagamen frame = new kanrishatuikagamen();
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
	public kanrishatuikagamen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7BA1\u7406\u8005\u8FFD\u52A0\u753B\u9762");
		label.setFont(new Font("MS UI Gothic", Font.PLAIN, 40));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(200, 40, 300, 70);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(80, 210, 80, 70);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(160, 210, 140, 70);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(300, 210, 80, 70);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setBounds(380, 210, 80, 70);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setBounds(460, 210, 80, 70);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setBounds(540, 210, 80, 70);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblid = new JLabel("\u5546\u54C1ID");
		lblid.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		lblid.setHorizontalAlignment(SwingConstants.CENTER);
		lblid.setBounds(80, 170, 80, 40);
		contentPane.add(lblid);
		
		JLabel label_1 = new JLabel("\u5546\u54C1\u540D");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		label_1.setBounds(160, 170, 140, 40);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u4FA1\u683C");
		label_2.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(300, 170, 80, 40);
		contentPane.add(label_2);
		
		JLabel lblNewLabel = new JLabel("\u6E29or\u51B7");
		lblNewLabel.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(380, 170, 80, 40);
		contentPane.add(lblNewLabel);
		
		JLabel label_3 = new JLabel("\u8CA9\u58F2\u671F\u9593");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		label_3.setBounds(460, 170, 80, 40);
		contentPane.add(label_3);
		
		JLabel lblNewLabel_1 = new JLabel("\u5728\u5EAB\u6570");
		lblNewLabel_1.setFont(new Font("MS UI Gothic", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(540, 170, 80, 40);
		contentPane.add(lblNewLabel_1);
		
		JButton button = new JButton("\u623B\u308B");
		button.setBackground(Color.GREEN);
		button.setFont(new Font("MS UI Gothic", Font.PLAIN, 40));
		button.setBounds(40, 40, 110, 70);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
			
			Home next = new Home();
			next.setVisible(true);
			setVisible(false);
			}
		});
		
		JButton button_1 = new JButton("\u30ED\u30B0\u30A2\u30A6\u30C8");
		button_1.setBackground(Color.RED);
		button_1.setFont(new Font("MS UI Gothic", Font.BOLD, 24));
		button_1.setBounds(525, 40, 130, 70);
		contentPane.add(button_1);
		
		button_1.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
			Login next = new Login();
			next.setVisible(true);
			setVisible(false);
			}
		});
		
		JButton button_2 = new JButton("\u8FFD\u52A0");
		button_2.setFont(new Font("MS UI Gothic", Font.BOLD, 24));
		button_2.setBounds(285, 350, 130, 50);
		contentPane.add(button_2);
		button_2.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
			try{
				String proId = textField.getText();
				String proName = textField_1.getText();
				String price = textField_2.getText();
				String ondo = textField_3.getText();
				String kikan = textField_4.getText();
				String zaiko = textField_5.getText();
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kaihatu","root","root");
				Statement stmt = con.createStatement();
				
				String sqlStr = "INSERT INTO shohin VALUES ("+ proId + ",'" + proName + "',"
											+ price + ","+ondo + ",'" + kikan + "',"+zaiko + ");";
				int rs = stmt.executeUpdate(sqlStr);
				//rs.next();
			
//			rs.close();
			stmt.close();
			con.close();
			
			}catch(Exception eee){
				System.out.println(eee);;
			}
			Home next = new Home();
			next.setVisible(true);
			setVisible(false);
			}
});
	}
}
	
	
	