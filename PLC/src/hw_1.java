//Christopher White


public class hw_1 {

	
	public static void main(String[] args) {
		
		String input = "2345 6tgbsauhd0sa67*|{OPKDSI;jaklhl";
		
		lexsplit(input);
		
	}
	
	
	
	public static void lexsplit(String x) {
		
		String specialCharacters = " *|{;";
		String[] array = x.split("");
		 
			
			for(int i = 0; i < array.length; i++) {
				String lex = array[i];
				int count = 0;
				
				
				while (count < lex.length() ) {
					if (specialCharacters.contains(Character.toString(lex.charAt(count)))) {
						 
							System.out.println();
							System.out.println(lex.charAt(count));
}
					else {
						System.out.print(lex.charAt(count));
					
					}
					
					count++;
				}
				
			}
			
			
		
	}
	
}
