import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuScreen extends Screen {
	JLabel label;
	JLabel inslabel;
	JLabel startlabel;
	Color textColor;

	public MenuScreen(JFrame frame) {
		super(frame);
		backgroundColor = new Color(170, 136, 255);
		textColor = new Color(51, 136, 221);
		label = new JLabel();
		inslabel = new JLabel();
		startlabel = new JLabel();
	}

	public void draw() {
		// c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		this.add(label, c);

		// c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		this.add(inslabel, c);

		// c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		this.add(startlabel, c);

		frame.add(this);
		// panel.add(inslabel);
		// panel.add(startlabel);
		// panel.add(label);
		this.setBackground(backgroundColor);

		label.setFont(new Font("Serif", Font.PLAIN, 40));
		label.setForeground(textColor);
		label.setText("ZODIAC SCRAMBLE");

		inslabel.setFont(new Font("Serif", Font.PLAIN, 35));
		inslabel.setForeground(textColor);
		inslabel.setText("Press ENTER for instructions");

		startlabel.setFont(new Font("Serif", Font.PLAIN, 35));
		startlabel.setForeground(textColor);
		startlabel.setText("Press SPACE to start");

		this.repaint();
		frame.pack();
	}

}
