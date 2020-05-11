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
	int index = -1;

	private int gameState = MENU;
	JFrame frame;

	Screen menu;
	gameAr gameAr;
	gameT gameT;
	gameG gameG;
	gameCan gameCan;
	gameLe gameLe;
	gameV gameV;
	gameLi gameLi;
	gameSc gameSc;
	gameSa gameSa;
	gameCap gameCap;
	gameAq gameAq;
	gameP gameP;
	Screen end;
	Screen ins;
	Screen currentScreen;
	Screen fail;
	Screen[] signs = new Screen[12];

	public static void main(String[] args) throws Exception {
		new ZodiacScramble().startGame();
	}

	private void startGame() {
		frame = new JFrame("Zodiac Scramble");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);

		gameAr = new gameAr(this);
		gameT = new gameT(frame);
		gameG = new gameG(frame);
		gameCan = new gameCan(frame);
		gameLe = new gameLe(frame);
		gameV = new gameV(frame);
		gameLi = new gameLi(frame);
		gameSc = new gameSc(frame);
		gameSa = new gameSa(frame);
		gameCap = new gameCap(frame);
		gameAq = new gameAq(frame);
		gameP = new gameP(frame);

		signs[0] = gameAr;
		signs[1] = gameT;
		signs[2] = gameG;
		signs[3] = gameCan;
		signs[4] = gameLe;
		signs[5] = gameV;
		signs[6] = gameLi;
		signs[7] = gameSc;
		signs[8] = gameSa;
		signs[9] = gameCap;
		signs[10] = gameAq;
		signs[11] = gameP;

		menu = new MenuScreen(frame);
		end = new EndScreen(frame);
		ins = new Instructions(frame);
		fail = new FailScreen(frame);
		selectScreen(ins);
		selectScreen(menu);
	}

	private void selectScreen(Screen screen) {
		if (currentScreen != null) {
			currentScreen.removeScreen();
		}
		screen.guessBox.setText("");
		currentScreen = screen;
		screen.draw();
		if (screen !=ins&&screen !=menu && screen != end && screen != fail){
			Screen.guessBox.requestFocus();
		}
		System.out.println(currentScreen);
		if (screen == end||screen == fail){
			index=-1;
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
	System.out.println(arg0.getKeyChar());
		// TODO Auto-generated method stub
		// else if (currentScreen == gameV) {
		// if ()

		// }
		if (currentScreen == gameAr) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				if (checkAnswer("aries"))
					selectScreen(gameT);

				else {
					selectScreen(fail);
					gameAr.clear();
					gameT.clear();
					gameG.clear();
					gameCan.clear();
					gameLe.clear();
					gameV.clear();
					gameLi.clear();
					gameSc.clear();
					gameSa.clear();
					gameCap.clear();
					gameAq.clear();
					gameP.clear();
				}
			}
		} else if (currentScreen == gameT) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				if (checkAnswer("taurus"))
					selectScreen(gameG);
				else {
					selectScreen(fail);
					gameAr.clear();
					gameT.clear();
					gameG.clear();
					gameCan.clear();
					gameLe.clear();
					gameV.clear();
					gameLi.clear();
					gameSc.clear();
					gameSa.clear();
					gameCap.clear();
					gameAq.clear();
					gameP.clear();
				}
			}
		} else if (currentScreen == gameG) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				if (checkAnswer("gemini"))
					selectScreen(gameCan);
				else {
					selectScreen(fail);
					gameAr.clear();
					gameT.clear();
					gameG.clear();
					gameCan.clear();
					gameLe.clear();
					gameV.clear();
					gameLi.clear();
					gameSc.clear();
					gameSa.clear();
					gameCap.clear();
					gameAq.clear();
					gameP.clear();
				}
			}
		} else if (currentScreen == gameCan) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				if (checkAnswer("cancer"))
					selectScreen(gameLe);
				else {
					selectScreen(fail);
					gameAr.clear();
					gameT.clear();
					gameG.clear();
					gameCan.clear();
					gameLe.clear();
					gameV.clear();
					gameLi.clear();
					gameSc.clear();
					gameSa.clear();
					gameCap.clear();
					gameAq.clear();
					gameP.clear();
				}
			}
		} else if (currentScreen == gameLe) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				if (checkAnswer("leo"))
					selectScreen(gameV);
				else {
					selectScreen(fail);
					gameAr.clear();
					gameT.clear();
					gameG.clear();
					gameCan.clear();
					gameLe.clear();
					gameV.clear();
					gameLi.clear();
					gameSc.clear();
					gameSa.clear();
					gameCap.clear();
					gameAq.clear();
					gameP.clear();
				}
			}
		} else if (currentScreen == gameV) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				if (checkAnswer("virgo"))
					selectScreen(gameLi);
				else {
					selectScreen(fail);
					gameAr.clear();
					gameT.clear();
					gameG.clear();
					gameCan.clear();
					gameLe.clear();
					gameV.clear();
					gameLi.clear();
					gameSc.clear();
					gameSa.clear();
					gameCap.clear();
					gameAq.clear();
					gameP.clear();
				}
			}
		} else if (currentScreen == gameLi) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				if (checkAnswer("libra"))
					selectScreen(gameSc);
				else {
					selectScreen(fail);
					gameAr.clear();
					gameT.clear();
					gameG.clear();
					gameCan.clear();
					gameLe.clear();
					gameV.clear();
					gameLi.clear();
					gameSc.clear();
					gameSa.clear();
					gameCap.clear();
					gameAq.clear();
					gameP.clear();
				}
			}
		} else if (currentScreen == gameSc) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				if (checkAnswer("scorpio"))
					selectScreen(gameSa);
				else {
					selectScreen(fail);
					gameAr.clear();
					gameT.clear();
					gameG.clear();
					gameCan.clear();
					gameLe.clear();
					gameV.clear();
					gameLi.clear();
					gameSc.clear();
					gameSa.clear();
					gameCap.clear();
					gameAq.clear();
					gameP.clear();
				}
			}
		} else if (currentScreen == gameSa) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				if (checkAnswer("sagittarius"))
					selectScreen(gameCap);
				else {
					selectScreen(fail);
					gameAr.clear();
					gameT.clear();
					gameG.clear();
					gameCan.clear();
					gameLe.clear();
					gameV.clear();
					gameLi.clear();
					gameSc.clear();
					gameSa.clear();
					gameCap.clear();
					gameAq.clear();
					gameP.clear();
				}
			}
		} else if (currentScreen == gameCap) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				if (checkAnswer("capricorn"))
					selectScreen(gameAq);
				else {
					selectScreen(fail);
					gameAr.clear();
					gameT.clear();
					gameG.clear();
					gameCan.clear();
					gameLe.clear();
					gameV.clear();
					gameLi.clear();
					gameSc.clear();
					gameSa.clear();
					gameCap.clear();
					gameAq.clear();
					gameP.clear();
				}
			}
		} else if (currentScreen == gameAq) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				if (checkAnswer("aquarius"))
					selectScreen(gameP);
				else {
					selectScreen(fail);
					gameAr.clear();
					gameT.clear();
					gameG.clear();
					gameCan.clear();
					gameLe.clear();
					gameV.clear();
					gameLi.clear();
					gameSc.clear();
					gameSa.clear();
					gameCap.clear();
					gameAq.clear();
					gameP.clear();
				}
			}
		} else if (currentScreen == gameP) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				if (checkAnswer("pisces"))
					selectScreen(end);
				else {
					selectScreen(fail);
					gameAr.clear();
					gameT.clear();
					gameG.clear();
					gameCan.clear();
					gameLe.clear();
					gameV.clear();
					gameLi.clear();
					gameSc.clear();
					gameSa.clear();
					gameCap.clear();
					gameAq.clear();
					gameP.clear();
				}
			}
		} else if (currentScreen == ins) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				selectScreen(menu);
			}
		} else if (currentScreen == menu) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				selectScreen(ins);
			}
			if (arg0.getKeyCode() == KeyEvent.VK_SPACE) {
				index++;
				System.out.println(index);
				selectScreen(signs[index]);
			}
		} else if (currentScreen == fail) {
			if (arg0.getKeyCode() == KeyEvent.VK_SPACE) {
				selectScreen(menu);
			} else {
				if (arg0.getKeyCode() == KeyEvent.VK_SPACE) {
					index++;
					System.out.println(index);
					selectScreen(signs[index]);
				}
			}
		} else if (currentScreen == end) {
			if (arg0.getKeyCode() == KeyEvent.VK_SPACE) {
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

	public boolean checkAnswer(String correct) {
		String answer = gameAr.getTextBox();
		System.out.println(answer);
		if (answer.equals(correct)) {
			return true;
		} else {
			return false;
		}
	}

}
