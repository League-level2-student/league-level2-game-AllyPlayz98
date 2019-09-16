import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuScreen extends Screen {
    JLabel label;
    Color textColor;

    public MenuScreen(JFrame frame) {
        super(frame);
        backgroundColor = new Color(170, 136, 255);
        textColor = new Color (51, 136, 221);
        label = new JLabel();
    }

    public void drawMenu() {
        frame.add(panel);
        panel.add(label);
        panel.setBackground(backgroundColor);
        label.setFont(new Font( "Serif", Font.PLAIN, 40));
        label.setForeground(textColor);
        label.setText("ZODIAC SCRAMBLE");
        panel.repaint();
        frame.pack();
    }

}
