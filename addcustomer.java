package travelmanagementsystem;
import java.awt.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
public class addcustomer extends JFrame implements ActionListener{
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JComboBox c1;
	JRadioButton r1,r2;
	JButton b1,b2;
	addcustomer(String Username){
		setBounds(250,100,850,550);
		getContentPane().setBackground(new Color(16,230,207));
		setLayout(null);
		//setUndecorated(true);
		
		JLabel l1 =new JLabel("Username:");
        l1.setBounds(30,50,200,25);
        l1.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l1);
        
        t1=new JTextField();
        t1.setBounds(200,50,200,25);
        add(t1);
        
        JLabel l2 =new JLabel("ID:");
        l2.setBounds(30,90,200,25);
        l2.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l2);
        
        c1 = new JComboBox (new String[]{"passport","Adhar card","pancard","Driving liecence"});
        c1.setBounds(200,90,200,25);
        c1.setBackground(Color.WHITE);
        add(c1);
        
        JLabel l3 =new JLabel("Number:");
        l3.setBounds(30,130,200,25);
        l3.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l3);
        
        t2=new JTextField();
        t2.setBounds(200,130,200,25);
        add(t2);
        
        JLabel l4 =new JLabel("Name:");
        l4.setBounds(30,170,200,25);
        l4.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l4);
        
        t3=new JTextField();
        t3.setBounds(200,170,200,25);
        add(t3);

        JLabel l5 =new JLabel("Gender:");
        l5.setBounds(30,210,200,25);
        l5.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l5);
        
        r1=new JRadioButton("Male");
        r1.setBackground(Color.WHITE);
        r1.setBounds(200,210,70,25);
        add(r1);
        
        r2=new JRadioButton("Female");
        r2.setBounds(320,210,70,25);
        r2.setBackground(Color.WHITE);
        add(r2);
        
        JLabel l6 =new JLabel("State:");
        l6.setBounds(30,250,200,25);
        l6.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l6);
        
        t4=new JTextField();
        t4.setBounds(200,250,200,25);
        add(t4);
        
        JLabel l7 =new JLabel("City:");
        l7.setBounds(30,290,200,25);
        l7.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l7);
        
        t5=new JTextField();
        t5.setBounds(200,290,200,25);
        add(t5);
        
        JLabel l8 =new JLabel("Address:");
        l8.setBounds(30,330,200,25);
        l8.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l8);
        
        t6=new JTextField();
        t6.setBounds(200,330,200,25);
        add(t6);
        
        JLabel l9 =new JLabel("Phone:");
        l9.setBounds(30,370,200,25);
        l9.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l9);
        
        t7=new JTextField();
        t7.setBounds(200,370,200,25);
        add(t7);
        
        JLabel l10 =new JLabel("Email:");
        l10.setBounds(30,410,200,25);
        l10.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        add(l10);
        
        t8=new JTextField();
        t8.setBounds(200,410,200,25);
        add(t8);
        
        JLabel l11 =new JLabel("Customer Details:-");
        l11.setBounds(30,0,400,25);
        l11.setFont( new Font("SAN_SERIF",Font.BOLD,23));
        add(l11);
        
        b1 =new JButton("Add");
        b1.setBounds(70,470,100,25);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBorder(new LineBorder( Color.red));
        b1.addActionListener(this);
        add(b1);
        
        b2 =new JButton("Back");
        b2.setBounds(260,470,100,25);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBorder(new LineBorder( Color.red));
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon sr=new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/OIP.jpg"));
        Image sr2 = sr.getImage().getScaledInstance(480,550,Image.SCALE_DEFAULT);
        ImageIcon sr3 = new ImageIcon(sr2);
        JLabel l12=new JLabel(sr3);
        l12.setBounds(410,0,450,550);
        l12.setBackground(Color.WHITE);
        add(l12);
        
        /*ImageIcon st=new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/Rrr.png"));
        Image st2 = st.getImage().getScaledInstance(420,450,Image.SCALE_DEFAULT);
        ImageIcon st3 = new ImageIcon(st2);
        JLabel l13=new JLabel(st3);
        l13.setBounds(0,0,450,450);
        add(l13);*/
        
        //System.out.println(Username);
        try {
        	conn c = new conn ();
        	ResultSet rs =c.s.executeQuery("select * from account where Username ='"+Username+"'");
        	while(rs.next()) {
        		t1.setText(rs.getString("Username"));
        		t3.setText(rs.getString("Name"));
        	}
        }catch(Exception e) {
        	
        }
	}
	   
	  public addcustomer() {
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed(ActionEvent ae){
		  if(ae.getSource()==b1) {
		  String Username = t1.getText();
		  String ID = (String)c1.getSelectedItem();
		  String Number = t2.getText();
		  String Name = t3.getText();
		  String radio = null;
		  if(r1.isSelected()) {
			  radio = "male";
		  }else if (r2.isSelected()) {
			  radio ="female";
		  }
		  String State = t4.getText();
		  String City = t5.getText();
		  String Address = t6.getText();
		  String Phone = t7.getText();
		  String Email = t8.getText();
		  
		  
		  String q="insert into customer values('"+Username+"','"+ID+"','"+Number+"','"+Name+"','"+radio+"','"+State+"','"+City+"','"+Address+"','"+Phone+"','"+Email+"')";
		  try {
			  conn c=new conn();
			  c.s.executeUpdate(q);
			  
			  JOptionPane.showMessageDialog(null,"Customer Details added Successfully");
			  this.setVisible(false);
		  }catch (Exception e) {
		       e.printStackTrace();
		  }
		  }else if(ae.getSource()==b2){
			  this.setVisible(false);
		  }
	  }

	public static void main(String[] args) {
		new addcustomer("").setVisible(true);

	}

}
