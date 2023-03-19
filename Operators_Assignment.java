class Operators_Assignment{
	public static void main(String param[]){
		int x = 10;
		int y = 3;
		
		System.out.print(x + " = " + y + " = ");
		x = y;
		System.out.println(x);

		x = 10;
		System.out.print(x + " += " + y + " = ");
		x += y;
		System.out.println(x);

		x = 10;
		System.out.print(x + " -= " + y + " = ");
		x -= y;
		System.out.println(x);

		x = 10;
		System.out.print(x + " *= " + y + " = ");
		x *= y;
		System.out.println(x);

		x = 10;
		System.out.print(x + " /= " + y + " = ");
		x /= y;
		System.out.println(x);

		x = 10;
		System.out.print(x + " %= " + y + " = ");
		x %= y;
		System.out.println(x);
	}
}