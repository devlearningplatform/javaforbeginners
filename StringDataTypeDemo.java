class StringDataTypeDemo{
	public static void main(String param[]){
		String str_val_1 = "   I AM a text with mixed characters and 01234_$  ";
		String str_val_2 = "I am a text to be concatenated";

		String upper_case_str = str_val_1.toUpperCase();
		String lower_case_str = str_val_1.toLowerCase();
		String concat_str_1 = str_val_1.concat(str_val_2);
		String concat_str_2 = str_val_1 + str_val_2;
		String str_trim = str_val_1.trim();
		char str_char_at = str_val_1.charAt(0);
		boolean str_contains_$ = str_val_1.contains("$");
		boolean str_starts_with = str_val_1.startsWith("B");
		boolean str_ends_with = str_val_1.endsWith("Z");
		boolean is_str_empty = str_val_1.isEmpty();
		int str_val_1_length = str_val_1.length();
		int index_of_A = str_val_1.indexOf("A");
		
		System.out.println("[01] - String 1               = " + str_val_1);
		System.out.println("[02] - String 2               = " + str_val_2);		
		System.out.println("[03] - String in upper case   = " + upper_case_str);
		System.out.println("[04] - String in lower case   = " + lower_case_str);
		System.out.println("[05] - String concatenation1  = " + concat_str_1);
		System.out.println("[06] - String concatenation2  = " + concat_str_2);
		System.out.println("[07] - String 1 trimmed       = " + str_trim);
		System.out.println("[08] - String 1 character 0   = " + str_char_at);
		System.out.println("[09] - String 1 contains $    = " + str_contains_$);
		System.out.println("[10] - String 1 starts with B = " + str_starts_with);
		System.out.println("[11] - String 1 ends with Z   = " + str_ends_with);
		System.out.println("[12] - String 1 is empty ?    = " + is_str_empty);
		System.out.println("[13] - Length of String 1     = " + str_val_1_length);
		System.out.println("[14] - Index of A in String 1 = " + index_of_A);
	}
}