package team2;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

import java.sql.*;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7BA1\u7406\u8005\u30ED\u30B0\u30A4\u30F3");
		label.setBackground(new Color(255, 255, 255));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("MS UI Gothic", Font.PLAIN, 40));
		label.setBounds(200, 40, 300, 70);
		contentPane.add(label);
		
		JLabel lblid = new JLabel("\u7BA1\u7406\u8005ID");
		lblid.setFont(new Font("MS UI Gothic", Font.BOLD, 18));
		lblid.setBounds(180, 180, 80, 30);
		contentPane.add(lblid);
		
		textField = new JTextField();
		textField.setBounds(440, 180, 110, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u30D1\u30B9\u30EF\u30FC\u30C9");
		label_1.setFont(new Font("MS UI Gothic", Font.BOLD, 18));
		label_1.setBounds(180, 257, 80, 30);
		contentPane.add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(440, 260, 110, 30);
		contentPane.add(passwordField);
		
		JButton button = new JButton("\u30ED\u30B0\u30A4\u30F3");
		button.setBackground(Color.YELLOW);
		button.setFont(new Font("MS UI Gothic", Font.BOLD, 24));
		button.setBounds(285, 350, 130, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u623B\u308B");
		button_1.setBackground(new Color(0, 255, 0));
		button_1.setFont(new Font("MS UI Gothic", Font.PLAIN, 40));
		button_1.setBounds(40, 40, 110, 70);
		contentPane.add(button_1);
		
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try{
					String hoge = textField.getText();
					char[] hoge2 = passwordField.getPassword();
					String hoge1 = new String(hoge2);
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kaihatu","root","root");
					Statement stmt = con.createStatement();
					
					String sqlStr = "SELECT count(*) FROM kanrisha where admid = '" + hoge + "'";
					ResultSet rs = stmt.executeQuery(sqlStr);
					rs.next();
					int x = rs.getInt("count(*)");
					
					if(x == 1){
						sqlStr = "SELECT pass FROM kanrisha where admid = '" + hoge + "'";
						rs = stmt.executeQuery(sqlStr);
						rs.next();
						String pw = rs.getString("pass");
							if(pw.equals(hoge1)){
								Home next = new Home();
								next.setVisible(true);
								setVisible(false);
							}else{
								JOptionPane.showMessageDialog(Login.this, "PWÇ™ä‘à·Ç¶ÇƒÇ¢Ç‹Ç∑");
								passwordField.setText("");
							}
					}else{
						JOptionPane.showMessageDialog(Login.this, "IDÇ™ë∂ç›ÇµÇ‹ÇπÇÒ");
						textField.setText("");
						passwordField.setText("");
					}
					rs.close();
					stmt.close();
					con.close();
				}catch(Exception eee){
					System.out.println(eee);;
				}				
				
			}
		});
		button_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				main next = new main();
				next.setVisible(true);
				setVisible(false);
				
			}
		});
	}
}
