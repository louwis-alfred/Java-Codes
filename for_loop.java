package ForPract;
import java.util.Scanner;
public class for_loop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.print("Rows: ");
		rows = s.nextInt();
		System.out.print("Columns: ");
		columns = s.nextInt();
		System.out.print("Enter Symbol: "); // For symbol
		symbol = s.next();
		
		for (int i = 1; i <= rows; i++) {
			System.out.println();
			for (int j = 1; j <= columns; j++) {
				System.out.print(symbol);
			}
		}
	}
  }

