package ForPract;
import java.util.Scanner;
public class if_else_GameQuit {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String response;
		
		System.out.print("You want to continue? Yes or No:");
		response = s.nextLine();
		
		if (!response.equals("No") && !response.equals("no")) {
			System.out.println("Get ready for next round");
		}
		else {
			System.out.println("Bye!");
		}

	}

}
