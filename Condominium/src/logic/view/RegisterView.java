package logic.view;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import logic.bean.UserBean;
import logic.controller.RegisterController;
import logic.controller.ViewController;
import logic.model.Role;

public class RegisterView extends Application{

	private ViewController view = new ViewController();
	private Stage stage = new Stage();
	private Role role;

    @FXML
    private TextField tfname;
    @FXML
    private Button btnSignup;
    @FXML
    private TextField tfsurname;
    @FXML
    private TextField tfemail;
    @FXML
    private PasswordField tfpassword;
    @FXML
    private PasswordField tfconfirmpassword;
    @FXML
    private RadioButton rbadmin;
    @FXML
    private ToggleGroup grup;
    @FXML
    private RadioButton rbowner;
    @FXML
    private RadioButton rbresident;
    @FXML
    private TextField tfcondominiumCode;
    @FXML
    private Button btnSignin;

    @FXML
    void onSigninClick() {
    	LoginView reg = new LoginView();
    	reg.start((Stage) btnSignup.getScene().getWindow());
    }

    @FXML
    void onSignupClick(){
    	if (tfname.getText().isEmpty() || tfsurname.getText().isEmpty() || tfemail.getText().isEmpty() || 
    		tfpassword.getText().isEmpty() || tfconfirmpassword.getText().isEmpty()) {
    		view.loadPage("Alert",stage);
    		
    		System.out.println("nessun niuente");
    	} else if(grup.getSelectedToggle() == null) {
    		view.loadPage("Alert",stage);
    		System.out.println("nessun ruolo");    	
    	} else if (tfcondominiumCode.getText().isEmpty()) {
    		view.loadPage("Alert",stage);
    		System.out.println("nessun cc");
    	} else if (tfpassword.getText().equals(tfconfirmpassword.getText()) == false){
    		view.loadPage("Alert",stage);
    		System.out.println("nessun password");
    	} else { 
    		RadioButton selectedRadioButton = (RadioButton) grup.getSelectedToggle();
    		String toogleGroupValue = selectedRadioButton.getText();
    		role = Role.valueOf(toogleGroupValue);
    		UserBean bean = createBean(tfname.getText(),tfsurname.getText(),tfemail.getText(),tfpassword.getText(),role,tfcondominiumCode.getText());
    		RegisterController controller = new RegisterController();
    	}    	 
    }
    
    public UserBean createBean(String name,String surname,String email, String password,Role role,String condominiumCode) {
		UserBean user = new UserBean();
		user.setName(name);
		user.setSurname(surname);
		user.setEmail(email);
		user.setPassword(password);
		user.setRole(role);
		user.setcondominiumCode(condominiumCode);
		return user;
	}

    public void start(Stage primaryStage){
		view.loadPage("Register", primaryStage);
	}

	public static void main(String[] args) {
		launch(args);
	}

}


    

	
    
