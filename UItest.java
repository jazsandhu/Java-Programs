import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UItest{
	static JFrame frame;

	public static void main(String args[]) {
		frame = new JFrame("Colour Game");
		frame1();
		frame.setSize(700, 350);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

	private static void frame1() {
		JButton button = new JButton("Start");
		button.setPreferredSize(new Dimension(600, 70));
		JLabel welcome = new JLabel(
				"<html><div style='text-align: center'><strong><font size='6'>WELCOME</font></strong><br>"
						+ "<strong><font size='5'>to the</font></strong><br>"
						+ "<strong><font color=red size='6'>Colour Game</font></strong></html>");
		JLabel description = new JLabel("<html> > Choose the colour of the provided items < </div></html>");

		JPanel northPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		JPanel southPanel = new JPanel();
		southPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
		northPanel.add(welcome);
		centerPanel.add(Box.createRigidArea(new Dimension(0, 200)));
		centerPanel.add(description);
		southPanel.add(button);

		frame.getContentPane().removeAll();
		frame.repaint();
		frame.add(northPanel, BorderLayout.NORTH);
		frame.add(centerPanel, BorderLayout.CENTER);
		frame.add(southPanel, BorderLayout.SOUTH);
		frame.setVisible(true);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                frame.getContentPane().remove(welcome);
				frame2();
			}
		});
	}

	private static void frame2() {
		JButton button1 = new JButton("Pink");
		button1.setPreferredSize(new Dimension(200, 70));
		JButton button2 = new JButton("Blue");
		button2.setPreferredSize(new Dimension(200, 70));
		JButton button3 = new JButton("Brown");
		button3.setPreferredSize(new Dimension(200, 70));
		JLabel facebookLogo = new JLabel("<html><div style='text-align: center'><strong><font size='6'>Facebook Logo</font></strong></div></html>");

		JPanel northPanel = new JPanel();
		JPanel southPanel = new JPanel();
		northPanel.setBorder(BorderFactory.createEmptyBorder(80, 0, 0, 0));
		southPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 80, 0));
		northPanel.add(facebookLogo);
		southPanel.add(button1);
		southPanel.add(button2);
		southPanel.add(button3);

		frame.getContentPane().removeAll();
		frame.repaint();
		frame.add(northPanel, BorderLayout.NORTH);
		frame.add(southPanel, BorderLayout.SOUTH);
		frame.setVisible(true);

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3();
			}
		});
	}

	private static void frame3() {
		JButton button1 = new JButton();
		button1.setPreferredSize(new Dimension(200, 70));
		button1.setBackground(Color.BLACK);
		button1.setOpaque(true);
		JButton button2 = new JButton();
		button2.setPreferredSize(new Dimension(200, 70));
		button2.setBackground(Color.GREEN);
		button2.setOpaque(true);
		JButton button3 = new JButton();
		button3.setPreferredSize(new Dimension(200, 70));
		button3.setBackground(Color.RED);
		button3.setOpaque(true);
		JLabel tomato = new JLabel("<html><div style='text-align: center'><strong><font size='6'>Tomato</font></strong></div></html>");

		JPanel northPanel = new JPanel();
		JPanel southPanel = new JPanel();
		northPanel.setBorder(BorderFactory.createEmptyBorder(80, 0, 0, 0));
		southPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 80, 0));
		northPanel.add(tomato);
		southPanel.add(button1);
		southPanel.add(button2);
		southPanel.add(button3);

		frame.getContentPane().removeAll();
		frame.repaint();
		frame.add(northPanel, BorderLayout.NORTH);
		frame.add(southPanel, BorderLayout.SOUTH);
		frame.setVisible(true);

		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame4();
			}
		});
	}

	private static void frame4() {
		JLabel done = new JLabel("<html><div style='text-align: center'><strong><font size='6'>Congrats! You just completed!</font></strong></div></html>");
		JButton restart = new JButton("Resart");
		restart.setPreferredSize(new Dimension(200, 70));
		
		JPanel northPanel = new JPanel();
		JPanel southPanel = new JPanel();
		northPanel.setBorder(BorderFactory.createEmptyBorder(100, 0, 0, 0));
		southPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
		northPanel.add(done);
		southPanel.add(restart);

		frame.getContentPane().removeAll();
		frame.repaint();
		frame.add(northPanel, BorderLayout.NORTH);
		frame.add(southPanel, BorderLayout.SOUTH);
		frame.setVisible(true);

		restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1();
			}
		});
	}
}