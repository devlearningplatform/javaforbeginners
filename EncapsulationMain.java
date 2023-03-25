
public class EncapsulationMain {

	public static void main(String[] args) {
		EncapsulationConstants enc_const = new EncapsulationConstants();
		
		int perimeter = 0;
		perimeter = enc_const.getLength_side_a() + enc_const.getLength_side_b() + enc_const.getLength_side_c();
		
		System.out.println("Perimeter of triangle = " + perimeter);

	}

}
