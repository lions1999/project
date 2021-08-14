package logic.model;

import javafx.scene.image.Image;

public class Post {

	private User mittente;
	private Image immagine;
	private String label;
	
	
	public Post(User mittente, Image immagine, String label){
		this.mittente = mittente;
		this.immagine = immagine;
		this.label = label;
	}
	
	public void setUser(User mittente) {
		this.mittente = mittente;
	}
	
	public User getUser() {
		return this.mittente;
	}
	
	public void setImage(Image immagine) {
		this.immagine = immagine;
	}
	
	public Image getImage() {
		return this.immagine;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}
}
