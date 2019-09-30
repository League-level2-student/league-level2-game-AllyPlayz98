import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Instructions extends Screen{
	 JLabel label;
	 Color textColor;
	public Instructions (JFrame frame) {
		super(frame);
        backgroundColor = new Color(170, 136, 255);
        textColor = new Color (51, 136, 221);
        label = new JLabel();
	}
}
