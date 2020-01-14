import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Instructions extends Screen {
	JLabel label;
	Color textColor;

	public Instructions(JFrame frame) {
		super(frame);
		backgroundColor = new Color(170, 136, 255);
		textColor = new Color(51, 136, 221);
		label = new JLabel();
		this.setLayout(new FlowLayout());
	}

	public void draw() {
		// TODO Auto-generated method stub
		// c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		this.add(label, c);

		frame.add(this);
		// panel.add(label);
		this.setBackground(backgroundColor);

		label.setFont(new Font("Serif", Font.PLAIN, 30));
		label.setForeground(textColor);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setPreferredSize(new Dimension(WIDTH - 100, HEIGHT));
		label.setText("<html><br/><br/><br/><br/><br/><br/><br/><br/>INSTRUCTIONS:"
				+ "<br/>The aim of the game is to guess all of the"
				+ "<br/>correct zodiac symbols. There will be no time"
				+ "<br/>limit, so there's no rush. Use the scrambled"
				+ "<br/>letters on the screen to guess the correct sign."
				+ "<br/>Once that has been done, move onto the next"
				+ "<br/>symbol. After all twelve signs have been guessed"
				+ "<br/>correctly,the game will be finished. If the wrong"
				+ "<br/>sign is guessed, the game will restart.</html>");
		this.repaint();
		frame.pack();
		// frame.setFocusable(true);
	}
}
