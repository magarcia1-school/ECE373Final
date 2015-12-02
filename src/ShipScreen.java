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
	}
}
