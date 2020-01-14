import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class gameAr extends Screen{
Color textColor;
JLabel label;
JLabel insLabel;
JLabel startLabel;
	public gameAr(JFrame frame) {
		super(frame);
		backgroundColor = new Color(170, 136, 255);
		frame.add(this);
		textColor = new Color(51, 136, 221);
		label = new JLabel("hello");
		insLabel = new JLabel("hey");
		startLabel = new JLabel("hi");
		this.add(label);
		this.add(insLabel);
		this.add(startLabel);
		
		// TODO Auto-generated constructor stub
	}
	public void draw() {

		// c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		this.add(label, c);

		// c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		this.add(insLabel, c);

		// c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		this.add(startLabel, c);

		frame.add(this);
		// panel.add(inslabel);
		// panel.add(startlabel);
		// panel.add(label);
		this.setBackground(backgroundColor);

		label.setFont(new Font("Serif", Font.PLAIN, 40));
		label.setForeground(textColor);
		label.setText("ZODIAC SCRAMBLE");

		insLabel.setFont(new Font("Serif", Font.PLAIN, 35));
		insLabel.setForeground(textColor);
		insLabel.setText("Press ENTER for instructions");

		startLabel.setFont(new Font("Serif", Font.PLAIN, 35));
		startLabel.setForeground(textColor);
		startLabel.setText("Press SPACE to start");

		this.repaint();
		frame.pack();
	
	}

}
