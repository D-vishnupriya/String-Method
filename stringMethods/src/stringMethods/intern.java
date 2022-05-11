package stringMethods;

public class intern {

	public static void main(String[] args)
	{
		/**
		 * intern():
		 * 
		 * Returns a canonical representation for the string object.
		 * 		 * 
		 */
		
		String text = "Welcome to India";
		
		String text1 = text.intern();
		
		System.out.println(text1);



	}

}
