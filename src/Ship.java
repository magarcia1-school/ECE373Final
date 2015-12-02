import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ship {
	
	public String name;
	public int score, X_Cord, Y_Cord;
	public boolean raising;
	public BufferedImage img;
	
	//constructors
	public Ship(String name, int score, int x_Cord, int y_Cord, boolean raising) {
		super();
		this.name = name;
		this.score = score;
		X_Cord = x_Cord;
		Y_Cord = y_Cord;
		this.raising = raising;
	}
	
	
	//getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getX_Cord() {
		return X_Cord;
	}

	public void setX_Cord(int x_Cord) {
		X_Cord = x_Cord;
	}

	public int getY_Cord() {
		return Y_Cord;
	}

	public void setY_Cord(int y_Cord) {
		Y_Cord = y_Cord;
	}

	
	//methods
	
	public void move(int x, int y){
		
	}
	
	public BufferedImage loadXWing()
	{
		//Open the XWingFighter.jpg picture
		try {
			img = ImageIO.read(new File("XWingFighter.png"));
		} catch (IOException e) {
		}
		//return the loaded image
		return img;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
