import java.util.Random;

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
			System.out.println("adding");

		}
		if (operation == 2) {
			madlibs();

		}
		if (operation == 3) {
		random();

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
	
	public static void random() {
		String b = JOptionPane.showInputDialog(null, " name a number. Any number");

		int i = Integer.parseInt(b);

		Random t = new Random();
		int c = t.nextInt(i);
		JOptionPane.showMessageDialog(null, "your random number is " + c);

	}
	public static void madlibs() {
		String adjective = JOptionPane.showInputDialog("Give me a adjective");
		
		String verb =JOptionPane.showInputDialog("Give me a verb present tense");
		
		String dessert = JOptionPane.showInputDialog("Give me a dessert");
		String animal =JOptionPane.showInputDialog("Big or wild animal");
		String place =JOptionPane.showInputDialog("Give me a place");
		
		JOptionPane.showMessageDialog(null,"A "+adjective +" woman was " +verb+ " down the street and wanted to get a " +dessert+" because it was so hot. On her way to buy some " +dessert+ " she saw a " +animal+ " "
				+ "running loose at the "+place+". She ran all the way home");  
	}
}