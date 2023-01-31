package travelmanagementsystem;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class payment extends JFrame implements ActionListener {
JButton b1,b2;
	payment (){
		setBounds(250,100,800,550);
		setLayout(null);
		getContentPane().setBackground(new Color(16,230,207));
		
        
        ImageIcon s1  = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/paytm.jpeg"));
	    Image s3 = s1.getImage().getScaledInstance(800, 520,Image.SCALE_DEFAULT);
	    ImageIcon s2 = new ImageIcon(s3);
	    JLabel k1 = new JLabel(s2);
	    k1.setBounds(0,0,800,520);
	    add(k1);
	    
	    b1 = new JButton("Pay");
		//b1.setBackground(Color.black);
		//b1.setForeground(Color.white);
		b1.setBounds(580,30,80,40);
		b1.addActionListener(this);
		k1.add(b1);
		
		b2 = new JButton("Back");
		//b2.setBackground(Color.red);
		//b2.setForeground(Color.black);
		b2.setBounds(680,30,80,40);
		b2.addActionListener(this);
		k1.add(b2);
		
	}
		public void actionPerformed(ActionEvent ae) {
			if (ae.getSource()==b1) {
				this.setVisible(false);
				new paytm().setVisible(true);
			}else if(ae.getSource()==b2){
				this.setVisible(false);
				
			
		}
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new payment().setVisible(true);

	}

}
