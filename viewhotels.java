package travelmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class viewhotels extends JFrame implements Runnable{
	Thread t1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JLabel[] label= new JLabel[] { l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15};
	JLabel caption;
	 public void run() {
		 String[] package1 = new String[]{"The skylight dubai","The Sea king dubai","The burj-al-arab Abudhabi","The Oberoi Amarvilas westbengal","Umaid Bhawan Palace jammu and khashmir","The Leela Palace New Delhi","The Mayfair Bhubaneswar","The Oberoi palace dhanushkoti","The Oberoi Udaivilas Uttarakhand","The Oberoi Vanyavilas mumbai"," RanthamboreTaj Rambagh Palace Chennai","The Worldone Goa","The Taj hotel Mumbai","The oberoi palace Jaipur","The MiaJaan Hyderabad"};
		 try {
		 for(int a=0;a<=14;a++) {
			 this.label[a].setVisible(true);
			 caption.setText(package1[a]);
			 this.label[a].add(caption);
			 Thread.sleep(2800);
			 this.label[a].setVisible(false);
		 }
		 }catch(Exception e) {}
	 }
	 
	viewhotels(){
		setBounds(250,100,900,550);
		setLayout(null);
		getContentPane().setBackground(new Color(16,230,207));
		
		
		
		ImageIcon a1=null,a2 =null,a3=null,a4=null,a5=null,a6=null,a7=null,a8=null,a9=null,a10=null,a11=null,a12=null,a13=null,a14=null,a15=null;
		ImageIcon[] image= new ImageIcon[] {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15};
		Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null,j11=null,j12=null,j13=null,j14=null,j15=null;
		Image[] jimage = new Image[] {j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14,j15};
		//ImageIcon a11=null,a12 =null,a13=null,a14=null,a15=null,a16=null,a17=null,a18=null,a19=null,a20=null;
		//ImageIcon[] image1= new ImageIcon[] {a11,a12,a13,a14,a15,a16,a17,a18,a19,a20};
		
		caption = new JLabel();
		caption.setBounds(20,400,900,100);
		caption.setFont( new Font("Tahoma",Font.BOLD,40));
        caption.setForeground(Color.white);
        add(caption);

		
		for(int a=0;a<=14;a++) {
		  image[a] = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/hotel"+(a+1)+".jpg"));
          jimage [a] = image[a].getImage().getScaledInstance(900, 550,Image.SCALE_DEFAULT);
          image [a] = new ImageIcon(jimage [a]);
          this.label[a]= new JLabel(image[a]);
          this.label[a].setBounds(0,0,900,550);
          add( this.label[a]);
		}
		
		t1= new Thread(this);
		t1.start();
		
		
		JLabel l1 = new JLabel("THANK YOU");
		l1.setFont(new Font("Yu Mincho", Font.BOLD, 110));
		l1.setBounds(140, 300, 900, 120);
		add(l1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new viewhotels().setVisible(true);


	}

}
