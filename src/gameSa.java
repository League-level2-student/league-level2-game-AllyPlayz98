
	import java.awt.Color;
	import java.awt.Font;
	import java.awt.Graphics;

	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;

	public class gameSa extends Screen {
		Color textColor;
		JLabel label;
		JLabel insLabel;
		JLabel startLabel;

		public gameSa(JFrame frame) {
			super(frame);
			backgroundColor = new Color(170, 136, 255);
			textColor = new Color(51, 136, 221);
			label = new JLabel();
			insLabel = new JLabel();
			guessBox = new JTextField(20);
			// startLabel = new JLabel();
			this.add(label);
			this.add(insLabel);
			// this.add(startLabel);
			//this.add(guessBox);

			// TODO Auto-generated constructor stub
		}

		public boolean checkBox() {
			return false;

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
//			guessBox.setSize(5000, 20);

			this.repaint();
			frame.pack();

		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(imageS, 15, 155, 70, 70, null);
			g.drawImage(imageA, 715, 155, 70, 70, null);
			g.drawImage(imageG, 645, 155, 70, 70, null);
			g.drawImage(imageI, 575, 155, 70, 70, null);
			g.drawImage(imageT, 505, 155, 70, 70, null);
			g.drawImage(imageT, 435, 155, 70, 70, null);
			g.drawImage(imageA, 365, 155, 70, 70, null);
			g.drawImage(imageR, 295, 155, 70, 70, null);
			g.drawImage(imageI, 225, 155, 70, 70, null);
			g.drawImage(imageU, 155, 155, 70, 70, null);
			g.drawImage(imageS, 85, 155, 70, 70, null);
		}
		void clear() {
			this.remove(guessBox);
			this.remove(insLabel);
			this.remove(frame);
		}

	}

