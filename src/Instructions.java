import java.awt.Color;
import java.awt.Font;

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
	public void drawInstructions() {
		// TODO Auto-generated method stub
		//c.fill = GridBagConstraints.HORIZONTAL;
    	c.gridx = 0;
    	c.gridy = 0;
    	panel.add(label, c);
    	
        frame.add(panel);
        //panel.add(label);
        panel.setBackground(backgroundColor);
        
        label.setFont(new Font( "Serif", Font.PLAIN, 30));
        label.setForeground(textColor);
        label.setText("<html> The aim of the game is to guess all of the correct zodiac symbols. "
        		+ "There will be no time limit, so there's no rush. Move around the "
        		+ "letters on the screen to make the correct words. Once you have done "
        		+ "that, move onto the next word. Once you have guessed all twelve signs, "
        		+ "you will have finished the game. If you guess the wrong sign, the game"
        		+ "will restart.</html>");
        panel.repaint();
        frame.pack();
	}
}
