package logic.controller;

import logic.bean.PostBean;
import logic.dao.PostDAO;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.fxml.Initializable;

public class PostController implements Initializable {

    @FXML
    private ImageView idimage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	PostBean bean = new PostBean();
    	PostDAO post = new PostDAO();
    	try{
    		bean.ImageConverter(post.checkImagePost(1, 12345), "Images"+1+".png");
    	}
    	catch(Exception e){
    		
    	}
    	
        File file = new File("Images"+1+".png");
        Image image = new Image(file.toURI().toString());
        idimage.setImage(image);
    }
    
}