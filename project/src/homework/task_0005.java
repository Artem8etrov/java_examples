package homework;
import java.util.Scanner;

/*Task 9: 
 * Написать метод, возвращающий вторую половину строки.
 */

public class task_0005 
{
	public static void main(String[] args)
	{
		String s;
		int len;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Введите строку: ");		
		s = scan.next();
		
		len = s.length();
		
		System.out.println("Вторая половина строки: " + s.substring(len/2));
		
	}
}


