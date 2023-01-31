package travelmanagementsystem;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;



public class travel {

	
public static void main(String[] args) {
	SplashFrame Frame = new SplashFrame();
	 Frame.setVisible(true);
	int x = 1;
	for(int i=1;i<=700;i+=5,x+=7) {
	
	      Frame.setLocation(0,0);
		  Frame.setSize(x+i,i);
		  try {
			  Thread.sleep(10);
		  }catch (Exception e) {}
		  Frame.setVisible(true);
	}  
		
	
}

}
class SplashFrame extends JFrame implements Runnable{
	Thread s1;
 
  SplashFrame (){
	ImageIcon tt=new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/splashh.jpg"));
	Image t1 = tt.getImage().getScaledInstance(1200,800,Image.SCALE_DEFAULT);
	ImageIcon t2=new ImageIcon(t1);
	JLabel skt =new JLabel(t2);
	add(skt);
	
	
	//setLocation(0,0);
	//setSize(1200,1000);
	
	//setBounds(0,0,1200,800);//use for both location and size
	//setUndecorated(true);
	
	
	s1= new Thread(this);
	s1.start();
}
  public void run() {
	  try {
		  Thread.sleep(7000);
		  this.setVisible(false);
		  
		  new loginpage().setVisible(true);
	  }catch(Exception e) {}
	  
  }
}