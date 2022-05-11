package stringMethods;

public class Contains {

	public static void main(String[] args) 
	{

		/**
		 * contains(CharSequence s):
		 * 
		 * Returns true if and only if this string contains the 
		 * specified sequence of char values.
		 * 
		 */
		
		String text = "Samyuktha is a good girl";
		
		System.out.println(text.contains("is"));
		System.out.println(text.contains("Is"));
		System.out.println(text.contains("good"));
		
		System.out.println(text.contains("samyuktha"));

	}

}
