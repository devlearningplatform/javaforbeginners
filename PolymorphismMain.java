
public class PolymorphismMain {
	public static void main(String param[]) {
		PolymorphismParent parent = new PolymorphismParent();
		PolymorphismParent child = new PolymorphismChild();
		
		parent.PrintGreetings();
		child.PrintGreetings();
	}
}
