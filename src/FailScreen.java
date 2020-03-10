import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FailScreen extends Screen {
	JLabel label;
	Color textColor;
	
	public FailScreen(JFrame frame) {
		super(frame);
		backgroundColor = new Color(170, 136, 255);
		textColor = new Color(51, 136, 221);

		backgroundColor = new Color(170, 136, 255);
		label = new JLabel();
	}

	public void draw() {
		frame.add(this);
		this.add(label);
		this.setBackground(backgroundColor);
		label.setFont(new Font("Serif", Font.PLAIN, 80));
		label.setForeground(textColor);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText("<html>YOU FAILED"
				+ "<br/>TRY AGAIN :)</html>");
		this.repaint();
		frame.pack();
	}
}