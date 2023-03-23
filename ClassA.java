import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) {
		ClassB obj = new ClassB();
		
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

}
