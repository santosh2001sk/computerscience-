package travelmanagementsystem;


import java.awt.*;


import java.sql.*;	
import javax.swing.*;
import java.awt.event.*;



public class bookpackage extends JFrame implements ActionListener {
	JLabel ls1,ls2,ls3,ls4,ls5;
	Choice c1;
	JTextField t1;
	JButton b1,b2,b3;
	bookpackage(String Username){
		setBounds(250,100,1000,550);
		setLayout(null);
		getContentPane().setBackground(new Color(16,230,207));
		
		
		 ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/bookpackage.jpg"));
         Image i3 = i1.getImage().getScaledInstance(580, 550,Image.SCALE_DEFAULT);
         ImageIcon i2 = new ImageIcon(i3);
         JLabel l9 = new JLabel(i2);
         l9.setBounds(420,0,580,550);
         add(l9);
         
         ImageIcon s1  = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/bookp.png"));
 	    Image s3 = s1.getImage().getScaledInstance(420, 120,Image.SCALE_DEFAULT);
 	    ImageIcon s2 = new ImageIcon(s3);
 	    JLabel k1 = new JLabel(s2);
 	    k1.setBounds(0,397,420,120);
 	    add(k1);
		
		JLabel l1 = new JLabel("BOOK PACKAGE:");
		l1.setFont(new Font("Yu Mincho", Font.BOLD, 30));
		l1.setBounds(40, 5, 300, 30);
		add(l1);
		
		JLabel l2 = new JLabel("Username:");
		l2.setFont(new Font("tahoma", Font.PLAIN, 20));
		l2.setBounds(40, 70, 150, 30);
		add(l2);
		
		ls1 = new JLabel("");
		ls1.setFont(new Font("tahoma", Font.PLAIN, 20));
		ls1.setBounds(200, 70, 200, 30);
		add(ls1);
		
		JLabel l3 = new JLabel("Select Package:");
		l3.setFont(new Font("tahoma", Font.PLAIN, 20));
		l3.setBounds(40, 110, 150, 30);
		add(l3);
		
		c1 = new Choice();
		c1.add("DIAMOND PACKAGE");
		c1.add("GOLD PACKAGE");
		c1.add("SILVER PACKAGE");
		c1.add("BRONZE PACKAGE");
		c1.add("360-INDIA");
		c1.setBounds(200,117,200,30);
		add(c1);
		
		JLabel l4 = new JLabel("Total Persons:");
		l4.setFont(new Font("tahoma", Font.PLAIN, 20));
		l4.setBounds(40, 150, 150, 30);
		add(l4);
		
		t1 = new JTextField("");
		t1.setBounds(200,152,200,25);
		add(t1);
		
		JLabel l5 = new JLabel("ID:");
		l5.setFont(new Font("tahoma", Font.PLAIN, 20));
		l5.setBounds(40, 190, 150, 30);
		add(l5);
		
		ls2 = new JLabel("");
		ls2.setFont(new Font("tahoma", Font.PLAIN, 20));
		ls2.setBounds(200, 190, 200, 30);
		add(ls2);
		
		JLabel l6 = new JLabel("NUMBER:");
		l6.setFont(new Font("tahoma", Font.PLAIN, 20));
		l6.setBounds(40, 230, 150, 30);
		add(l6);
		
		ls3 = new JLabel("");
		ls3.setFont(new Font("tahoma", Font.PLAIN, 20));
		ls3.setBounds(200, 230, 200, 30);
		add(ls3);
		
		JLabel l7 = new JLabel("PHONE:");
		l7.setFont(new Font("tahoma", Font.PLAIN, 20));
		l7.setBounds(40, 270, 150, 30);
		add(l7);
		
		ls4 = new JLabel("");
		ls4.setFont(new Font("tahoma", Font.PLAIN, 20));
		ls4.setBounds(200, 270,200, 30);
		add(ls4);
		
		JLabel l8 = new JLabel("Total Price:");
		l8.setFont(new Font("tahoma", Font.PLAIN, 20));
		l8.setBounds(40, 310, 150, 30);
		add(l8);
		
		ls5 = new JLabel("");
		ls5.setFont(new Font("tahoma", Font.PLAIN, 20));
		ls5.setForeground(Color.blue);
		ls5.setBounds(200, 310, 200, 30);
		add(ls5);
		
		try {
			conn c = new conn();
			ResultSet rs = c.s.executeQuery("select * from customer where Username = '"+Username+"'");
			while(rs.next()) {
				ls1.setText(rs.getString("Username"));
				ls2.setText(rs.getString("ID"));
				ls3.setText(rs.getString("Number"));
				ls4.setText(rs.getString("Phone"));
			}
		}catch(Exception e) {}
		
		b1 = new JButton("Check Price");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(40,380,140,30);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Back");
		b2.setBackground(Color.red);
		b2.setForeground(Color.black);
		b2.setBounds(310,5,90,30);
		b2.addActionListener(this);
		add(b2);
		
		b3 = new JButton("Book Package");
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setBounds(260,380,140,30);
		b3.addActionListener(this);
		add(b3);
	}
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()==b1) {
			String p = c1.getSelectedItem(); 
			
			int cost = 0;
            if(p.equals("DIAMOND PACKAGE")) {
                cost += 40000;
            }else if(p.equals("GOLD PACKAGE")){
                cost += 30000;
            }else if(p.equals("SILVER PACKAGE")){
                cost += 25000;
            }else if(p.equals("BRONZE PACKAGE")){
                cost += 15000;
            }else if(p.equals("360-INDIA")){
                cost += 150000;
            }
            int Persons = Integer.parseInt(t1.getText());
            cost *= Persons;
            ls5.setText("Rs-"+ cost);
            
		}else if(ae.getSource()==b3) {
			try {
				conn c = new conn();
				 c.s.executeUpdate( "insert into bookpackage values('"+ls1.getText()+"', '"+c1.getSelectedItem()+"', '"+t1.getText()+"', '"+ls2.getText()+"', '"+ls3.getText()+"', '"+ls4.getText()+"', '"+ls5.getText()+"')");
				 JOptionPane.showMessageDialog(null, "Package Booked Successfully");
				 this.setVisible(false);
			}catch(Exception e) {}
			
		}else if(ae.getSource()==b2) {
			this.setVisible(false);
		}
		
		
	}
	
    
	
	public static void main(String[] args) {
		new bookpackage("").setVisible(true);
		
	}

}
