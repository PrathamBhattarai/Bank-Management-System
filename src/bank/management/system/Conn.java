
package bank.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "@Pp9842030782");
            System.out.println("Database connected successfully");
            
            s = c.createStatement();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        }
    }
    

