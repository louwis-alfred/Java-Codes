package ForPract;
import java.util.Scanner;
public class Do_While {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String name = "";
		
		do {
			System.out.println("Enter name: ");
			name = s.nextLine();
		}
		
		while(name.isBlank());
		System.out.println("Hi, " + name);
		
	}

}
