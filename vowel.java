package firstpackage;
import java.util.Scanner;

public class fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a alphabet");
        char ch = scanner.next().charAt(0);
        
        if (isVowel(ch))
        {
        	System.out.println(ch + " is a vowel.");
        }
        else 
        {
        	System.out.println( ch + " is not a vowel.");
        }	
        
	}
	
	public static boolean isVowel(char ch)
	{
		ch = Character.toLowerCase(ch);
				if (ch == 'a' || ch == 'e' || ch == 'i'||ch == 'o' || ch == 'u')
				{
					return true;
				}
		return false;
	}

}
