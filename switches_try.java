package ForPract;

import java.util.Scanner;

public class switches_try {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String day;
		
		System.out.print("Day: ");
		day = s.nextLine();
		
		switch(day) {
		
		case "Sunday":System.out.println("It is Sunday!");
		break;
		case "Monday": System.out.println("It is Monday!");
		break;
		case "Tuesday": System.out.println("It is Tuesday!");
		break;
		case "Wednesday": System.out.println("It is Wednesday!");
		break;
		case "Thursday": System.out.println("It is Thursday!");
		break;
		case "Friday": System.out.println("It is Friday!");
		break;
		case "Saturday": System.out.println("It is Saturday!");
		break;
		
		default: System.out.println("That is not a day");
		}
		
		
		
		

	}

}
