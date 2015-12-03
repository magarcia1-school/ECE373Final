import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * This class demonstrates how to load an Image from an external file
 */

public class GameScreen extends Component {
//    static GraphicsDevice device = GraphicsEnvironment
//    		.getLocalGraphicsEnvironment().getDefaultScreenDevice();     
    BufferedImage img;
    int width = getWidth();
    int height = getHeight();
    
    
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public GameScreen() {
       try {
           img = ImageIO.read(new File("GameScreen.png"));
       } catch (IOException e) {
       }

    }

    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
        	return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }

    public static void main(String[] args) {
//        JFrame f = new JFrame("Start Wars Game Screen");
        
//        ImageIcon GreenLightSaber = new ImageIcon("GreenLightSaber.png");
        
//        JLabel background = new JLabel(new ImageIcon("GameScreen.jpg"));
//        background.setLayout(new BorderLayout());
//        f.add(background);
//
//        JLabel label = new JLabel("GreenLightSaber.png");
//        label.setHorizontalAlignment(JLabel.CENTER);
//
//        background.add(label);
//        background.add(new GameScreen());
//
//        background.add(new GameScreen());
//        background.add(label);
//        f.pack();
//        f.setResizable(false);
//        f.setVisible(true);
    	
    	JFrame background = new JFrame("Star Wars Game");
        background.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program when the window is closed
        background.setResizable(false); //don't allow the user to resize the window
        background.setSize(new Dimension(818,568));
        background.setVisible(true);

        ImagePanel back = new ImagePanel("back.JPG");
        background.add(back);

        back.addMouseListener(this);


    }
}