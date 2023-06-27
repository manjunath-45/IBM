package firstpackage;
import java.util.Scanner;
public class fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scanner = new Scanner(System.in);
           System.out.println("enter a word:");
           String word = scanner.nextLine();
           
           String reverseWord = reverseWord(word);
           System.out.println("reverse word:" + reverseWord);
           
           scanner.close();
           
	}
     
	public static String reverseWord(String word) {
		StringBuilder reversed = new StringBuilder();
		
		for(int i = word.length()-1;i>=0;i--) {
			reversed.append(word.charAt(i));
			
		}
		return reversed.toString();
	}
}
