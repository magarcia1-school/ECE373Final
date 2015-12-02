import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 * This class demonstrates how to load an Image from an external file
 */
public class MainScreen extends Component {
          
    BufferedImage img;
    int width = getWidth();
    int height = getHeight();
    static GraphicsDevice device = GraphicsEnvironment
	        .getLocalGraphicsEnvironment().getDefaultScreenDevice();
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public MainScreen() {
       try {
           img = ImageIO.read(new File("MainScreen.jpg"));
       } catch (IOException e) {
       }

    }

//    public Dimension getPreferredSize() {
////    	Toolkit tk = Toolkit.getDefaultToolkit();
////    	int xsize = 100;
////    	int ysize = 100;
//        if (img == null) {
//             return new Dimension(100,100);
//        } else {
////        	xsize = (int) tk.getScreenSize().getWidth();
////        	ysize = (int) tk.getScreenSize().getHeight();
//        	return new Dimension(img.getWidth(null), img.getHeight(null));
//       }
//    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Load Image Sample");
            
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        device.setFullScreenWindow(f);
        f.add(new MainScreen());
        f.pack();
        f.setVisible(true);
    }
}