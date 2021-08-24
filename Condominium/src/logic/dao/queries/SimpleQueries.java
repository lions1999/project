package logic.dao.queries;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SimpleQueries {
	
	
    public static ResultSet getUserIDfromEmail(Statement stmt, String email,String condominiumCode)  throws SQLException {
		String sql= "SELECT ID from users where Email='"+email+"'and CodiceCondominioFK='"+condominiumCode+"'";
		System.out.println(sql);
		return stmt.executeQuery(sql);	
    }
		
    public static ResultSet selectCondominiumList(Statement stmt, int condominiumCode) throws SQLException  {
        String sql = "SELECT * FROM condominiums where CodiceCondominio = '" + condominiumCode + "';";
        System.out.println(sql);
        return stmt.executeQuery(sql);
    }
    
    public static ResultSet selectCondominiumCode(Statement stmt, String email) throws SQLException {
    	String sql = "SELECT CodiceCondominioFK from users where Email='"+email+"'";
    	System.out.println(sql);
        return stmt.executeQuery(sql);
    }
    
    public static ResultSet selectLogin(Statement stmt, String email,String condominiumCode)  throws SQLException {

		String sql= "SELECT Password from users where Email='"+email+"'and CodiceCondominioFK='"+condominiumCode+"'";
		System.out.println(sql);
		return stmt.executeQuery(sql);
	
    }
	
    public static ResultSet selectRole(Statement stmt,String email) throws SQLException  {
        String sql = "SELECT Ruolo FROM users WHERE Email='"+email+"'";
        System.out.println(sql);
        return stmt.executeQuery(sql);
    }
    public static ResultSet selectPostImage(Statement stmt,int id,int condominiumCode) throws SQLException  {
        String sql = "SELECT Image FROM posts where ID='"+id+"' and CodiceCondominioFK='"+condominiumCode+"'";
        System.out.println(sql);
        return stmt.executeQuery(sql);
    }
}
