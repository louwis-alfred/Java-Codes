package ForPract;
import java.util.Scanner;
public class while_try {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "";
		
		while (name.isBlank()) {
			System.out.println("Enter your name: ");
			name = s.nextLine();
		}
		System.out.println("Hello there! " + name);
	}

}
