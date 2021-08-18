package logic.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import logic.dao.queries.SimpleQueries;
import logic.model.Role;

public class SqlDAO {
			
	
	private static final String URL = "jdbc:mysql://localhost:3306/condominiumdb";
	private static final String USER = "condominium";
	private static final String PASSWORD = "ispw2021";
	
	private Statement stmt;
	private Connection conn;
	
	private Role role;
	private int ID;
	private String password;
	private int condominiumCode;
	private String condominium;
	
	//private Role role;
	private boolean val = false;
	
	public SqlDAO() {
		this.stmt = null;
		this.conn = null;
	}
	
	private void connect() throws SQLException {
		 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		 conn = DriverManager.getConnection(URL,USER,PASSWORD);
		 stmt = conn.createStatement();
	}
	
	private void disconnect() throws SQLException{
        if (stmt != null)
            stmt.close();
        if (conn != null)
            conn.close();
	}
	
	//public User 
	
	
	public int getUserIDfromEmail(String email) throws SQLException{
		 try {        	
	        	connect();           
	            ResultSet rs = SimpleQueries.getUserIDfromEmail(stmt, email);           
	            if(rs.next()) {
	            	this.ID = rs.getInt("ID");
	            }
	        } finally {       	
	        	disconnect();
	        }
	        return this.ID;
	}
	
	
	public  String checkLogin(String email) throws SQLException {		                
        try {        	
        	connect();           
            ResultSet rs = SimpleQueries.selectLogin(stmt, email);           
            if(rs.next()) {
            	this.password = rs.getString("Password");
            }
        } finally {       	
        	disconnect();
        }
        return this.password;
	}
	
		
	public  Role checkRole(String email) throws SQLException {				
        try {
        	connect();            
            ResultSet rs = SimpleQueries.selectRole(stmt,email);                                    
            if(rs.next()) {
            	this.role = Role.valueOf(rs.getString("Ruolo"));
            }            
        } finally {
        		disconnect();
        }
        return this.role;
	}
	
	public int checkCondominiumCode(String email) throws SQLException {	
		        
        
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

	public  String checkCondominium(int condCode) throws SQLException {	
	        
    
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

public  InputStream checkImagePost(int id,int CodiceCondominio) throws SQLException {		
	 
    ResultSet rs = null;
    InputStream input = null;
   
    
    try {
    	
       connect();
        
        rs = SimpleQueries.selectPostImage(stmt,id,CodiceCondominio);
                               	
        if(rs.next()) {
        	
        	input = rs.getBinaryStream("Image");
        }
        
    } finally {
    	disconnect();
    }
    
    return input;
}


}
	
