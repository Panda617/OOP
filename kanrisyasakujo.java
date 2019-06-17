package team2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;





import java.sql.*;

public class kanrisyasakujo extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	 private DefaultTableModel model;
	private JTable table;
	String sel = null;
	int i = 0;
	int j = 0;
	
	public kanrisyasakujo(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 483);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JButton modoru = new JButton("\u623B\u308B");
		modoru.setBackground(Color.GREEN);
		modoru.setFont(new Font("MS UI Gothic", Font.PLAIN, 40));
		modoru.setBounds(30, 10, 110, 60);
		contentPane.add(modoru);
		
		JLabel label_sakujo = new JLabel("\u7BA1\u7406\u8005\u524A\u9664\u753B\u9762");
		label_sakujo.setFont(new Font("MS UI Gothic", Font.PLAIN, 40));
		label_sakujo.setHorizontalAlignment(SwingConstants.CENTER);
		label_sakujo.setBounds(200, 10, 300, 70);
		contentPane.add(label_sakujo);
		
		
		JButton logout = new JButton("\u30ED\u30B0\u30A2\u30A6\u30C8");
		logout.setBackground(Color.RED);
		logout.setFont(new Font("MS UI Gothic", Font.BOLD, 24));
		logout.setBounds(520, 10, 130, 60);
		contentPane.add(logout);
		

		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kaihatu","root","root");
			Statement stmt = con.createStatement();
			
			String sqlStr = "SELECT * FROM shohin";
			ResultSet rs = stmt.executeQuery( sqlStr );
			
			String[] colName = {"è§ïiID","è§ïiñº"};
			
			int row = 0;
			int col = 0;
			
			
			String[][] rowDat = new String[row][col];
			final DefaultTableModel model 
        	= new DefaultTableModel(rowDat, colName);
			getContentPane().setLayout(null);
			final JTable tb = new JTable(model);
			
			tb.addMouseListener(new java.awt.event.MouseAdapter() {
				   public void mouseClicked(MouseEvent e) {
					   i = tb.getSelectedRow();
					   
					   sel = model.getValueAt(i, 0).toString();
				   }
			});
			
			JScrollPane sp = new JScrollPane(tb);
			sp.setBounds(0, 79, 684, 295);
			getContentPane().add(sp);
			tb.setRowHeight(30);
			
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("èoóÕåãâ ");
			setSize(700, 480);
			setVisible(true);
			
			while(rs.next()){
				
				int id = rs.getInt("proId");
				String name = rs.getString("pro_Name");
				
				String[] data = { String.valueOf(id), name};
				model.addRow(data);
			}
				rs.close();
				stmt.close();
				con.close();
				
			}catch(Exception te){
				System.out.println(te);
			}
		
		JButton sakujo = new JButton("\u524A\u9664");
		sakujo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				   
				   try{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kaihatu","root","root");
						Statement stmt = con.createStatement();
						
						String sql = "Delete from shohin where proID = " + sel+ ";";
						int rsl = stmt.executeUpdate(sql);
					
	
						
						
					stmt.close();
					con.close();
					kanrisyasakujo tb = new kanrisyasakujo();
					tb.setVisible( false );
					tb.setVisible( true );
					
					}catch(Exception eee){
						System.out.println(eee);
					}        
			           
			   }
		});   
		
		sakujo.setFont(new Font("MS UI Gothic", Font.PLAIN, 30));
		sakujo.setBounds(282, 381, 135, 50);
		contentPane.add(sakujo);
				
		modoru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home next = new Home();
				next.setVisible(true);
				setVisible(false);
			}
		});
		
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login next = new Login();
				next.setVisible(true);
				setVisible(false);
			}
		});
			
			}
			public static void main(String[] args) {
				new kanrisyasakujo();
				}

}