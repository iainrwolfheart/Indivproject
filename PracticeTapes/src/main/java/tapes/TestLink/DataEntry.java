package TestLink;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataEntry implements ActionListener{
    TextField TR,TN,TM;
    Statement stmt;
    
     public DataEntry(TextField T1,TextField T2,TextField T3) {
        TR=T1;
        TN=T2;
        TM=T3;
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/practicetapes", "root", "Las1Vegas!");
            stmt =con.createStatement();                
         }
         catch(Exception E) {
             System.out.println(E.toString());
         }
    }
    public void actionPerformed(ActionEvent e) {

        String regno,name,marks;
        String insertquery="";
        regno=TR.getText();
        name=TN.getText();
        marks=TM.getText();
        insertquery="insert into school values("+regno+",'"+name+"',"+marks+")";
	        try {
	        stmt.executeUpdate(insertquery);
	        TR.setText("");
	        TN.setText("");
	        TM.setText("");
	         }
	         catch(Exception E) {
	             System.out.println(E.toString());
	         }

	}
}
