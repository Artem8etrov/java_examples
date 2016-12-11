package homework;

import java.util.Scanner;
import java.io.*;


/* Task 7.
 *  
 * Написать метод, принимающий в качестве параметра строку.
 * Возвратить индекс первого вхождения символа "a" этой строки
 */

public class task_0003 
{
	public static void main(String[] args)
	{
		String Str;
		int index;
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Введите строку: ");		
		Str = scan.next();
		
		index = Str.indexOf('a');
		
		if (index != -1)
			System.out.print("Индекс первого вхождения символа 'a': " + index );
		else
			System.out.print("Cимвол 'a' в строке не найден");
	}
}
	