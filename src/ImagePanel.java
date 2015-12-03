import java.awt.Image;
import java.util.ArrayList;

public class ImagePanel
{
	private Image background;                    //The background image    private ArrayList<MovingImage> top;    //An array list of foreground images
	private ArrayList<MovingImage> bottom;
	private ArrayList<MovingImage> middle;
	private MovingImage copter;
	private ArrayList<MovingImage> smoke;

  //Constructs a new ImagePanel with the background image specified by the file path given
    public ImagePanel(String img) 
    {
        this(new ImageIcon(img).getImage());    
            //The easiest way to make images from file paths in Swing
    }

  //Constructs a new ImagePanel with the background image given
    public ImagePanel(Image img)
    {
      background = img;
      Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));    
          //Get the size of the image
      //Thoroughly make the size of the panel equal to the size of the image
      //(Various layout managers will try to mess with the size of things to fit everything)
      setPreferredSize(size);
      setMinimumSize(size);
      setMaximumSize(size);
      setSize(size);

      top = new ArrayList<MovingImage>();
      middle = new ArrayList<MovingImage>();
      bottom = new ArrayList<MovingImage>();

      smoke = new ArrayList<MovingImage>();
}
