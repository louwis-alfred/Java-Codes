package ForPract;

public class return_method {
	
	public static void main(String[] args) {
			int sum = add(5,2);
			System.out.println(sum);
	}
	
	static int add(int num1 , int num2) {
		return num1 + num2;
	}
	static int subtract(int num1 , int num2) {
		return num1 - num2;
	}
	static int multiply(int num1 , int num2) {
		return num1 * num2;
	}

}
