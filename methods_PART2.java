package ForPract;

public class methods_PART2 {
	
	//Global variable
	static String section = "A";

	public static void main(String[] args) {
			greet("Louwis", 18);
	}
	
	static void greet(String name, int age) {
		print("Hello there! " + name);
		print("you are " + age + " years old");
	}
	
	static void print(String word) {
		System.out.println(word);
	}
	
}