import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class MultipleScenes{
	static JFrame frame;
	
	//timer
	static int timerCounter = 0;
	static JLabel timerCounterLabel = new JLabel();
	static JLabel timerTookLabel = new JLabel();

	static Timer timer = new Timer(1000, new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			timerCounter++;
			timerCounterLabel.setText("(Timer: " + String.valueOf(timerCounter) + "s)");
		};
	});

	static public void resetCounter() {
		timerTookLabel.setText("(Took: " + String.valueOf(timerCounter) + "s)");
		timerCounterLabel.setText("(Timer: 0s)");
		timerCounter = 0;
	};
	static JPanel timePanel = new JPanel();	

	public static void main(String args[]) {
		timePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		timePanel.add(timerCounterLabel);
		timePanel.add(timerTookLabel);
		timer.start();
		
		frame1();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

	private static void frame1() {
		frame = new JFrame("Exam - Panel 1");
		JButton button = new JButton("To Panel 2");

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.add(button, FlowLayout.LEFT);
		panel.setBorder(new EmptyBorder(0, 15, 15, 15));
		frame.add(panel, BorderLayout.CENTER);
		
		resetCounter();
		frame.add(timePanel, BorderLayout.SOUTH);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2();
			}

		});

	}

	private static void frame2() {
		frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JButton button = new JButton("To Panel 3");

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.add(button);
		panel.setBorder(new EmptyBorder(0, 15, 15, 15));

		frame.add(panel, BorderLayout.CENTER);
		frame.setTitle("Exam - Panel 2");
		
		resetCounter();
		frame.add(timePanel, BorderLayout.SOUTH);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3();
			}

		});
	}

	private static void frame3() {
		frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JButton button = new JButton("To Panel 4");

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.add(button);
		panel.setBorder(new EmptyBorder(0, 15, 15, 15));

		frame.add(panel, BorderLayout.CENTER);
		frame.setTitle("Exam - Panel 3");

		resetCounter();
		frame.add(timePanel, BorderLayout.SOUTH);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame4();
			}

		});
	}

	private static void frame4() {
		frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		JButton button = new JButton("Done!");

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.add(button);
		panel.setBorder(new EmptyBorder(0, 15, 15, 15));

		frame.add(panel, BorderLayout.CENTER);
		frame.setTitle("Exam - Panel 4");
		
		resetCounter();
		frame.add(timePanel, BorderLayout.SOUTH);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}

		});
	}
}