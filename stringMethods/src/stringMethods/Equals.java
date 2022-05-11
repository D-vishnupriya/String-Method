package stringMethods;

public class Equals {

	public static void main(String[] args) 
	{
		/**
		 * equals(Object anObject):
		 * 
		 * Compares this string to the specified object.
		 * 
		 * ================================================
		 * 
		 * equalsIgnoreCase(String anotherString):
		 * 
		 * Compares this String to another String, ignoring case considerations.
		 * 
		 */		
		
		String text1 = "Vishnu";
		
		String text2 = "Vishnu";
		
		String text3 = "Girl";
		
		String text4 = "vishnu";
		
		String text5 = "Vishnu 123";	

		System.out.println(text1.equals(text2));
		System.out.println(text1.equals(text3));
		System.out.println(text1.equals(text4));
		
		System.out.println("==========================");
		
	


	}

}
