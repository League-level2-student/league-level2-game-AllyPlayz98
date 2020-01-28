import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Screen extends JPanel{
	static final int WIDTH = 800;
	static final int HEIGHT = 800;
	JFrame frame;
	GridBagConstraints c;
	Dimension panelSize;
	Color backgroundColor;
	public static BufferedImage imageB;
	
	Screen[] signimages = new Screen[12];

	public Screen(JFrame frame) {
		this.frame = frame;
		c = new GridBagConstraints();
		panelSize = new Dimension(Screen.WIDTH, Screen.HEIGHT);

		frame.setPreferredSize(panelSize);
		this.setLayout(new GridBagLayout());
		try {
			imageB = ImageIO.read(this.getClass().getResourceAsStream("a.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.pack();
		
	}

	public void removeScreen() {
		this.frame.getContentPane().remove(this);
	}

	public JLabel createLabelImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	public void draw() {

	}

}
