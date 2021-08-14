package logic.controller;

import logic.bean.UserBean;
import logic.controller.exception.InvalidInputException;
import logic.dao.LoginDAO;
//import logic.model.UserSingleton;
//import logic.model.Administrator;

public class LoginController {
	private LoginDAO ourDB = new LoginDAO();
	//private static UserSingleton sg = UserSingleton.getInstance();

	public void login(UserBean bean) throws InvalidInputException, Exception {
		if (checkBean(bean)) {
			/*sg.setRole(ourDB.checkRole(bean.getEmail()));
				switch (sg.getRole()) {
				case "ADMINISTRATOR":
			    	Admistrator admin = ourDB.loadUserByEmail(bean.getEmail());
			    	sg.setAdministrator(admin);
					break;
				case "RESIDENT":
					break;
				case "OWNER":
					break;
				default:
					break;
				}
			} else {
				throw new DatabaseException("Banned User");
			}*/
		} else {
			throw new InvalidInputException("Wrong password");
		}
	}


	public boolean checkBean(UserBean bean) throws InvalidInputException, Exception {
		if(ourDB.checkLogin( bean.getEmail(),  bean.getPassword())) {
			return true;
		}
		return false;
	}

	
}




