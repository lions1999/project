package logic.controller;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ViewController{
	
	public void loadPage(String page ,Stage primaryStage){

				
		FXMLLoader loader  = new FXMLLoader(getClass().getResource("/logic/view/fxml/"+page+".fxml"));
		
		Parent root;
		
		try {
			
			root  = loader.load();
			
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Condominium/"+page);
			primaryStage.show();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	
	}	
}
