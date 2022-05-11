package stringMethods;

public class split {

	public static void main(String[] args) 
	{

		/**
		 * split(String regex):
		 * 
		 * Splits this string around matches of the given regular expression.
		 *   
		 */
		
		String message = "Hello How are, I am fine, thank you";
		
		String words[] = message.split("\\s");
		
		for(String word: words)
		{
			System.out.println(word);
		}


	}

}
