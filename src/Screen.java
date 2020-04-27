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
import javax.swing.JTextField;

public class Screen extends JPanel {
	static final int WIDTH = 800;
	static final int HEIGHT = 800;
	JFrame frame;
	GridBagConstraints c;
	Dimension panelSize;
	Color backgroundColor;
	public static BufferedImage imageA;
	public static BufferedImage imageB;
	public static BufferedImage imageC;
	public static BufferedImage imageE;
	public static BufferedImage imageG;
	public static BufferedImage imageI;
	public static BufferedImage imageL;
	public static BufferedImage imageM;
	public static BufferedImage imageN;
	public static BufferedImage imageO;
	public static BufferedImage imageP;
	public static BufferedImage imageQ;
	public static BufferedImage imageR;
	public static BufferedImage imageS;
	public static BufferedImage imageT;
	public static BufferedImage imageU;
	public static BufferedImage imageV;
	static JTextField guessBox;

	Screen[] signimages = new Screen[12];

	public Screen(JFrame frame) {
		this.frame = frame;
		c = new GridBagConstraints();
		panelSize = new Dimension(Screen.WIDTH, Screen.HEIGHT);
		guessBox = new JTextField(20);

		frame.setPreferredSize(panelSize);
		this.setLayout(new GridBagLayout());
		try {
			imageA = ImageIO.read(this.getClass().getResourceAsStream("a.png"));
			imageB = ImageIO.read(this.getClass().getResourceAsStream("b.png"));
			imageC = ImageIO.read(this.getClass().getResourceAsStream("c.png"));
			imageE = ImageIO.read(this.getClass().getResourceAsStream("e.png"));
			imageG = ImageIO.read(this.getClass().getResourceAsStream("g.png"));
			imageI = ImageIO.read(this.getClass().getResourceAsStream("i.png"));
			imageL = ImageIO.read(this.getClass().getResourceAsStream("l.png"));
			imageM = ImageIO.read(this.getClass().getResourceAsStream("m.png"));
			imageN = ImageIO.read(this.getClass().getResourceAsStream("n.png"));
			imageO = ImageIO.read(this.getClass().getResourceAsStream("o.png"));
			imageP = ImageIO.read(this.getClass().getResourceAsStream("p.png"));
			imageQ = ImageIO.read(this.getClass().getResourceAsStream("q.png"));
			imageR = ImageIO.read(this.getClass().getResourceAsStream("r.png"));
			imageS = ImageIO.read(this.getClass().getResourceAsStream("s.png"));
			imageT = ImageIO.read(this.getClass().getResourceAsStream("t.png"));
			imageU = ImageIO.read(this.getClass().getResourceAsStream("u.png"));
			imageV = ImageIO.read(this.getClass().getResourceAsStream("v.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.pack();

	}

	public void removeScreen() {
		this.frame.getContentPane().remove(this);
		this.frame.revalidate();
		this.frame.repaint();
		this.frame.requestFocus();
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

	public boolean checkAnswer(String correct) {
		String answer = guessBox.getText();
		if (answer.equals(correct)) {
			return true;
		} else {
			return false;
		}
	}

}
