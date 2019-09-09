import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ZodiacScramble2 {
	JFrame jf1;
	JPanel jp1;
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 750;

	public static void main(String[] args) {
		ZodiacScramble2 zs = new ZodiacScramble2();
		zs.setup();
	}

	public ZodiacScramble2() {
		jf1 = new JFrame();
		jp1 = new JPanel();
	}

	private void setup() {
		jf1.add(jp1);
		jf1.setVisible(true);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf1.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		jf1.pack();
	}
}
