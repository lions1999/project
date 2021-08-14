package logic.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import logic.controller.ViewController;

public class HomeView extends Application implements Initializable{
    
	private ViewController view = new ViewController();
    
	@FXML
	private Label lbTitle;
 	@FXML
 	private ImageView imgUser;
 	@FXML
	private Label lbnome;
	@FXML
	private Button btnHome;
	@FXML
	private Button btnMessage;
	@FXML
	private Button btnMeeting;
	@FXML
	private Button btnApartmentinfo;
	@FXML
	private Button btnSignout;
	@FXML
	private Label tfCondominiumCode;
	@FXML
	private Label tfEmail;
	@FXML
	private VBox scrollbarBox;
	@FXML
	private Button btnAddPost;
	@FXML
	private ImageView imgUserPost;
	@FXML
	private Pane pnlHome;
    @FXML
    private Pane pnlMeeting;
    @FXML
    private Pane pnlApartmentInfo;
	@FXML
	public void handleClicks(ActionEvent actionEvent) {
		if (actionEvent.getSource() == btnHome) {
			pnlHome.setStyle("-fx-background-color : #1620A1");
			pnlHome.toFront();
        }
        if (actionEvent.getSource() == btnMeeting) {
        	pnlMeeting.setStyle("-fx-background-color : #53639F");
        	pnlMeeting.toFront();
        }
        if (actionEvent.getSource() == btnApartmentinfo) {
        	pnlApartmentInfo.setStyle("-fx-background-color : #ffffff");
        	pnlApartmentInfo.toFront();
        }
 	}
	 
	
	@Override
	public void start(Stage primaryStage) throws Exception{		
		view.loadPage("Home", primaryStage);
	}	
	
	  @Override
	  public void initialize(URL location, ResourceBundle resources) {
		  	pnlHome.toFront();
	        Node[] nodes = new Node[10];
	        for (int i = 0; i < nodes.length; i++) {
	            try {

	                final int j = i;
	                nodes[i] = FXMLLoader.load(getClass().getResource("/logic/view/fxml/Post.fxml"));

	                //give the items some effect

	                nodes[i].setOnMouseEntered(event -> {
	                    nodes[j].setStyle("-fx-background-color : #0A0E3F");
	                });
	                nodes[i].setOnMouseExited(event -> {
	                    nodes[j].setStyle("-fx-background-color : #02030A");
	                });
	                
	                scrollbarBox.getChildren().add(nodes[i]);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
		
	public static void main(String[] args) {
		launch(args);
	}

}
