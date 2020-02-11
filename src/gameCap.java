
	import java.awt.Color;
	import java.awt.Font;
	import java.awt.Graphics;

	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;

	public class gameCap extends Screen {
		Color textColor;
		JLabel label;
		JLabel insLabel;
		JLabel startLabel;
		JTextField guessBox;

		public gameCap(JFrame frame) {
			super(frame);
			backgroundColor = new Color(170, 136, 255);
			frame.add(this);
			textColor = new Color(51, 136, 221);
			label = new JLabel();
			insLabel = new JLabel();
			// startLabel = new JLabel();
			guessBox = new JTextField(20);
			this.add(label);
			this.add(insLabel);
			// this.add(startLabel);
			this.add(guessBox);

			// TODO Auto-generated constructor stub
		}

		public void draw() {

			// c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 0;
			this.add(label, c);

			// c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 1;
			this.add(insLabel, c);

			// c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 2;
			// this.add(startLabel, c);
			this.add(guessBox, c);

			frame.add(this);
			// panel.add(inslabel);
			// panel.add(startlabel);
			// panel.add(label);
			this.setBackground(backgroundColor);

			insLabel.setFont(new Font("Serif", Font.PLAIN, 35));
			insLabel.setForeground(textColor);
			insLabel.setText("Unscramble the zodiac sign and type it below.");

			guessBox.setFont(new Font("Serif", Font.PLAIN, 35));
			guessBox.setForeground(textColor);
//				guessBox.setSize(5000, 20);

			this.repaint();
			frame.pack();

		}

		public void paintComponent(Graphics g) {
			g.drawImage(imageC, 645, 155, 70, 70, null);
			g.drawImage(imageA, 575, 155, 70, 70, null);
			g.drawImage(imageP, 505, 155, 70, 70, null);
			g.drawImage(imageR, 435, 155, 70, 70, null);
			g.drawImage(imageI, 365, 155, 70, 70, null);
			g.drawImage(imageC, 295, 155, 70, 70, null);
			g.drawImage(imageO, 225, 155, 70, 70, null);
			g.drawImage(imageR, 155, 155, 70, 70, null);
			g.drawImage(imageN, 85, 155, 70, 70, null);
		}

	}
