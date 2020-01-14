import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.net.MalformedURLException;
import java.net.URL;

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

	public Screen(JFrame frame) {
		this.frame = frame;
		c = new GridBagConstraints();
		panelSize = new Dimension(Screen.WIDTH, Screen.HEIGHT);

		frame.setPreferredSize(panelSize);
		this.setLayout(new GridBagLayout());
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
