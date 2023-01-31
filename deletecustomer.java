package travelmanagementsystem;


	import java.awt.*;

import javax.swing.border.EmptyBorder;

import java.sql.*;	
	import javax.swing.*;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

		public class deletecustomer extends JFrame implements ActionListener{
			
			JLabel t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
			JComboBox c1;
			JRadioButton r1,r2;
			JButton b1,b3;
			String Username;
			deletecustomer(String User){
				this.Username = User;
				setBounds(250,100,850,550);
				getContentPane().setBackground(new Color(16,230,207));
				setLayout(null);
	                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/delete.png"));
	                Image i3 = i1.getImage().getScaledInstance(480, 550,Image.SCALE_DEFAULT);
	                ImageIcon i2 = new ImageIcon(i3);
	                JLabel a1 = new JLabel(i2);
	                a1.setBounds(410,0,480,550);
	                add(a1);
			
	                JLabel l11 =new JLabel("Delete Customer Details:-");
	                l11.setBounds(30,0,400,25);
	                l11.setFont( new Font("SAN_SERIF",Font.BOLD,23));
	                add(l11);
	                JLabel l1 =new JLabel("Username:");
	                l1.setBounds(30,50,200,25);
	                l1.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
	                add(l1);
	                
	                t1 =new JLabel();
	                t1.setBounds(200,50,200,25);
	                
	                add(t1);
	                
	                JLabel l2 =new JLabel("ID:");
	                l2.setBounds(30,90,200,25);
	                l2.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
	                add(l2);
	                
	                t2 =new JLabel();
	                t2.setBounds(200,90,200,25);
	                
	                add(t2);
	                JLabel l3 =new JLabel("Number:");
	                l3.setBounds(30,130,200,25);
	                l3.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
	                add(l3);
	                
	                t3=new JLabel();
	                t3.setBounds(200,130,200,25);
	                add(t3);
	                
	                JLabel l4 =new JLabel("Name:");
	                l4.setBounds(30,170,200,25);
	                l4.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
	                add(l4);
	                
	                t4=new JLabel();
	                t4.setBounds(200,170,200,25);
	                add(t4);

	                JLabel l5 =new JLabel("Gender:");
	                l5.setBounds(30,210,200,25);
	                l5.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
	                add(l5);
	                
	                t5 =new JLabel();
	                t5.setBounds(200,210,200,25);
	                t5.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
	                add(t5);
	                
	               
	                
	                JLabel l6 =new JLabel("State:");
	                l6.setBounds(30,250,200,25);
	                l6.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
	                add(l6);
	                
	                t6=new JLabel();
	                t6.setBounds(200,250,200,25);
	                add(t6);
	                
	                JLabel l7 =new JLabel("City:");
	                l7.setBounds(30,290,200,25);
	                l7.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
	                add(l7);
	                
	                t7=new JLabel();
	                t7.setBounds(200,290,200,25);
	                add(t7);
	                
	                JLabel l8 =new JLabel("Address:");
	                l8.setBounds(30,330,200,25);
	                l8.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
	                add(l8);
	                
	                t8=new JLabel();
	                t8.setBounds(200,330,200,25);
	                add(t8);
	                
	                JLabel l9 =new JLabel("Phone:");
	                l9.setBounds(30,370,200,25);
	                l9.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
	                add(l9);
	                
	                t9=new JLabel();
	                t9.setBounds(200,370,200,25);
	                add(t9);
	                
	                JLabel l10 =new JLabel("Email:");
	                l10.setBounds(30,410,200,25);
	                l10.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
	                add(l10);
	                
	                t10=new JLabel();
	                t10.setBounds(200,410,200,25);
	                add(t10);
	                

	        		b1 = new JButton("DELETE");
	        		b1.setBackground(Color.black);
	        		b1.setForeground(Color.white);
	        		b1.setBounds(40,460,140,30);
	        		b1.addActionListener(this);
	        		add(b1);
	        		
	        		
	        		
	        		b3 = new JButton("BACK");
	        		b3.setBackground(Color.black);
	        		b3.setForeground(Color.white);
	        		b3.setBounds(260,460,140,30);
	        		b3.addActionListener(this);
	        		add(b3); 
	                 
	        		
	        		try {
	                	conn c = new conn ();
	                	ResultSet rs =c.s.executeQuery("select * from customer where Username ='"+Username+"'");
	                	while(rs.next()) {
	                		t1.setText(rs.getString("Username"));
	                		t2.setText(rs.getString("ID"));
	                		t3.setText(rs.getString("Number"));
	                		t4.setText(rs.getString("Name"));
	                		t5.setText(rs.getString("Gender"));
	                		t6.setText(rs.getString("State"));
	                		t7.setText(rs.getString("City"));
	                		t8.setText(rs.getString("Address"));
	                		t9.setText(rs.getString("Phone"));
	                		t10.setText(rs.getString("Email"));
	                	}
	                }catch(Exception e) {
	                	e.printStackTrace();
	                }
			}          
	                public void actionPerformed(ActionEvent ae) {
	            		if (ae.getSource()==b1) {
	            			try {
	            				conn c = new conn();
	            				c.s.executeUpdate("delete from account where Username='"+Username+"'");
	            				c.s.executeUpdate("delete from customer where Username='"+Username+"'");
	            				c.s.executeUpdate("delete from bookpackage where Username='"+Username+"'");
	            				c.s.executeUpdate("delete from bookhotel where Username='"+Username+"'");   
	            				
	            				  JOptionPane.showMessageDialog(null,"Customer Details Delete Successfully");
	            				  System.exit(0);
	            			}catch(Exception e) {}
	            		}else if(ae.getSource()==b3) {
	            			this.setVisible(false);
	            		}
	            		}
	            		
	        	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new deletecustomer("").setVisible(true);


	}

}
