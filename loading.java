package travelmanagementsystem;


import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class loading extends JFrame implements Runnable{
	JProgressBar p;
	Thread t;
	String Username;
	public void run() {
		try {
			for(int i = 1;i <= 101; i++){
			int m=p.getMaximum();
			int n=p.getValue();
			if(n<m){
				p.setValue(p.getValue()+1);
			}
			else {
				i= 101;
				setVisible(false);
				new dashboard(Username).setVisible(true);
			}
			Thread.sleep(50);
			}
		}catch(Exception e) {}
	}
	
	loading( String user){
		
		Username =user;
		t= new Thread(this);
		
		setBounds(500,210,350,250);
		getContentPane().setBackground(Color.black);
		((JComponent) getContentPane()).setBorder(new LineBorder( Color. blue ,5));
		setLayout(null);
		
		
		JLabel sa = new JLabel(("T0UR(360)"));
		sa.setBounds(37,12,280,50);
		sa.setFont( new Font("monospaced",Font.BOLD,50));
		sa.setBorder(new LineBorder( Color.black,3));
	    sa.setForeground(Color.black);
	    sa.setBackground(Color.black);
		add(sa);
		
		p=new JProgressBar();
		p.setStringPainted(true);
		p.setBounds(40,150,280,22);
		p.setForeground(new Color(108,238,6));
		add(p);
		
		JLabel sb = new JLabel(("Please wait..."));
		sb.setBounds(120,180,200,20);
		sb.setFont( new Font("Georgia",Font.BOLD,15));
	    sb.setForeground(Color.red);
		add(sb);
		
		JLabel sc = new JLabel("WelCome." + Username );
		sc.setBounds(40,90,250,30);
		sc.setFont( new Font("italic",Font.BOLD,25));
	    sc.setForeground(Color.black);
		add(sc);
		
		JLabel sd = new JLabel("Tour(360) version 0.01,s.k.rabada");
		sd.setBounds(180,220,260,20);
		sd.setFont( new Font("Tahoma",Font.PLAIN,10));
	    sd.setForeground(Color.black);
		add(sd);
		
		ImageIcon a1 =new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/R.jpg"));
		Image a2 = a1.getImage().getScaledInstance(350,250,Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel ta =new JLabel(a3);
        ta.setBounds(0,0,350,250);
        add(ta);
		
		setUndecorated(true);
		
		t.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new loading("").setVisible(true);

	}

}
