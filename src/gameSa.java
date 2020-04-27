
	import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

	import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

	public class gameSa extends Screen {
		Color textColor;
		JLabel label;
		JLabel insLabel;
		JLabel startLabel;
		BufferedImage[] bufferedImages;

		public gameSa(JFrame frame) {
			super(frame);
			backgroundColor = new Color(170, 136, 255);
			textColor = new Color(51, 136, 221);
			label = new JLabel();
			insLabel = new JLabel();
			guessBox = new JTextField(20);
			bufferedImages = new BufferedImage[11];
			bufferedImages[0] = imageS;
			bufferedImages[1] = imageA;
			bufferedImages[2] = imageG;
			bufferedImages[3] = imageI;
			bufferedImages[4] = imageT;
			bufferedImages[5] = imageT;
			bufferedImages[6] = imageA;
			bufferedImages[7] = imageR;
			bufferedImages[8] = imageI;
			bufferedImages[9] = imageU;
			bufferedImages[10] = imageS;
			for (int i = 0; i < bufferedImages.length; i++) {
				Random r = new Random();
				int index1 = r.nextInt(bufferedImages.length);
				int index2 = r.nextInt(bufferedImages.length);
				BufferedImage temp = bufferedImages[index1];
				bufferedImages[index1] = bufferedImages[index2];
				bufferedImages[index2] = temp;
			}
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
			g.drawImage(bufferedImages[0], 15, 155, 70, 70, null);
			g.drawImage(bufferedImages[1], 715, 155, 70, 70, null);
			g.drawImage(bufferedImages[2], 645, 155, 70, 70, null);
			g.drawImage(bufferedImages[3], 575, 155, 70, 70, null);
			g.drawImage(bufferedImages[4], 505, 155, 70, 70, null);
			g.drawImage(bufferedImages[5], 435, 155, 70, 70, null);
			g.drawImage(bufferedImages[6], 365, 155, 70, 70, null);
			g.drawImage(bufferedImages[7], 295, 155, 70, 70, null);
			g.drawImage(bufferedImages[8], 225, 155, 70, 70, null);
			g.drawImage(bufferedImages[9], 155, 155, 70, 70, null);
			g.drawImage(bufferedImages[10], 85, 155, 70, 70, null);
		}
		void clear() {
			this.remove(guessBox);
			this.remove(insLabel);
			this.remove(frame);
		}

	}

