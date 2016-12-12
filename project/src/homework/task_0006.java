package homework;

import java.util.Scanner;

/*Task 10: 
 * Написать метод, проверяющий является ли строка полиндромом.
 */

public class task_0006 
{
	public static void main(String[] args)
	{
		String s;
		int len;
		boolean ret;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введите строку: ");		
		s = scan.next();
		
		ret = is_palindrome(s);
		
		System.out.println("Строка является полиндромом: " + ret );	
	}
	
	static boolean is_palindrome(String s) 
	{
		 StringBuilder strBuilder = new StringBuilder(s);
	     strBuilder.reverse();
 
	     return strBuilder.toString().equals(s);
	}
}

