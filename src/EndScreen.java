import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EndScreen extends Screen {
	JLabel label;
	Color textColor;

	public EndScreen(JFrame frame) {
		super(frame);

		backgroundColor = new Color(170, 136, 255);
		label = new JLabel();
		textColor = new Color(51, 136, 221);
	}

	public void draw() {
		frame.add(this);
		this.add(label);
		this.setBackground(backgroundColor);
		label.setFont(new Font("Serif", Font.PLAIN, 80));
		label.setForeground(textColor);
		label.setText("<html>CONGRATS!"
				+ "<br/>YOU WIN! :)</html>");
		this.repaint();
		frame.pack();
	}
}
