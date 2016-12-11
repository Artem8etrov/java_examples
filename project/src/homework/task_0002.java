package homework;

import java.util.Scanner;

/*Task 6(indexOf). Ќаписать метод в качестве параметра должен принимать 2 строки s и s1.
ќпределить входит ли строка s в строку s1.(явл¤етс¤ ли s подстрокой s1).
метод должен вернуть значение boolean. (true - если входит) */ 

public class task_0002 
{
	public static void main(String[] args)
	{
		String Str1, Str2;
		Scanner scan = new Scanner(System.in);
		boolean ret;
		
		//1: ввести S1, S2
		System.out.println("¬ведите первую строку: ");		
		Str1 = scan.next();
		
		System.out.println("¬ведите вторую строку: ");		
		Str2 = scan.next();
		
		//1.1: проверить введенный результат  
		System.out.println("Str1  " + Str1);
		System.out.println("Str2  " + Str2);
				
		//2: вызвать функцию проверки S1 в S2, результат true/false
		ret = is_including(Str1, Str2);
		
		//3: вывести результат
		if (ret)
			System.out.println("строка найдена");
		else
			System.out.println("строка не найдена");
	}
	
	public static boolean is_including(String str, String substr)
	{
		boolean ret;
		int index;
		
		index = str.indexOf(substr);
		
		if (index == -1)
			ret = false;
		else 
			ret = true;
					
		return ret;	
	}
}
