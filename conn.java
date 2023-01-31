package travelmanagementsystem;


import java.sql.*;

public class conn {
    Connection c;
    Statement s;
	public conn(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","s.k.trabada01");
			s=c.createStatement();
			
		}catch(Exception e) {
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
