package homework;

import java.util.Scanner;
import java.io.*;


/*Task 11: 
 * Написать метод, который принимает строку и возвращает массив целых чисел с индексами, 
 * где встречаются символы 'а'.
 */

public class task_0007 
{
	public static void main(String[] args)
	{
		String s;
		int[] arr;
		char c;
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Введите строку: ");		
		s = scan.next();
		
		c = 'a';
		arr = get_arr(s, c);
	
		System.out.print("Массив индексов в строке с символом '" + c + "': ");
		for(int i = 0; i <= arr.length  - 1; i++) 
		{
			  System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	static int[] get_arr(String s, char c) 
	{
		int[] arr;
		char[] arr_char = s.toCharArray();
		int count, i, j;
	
		count = 0;	
		for (i = 0; i <= arr_char.length - 1; i++)
		{
			if ( arr_char[i] == c )
			{
				count = count + 1;
			}			
		}
		
		if (count != 0)
		{
			arr = new int[count];
			
			j = 0;
			for (i = 0; i <= arr_char.length - 1; i++)
			{
				if ( arr_char[i] == c )
				{
					arr[j] = i;
					j++;
				}			
			}	
		}
		else
		{
			arr = new int[0];
		}		
		
		return arr;
	}
	
}
