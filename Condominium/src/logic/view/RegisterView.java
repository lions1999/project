package logic.view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import logic.controller.ViewController;

public class RegisterView extends Application{

    @FXML
    private TextField tfnome;

    @FXML
    private Button btnSignup;

    @FXML
    private TextField tfcognome;

    @FXML
    private TextField tfemail;

    @FXML
    private PasswordField tfpassword;

    @FXML
    private PasswordField tfconfirmpassword;

    @FXML
    private RadioButton rb_admin;

    @FXML
    private ToggleGroup grup;

    @FXML
    private RadioButton rb_owner;

    @FXML
    private RadioButton rb_resident;

    @FXML
    private TextField tfcondominiumCode;

    private ViewController view = new ViewController();
    
    @FXML
    void onSignupClick(ActionEvent event) {
    		//TODO
    }



    public void start(Stage primaryStage){
		view.loadPage("Registrazione", primaryStage);
	}

	public static void main(String[] args) {
		launch(args);
	}

}


    

	
    
