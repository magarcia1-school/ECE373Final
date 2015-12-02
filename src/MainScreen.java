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

public class MainScreen extends Component {
//    static GraphicsDevice device = GraphicsEnvironment
//    		.getLocalGraphicsEnvironment().getDefaultScreenDevice();     
    BufferedImage img;
    int width = getWidth();
    int height = getHeight();
    
    ShipScreen shipScreen;
    
    
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
//        if (img == null) {
//             return new Dimension(100,100);
//        } else {
//        	return new Dimension(img.getWidth(null), img.getHeight(null));
//       }
//    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Start Wars");
        
//        ImageIcon XWingShip = new ImageIcon("XWingFighter.png");

        JLabel background = new JLabel(new ImageIcon("MainScreen.jpg"));
        background.setLayout(new BorderLayout());
        f.add(background);

        JLabel label = new JLabel("I'm on fire");
        label.setFont(label.getFont().deriveFont(Font.BOLD, 48));
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(JLabel.CENTER);

//        f.addWindowListener(new WindowAdapter(){
//                public void windowClosing(WindowEvent e) {
//                    System.exit(0);
//                }
//            });
        
       // device.setFullScreenWindow(f);
        background.add(new MainScreen());
        background.add(label);
        f.pack();
        f.setResizable(false);
        
   
        f.setVisible(true);
    }
}