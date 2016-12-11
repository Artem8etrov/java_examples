package homework;

/* Task 5(charAt). Написать метод, принимающий в качестве параметра строку и   
 * определ§ющий равны ли первый и последний символ в строке. 
 * boolean isFirstLastCharsEquals(String s)
 */

import java.util.Scanner;
import java.util.Arrays;

public class task_0001 
{
	public static void main(String[] args)
	{
		String S1;
		Scanner scan = new Scanner(System.in);
		boolean ret1, ret2;		
				
		System.out.println("ђведите строку: ");		
		S1 = scan.next();
	
		ret1 = isFirstLastCharsEquals1(S1);
		ret2 = isFirstLastCharsEquals2(S1);
		System.out.println("\nЦезультат: " + ret1 + ", " + ret2);	
	}
	
	static boolean isFirstLastCharsEquals1(String s)
	{
		boolean ret;
		char[] chArray;
		int i, len;
				
		System.out.println("\nS1: " + s);
		
		chArray = s.toCharArray();
		len = chArray.length;
		
		System.out.print("Array: ");
		for(i = 0; i<len; i++)
		{
			System.out.print(chArray[i] + "==" + (int)chArray[i]);
			
		}
		System.out.println(" ");
				
		if (chArray[0] == chArray[len - 1])
			ret = true;
		else
			ret = false;
				
		return ret;
	}
	
	static boolean isFirstLastCharsEquals2(String s)
	{
		boolean ret;
		String Str1, Str2;
		int len = s.length();
		
		System.out.println("\nS2: " + s);
		
		Str1 = s.substring(0, 1);
		Str2 = s.substring(len - 1, len);
		
		System.out.println("Str1: " + Str1 );
		System.out.println("Str2: " + Str2 );

		if (Str1.equals(Str2))
			ret = true;
		else
			ret = false;
					
		return ret;
	}
}
