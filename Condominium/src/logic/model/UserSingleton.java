package logic.model;

public class UserSingleton {

	private Administrator administrator = null;
	/*private Resident resident = null;
	private Owner owner = null;*/
	
	private String role;

	private String code;

	private static UserSingleton instance = null;

	private UserSingleton() {
	}

	public static UserSingleton getInstance() {
		if (instance == null)
			instance = new UserSingleton();
		return instance;
	}

	public int getUserID() {
		if (role.equals("ADMINISTRATOR"))
			return this.administrator.getUserID();
		/*if (role.equals(Role.RESIDENT))
			return this.student.getUserID();
		if (role.equals(Role.OWNER))
			return this.student.getUserID();*/
		else
			return 0;
	}

	public void setAdministrator(Administrator user) {
		this.administrator = user;
	}

	public Administrator getAdministrator() {
		return this.administrator;
	}


	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void clearState() {
		this.setCode(null);
		this.setRole(null);
		this.setAdministrator(null);
	}
}
