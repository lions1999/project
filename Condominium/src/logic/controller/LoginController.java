package logic.controller;

import logic.bean.UserBean;
import logic.controller.exception.InvalidInputException;
import logic.dao.SqlDAO;
import logic.model.UserSingleton;
//import logic.model.Administrator;

public class LoginController {
	private SqlDAO ourDB = new SqlDAO();
	private static UserSingleton sg = UserSingleton.getInstance();

	public void login(UserBean bean) throws InvalidInputException, Exception {
		if (checkBean(bean)) {
			
			sg.setRole(ourDB.checkRole(bean.getEmail()));
				switch (sg.getRole()) {
				case ADMINISTRATOR:
					//Administrator admin = ourDB.getUserIDfromEmail(bean.getEmail());
				break;
				case RESIDENT:
				break;
				case OWNER:
				break;
				}
//				case ADMISTRATOR:
//			    	Admistrator admin = ourDB.loadUserByEmail(bean.getEmail());
//			    	sg.setAdministrator(admin);
//					break;
//				case RESIDENT:
//					break;
//				case OWNER:
//					break;
//				default:
//					break;
//				}
			/*} else {
				throw new DatabaseException("Banned User");
			}*/
			
			
			
		} else {
			throw new InvalidInputException("Wrong password");
		}
	}


	public boolean checkBean(UserBean bean) throws InvalidInputException, Exception {
		return ourDB.checkLogin( bean.getEmail()).equals(bean.getPassword());
	}
	
}




