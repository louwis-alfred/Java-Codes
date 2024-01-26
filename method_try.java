package ForPract;
import java.util.Scanner;
public class method_try {

	public static void main(String[] args) {
		// method a block of code that is executed whenever it is called upon
		Scanner s = new Scanner(System.in);
		String name = "";
		
		while(name.isBlank()) {
			System.out.println("Enter your name: ");
			name = s.nextLine();
		}
		
		hello(name);
		
	}
	
     static void hello(String name) {
		System.out.println("Hello! " + name);
	}
 
}
