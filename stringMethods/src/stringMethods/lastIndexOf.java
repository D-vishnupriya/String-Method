package stringMethods;

public class lastIndexOf {

	public static void main(String[] args)
	{
		

		/**
		 * lastIndexOf(String str):
		 * 
		 * Returns the index within this string of the last occurrence 
		 * of the specified substring.
		 *   
		 */
		
		String message = "Hello How are, I am fine, thank you";
		
		System.out.println(message.lastIndexOf("thank you"));
		
		System.out.println(message.lastIndexOf("Hello How are, I am fine, thank you"));

		System.out.println(message.lastIndexOf("How"));
		

	}

}
