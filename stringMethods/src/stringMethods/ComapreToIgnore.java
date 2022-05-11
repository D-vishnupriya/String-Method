package stringMethods;

public class ComapreToIgnore {

	public static void main(String[] args) 
	{
	

		/**
		 * compareTo(String anotherString):
		 * 
		 * Compares two strings lexicographically.
		 * 
		 * =======================================================
		 * 
		 * compareToIgnoreCase(String str):
		 * 
		 * Compares two strings lexicographically, ignoring case differences.
		 * 
		 */		
		
		String text1 = "Vishnupriya";
		
		String text2 = "vishnu 123";
		
		String text3 = "Girl";
		
		String text4 = "Vishnupriya";
		
		//System.out.println(text1.compareTo(text2));
		
		//System.out.println(text1.compareTo(text3));
		
		System.out.println(text1.compareTo(text4));
		
		System.out.println("=======================");
		
		System.out.println(text1.compareToIgnoreCase(text4));
	}

}
