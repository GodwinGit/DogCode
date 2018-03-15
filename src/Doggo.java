import javax.swing.JOptionPane;

public class Doggo {

	public static void main(String[] args) {

		/*
		 * 
		 * System.exit.(0); System.out.println("Wheres your dog? "); Scanner
		 * scan = new
		 * 
		 * Scanner(System.in); int num = scan.nextInt(); myMethod(num);
		 */

		String input = JOptionPane.showInputDialog(null, "wheres your dog?");

		int input2 = Integer.parseInt(input);

		myMethod(input2);

	}

	public static void myMethod(int input2) {
		String type1 = "yu";
		String type2 = "nd";
		String type3 = "rd";
		String type4 = "st";

		// int counter = 0;

		int[] s = new int[100];

		for (int i = 0; i < 100; i++) {

			s[i] = i + 1;

			// System.out.println(s[i]);

		}
		

		for (int i = 0; i < 100; i++) {
			if (i + 1 != input2){
				
		}
			if (s[i] != 10)

		  if (i + 1 != input2) {
				
				System.out.println(s[i] + type2);

			}

			else if (input2 % 10 == 0) {

				System.out.println(s[i] + type1);

			}

			else if  (input2 % 10 == 1) {

				System.out.println(s[i] + type3);

			}

			else if (input2 % 10 == 2) {

				System.out.println(s[i] + type4);

			/*}
			else{ 
				System.out.println(s[i] + type4);  
			}*/
	}

		}
}
}

	

