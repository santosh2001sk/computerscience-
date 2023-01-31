package travelmanagementsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class bookhotel extends JFrame  implements ActionListener {
	JLabel ls1,ls2,ls3,ls4,ls5;
	Choice c1;
	JRadioButton r1,r2,r3,r4;
	JTextField t1,t2;
	JButton b1,b2,b3;
	bookhotel(String Username){
		setBounds(250,100,1000,560);
		setLayout(null);
		getContentPane().setBackground(new Color(16,230,207));
		
		 ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/book.jpg"));
         Image i3 = i1.getImage().getScaledInstance(570, 560,Image.SCALE_DEFAULT);
         ImageIcon i2 = new ImageIcon(i3);
         JLabel li = new JLabel(i2);
         li.setBounds(430,0,570,560);
         add(li);
	
		JLabel l1 = new JLabel("BOOK HOTEL:");
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
		
		
		JLabel l3 = new JLabel("Select hotel:");
		l3.setFont(new Font("tahoma", Font.PLAIN, 20));
		l3.setBounds(40, 110, 150, 30);
		add(l3);
		
		c1 = new Choice();
		try {
			conn c=new conn();
			ResultSet rs=c.s.executeQuery("Select * from hotels");
			while(rs.next()) {
				c1.add(rs.getString("name"));
			}
			
			
		}catch(Exception e) {}
		
		c1.setBounds(200,117,220,30);
		add(c1);
		
		JLabel l4 = new JLabel("Total Persons:");
		l4.setFont(new Font("tahoma", Font.PLAIN, 20));
		l4.setBounds(40, 150, 150, 30);
		add(l4);
		
		t1 = new JTextField("");
		t1.setBounds(200,152,220,25);
		add(t1);
		
		JLabel l5 = new JLabel("Number of days:");
		l5.setFont(new Font("tahoma", Font.PLAIN, 20));
		l5.setBounds(40, 190, 150, 30);
		add(l5);
		
		t2 = new JTextField("");
		t2.setBounds(200,192,220,25);
		add(t2);
		
		JLabel l6 = new JLabel("AC/NON-AC:");
		l6.setFont(new Font("tahoma", Font.PLAIN, 20));
		l6.setBounds(40, 230, 150, 30);
		add(l6);
	
		    r1=new JRadioButton("AC");
	        r1.setBackground(Color.WHITE);
	        r1.setBounds(200,230,70,25);
	        add(r1);
	        
	        r2=new JRadioButton("NON-AC");
	        r2.setBounds(335,230,80,25);
	        r2.setBackground(Color.WHITE);
	        add(r2);
		
		JLabel l7 = new JLabel("Food include:");
		l7.setFont(new Font("tahoma", Font.PLAIN, 20));
		l7.setBounds(40, 270, 150, 30);
		add(l7);
	
		    r3=new JRadioButton("Yes");
	        r3.setBackground(Color.WHITE);
	        r3.setBounds(200,270,70,25);
	        add(r3);
	        
	        r4=new JRadioButton("No");
	        r4.setBounds(335,270,80,25);
	        r4.setBackground(Color.WHITE);
	        add(r4);
	        
	        JLabel l8 = new JLabel("ID:");
			l8.setFont(new Font("tahoma", Font.PLAIN, 20));
			l8.setBounds(40, 310, 150, 30);
			add(l8);
			
			ls2 = new JLabel("");
			ls2.setFont(new Font("tahoma", Font.PLAIN, 20));
			ls2.setBounds(200, 310, 200, 30);
			add(ls2);
			
			JLabel l9 = new JLabel("NUMBER:");
			l9.setFont(new Font("tahoma", Font.PLAIN, 20));
			l9.setBounds(40, 350, 150, 30);
			add(l9);
			
			ls3 = new JLabel("");
			ls3.setFont(new Font("tahoma", Font.PLAIN, 20));
			ls3.setBounds(200, 350, 200, 30);
			add(ls3);
			
			JLabel l10 = new JLabel("PHONE:");
			l10.setFont(new Font("tahoma", Font.PLAIN, 20));
			l10.setBounds(40, 390, 150, 30);
			add(l10);
			
			ls4 = new JLabel("");
			ls4.setFont(new Font("tahoma", Font.PLAIN, 20));
			ls4.setBounds(200, 390,200, 30);
			add(ls4);
			
			JLabel l11 = new JLabel("Total Price:");
			l11.setFont(new Font("tahoma", Font.PLAIN, 20));
			l11.setBounds(40, 430, 150, 30);
			add(l11);
			
			ls5 = new JLabel("");
			ls5.setFont(new Font("tahoma", Font.PLAIN, 20));
			ls5.setForeground(Color.red);
			ls5.setBounds(200, 430, 200, 30);
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
			b1.setBounds(40,480,140,30);
			b1.addActionListener(this);
			add(b1);
			
			b2 = new JButton("Back");
			b2.setBackground(Color.red);
			b2.setForeground(Color.black);
			b2.setBounds(320,5,90,30);
			b2.addActionListener(this);
			add(b2);
			
			b3 = new JButton("Book hotel");
			b3.setBackground(Color.black);
			b3.setForeground(Color.white);
			b3.setBounds(260,480,140,30);
			b3.addActionListener(this);
			add(b3);
		
	}
	public bookhotel() {
		// TODO Auto-generated constructor stub
	}
	private void While(boolean next) {
		// TODO Auto-generated method stub
		
	}
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()==b1) {

			try {
				conn c = new conn();
				ResultSet rs=c.s.executeQuery("select * from hotels where name = '"+c1.getSelectedItem()+"'");
				while(rs.next()) {
					int cost=Integer.parseInt(rs.getString("cost_per_day"));
					int food=Integer.parseInt(rs.getString("food_charges"));
					int ac=Integer.parseInt(rs.getString("ac_charges"));
					
					int persons=Integer.parseInt(t1.getText());
					int days=Integer.parseInt(t2.getText());
					
					String acprice = null;
					  if(r1.isSelected()) {
						  acprice = "AC";
					  }else if (r2.isSelected()) {
						  acprice ="NON-AC";
					  }
					  
					  String foodprice = null;
					  if(r3.isSelected()) {
						  foodprice = "Yes";
					  }else if (r4.isSelected()) {
						  foodprice ="No";
					  }
					  
					  if(persons * days >0) {
						  int total=0;
						  total += acprice.equals("AC") ? ac : 0;
						  total += foodprice.equals("Yes") ? food : 0;
						  total +=cost;
						  total= total * persons * days;
						  ls5.setText(""+total);
					  }else {
						  ls5.setText("Enter a valid number");
					  }
				}
			}catch(Exception e) {}	
		}else if(ae.getSource()==b3) {
		
				  String Username = ls1.getText();
				  String hotel = (String)c1.getSelectedItem();
				  String totalp = t1.getText();
				  String Numday = t2.getText();
				  String radio = null;
				  if(r1.isSelected()) {
					  radio = "AC";
				  }else if (r2.isSelected()) {
					  radio ="NON-AC";
				  }
				  String radio1 = null;
				  if(r3.isSelected()) {
					  radio1 = "Yes";
				  }else if (r4.isSelected()) {
					  radio1 ="No";
				  }
				  String id = ls2.getText();
				  String num = ls3.getText();
				 
				  String Phone = ls4.getText();
				  String cost = ls5.getText();
				  
				  
				  String q="insert into bookHotel values('"+Username+"','"+hotel+"','"+totalp+"','"+Numday+"','"+radio+"','"+radio1+"','"+id+"','"+num+"','"+Phone+"','"+cost+"')";
				  try {
					  conn c=new conn();
					  c.s.executeUpdate(q);
					  
					  JOptionPane.showMessageDialog(null,"Hotel booked added Successfully");
					  this.setVisible(false);
				  }catch (Exception e) {
				       e.printStackTrace();
				  }
		}
			
		else if(ae.getSource()==b2) {
			this.setVisible(false);
		}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new bookhotel("").setVisible(true);
		

	}

}
