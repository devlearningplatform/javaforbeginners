class Operators_Logical{
	public static void main(String param[]){
		boolean x = true;
		boolean y = false;
		boolean z = true;

		System.out.print(x + " && " + y + " = ");
		System.out.println(x && y);

		System.out.print(x + " && " + z + " = ");
		System.out.println(x && z);

		System.out.print(x + " || " + y + " = ");
		System.out.println(x || y);

		System.out.print(x + " || " + z + " = ");
		System.out.println(x || z);
	}
}