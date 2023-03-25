
public class ChildClass extends ParentClass{
	private int perimeter;
	
	public ChildClass() {
		perimeter = 0;
		calculate_permiter();
	}
	
	private void calculate_permiter() {
		perimeter = side_a + side_b + side_c;
	}
	
	public int getPerimeter() {
		return perimeter;
	}
}
