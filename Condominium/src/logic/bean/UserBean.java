package logic.bean;

public class UserBean {

	private int userID;
    private String name;
    private String surname;
	private String email;
	private String password;
	private String role;
	private String condominiumCode;
	
	public int geUuserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public String getCondominiumCode() {
        return condominiumCode;
    }

    public void setcondominiumCode(String condominiumCode) {
        this.condominiumCode = condominiumCode;
    }

}
