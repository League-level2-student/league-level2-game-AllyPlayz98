
//https://www.pixilart.com

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ZodiacScramble implements KeyListener {
	static final int MENU = 0;
	static final int GAMEAr = 1;
	static final int GAMET = 2;
	static final int GAMEG = 3;
	static final int GAMECan = 4;
	static final int GAMELe = 5;
	static final int GAMEV = 6;
	static final int GAMELi = 7;
	static final int GAMESc = 8;
	static final int GAMESa = 9;
	static final int GAMECap = 10;
	static final int GAMEAq = 11;
	static final int GAMEP = 12;
	static final int END = 13;
	static final int INS = 14;
	static final int NUM_STATES = 15;

	private int gameState = MENU;
	JFrame frame;

	Screen menu;
	Screen gameAr;
	Screen gameT;
	Screen gameG;
	Screen gameCan;
	Screen gameLe;
	Screen gameV;
	Screen gameLi;
	Screen gameSc;
	Screen gameSa;
	Screen gameCap;
	Screen gameAq;
	Screen gameP;
	Screen end;
	Screen ins;
	Screen currentScreen;
	Screen[] screens = new Screen[12];

	public static void main(String[] args) throws Exception {
		new ZodiacScramble().startGame();
	}

	private void startGame() {
		frame = new JFrame("Zodiac Scramble");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);

		menu = new MenuScreen(frame);
		// game = new GameScreen(frame);
		end = new EndScreen(frame);
		ins = new Instructions(frame);
		selectScreen(menu);
	}

	private void selectScreen(Screen screen) {
		currentScreen = screen;
		screen.draw();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (currentScreen == menu) {
			if (arg0.getKeyCode() == KeyEvent.VK_SPACE) {
				// selectScreen(game);
			}
			// } else if (currentScreen == game) {
			if (arg0.getKeyCode() == KeyEvent.VK_SPACE) {
				selectScreen(end);
			}
		} else if (currentScreen == end) {
			if (arg0.getKeyCode() == KeyEvent.VK_SPACE) {
				selectScreen(menu);
			}
		}
		if (currentScreen == menu) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				selectScreen(ins);
			}
		} else if (currentScreen == ins) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				selectScreen(menu);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
