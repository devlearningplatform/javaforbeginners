
public class ClassB {
	private int result;
	
	public ClassB() {
		result = 0;
	}
	
	public int add(int value1, int value2) {
		result = value1 + value2;
		
		return result;
	}
	
	public int subtract(int value1, int value2) {
		result = value1 - value2;
		
		return result;
	}
}
