class Conditions_Demo{
	public static void main(String param[]){
		int score = 89;
		
		if(score >= 90){
			System.out.println("Your grade is A+");
		}

		if(score < 90 && score >= 80){
			System.out.println("Your grade is A");
		}

		if(score < 80 && score >= 60){
			System.out.println("Your grade is B");
		}

		if(score < 60){
			System.out.println("Your grade is C");
		}
		
		System.out.println("End of Execution");
	}
}