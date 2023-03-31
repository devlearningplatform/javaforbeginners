
public class TryCatchFinallyDemo {
	public static void main(String param[]) {
		TryCatchFinallyDemo obj = new TryCatchFinallyDemo();
				
		obj.ExceptionDemo();
	}
	
	private void ExceptionDemo() {
		System.out.println("Start of Execution");
		String text = "10abc";
		int num = 0;
		
		Integer num1 = null;
		
		try {
			num = Integer.parseInt(text);
			
			//num = num1 / 0;
			System.out.println("Converted number is " + num);
			
			
		}
		catch(Exception e) {
			System.err.println("General Exception");
		}
		
		finally {
			System.out.println("End of Execution");
		}
		
	}
}
