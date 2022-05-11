package stringMethods;

public class EqualsIgnoreCase {

	public static void main(String[] args)
	{

		String text1 = "Vishnupriya";

		String text2 = "Vishnupriya";

		String text3 = "Girl";

		String text4 = "vishnupriya";

		String text5 = "Vishnu 123";	

		System.out.println(text1.equalsIgnoreCase(text2));
		System.out.println(text1.equalsIgnoreCase(text3));
		System.out.println(text1.equalsIgnoreCase(text4));
		System.out.println(text2.equalsIgnoreCase(text3));


	}

}
