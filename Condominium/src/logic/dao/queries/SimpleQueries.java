package logic.dao.queries;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SimpleQueries {
	
    public static ResultSet selectCondominiumList(Statement stmt, int CodiceCondominio) throws SQLException  {
        String sql = "SELECT * FROM condominiums where CodiceCondominio = '" + CodiceCondominio + "';";
        System.out.println(sql);
        return stmt.executeQuery(sql);
    }
    
    public static ResultSet selectCondominiumCode(Statement stmt, String email) throws SQLException {
    	String sql = "SELECT CodiceCondominioFK from users where Email='"+email+"'";
    	System.out.println(sql);
        return stmt.executeQuery(sql);
    }
    
    public static ResultSet selectLogin(Statement stmt, String email, String password)  throws SQLException {

		String sql= "SELECT * from users where Email='"+email+"' and Password='"+password+"'";
		System.out.println(sql);
		return stmt.executeQuery(sql);
	
    }
	
    public static ResultSet selectRole(Statement stmt,String email) throws SQLException  {
        String sql = "SELECT Ruolo FROM users WHERE Email='"+email+"'";
        System.out.println(sql);
        return stmt.executeQuery(sql);
    }
    public static ResultSet selectPostImage(Statement stmt,int id,int CodiceCondominio) throws SQLException  {
        String sql = "SELECT Image FROM posts where ID='"+id+"' and CodiceCondominioFK='"+CodiceCondominio+"'";
        System.out.println(sql);
        return stmt.executeQuery(sql);
    }
}
