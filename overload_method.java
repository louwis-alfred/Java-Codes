package ForPract;

public class overload_method {

	public static void main(String[] args) {
	
		//Overload methods
		int x = add(3,3,3,4);
		
		System.out.println(x);
		

	}
	
	static int add(int a, int b) {
		System.out.println("Overloaded method #1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("Overloaded method #2");
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("Overloaded method #3");
		return a + b + c + d;
	}

}
