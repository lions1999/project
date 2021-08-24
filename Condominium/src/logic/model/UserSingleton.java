package logic.model;

public class UserSingleton {

	private Administrator administrator = null;
	/*private Resident resident = null;
	private Owner owner = null;*/
	
	private Role role;

	private String code;
	
	private int id;

	private static UserSingleton instance = null;

	private UserSingleton() {
	}

	public static UserSingleton getInstance() {
		if (instance == null)
			instance = new UserSingleton();
		return instance;
	}

	/*public int getUserID() {
		if (role.equals(Role.ADMINISTRATOR))
			return this.administrator.getUserID();
		if (role.equals(Role.RESIDENT))
			return this.student.getUserID();
		if (role.equals(Role.OWNER))
			return this.student.getUserID();
		else
			return 0;
	}*/
	
	public void setUserID(int id) {
		this.id = id;
	}
	
	public int getUserID() {
		return this.id;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void clearState() {
		this.setCode(null);
		this.setRole(null);
		this.setAdministrator(null);
	}
}
