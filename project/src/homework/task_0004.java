package homework;
import java.util.Scanner;

/*Task 8. 
 * Написать метод, принимающий в качестве параметра строку. 
 * Возвращающий перевернутую строку.
 */

public class task_0004 
{
	public static void main(String[] args)
	{
		String Str;
		StringBuffer buffer;
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Введите строку: ");		
		Str = scan.next();
		
		buffer = new StringBuffer(Str);	
		buffer.reverse();
		
		System.out.println("Перевернутая строка: " + buffer);
	}
}
