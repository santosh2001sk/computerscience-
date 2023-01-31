package travelmanagementsystem;





import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class loginpage extends JFrame implements ActionListener{
    JButton bx,by,bz;
    JTextField ba;
    JPasswordField bn;
    

    loginpage(){
        //setSize(1200,800);
        //setLocation(400,200);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        ((JComponent) getContentPane()).setBorder(new LineBorder( Color.blue,5));
        setBounds(200,100,900,390);//use for both location and size
        
        JPanel kk=new JPanel();
        kk.setBackground(new Color(15,245,196));
        kk.setBounds(10,10,400,330);
        kk.setBorder(new LineBorder( Color.blue,5));
        kk.setLayout(null);
        add(kk);
        
        ImageIcon sr=new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/Odp.png"));
        Image sr2 = sr.getImage().getScaledInstance(350,350,Image.SCALE_DEFAULT);
        ImageIcon sr3 = new ImageIcon(sr2);
        JLabel ts=new JLabel(sr3);
        ts.setBounds(10,5,400,330);
        kk.add(ts);
        
        JPanel kk1=new JPanel();
        kk1.setLayout(null);
        kk1.setBounds(420,10,450,330);
        kk1.setBackground(Color.cyan);
        kk1.setBorder(new LineBorder( Color.red,5));
        add(kk1);
        
        JLabel tm =new JLabel("Username:");
        tm.setBounds(60,40,150,30);
        tm.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        tm.setForeground(Color.white);
        kk1.add(tm);
        
        ba =new JTextField();
        ba.setBounds(60,80,270,30);
        ba.setBorder(BorderFactory.createEmptyBorder());
        kk1.add(ba);
        
        JLabel tn =new JLabel("password");
        tn.setBounds(60,120,150,30);
        tn.setFont( new Font("SAN_SERIF",Font.PLAIN,23));
        tn.setForeground(Color.white);
        kk1.add(tn);
        
        bn =new JPasswordField();
        bn.setBounds(60,160,270,30);
        bn.setBorder(BorderFactory.createEmptyBorder());
        kk1.add(bn);
        
        by =new JButton("Login");
        by.setBounds(60,220,110,30);
        by.setBackground(Color.green);
        by.setBorder(BorderFactory.createEmptyBorder());
        by.addActionListener(this);
        kk1.add(by);
        
        bx =new JButton("Signup");
        bx.setBounds(220,220,110,30);
        bx.setBackground(Color.yellow);
        bx.setBorder(BorderFactory.createEmptyBorder());
        bx.addActionListener(this);
        kk1.add(bx);
        
        bz =new JButton("Forgot Password?");
        bz.setBounds(60,260,190,30);
        bz.setBackground(Color.white);
        bz.setForeground(Color.red);
        bz.setBorder(new LineBorder( Color.red));
        bz.addActionListener(this);
        kk1.add(bz);
        
        JLabel ca =new JLabel("Trouble in Login");
        ca.setBounds(260,260,200,30);
        ca.setFont( new Font("SAN_SERIF",Font.PLAIN,10));
        ca.setForeground(Color.white);
        kk1.add(ca);
        
        ImageIcon tt=new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/Konark.jpg"));
    	Image t1 = tt.getImage().getScaledInstance(450,430,Image.SCALE_DEFAULT);
    	ImageIcon t2=new ImageIcon(t1);
    	JLabel skt =new JLabel(t2);
    	skt.setBounds(0,0,450,430);
    	kk1.add(skt);
        
        //setUndecorated(true);
        
        setVisible(true);
        
        /*JLabel mo =new JLabel("Login here>>>>>>");
        mo.setBounds(100,15,400,30);
        mo.setFont( new Font("Georgia",Font.PLAIN,30));
        mo.setForeground(Color.red);
        kk.add(mo);*/
        
       
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
       if (ae.getSource()==by){
    	   
       try {
    		 String Username = ba.getText(); 
    		 String password = bn.getText();
    		 String sql = "select * from account where Username = '"+Username+"' AND password = '"+password+"'";
    		 conn c=new conn();
    		 ResultSet rs= c.s.executeQuery(sql);
    		 if(rs.next()) {
    			 this.setVisible(false);
    			 new loading(Username).setVisible(true);
    		 }else {
    			 JOptionPane.showMessageDialog(null, "Invalid username and password");
    		 }
    	    }catch(Exception e) {}
            
       }else if (ae.getSource()==bx){
    	   new signup().setVisible(true);
    	   this.setVisible(false);
            
       }else if (ae.getSource()==bz){
    	   new forgotpassword().setVisible(true);
    	   this.setVisible(false);
            
       }
                
        
    }
    
    public static void main(String[] args){
        new loginpage();
    }
}
