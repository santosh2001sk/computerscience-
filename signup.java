package travelmanagementsystem;




import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class signup extends JFrame implements ActionListener{
	
    JButton bz,tf;
    JTextField aa,ab,ac,ad;
    Choice c1;
	
	signup(){
		setBounds(200,100,900,370);
		getContentPane().setBackground(Color.white);
		((JComponent) getContentPane()).setBorder(new LineBorder( Color.blue,5));
		setLayout(null);
		
		JPanel ka=new JPanel();
        ka.setBackground(Color.cyan);
        ka.setBounds(10,7,500,320);
        ka.setBorder(new LineBorder( Color.red,5));
        ka.setLayout(null);
        add(ka);
        
        JLabel ta =new JLabel("Username:");
        ta.setBounds(60,40,150,25);
        ta.setFont( new Font("Tahoma",Font.BOLD,20));
        ta.setForeground(Color.black);
        ka.add(ta);
        
        aa =new JTextField();
        aa.setBounds(210,40,270,25);
        aa.setBorder(BorderFactory.createEmptyBorder());
        add(aa);
        
        JLabel tb =new JLabel("Name:");
        tb.setBounds(60,80,150,25);
        tb.setFont( new Font("Tahoma",Font.BOLD,20));
        tb.setForeground(Color.black);
        ka.add(tb);
        
        ab =new JTextField();
        ab.setBounds(210,80,270,25);
        ab.setBorder(BorderFactory.createEmptyBorder());
        add(ab);
        
        JLabel tc =new JLabel("Password");
        tc.setBounds(60,120,150,25);
        tc.setFont( new Font("Tahoma",Font.BOLD,20));
        tc.setForeground(Color.black);
        ka.add(tc);
        
        ac =new JTextField();
        ac.setBounds(210,120,270,25);
        ac.setBorder(BorderFactory.createEmptyBorder());
        add(ac);
        
        JLabel td =new JLabel("security question");
        td.setBounds(60,160,140,25);
        td.setFont( new Font("Tahoma",Font.BOLD,15));
        td.setForeground(Color.black);
        ka.add(td);
        
        c1=new Choice();
        c1.add("what is your age in 2022");
        c1.add("what is your nick name ");
        c1.add("your favorite person ");
        c1.add("who is your best friend");
        c1.setBounds(200,160,270,25);
        ka.add(c1);
        
        JLabel te =new JLabel("Answer");
        te.setBounds(60,200,150,25);
        te.setFont( new Font("Tahoma",Font.BOLD,20));
        te.setForeground(Color.black);
        ka.add(te);
        
        ad =new JTextField();
        ad.setBounds(210,200,270,25);
        ad.setBorder(BorderFactory.createEmptyBorder());
        add(ad);
	
        ImageIcon sb=new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/signup.png"));
        Image sr4 = sb.getImage().getScaledInstance(450,350,Image.SCALE_DEFAULT);
        ImageIcon sr5 = new ImageIcon(sr4);
        JLabel tg = new JLabel(sb);
        tg.setBackground(Color.green);
        tg.setBounds(480,0,450,350);
        add(tg);
        
        
        bz =new JButton("Create");
        bz.setBounds(60,250,100,30);
        bz.setBackground(Color.green);
        bz.setForeground(Color.black);
        bz.addActionListener(this);
        bz.setBorder(new LineBorder( Color.red));
        ka.add(bz);
        
        tf =new JButton("Back");
        tf.setBounds(250,250,100,30);
        tf.setBackground(Color.yellow);
        tf.setForeground(Color.black);
        tf.addActionListener(this);
        tf.setBorder(new LineBorder( Color.red));
        ka.add(tf);
        
        ImageIcon a1 =new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/Art.png"));
		Image a2 = a1.getImage().getScaledInstance(500,320,Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel ts =new JLabel(a3);
        ts.setBounds(0,0,500,320);
        ka.add(ts);
        
        
        }
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()==bz){
			String Username = aa.getText();
			String name = ab.getText();
			String password = ac.getText();
			String security = c1.getSelectedItem();
			String answer = ad.getText();
            
			String query = "insert into account values('"+Username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
			try {
				conn c=new conn();
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Account Created successfully");
				
				this.setVisible(false);
				new loginpage().setVisible(true);
			}catch(Exception e) {
				
			}
	       }else if (ae.getSource()==tf){
	    	   new loginpage().setVisible(true);
	    	   this.setVisible(false);
	       }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new signup().setVisible(true);
	}

	

}
