package travelmanagementsystem;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class dashboard extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
	String Username;
	
	dashboard(String Username){
		this.Username=Username;
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		 JPanel kk=new JPanel();
	     kk.setBackground(new Color(0,0,102));
	     kk.setBounds(0,0,1600,50);
	     kk.setLayout(null);
	     add(kk);
	     
	     JPanel kl=new JPanel();
	     kl.setBackground(new Color(0,0,102));
	     kl.setBounds(0,50,250,1000);
	     kl.setLayout(null);
	     add(kl);
		
	        b1 =new JButton("Add personal details");
	        b1.setBounds(0,0,250,40);
	        b1.setBackground(new Color(0,0,102));
	        b1.setFont( new Font("tahoma",Font.PLAIN,20));
	        //b1.setBorder(new LineBorder( Color.white,2));
	        b1.setForeground(Color.white);
	        b1.setMargin(new Insets(0,0,0,40));
	        b1.addActionListener(this);
	       // b1.setBorder(BorderFactory.createEmptyBorder());
	        kl.add(b1);
	        
	        b2 =new JButton("Update presonal details");
	        b2.setBounds(0,40,250,40);
	        b2.setBackground(new Color(0,0,102));
	        b2.setFont( new Font("tahoma",Font.PLAIN,20));
	        b2.setMargin(new Insets(0,0,0,10));
	        b2.addActionListener(this);
	        b2.setForeground(Color.white);
	        kl.add(b2);
	        
	        b3 =new JButton("View personal details");
	        b3.setBounds(0,80,250,40);
	        b3.setBackground(new Color(0,0,102));
	        b3.setFont( new Font("tahoma",Font.PLAIN,20));
	        b3.setForeground(Color.white);
	        b3.setMargin(new Insets(0,0,0,30));
	        b3.addActionListener(this);
	        kl.add(b3);
	        
	        b4 =new JButton("Delete personal details");
	        b4.setBounds(0,120,250,40);
	        b4.setBackground(new Color(0,0,102));
	        b4.setFont( new Font("tahoma",Font.PLAIN,20));
	        b4.setForeground(Color.white);
	        b4.setMargin(new Insets(0,0,0,10));
	        b4.addActionListener(this);
	        kl.add(b4);
	        
	        b5 =new JButton("Check Package");
	        b5.setBounds(0,160,250,40);
	        b5.setBackground(new Color(0,0,102));
	        b5.setFont( new Font("tahoma",Font.PLAIN,20));
	        b5.setMargin(new Insets(0,0,0,80));
	        b5.setForeground(Color.white);
	        b5.addActionListener(this);
	        kl.add(b5);
	        
	        b6 =new JButton("Book Package");
	        b6.setBounds(0,200,250,40);
	        b6.setBackground(new Color(0,0,102));
	        b6.setFont( new Font("tahoma",Font.PLAIN,20));
	        b6.setForeground(Color.white);
	        b6.setMargin(new Insets(0,0,0,85));
	        b6.addActionListener(this);
	        kl.add(b6);
	        
	        b7 =new JButton("viewpackage");
	        b7.setBounds(0,240,250,40);
	        b7.setBackground(new Color(0,0,102));
	        b7.setFont( new Font("tahoma",Font.PLAIN,20));
	        b7.setForeground(Color.white);
	        b7.setMargin(new Insets(0,0,0,85));
	        b7.addActionListener(this);
	        kl.add(b7);
	        
	        b8 =new JButton("View Hotels");
	        b8.setBounds(0,280,250,40);
	        b8.setBackground(new Color(0,0,102));
	        b8.setFont( new Font("tahoma",Font.PLAIN,20));
	        b8.setForeground(Color.white);
	        b8.setMargin(new Insets(0,0,0,100));
	        b8.addActionListener(this);
	        kl.add(b8);
	        
	        b9 =new JButton("Book Hotel");
	        b9.setBounds(0,320,250,40);
	        b9.setBackground(new Color(0,0,102));
	        b9.setFont( new Font("tahoma",Font.PLAIN,20));
	        b9.setForeground(Color.white);
	        b9.setMargin(new Insets(0,0,0,105));
	        b9.addActionListener(this);
	        kl.add(b9);
	        
	        b10 =new JButton("View My Hotel");
	        b10.setBounds(0,360,250,40);
	        b10.setBackground(new Color(0,0,102));
	        b10.setFont( new Font("tahoma",Font.PLAIN,20));
	        b10.setForeground(Color.white);
	        b10.setMargin(new Insets(0,0,0,75));
	        b10.addActionListener(this);
	        kl.add(b10);
	        
	        b11 =new JButton("Destination");
	        b11.setBounds(0,400,250,40);
	        b11.setBackground(new Color(0,0,102));
	        b11.setFont( new Font("tahoma",Font.PLAIN,20));
	        b11.setForeground(Color.white);
	        b11.setMargin(new Insets(0,0,0,95));
	        b11.addActionListener(this);
	        kl.add(b11);
	        
	        b12 =new JButton("Payment");
	        b12.setBounds(0,440,250,40);
	        b12.setBackground(new Color(0,0,102));
	        b12.setFont( new Font("tahoma",Font.PLAIN,20));
	        b12.setForeground(Color.white);
	        b12.setMargin(new Insets(0,0,0,115));
	        b12.addActionListener(this);
	        kl.add(b12);
	        
	        b13 =new JButton("Calculator");
	        b13.setBounds(0,480,250,40);
	        b13.setBackground(new Color(0,0,102));
	        b13.setFont( new Font("tahoma",Font.PLAIN,20));
	        b13.setForeground(Color.white);
	        b13.setMargin(new Insets(0,0,0,105));
	        b13.addActionListener(this);
	        kl.add(b13);
	        
	        b14 =new JButton("Notepad");
	        b14.setBounds(0,520,250,40);
	        b14.setBackground(new Color(0,0,102));
	        b14.setFont( new Font("tahoma",Font.PLAIN,20));
	        b14.setForeground(Color.white);
	        b14.setMargin(new Insets(0,0,0,115));
	        b14.addActionListener(this);
	        kl.add(b14);
	        
	        b15 =new JButton("About");
	        b15.setBounds(0,560,250,40);
	        b15.setBackground(new Color(0,0,102));
	        b15.setFont( new Font("tahoma",Font.PLAIN,20));
	        b15.setForeground(Color.white);
	        b15.setMargin(new Insets(0,0,0,130));
	        b15.addActionListener(this);
	        kl.add(b15);
	     
		ImageIcon a1 =new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/home.jpg"));
		Image a2 = a1.getImage().getScaledInstance(1600,1000,Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel ta =new JLabel(a3);
        ta.setBounds(0,0,1600,1000);
        add(ta);
        
        JLabel tm =new JLabel("Dashboard");
        tm.setBounds(70,10,300,40);
        tm.setFont( new Font("tahoma",Font.BOLD,25));
        tm.setForeground(Color.white);
        kk.add(tm);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/dashboard.png"));
		Image i2 = i1.getImage().getScaledInstance(80,50,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel tb =new JLabel(i3);
        tb.setBounds(0,0,80,50);
        kk.add(tb);
        
        JLabel ss =new JLabel("WELCOME TO TOUR(360)");
        ss.setBounds(500,100,700,40);
        ss.setFont( new Font("SAN_SERIF",Font.PLAIN,40));
        ss.setForeground(Color.white);
        ta.add(ss);
              
	}
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()==b13) {
			try {
				Runtime.getRuntime().exec("calc.exe");
			}catch(Exception e) {
				
			}
		}else if(ae.getSource()==b14) {
			try {
				Runtime.getRuntime().exec("notepad.exe");
			}catch(Exception e) {}
				
		}else if(ae.getSource()==b1) {
				new addcustomer(Username).setVisible(true);
			}else if(ae.getSource()==b2) {
				new updatecustomer(Username).setVisible(true);
			}else if(ae.getSource()==b3) {
				new viewdetails(Username).setVisible(true);
			}else if(ae.getSource()==b5) {
				new checkpackage().setVisible(true);
			}else if(ae.getSource()==b6) {
				new bookpackage(Username).setVisible(true);
			}else if(ae.getSource()==b7) {
				new viewpackage(Username).setVisible(true);
			}else if(ae.getSource()==b8) {
				new viewhotels().setVisible(true);
			}else if(ae.getSource()==b9) {
				new bookhotel(Username).setVisible(true);
			}else if(ae.getSource()==b10) {
				new viewbookedhotel(Username).setVisible(true);	
			}else if(ae.getSource()==b11) {
				new destination().setVisible(true);
			}else if(ae.getSource()==b12) {
				new payment().setVisible(true);
			}else if(ae.getSource()==b15) {
				new About().setVisible(true);
			}else if(ae.getSource()==b4) {
				new deletecustomer(Username).setVisible(true);
			}
				
			
		
		
		}
	

	public static void main(String[] args) {
		new dashboard("").setVisible(true);

	}

}
