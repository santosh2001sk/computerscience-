package travelmanagementsystem;
import java.awt.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
public class viewdetails extends JFrame implements ActionListener{
	
	JButton b1;
	viewdetails(String Username){
		setBounds(250,30,900,610);
		getContentPane().setBackground(new Color(16,230,207));
		setLayout(null);
		//setUndecorated(true);
		
		JLabel l1 =new JLabel("Username:");
        l1.setBounds(30,50,200,25);
        l1.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l1);
        
        JLabel m1 =new JLabel();
        m1.setBounds(160,50,200,25);
        m1.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(m1);
        
        JLabel l2 =new JLabel("ID:");
        l2.setBounds(30,110,200,25);
        l2.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l2);
        
        JLabel m2 =new JLabel();
        m2.setBounds(160,110,200,25);
        m2.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(m2);
        
        JLabel l3 =new JLabel("Number:");
        l3.setBounds(30,170,200,25);
        l3.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l3);
        
        JLabel m3 =new JLabel();
        m3.setBounds(160,170,200,25);
        m3.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(m3);
        
        JLabel l4 =new JLabel("Name:");
        l4.setBounds(30,230,200,25);
        l4.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l4);
        
        JLabel m4 =new JLabel();
        m4.setBounds(160,230,200,25);
        m4.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(m4);

        JLabel l5 =new JLabel("Gender:");
        l5.setBounds(30,290,200,25);
        l5.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l5);
        
        JLabel m5 =new JLabel();
        m5.setBounds(160,290,200,25);
        m5.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(m5);
        
        JLabel l6 =new JLabel("State:");
        l6.setBounds(460,50,200,25);
        l6.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l6);
        
        JLabel m6 =new JLabel();
        m6.setBounds(590,50,200,25);
        m6.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(m6);
        
        JLabel l7 =new JLabel("City:");
        l7.setBounds(460,110,200,25);
        l7.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l7);
        
        JLabel m7 =new JLabel();
        m7.setBounds(590,110,200,25);
        m7.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(m7);
        
        JLabel l8 =new JLabel("Address:");
        l8.setBounds(460,170,200,25);
        l8.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l8);
        
        JLabel m8 =new JLabel();
        m8.setBounds(590,170,200,25);
        m8.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(m8);
        
        JLabel l9 =new JLabel("Phone:");
        l9.setBounds(460,230,200,25);
        l9.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l9);
        
        JLabel m9 =new JLabel();
        m9.setBounds(590,230,200,25);
        m9.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(m9);
        
        JLabel l10 =new JLabel("Email:");
        l10.setBounds(460,290,200,25);
        l10.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l10);
        
        JLabel m10 =new JLabel();
        m10.setBounds(590,290,200,25);
        m10.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(m10);
        
        JLabel l11 =new JLabel("ViewCustomer Details:-");
        l11.setBounds(30,0,500,25);
        l11.setFont( new Font("SAN_SERIF",Font.BOLD,23));
        add(l11);
        
        b1 =new JButton("Back");
        b1.setBounds(780,350,100,35);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBorder(new LineBorder( Color.red));
        b1.addActionListener(this);
        add(b1);
        
        
        
        ImageIcon sr=new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/viewall.jpg"));
        Image sr2 = sr.getImage().getScaledInstance(600,230,Image.SCALE_DEFAULT);
        ImageIcon sr3 = new ImageIcon(sr2);
        JLabel l12=new JLabel(sr3);
        l12.setBounds(0,350,590,230);
        l12.setBackground(Color.WHITE);
        add(l12);
        
        ImageIcon sk=new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/viewall.jpg"));
        Image sk2 = sk.getImage().getScaledInstance(600,230,Image.SCALE_DEFAULT);
        ImageIcon sk3 = new ImageIcon(sr2);
        JLabel l13=new JLabel(sk3);
        l13.setBounds(570,350,590,230);
        l13.setBackground(Color.WHITE);
        add(l13);
        //System.out.println(Username);
        
        try {
        	conn c = new conn ();
        	ResultSet rs =c.s.executeQuery("select * from customer where Username ='"+Username+"'");
        	while(rs.next()) {
        		m1.setText(rs.getString("Username"));
        		m2.setText(rs.getString("ID"));
        		m3.setText(rs.getString("Number"));
        		m4.setText(rs.getString("Name"));
        		m5.setText(rs.getString("Gender"));
        		m6.setText(rs.getString("State"));
        		m7.setText(rs.getString("City"));
        		m8.setText(rs.getString("Address"));
        		m9.setText(rs.getString("Phone"));
        		m10.setText(rs.getString("Email"));
        	}
        }catch(Exception e) {
        	e.printStackTrace();
        }
	}
	   
	 public viewdetails() {
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed(ActionEvent ae){
		  if(ae.getSource()==b1){
			  this.setVisible(false);
		  }
	  }

	public static void main(String[] args) {
		new viewdetails("").setVisible(true);

	}

}

