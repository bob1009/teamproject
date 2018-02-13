import javax.swing.JOptionPane;

public class Menu {
	public static void main(String[] args) {
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "do you want a riddle", "do you want to add two numbers?",
						"do you want to do a mad libs", "do you want to generate random number?" },
				null);
		if (operation == 0) {
			riddler();
		}
		if (operation == 1) {

			add();
		}
		if (operation == 2) {
			System.out.println("mad libs");

		}
		if (operation == 3) {
			System.out.println("generate numbers ");

		}
	}

	public static void riddler() {
		String riddle = JOptionPane.showInputDialog(
				"I am taken from a mine and shut up in a wooden case, from which i am never released, and yet i am used by almost everybody. what am i?");
		if (riddle.equals("pencil lead")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		} else {
			JOptionPane.showMessageDialog(null, "you are wrong");
		}
	}

	public static void add() {
		String z = JOptionPane.showInputDialog("type in 1 number to add");
		String p = JOptionPane.showInputDialog("type in 1 number to add");
		int s = Integer.parseInt(z);
		int j = Integer.parseInt(p);
		JOptionPane.showMessageDialog(null, s + "+" + j + "=" + (s + j));
	}

}
