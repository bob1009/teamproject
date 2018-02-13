import javax.swing.JOptionPane;

public class Menu {
public static void main(String[] args) {
	int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
			JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "do you want a riddle", "do you want to add two numbers?",
					"do you want to do a mad libs", "do you want to generate random number?" },
			null);
	if(operation==0) {System.out.println("riddle");

	
	
	
}
	if(operation==1) {System.out.println("adding");



}
if(operation==2) {System.out.println("mad libs");



}
if(operation==3) {System.out.println("generate numbers ");

	
}
}}