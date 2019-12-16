import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class TypingTutor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TypingTutor() {
		// text label
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel description = new JLabel(
				"<html>Type some text using your keyboard. The keys you press will be highlighted and the test will be displayed.<br>"
						+ "Note: Clicking the buttons with your mouse will not perform any action.</html>");
		panel.add(description);
		panel.setBorder(new EmptyBorder(0, 15, 0, 0));
		add(panel, BorderLayout.NORTH);

		// Row 1
		JPanel Keyboard_Row1 = new JPanel();
		Keyboard_Row1.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		JButton btn = new JButton("~");
		Keyboard_Row1.add(btn);
		JButton one = new JButton("1");
		Keyboard_Row1.add(one);
		JButton two = new JButton("2");
		Keyboard_Row1.add(two);
		JButton three = new JButton("3");
		Keyboard_Row1.add(three);
		JButton four = new JButton("4");
		Keyboard_Row1.add(four);
		JButton five = new JButton("5");
		Keyboard_Row1.add(five);
		JButton six = new JButton("6");
		Keyboard_Row1.add(six);
		JButton seven = new JButton("7");
		Keyboard_Row1.add(seven);
		JButton eight = new JButton("8");
		Keyboard_Row1.add(eight);
		JButton nine = new JButton("9");
		Keyboard_Row1.add(nine);
		JButton zero = new JButton("0");
		Keyboard_Row1.add(zero);
		JButton minus = new JButton("-");
		Keyboard_Row1.add(minus);
		JButton plus = new JButton("+");
		Keyboard_Row1.add(plus);
		JButton Backspace = new JButton("Backspace");
		Keyboard_Row1.add(Backspace);

		// Row 2
		JPanel Keyboard_Row2 = new JPanel();
		Keyboard_Row2.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		JButton Tab = new JButton("Tab");
		Keyboard_Row2.add(Tab);
		JButton Q = new JButton("Q");
		Keyboard_Row2.add(Q);
		JButton W = new JButton("W");
		Keyboard_Row2.add(W);
		JButton E = new JButton("E");
		Keyboard_Row2.add(E);
		JButton R = new JButton("R");
		Keyboard_Row2.add(R);
		JButton T = new JButton("T");
		Keyboard_Row2.add(T);
		JButton Y = new JButton("Y");
		Keyboard_Row2.add(Y);
		JButton U = new JButton("U");
		Keyboard_Row2.add(U);
		JButton I = new JButton("I");
		Keyboard_Row2.add(I);
		JButton O = new JButton("O");
		Keyboard_Row2.add(O);
		JButton P = new JButton("P");
		Keyboard_Row2.add(P);
		JButton squareBracket1 = new JButton("[");
		Keyboard_Row2.add(squareBracket1);
		JButton squareBracket2 = new JButton("]");
		Keyboard_Row2.add(squareBracket2);
		JButton Backslash = new JButton("\\");
		Keyboard_Row2.add(Backslash);

		// Row 3
		JPanel Keyboard_Row3 = new JPanel();
		Keyboard_Row3.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		JButton Caps = new JButton("Caps");
		Keyboard_Row3.add(Caps);
		// if caps lock is on upon start
		if (Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
			Caps.setBackground(Color.GREEN);
		}
		JButton A = new JButton("A");
		Keyboard_Row3.add(A);
		JButton S = new JButton("S");
		Keyboard_Row3.add(S);
		JButton D = new JButton("D");
		Keyboard_Row3.add(D);
		JButton F = new JButton("F");
		Keyboard_Row3.add(F);
		JButton G = new JButton("G");
		Keyboard_Row3.add(G);
		JButton H = new JButton("H");
		Keyboard_Row3.add(H);
		JButton J = new JButton("J");
		Keyboard_Row3.add(J);
		JButton K = new JButton("K");
		Keyboard_Row3.add(K);
		JButton L = new JButton("L");
		Keyboard_Row3.add(L);
		JButton semiColon = new JButton(";");
		Keyboard_Row3.add(semiColon);
		JButton quotation = new JButton("\"");
		Keyboard_Row3.add(quotation);
		JButton Enter = new JButton("Enter ");
		Keyboard_Row3.add(Enter);

		// Row 4
		JPanel Keyboard_Row4 = new JPanel();
		Keyboard_Row4.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		JButton Shift = new JButton("Shift");
		Keyboard_Row4.add(Shift);
		JButton Z = new JButton("Z");
		Keyboard_Row4.add(Z);
		JButton X = new JButton("X");
		Keyboard_Row4.add(X);
		JButton C = new JButton("C");
		Keyboard_Row4.add(C);
		JButton V = new JButton("V");
		Keyboard_Row4.add(V);
		JButton B = new JButton("B");
		Keyboard_Row4.add(B);
		JButton N = new JButton("N");
		Keyboard_Row4.add(N);
		JButton M = new JButton("M");
		Keyboard_Row4.add(M);
		JButton comma = new JButton(",");
		Keyboard_Row4.add(comma);
		JButton period = new JButton(".");
		Keyboard_Row4.add(period);
		JButton questionMark = new JButton("?");
		Keyboard_Row4.add(questionMark);
		Keyboard_Row4.add(Box.createRigidArea(new Dimension(25, 0)));
		JButton upArrow = new JButton("â†‘");
		Keyboard_Row4.add(upArrow);

		// Row 5
		JPanel Keyboard_Row5 = new JPanel();
		Keyboard_Row5.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		Keyboard_Row5.add(Box.createRigidArea(new Dimension(200, 0)));
		JButton Space = new JButton("");
		Keyboard_Row5.add(Space);
		Keyboard_Row5.add(Box.createRigidArea(new Dimension(75, 0)));
		JButton leftArrow = new JButton("â†�");
		Keyboard_Row5.add(leftArrow);
		JButton downArrow = new JButton("â†“");
		Keyboard_Row5.add(downArrow);
		JButton rightArrow = new JButton("â†’");
		Keyboard_Row5.add(rightArrow);
		
		// Keyboard
		JPanel Keyboard = new JPanel();
		Keyboard.setLayout(new GridLayout(5, 1));
		Keyboard.setBorder(new EmptyBorder(10, 18, 10, 10));
		Keyboard.add(Keyboard_Row1);
		Keyboard.add(Keyboard_Row2);
		Keyboard.add(Keyboard_Row3);
		Keyboard.add(Keyboard_Row4);
		Keyboard.add(Keyboard_Row5);

		// text area
		JPanel textPanel = new JPanel();
		JTextArea textArea = new JTextArea();
		textArea.setColumns(68);
		textArea.setRows(20);
		textArea.setLineWrap(true);
		textArea.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
			System.out.print(e.getKeyCode());
				if (e.getKeyChar() == '~') {
					btn.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '1') {
					one.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '2') {
					two.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '3') {
					three.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '4') {
					four.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '5') {
					five.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '6') {
					six.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '7') {
					seven.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '8') {
					eight.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '9') {
					nine.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '0') {
					zero.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '-') {
					minus.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '+') {
					plus.setBackground(Color.GREEN);
				}
				if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
					Backspace.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == KeyEvent.VK_TAB) {
					Tab.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'q' || e.getKeyChar() == 'Q') {
					Q.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'w' || e.getKeyChar() == 'W') {
					W.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'e' || e.getKeyChar() == 'E') {
					E.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'r' || e.getKeyChar() == 'R') {
					R.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 't' || e.getKeyChar() == 'T') {
					T.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'y' || e.getKeyChar() == 'Y') {
					Y.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'u' || e.getKeyChar() == 'U') {
					U.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'i' || e.getKeyChar() == 'I') {
					I.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'o' || e.getKeyChar() == 'O') {
					O.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'p' || e.getKeyChar() == 'P') {
					P.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '[') {
					squareBracket1.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == ']') {
					squareBracket2.setBackground(Color.GREEN);
				}
				if (e.getKeyCode() == '\\') {
					Backslash.setBackground(Color.GREEN);
				}
				if (e.getKeyCode() == KeyEvent.VK_CAPS_LOCK) {
					if (!Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
						Caps.setBackground(null);
					} else {
						Caps.setBackground(Color.GREEN);
					}
				}
				if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
					A.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 's' || e.getKeyChar() == 'S') {
					S.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'd' || e.getKeyChar() == 'D') {
					D.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'f' || e.getKeyChar() == 'F') {
					F.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'g' || e.getKeyChar() == 'G') {
					G.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'h' || e.getKeyChar() == 'H') {
					H.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'j' || e.getKeyChar() == 'J') {
					J.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'k' || e.getKeyChar() == 'K') {
					K.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'l' || e.getKeyChar() == 'L') {
					L.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == ';') {
					semiColon.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '"') {
					quotation.setBackground(Color.GREEN);
				}
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					Enter.setBackground(Color.GREEN);
				}
				if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
					Shift.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'z' || e.getKeyChar() == 'Z') {
					Z.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'x' || e.getKeyChar() == 'X') {
					X.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
					C.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'v' || e.getKeyChar() == 'V') {
					V.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'b' || e.getKeyChar() == 'B') {
					B.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'n' || e.getKeyChar() == 'N') {
					N.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == 'm' || e.getKeyChar() == 'M') {
					M.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == ',') {
					comma.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '.') {
					period.setBackground(Color.GREEN);
				}
				if (e.getKeyChar() == '?') {
					questionMark.setBackground(Color.GREEN);
				}
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					upArrow.setBackground(Color.GREEN);
				}
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					Space.setBackground(Color.GREEN);
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					leftArrow.setBackground(Color.GREEN);
				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					downArrow.setBackground(Color.GREEN);
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					rightArrow.setBackground(Color.GREEN);
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyChar() == '~') {
					btn.setBackground(null);
				}
				if (e.getKeyChar() == '1') {
					one.setBackground(null);
				}
				if (e.getKeyChar() == '2') {
					two.setBackground(null);
				}
				if (e.getKeyChar() == '3') {
					three.setBackground(null);
				}
				if (e.getKeyChar() == '4') {
					four.setBackground(null);
				}
				if (e.getKeyChar() == '5') {
					five.setBackground(null);
				}
				if (e.getKeyChar() == '6') {
					six.setBackground(null);
				}
				if (e.getKeyChar() == '7') {
					seven.setBackground(null);
				}
				if (e.getKeyChar() == '8') {
					eight.setBackground(null);
				}
				if (e.getKeyChar() == '9') {
					nine.setBackground(null);
				}
				if (e.getKeyChar() == '0') {
					zero.setBackground(null);
				}
				if (e.getKeyChar() == '-') {
					minus.setBackground(null);
				}
				if (e.getKeyChar() == '+') {
					plus.setBackground(null);
				}
				if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
					Backspace.setBackground(null);
				}
				if (e.getKeyChar() == KeyEvent.VK_TAB) {
					Tab.setBackground(null);
				}
				if (e.getKeyChar() == 'q' || e.getKeyChar() == 'Q') {
					Q.setBackground(null);
				}
				if (e.getKeyChar() == 'w' || e.getKeyChar() == 'W') {
					W.setBackground(null);
				}
				if (e.getKeyChar() == 'e' || e.getKeyChar() == 'E') {
					E.setBackground(null);
				}
				if (e.getKeyChar() == 'r' || e.getKeyChar() == 'R') {
					R.setBackground(null);
				}
				if (e.getKeyChar() == 't' || e.getKeyChar() == 'T') {
					T.setBackground(null);
				}
				if (e.getKeyChar() == 'y' || e.getKeyChar() == 'Y') {
					Y.setBackground(null);
				}
				if (e.getKeyChar() == 'u' || e.getKeyChar() == 'U') {
					U.setBackground(null);
				}
				if (e.getKeyChar() == 'i' || e.getKeyChar() == 'I') {
					I.setBackground(null);
				}
				if (e.getKeyChar() == 'o' || e.getKeyChar() == 'O') {
					O.setBackground(null);
				}
				if (e.getKeyChar() == 'p' || e.getKeyChar() == 'P') {
					P.setBackground(null);
				}
				if (e.getKeyChar() == '[') {
					squareBracket1.setBackground(null);
				}
				if (e.getKeyChar() == ']') {
					squareBracket2.setBackground(null);
				}
				if (e.getKeyCode() == '\\') {
					Backslash.setBackground(null);
				}
				if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
					A.setBackground(null);
				}
				if (e.getKeyChar() == 's' || e.getKeyChar() == 'S') {
					S.setBackground(null);
				}
				if (e.getKeyChar() == 'd' || e.getKeyChar() == 'D') {
					D.setBackground(null);
				}
				if (e.getKeyChar() == 'f' || e.getKeyChar() == 'F') {
					F.setBackground(null);
				}
				if (e.getKeyChar() == 'g' || e.getKeyChar() == 'G') {
					G.setBackground(null);
				}
				if (e.getKeyChar() == 'h' || e.getKeyChar() == 'H') {
					H.setBackground(null);
				}
				if (e.getKeyChar() == 'j' || e.getKeyChar() == 'J') {
					J.setBackground(null);
				}
				if (e.getKeyChar() == 'k' || e.getKeyChar() == 'K') {
					K.setBackground(null);
				}
				if (e.getKeyChar() == 'l' || e.getKeyChar() == 'L') {
					L.setBackground(null);
				}
				if (e.getKeyChar() == ';') {
					semiColon.setBackground(null);
				}
				if (e.getKeyChar() == '"') {
					quotation.setBackground(null);
				}
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					Enter.setBackground(null);
				}
				if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
					Shift.setBackground(null);
				}
				if (e.getKeyChar() == 'z' || e.getKeyChar() == 'Z') {
					Z.setBackground(null);
				}
				if (e.getKeyChar() == 'x' || e.getKeyChar() == 'X') {
					X.setBackground(null);
				}
				if (e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
					C.setBackground(null);
				}
				if (e.getKeyChar() == 'v' || e.getKeyChar() == 'V') {
					V.setBackground(null);
				}
				if (e.getKeyChar() == 'b' || e.getKeyChar() == 'B') {
					B.setBackground(null);
				}
				if (e.getKeyChar() == 'n' || e.getKeyChar() == 'N') {
					N.setBackground(null);
				}
				if (e.getKeyChar() == 'm' || e.getKeyChar() == 'M') {
					M.setBackground(null);
				}
				if (e.getKeyChar() == ',') {
					comma.setBackground(null);
				}
				if (e.getKeyChar() == '.') {
					period.setBackground(null);
				}
				if (e.getKeyChar() == '?') {
					questionMark.setBackground(null);
				}
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					upArrow.setBackground(null);
				}
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					Space.setBackground(null);
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					leftArrow.setBackground(null);
				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					downArrow.setBackground(null);
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					rightArrow.setBackground(null);
				}
			}
		});
		textPanel.add(textArea);
		add(textPanel, BorderLayout.CENTER);

		// format all buttons
		JPanel array[] = { Keyboard_Row1, Keyboard_Row2, Keyboard_Row3, Keyboard_Row4, Keyboard_Row5 };
		for (int n = 0; n < array.length; n++) {
			Component[] component = array[n].getComponents();
			for (int i = 0; i < component.length; i++) {
				if (component[i] instanceof JButton) {
					JButton button = (JButton) component[i];
					button.setPreferredSize(new Dimension(50, 50));
				}
			}
		}
		Backspace.setPreferredSize(new Dimension(100, 50));
		Tab.setPreferredSize(new Dimension(75, 50));
		Caps.setPreferredSize(new Dimension(75, 50));
		Enter.setPreferredSize(new Dimension(100, 50));
		Shift.setPreferredSize(new Dimension(100, 50));
		Space.setPreferredSize(new Dimension(300, 50));

		add(Keyboard, BorderLayout.SOUTH);
	}

	public static void main(String args[]) {
		JFrame frame = new TypingTutor();
		frame.setTitle("Typing Tutor");
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

}