import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ShipScreen
{
	public BufferedImage loadXWing()
	{
		//Create a BufferedImage object
		BufferedImage img = null;
		//Open the XWingFighter.jpg picture
		try {
			img = ImageIO.read(new File("XWingFighter.png"));
		} catch (IOException e) {
		}
		//return the loaded image
		return img;
	}
}
