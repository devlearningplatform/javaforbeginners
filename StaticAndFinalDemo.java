
public class StaticAndFinalDemo {
	private int i = 10;
	
	public static void main(String param[]) {
		StaticAndFinalDemo obj = new StaticAndFinalDemo();
		
		obj.printText();
	}
	
	private void printText() {
		System.out.println("Text in print text" + i);
		
	}
	
	static {
		System.out.println("Text in static block");
	}
}
