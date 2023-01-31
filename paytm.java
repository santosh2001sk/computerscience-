package travelmanagementsystem;

import javax.swing.JEditorPane;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class paytm  extends JFrame implements ActionListener {
	
		paytm(){
			JEditorPane j = new JEditorPane();
	        j.setEditable(false);   

	        try {
	            j.setPage("https://paytm.com/electricity-bill-payment");
	        }catch (Exception e) {
	            j.setContentType("text/html");
	            j.setText("<html>Could not load</html>");
	        } 

	        JScrollPane scrollPane = new JScrollPane(j);     
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        getContentPane().add(scrollPane);
	        setPreferredSize(new Dimension(800,600));
	        
	        JButton back=new JButton("Back");
	        back.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                setVisible(false);
	            }
	        });
	        back.setBounds(610, 20, 80, 40);
	        j.add(back);
	        
	        
	        setSize(800,550);
	        setLocation(250,100);
	        setVisible(true);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new paytm().setVisible(true);


	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
