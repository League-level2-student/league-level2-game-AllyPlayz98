import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GameScreen extends Screen implements ActionListener {
    JTextField field;
    JButton guess;
    
    public GameScreen( JFrame frame ) {
        super( frame );
        
        backgroundColor = new Color(170, 136, 255);
        Color textColor = new Color(51, 136, 221);
        field = new JTextField( 20 );
        guess = new JButton( "Guess" );
    }
    
    public void draw() {
        frame.add( panel );
        panel.setBackground( backgroundColor );
        
        c.gridx = 0;
        c.gridy = 0;

        
        c.gridx = 0;
        c.gridy = 1;
        panel.add( field, c );
        
        c.gridx = 0;
        c.gridy = 2;
        panel.add( guess, c );
        
        guess.addActionListener( this );
        
        panel.repaint();
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }
    
}
