import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EndScreen extends Screen {
    JLabel label;

    public EndScreen(JFrame frame) {
        super( frame );
        
        backgroundColor = new Color(170, 136, 255);
        label = new JLabel();
    }

    public void draw() {
        frame.add( panel );
        panel.add( label );
        panel.setBackground( backgroundColor );
        label.setFont( new Font( "Serif", Font.PLAIN, 80 ) );
        label.setText( "END" );
        panel.repaint();
        frame.pack();
    }
}
