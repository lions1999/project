package logic.view;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import logic.bean.UserBean;
import logic.controller.LoginController;
import logic.controller.ViewController;
import logic.controller.exception.DatabaseException;
import logic.controller.exception.ExceptionHandler;
import logic.controller.exception.InvalidInputException;


public class LoginView extends Application {
	
		private ViewController view = new ViewController();
				
		@FXML
		private TextField tfemail;
		@FXML
		private TextField tfpassword;
	    @FXML
	    private Button btnSignin;
	    @FXML
	    private Button btnSignup;
	    @FXML
	    private TextField tfcc;	    

	    @FXML
	    private void onSignupClick() {	    	
	    	RegisterView reg = new RegisterView();
	    	reg.start((Stage) btnSignup.getScene().getWindow());	    	
	    }
	    
	    
	    @FXML
	    private void onSigninClick() throws Exception{
	    	UserBean bean = createBean(tfemail.getText(), tfpassword.getText(),tfcc.getText());
			LoginController controller = new LoginController();
			try {
				controller.login(bean);
				HomeView home = new HomeView();
				home.start((Stage) btnSignin.getScene().getWindow());
			} catch (InvalidInputException | DatabaseException e) {
				ExceptionHandler.handle(e);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public UserBean createBean(String email, String password, String condominiumCode) {
			UserBean user = new UserBean();
			user.setEmail(email);
			user.setPassword(password);
			user.setcondominiumCode(condominiumCode);
			return user;
		}

		@Override
		public void start(Stage primaryStage) {		
			view.loadPage("Login", primaryStage);
		}	
		
		public static void main(String[] args) {
			launch(args);
		}
}

