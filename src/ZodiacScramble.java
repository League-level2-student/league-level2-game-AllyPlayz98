
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
	static final int GAME = 1;
	static final int END = 2;
	static final int INS = 3;
	static final int NUM_STATES = 4;

	private int gameState = MENU;
	JFrame frame;

	Screen menu;
	Screen game;
	Screen end;
	Screen ins;
	Screen currentScreen;

	public static void main(String[] args) throws Exception {
		new ZodiacScramble().startGame();
	}

	private void startGame() {
		frame = new JFrame("Zodiac Scramble");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);

		menu = new MenuScreen(frame);
		game = new GameScreen(frame);
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
				selectScreen(game);
			}
		}

		if (currentScreen == end) {
			if (arg0.getKeyCode() == KeyEvent.VK_SPACE) {
				selectScreen(menu);
			}
		}
		if (currentScreen == menu) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				selectScreen(ins);
			}
		}
		if (currentScreen == ins) {
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
