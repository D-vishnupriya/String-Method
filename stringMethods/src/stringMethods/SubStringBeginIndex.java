package stringMethods;

public class SubStringBeginIndex {

	public static void main(String[] args) 
	{

		/**
		 * 
		 * substring(int beginIndex):
		 * 
		 * Returns a string that is a substring of this string.
		 * 
		 * ========================================================
		 * substring(int beginIndex, int endIndex):
		 * 
		 * Returns a string that is a substring of this string.
		 */
		
		String message = "Hello How are you, I am fine, thank you";
		
		
		System.out.println(message.substring(10));
		
		System.out.println(message.substring(19));
		
		System.out.println("=================");
		
		System.out.println(message.substring(6, 17));
		


	}

}
