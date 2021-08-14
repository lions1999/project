package logic.view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import logic.bean.UserBean;
import logic.controller.LoginController;
import logic.controller.ViewController;
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
	    private Button btnFacebook;	    
	    @FXML
	    private Button btnGoogle;
	    @FXML
	    private Button btnSignup;
	    
	    @FXML
	    void onFacebookClick(ActionEvent event) {
	    	//TODO
	    }

	    @FXML
	    void onGoogleClick(ActionEvent event) {
	    	//TODO
	    }

	    @FXML
	    private void onSignupClick(ActionEvent event) throws Exception {	    	
	    	RegisterView reg = new RegisterView();
	    	reg.start((Stage) btnSignup.getScene().getWindow());	    	
	    }
	    
	    
	    @FXML
	    private void onSigninClick() throws Exception, InvalidInputException{
			
			/*String c;
			LoginDAO log = new LoginDAO();
			
			//Controllo nel db se esiste utente
			if(log.checkLogin( tfemail.getText(),  tfpassword.getText())) {
				
				//Se esiste controllo il ruolo
				c = log.checkRole(tfemail.getText());
				
				Stage stage = (Stage) btnSignin.getScene().getWindow();
				
				
				if(c.equals("A")) {
					
					
				}
				
				if(c.equals("R")){
					
					HomeView page = new HomeView();
					page.start(stage);
					
					
				
				}
				
				if(c.equals("O")){
					RegisterView page = new RegisterView();
					page.start(stage);
				}
				
			}else {
				
				tfemail.setText("E-mail");
		    	tfpassword.setText("Password");
		    	ViewController page = new ViewController();
				Stage stage = new Stage();
				page.loadPage("Alert", stage);
			}*/
	    	UserBean bean = createBean(tfemail.getText(), tfpassword.getText());
			LoginController controller = new LoginController();
			try {
				controller.login(bean);
				HomeView home = new HomeView();
				home.start((Stage) btnSignin.getScene().getWindow());
			}
				/*MainMenuView main = new MainMenuView();
				main.start((Stage) btLogin.getScene().getWindow());*/
			/*} catch (InvalidInputException) {
				ExceptionHandler.handle(e);
			}*/ catch (Exception e) {
				e.printStackTrace();
			}

		}
	    
	    public UserBean createBean(String email, String password) {
			UserBean user = new UserBean();
			user.setEmail(email);
			user.setPassword(password);
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

