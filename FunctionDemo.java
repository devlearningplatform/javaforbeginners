import java.util.Scanner;

/* 
 * In this program we will input 2 integer values from user
 * will pass these values to 2 different functions to perform addition and subtraction
 * will get the result back from functions and will print it in our main function
*/

public class FunctionDemo {
	public static void main(String param[]) {
		FunctionDemo obj = new FunctionDemo();
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		
		result = obj.add(value1, value2);
		System.out.println("Result of addition = " + result);
		
		result = obj.subtract(value1, value2);
		System.out.println("Result of subtraction = " + result);
		sc.close();
	}
	
	public int add(int value1, int value2) {
		int result = 0;
		result = value1 + value2;
		
		return result;
	}
	
	public int subtract(int value1, int value2) {
		int result = 0;
		result = value1 - value2;
		
		return result;
	}
}
