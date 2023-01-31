package travelmanagementsystem;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class viewpackage extends JFrame implements ActionListener {
	JLabel ls1,ls2,ls3,ls4,ls5,ls6,ls7;
	JButton b1;
	viewpackage(String Username){
		setBounds(250,100,1000,550);
		setLayout(null);
		getContentPane().setBackground(new Color(16,230,207));
		
		ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/bookedDetails.jpg"));
        Image i3 = i1.getImage().getScaledInstance(580, 520,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l9 = new JLabel(i2);
        l9.setBounds(405,0,580,520);
        add(l9);
		
		JLabel l1 = new JLabel("VIEW PACKAGE DETAILS:");
		l1.setFont(new Font("Yu Mincho", Font.BOLD, 20));
		l1.setBounds(30, 5, 350, 30);
		add(l1);
		
		JLabel l2 = new JLabel("Username:");
		l2.setFont(new Font("tahoma", Font.PLAIN, 20));
		l2.setBounds(30, 70, 150, 30);
		add(l2);
		
		ls1 = new JLabel("");
		ls1.setFont(new Font("tahoma", Font.PLAIN, 20));
		ls1.setBounds(200, 70, 200, 30);
		add(ls1);
		
		JLabel l3 = new JLabel("Package:");
		l3.setFont(new Font("tahoma", Font.PLAIN, 20));
		l3.setBounds(30, 120, 150, 30);
		add(l3);
		
		ls2 = new JLabel("");
		ls2.setFont(new Font("tahoma", Font.PLAIN, 20));
		ls2.setBounds(200, 120, 200, 30);
		add(ls2);
		
		JLabel l4 = new JLabel("Total Persons:");
		l4.setFont(new Font("tahoma", Font.PLAIN, 20));
		l4.setBounds(30, 170, 150, 30);
		add(l4);
		
		ls3 = new JLabel("");
		ls3.setFont(new Font("tahoma", Font.PLAIN, 20));
		ls3.setBounds(200, 170, 200, 30);
		add(ls3);
		
		JLabel l5 = new JLabel("ID:");
		l5.setFont(new Font("tahoma", Font.PLAIN, 20));
		l5.setBounds(30, 220, 150, 30);
		add(l5);
		
		ls4 = new JLabel("");
		ls4.setFont(new Font("tahoma", Font.PLAIN, 20));
		ls4.setBounds(200, 220, 200, 30);
		add(ls4);

		JLabel l6 = new JLabel("NUMBER:");
		l6.setFont(new Font("tahoma", Font.PLAIN, 20));
		l6.setBounds(30, 270, 150, 30);
		add(l6);
		
		ls5 = new JLabel("");
		ls5.setFont(new Font("tahoma", Font.PLAIN, 20));
		ls5.setBounds(200, 270, 200, 30);
		add(ls5);

		JLabel l7 = new JLabel("PHONE:");
		l7.setFont(new Font("tahoma", Font.PLAIN, 20));
		l7.setBounds(30, 320, 150, 30);
		add(l7);
		
		ls6 = new JLabel("");
		ls6.setFont(new Font("tahoma", Font.PLAIN, 20));
		ls6.setBounds(200, 320,200, 30);
		add(ls6);
		
		JLabel l8 = new JLabel("Price:");
		l8.setFont(new Font("tahoma", Font.PLAIN, 20));
		l8.setBounds(30, 370, 150, 30);
		add(l8);
		
		ls7 = new JLabel("");
		ls7.setFont(new Font("tahoma", Font.PLAIN, 20));
		ls7.setForeground(Color.blue);
		ls7.setBounds(200, 370, 200, 30);
		add(ls7);
		
		try {
			conn c = new conn();
			ResultSet rs = c.s.executeQuery("select * from bookpackage where Username = '"+Username+"'");
			while(rs.next()) {
				ls1.setText(rs.getString("Username"));
				ls2.setText(rs.getString("Package"));
				ls3.setText(rs.getString("Persons"));
				ls4.setText(rs.getString("ID"));
				ls5.setText(rs.getString("Number"));
				ls6.setText(rs.getString("Phone"));
				ls7.setText(rs.getString("Price"));
				}
		}catch(Exception e) {}
		
		b1 = new JButton("BACK");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(100,430,100,30);
		b1.addActionListener(this);
		add(b1);
		
		
	}

	public void actionPerformed(ActionEvent ae) {
		this.setVisible(false);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new viewpackage("").setVisible(true);

	}

}
