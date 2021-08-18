package logic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import logic.dao.queries.SimpleQueries;
import logic.model.Role;

public class LoginDAO {
			
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/condominiumdb";
	private static final String USER = "condominium";
	private static final String PASSWORD = "ispw2021";
	
	private Statement stmt;
	private Connection conn;
	
	private String role;
	private int condominiumCode;
	private String condominium;
	
	//private Role role;
	private boolean val = false;
	
	public LoginDAO() {
		this.stmt = null;
		this.conn = null;
	}
	
	private void connect() throws Exception {
		 Class.forName(DRIVER);
		 conn = DriverManager.getConnection(URL,USER,PASSWORD);
		 stmt = conn.createStatement();
	}
	
	private void disconnect() throws Exception{
        if (stmt != null)
            stmt.close();
        if (conn != null)
            conn.close();
	}
	
	public  boolean checkLogin(String email,String password) throws Exception {		                
        try {        	
        	connect();           
            ResultSet rs = SimpleQueries.selectLogin(stmt, email, password);           
            if(rs.next()) {
            	this.val = true;
            }
        } finally {       	
        	disconnect();
        }
        return this.val;
	}
		
	public  String checkRole(String email) throws Exception {				
        try {
        	connect();            
            ResultSet rs = SimpleQueries.selectRole(stmt,email);                                    
            if(rs.next()) {
            	this.role = rs.getString("Ruolo");
            }            
        } finally {
        		disconnect();
        }
        return this.role;
	}
	
public int checkCondominiumCode(String email) throws Exception {	
		        
        
        try {
        	
            connect(); 
            
            ResultSet rs = SimpleQueries.selectCondominiumCode(stmt, email);
                        
            
            if(rs.next()) {
            	this.condominiumCode = rs.getInt("CodiceCondominioFK");
            }
            
        } finally {
        	
                disconnect();
        }
        return this.condominiumCode;
	}

public  String checkCondominium(int condCode) throws Exception {	
	        
    
    try {
    	
        connect(); 
        
        ResultSet rs = SimpleQueries.selectCondominiumList(stmt, condCode);
                    
        
        if(rs.next()) {
        	this.condominium = rs.getString("Via");
        }
        
    } finally {
    	
            disconnect();
    }
    return this.condominium;
	}
	
}
	
