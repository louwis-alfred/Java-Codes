package OOP2;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		fruit p = new fruit();
		
		System.out.print("Hello there!");
		
		System.out.print("Fruit: ");
		p.name = s.nextLine();
		
		System.out.print(13.13);
		p.price = s.nextDouble();
		
		System.out.print("How many? ");
		p.quantity = s.nextInt();
		
		System.out.println("So your order is");
		System.out.println("Fruit: " + p.name);
		System.out.println("Price: " + p.price);
		System.out.println("Quantity: " + p.quantity);
		

	}

}
