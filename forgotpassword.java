package travelmanagementsystem;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
public class forgotpassword extends JFrame implements ActionListener{
JTextField aa,ab,ac,ad,ae;
JButton bx,by,bz;
	forgotpassword(){
		setBounds(200,100,900,390);
		getContentPane().setBackground(Color.white);
		((JComponent) getContentPane()).setBorder(new LineBorder( Color.blue,5));
		setLayout(null);
		
		ImageIcon sb=new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/forgotpassword.jpg"));
        Image sr4 = sb.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon sr5 = new ImageIcon(sr4);
        JLabel tg = new JLabel(sb);
        tg.setBackground(Color.green);
        tg.setBounds(540,20,300,300);
        add(tg);
		
		JPanel ka=new JPanel();
        ka.setBackground(Color.cyan);
        ka.setBounds(5,5,510,340);
        ka.setBorder(new LineBorder( Color.green,5));
        ka.setBorder(new LineBorder( Color.red,5));
        ka.setLayout(null);
        add(ka);
		
        JLabel ta =new JLabel("Username:");
        ta.setBounds(20,40,150,25);
        ta.setFont( new Font("Tahoma",Font.BOLD,17));
        ta.setForeground(Color.black);
        ka.add(ta);
        
        aa =new JTextField();
        aa.setBounds(170,50,230,25);
        aa.setBorder(BorderFactory.createEmptyBorder());
        add(aa);
        
        JLabel tb =new JLabel("Name:");
        tb.setBounds(20,80,150,25);
        tb.setFont( new Font("Tahoma",Font.BOLD,17));
        tb.setForeground(Color.black);
        ka.add(tb);
        
        ab =new JTextField();
        ab.setBounds(170,90,230,25);
        ab.setBorder(BorderFactory.createEmptyBorder());
        add(ab);
        
        JLabel tc =new JLabel("security question");
        tc.setBounds(20,120,150,25);
        tc.setFont( new Font("Tahoma",Font.BOLD,15));
        tc.setForeground(Color.black);
        ka.add(tc);
        
        ac =new JTextField();
        ac.setBounds(170,130,335,25);
        ac.setBorder(BorderFactory.createEmptyBorder());
        add(ac);
        
        JLabel te =new JLabel("Answer");
        te.setBounds(20,160,150,25);
        te.setFont( new Font("Tahoma",Font.BOLD,17));
        te.setForeground(Color.black);
        ka.add(te);
        
        ad =new JTextField();
        ad.setBounds(170,170,230,25);
        ad.setBorder(BorderFactory.createEmptyBorder());
        add(ad);
        
        JLabel tf =new JLabel("password");
        tf.setBounds(20,200,150,25);
        tf.setFont( new Font("Tahoma",Font.BOLD,17));
        tf.setForeground(Color.black);
        ka.add(tf);
        
        ae =new JTextField();
        ae.setBounds(170,210,230,25);
        ae.setBorder(BorderFactory.createEmptyBorder());
        add(ae);
        
        bx =new JButton("Search");
        bx.setBounds(410,40,90,25);
        bx.setForeground(Color.black);
        //bx.setBackground(Color.GRAY);
        bx.addActionListener(this);
        bx.setBorder(new LineBorder( Color.red));
        ka.add(bx);
        
        by =new JButton("Retrieve");
        by.setBounds(410,160,90,25);
        by.setForeground(Color.black);
        //by.setBackground(Color.GRAY);
        by.addActionListener(this);
        by.setBorder(new LineBorder( Color.red));
        ka.add(by);
        
        bz=new JButton("Back");
        bz.setBounds(310,260,70,25);
        bz.setForeground(Color.black);
        bz.setBackground(Color.yellow);
        bz.addActionListener(this);
        bz.setBorder(new LineBorder( Color.green));
        ka.add(bz);
        
        ImageIcon a1 =new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/tahasu.jpg"));
		Image a2 = a1.getImage().getScaledInstance(510,340,Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel ts =new JLabel(a3);
        ts.setBounds(0,0,510,340);
        ka.add(ts);
	}
	
	public void actionPerformed(ActionEvent ag) {
		
		conn c=new conn();
		
		 if (ag.getSource()==bx){
			 try {
			 String sql = "select * from account where Username = '"+aa.getText()+"'";
			 ResultSet rs = c.s.executeQuery(sql);
			 while(rs.next()) {
				 ab.setText(rs.getString("name"));
				 ac.setText(rs.getString("security"));
			 }
			 }catch(Exception e) {
				 
			 }
			 
	       }else if (ag.getSource()==by){
	    	   try {
	  			 String sql = "select * from account where answer = '"+ad.getText()+"' AND Username = '"+aa.getText()+"'";
	  			 ResultSet rs = c.s.executeQuery(sql);
	  			 while(rs.next()) {
	  				 ae.setText(rs.getString("password"));
	  			 }
	  			 
	  			 }catch(Exception e) {
	  				 
	  			 }
	    	   
	            
	       }else if (ag.getSource()==bz){
	    	   this.setVisible(false);
	    	   new loginpage().setVisible(true);
	    	   
	       }
	          
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new forgotpassword().setVisible(true);

	}

}
