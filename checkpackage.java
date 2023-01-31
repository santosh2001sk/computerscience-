package travelmanagementsystem;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class checkpackage extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new checkpackage().setVisible(true);
    }

    checkpackage() {    
      setBounds(250, 20, 1000, 650);  
      setVisible(true);
      String[] package1 = new String[]{"package1.jpg","DIAMOND PACKAGE:-","Dubai&Abudhabi,Sea Beach&Dubai mall","8 days and 7 luxury Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Full Day 3 Island Cruise", "English Speaking Guide", "Sheeping Night", "Summer Special", "Rs 40000/- only"};
      String[] package2 = new String[]{"package2.jpg","GOLD PACKAGE:-","North india Kashmir,Simla&Himalaya","8 days and 7 luxury Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "Mountain climbing", "Winter Special", "Rs 30000/- only"};
      String[] package3 = new String[]{"package.3.jpg","SILVER PACKAGE:-","East& South india 4 Dham of india","6 days and 5 Nights", "Return Airfare", "Area wise food facilities", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "Mahaprasad seban", "Airport taxi services", "Autumn Special", "Rs 25000/- only"};
      String[] package4 = new String[]{"package.4.jpg","BRONZE PACKAGE:-","Western india,goa&Mysore","4 days and 4 Nights", "Return Airfare", "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 3 Star Hotel", "BBQ Dinner", "1 Night in Resort", "Rainy Special", "Rs 15000/- only"};
      String[] package5 = new String[]{"entire.jpg","360-INDIA:-","Most famous places of india","25 days and 25 Nights", "Return Airfare", "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 3 Star Hotel", "BBQ dinner", "1 Night in Resort", "All time", "Rs 150000/- only"};
      
      
      JTabbedPane tabbedPane = new JTabbedPane();
      JPanel p1 = createPackage(package1);
      tabbedPane.addTab("Package 1", null, p1);
      
      JPanel p2 = createPackage(package2);
      tabbedPane.addTab("Package 2", null, p2);
      
      JPanel p3 = createPackage(package3);
      tabbedPane.addTab("Package 3", null, p3);
      
      JPanel p4 = createPackage(package4);
      tabbedPane.addTab("Package 4", null, p4);
      
      JPanel p5 = createPackage(package5);
      tabbedPane.addTab("Package 5", null, p5);
      
      add(tabbedPane, BorderLayout.CENTER);    
   }
    
    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(16,230,207));
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/"+pack[0]));
        Image i3 = i1.getImage().getScaledInstance(600, 650,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(380,0,600,650);
        p1.add(l1);
        
        
      
               

        JLabel lblName = new JLabel(pack[1]);
        lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        //lblName.setForeground(Color.green);
        lblName.setBounds(35, 5, 350, 53);
        //lblName.setBorder(new LineBorder( Color.black,2));
        p1.add(lblName);

        JLabel l3 = new JLabel(pack[2]);
        l3.setForeground(Color.RED);
        l3.setBackground(Color.white);
        l3.setBounds(35, 70, 315, 25);
        l3.setFont(new Font("Yu Mincho", Font.PLAIN, 17));
        l3.setBorder(new LineBorder( Color.black,2));
        p1.add(l3);

        JLabel lblId = new JLabel(pack[3]);
        lblId.setForeground(Color.BLUE);
        lblId.setBounds(35, 110, 315, 25);
        lblId.setFont(new Font("Yu Mincho", Font.PLAIN, 17));
        lblId.setBorder(new LineBorder( Color.black,2));
        p1.add(lblId);

        JLabel l2 = new JLabel(pack[4]);
        l2.setForeground(Color.RED);
        l2.setBounds(35, 150, 315, 20);
        l2.setFont(new Font("Yu Mincho", Font.PLAIN, 17));
        l2.setBorder(new LineBorder( Color.black,2));
        p1.add(l2);

        JLabel lblName_1 = new JLabel(pack[5]);
        lblName_1.setForeground(Color.BLUE);
        lblName_1.setBounds(35, 190, 315, 20);
        lblName_1.setFont(new Font("Yu Mincho", Font.PLAIN, 17));
        lblName_1.setBorder(new LineBorder( Color.black,2));
        p1.add(lblName_1);

        JLabel lblGender = new JLabel(pack[6]);
        lblGender.setForeground(Color.white);
        lblGender.setBounds(35, 230, 315, 20);
        lblGender.setFont(new Font("Yu Mincho", Font.PLAIN, 17));
        lblGender.setBorder(new LineBorder( Color.black,2));
        p1.add(lblGender);

        JLabel lblCountry = new JLabel(pack[7]);
        lblCountry.setForeground(Color.BLUE);
        lblCountry.setBounds(35, 270, 315, 20);
        lblCountry.setFont(new Font("Yu Mincho", Font.PLAIN, 17));
        lblCountry.setBorder(new LineBorder( Color.black,2));
        p1.add(lblCountry);

        JLabel lblReserveRoomNumber = new JLabel(pack[8]);
        lblReserveRoomNumber.setForeground(Color.RED);
        lblReserveRoomNumber.setBounds(35, 310, 315, 20);
        lblReserveRoomNumber.setFont(new Font("Yu Mincho", Font.PLAIN, 17));
        lblReserveRoomNumber.setBorder(new LineBorder( Color.black,2));
        p1.add(lblReserveRoomNumber);

        JLabel lblCheckInStatus = new JLabel(pack[9]);
        lblCheckInStatus.setForeground(Color.BLUE);
        //lblCheckInStatus.setFont(new Font("Yu Mincho", Font.PLAIN, 14));
        lblCheckInStatus.setBounds(35, 350, 315, 20);
        lblCheckInStatus.setFont(new Font("Yu Mincho", Font.PLAIN, 17));
        lblCheckInStatus.setBorder(new LineBorder( Color.black,2));
        p1.add(lblCheckInStatus);

        JLabel ltlCheckInStatus = new JLabel(pack[10]);
        ltlCheckInStatus.setForeground(Color.red);
        ltlCheckInStatus.setFont(new Font("Yu Mincho", Font.PLAIN, 17));
        ltlCheckInStatus.setBorder(new LineBorder( Color.black,2));
        ltlCheckInStatus.setBounds(35, 390, 315, 20);
        p1.add(ltlCheckInStatus);
        
        JLabel lblDeposite = new JLabel(pack[11]);
        lblDeposite.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblDeposite.setBounds(35, 500, 240, 40);
        lblDeposite.setBorder(new LineBorder( Color.black,2));
        p1.add(lblDeposite);
        
        JLabel la1 = new JLabel(pack[12]);
        la1.setForeground(Color.RED);
        la1.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        la1.setBounds(35, 540, 240, 40);
        la1.setBorder(new LineBorder( Color.black,2));
        p1.add(la1);
        
        ImageIcon t1  = new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icon/bus.png"));
        Image t3 = t1.getImage().getScaledInstance(400, 650,Image.SCALE_DEFAULT);
        ImageIcon t2 = new ImageIcon(t3);
        JLabel s1 = new JLabel(t2);
        s1.setBounds(0,0,400,650);
        p1.add(s1);
        return p1;
    }
}
