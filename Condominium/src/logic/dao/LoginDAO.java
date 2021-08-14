package logic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import logic.dao.queries.SimpleQueries;
import logic.model.Role;

public class LoginDAO {
		
	private boolean val = false;
	private String role;
	
	public  boolean checkLogin(String email,String password) throws Exception {		
		
        Statement stmt = null;
        Connection conn = null;        
        
        try {
        	
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/condominiumdb","root","");
            
            stmt = conn.createStatement();
            
            ResultSet rs = SimpleQueries.selectLogin(stmt, email, password);
            
            if(rs.next()) {
            	this.val = true;
            }
        } finally {
        	
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
        }
        return this.val;
	}
	
	
	
	
	public  String checkRole(String email) throws Exception {		
		
        Statement stmt = null;
        Connection conn = null;        
        
        try {
        	
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/condominiumdb","root","");
            
            stmt = conn.createStatement();
            
            ResultSet rs = SimpleQueries.selectRole(stmt,email);
                        
            
            if(rs.next()) {
            	this.role = rs.getString("Ruolo");
            }
            
        } finally {
        	
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
        }
        return this.role;
	}
	
}
