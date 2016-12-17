package homework;

import java.util.Scanner;

public class cmdcalc 
{
	static double num1, num2;
	static int  pos1, pos2, neg1, neg2;
	static int op, state;
	
	private static final int STATE_NUM1 = 0;
	private static final int STATE_OP = 1;
	private static final int STATE_NUM2 = 2;	
	private static final int STATE_END = 3;
	
	private static final int OP_UNKNOWN = 0;
	private static final int OP_PLUS =	1;
	private static final int OP_MINUS = 2;
	private static final int OP_DIV = 	3;	
	private static final int OP_MULT = 	4;
	
	private static final int SUCCESS = 	0;
	private static final int FAIL = 	1;
	
	
	public static void main(String[] args)
	{	
		String str;
		char[] arr;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CMD Calc");
		System.out.println("Press 'exit' for EXIT");
			
		num1 = 0;
		num2 = 0;
		pos1 = 1;
		pos2 = 1;
		neg1 = 0;
		neg2 = 0;
		
		op = OP_UNKNOWN;
		state = STATE_NUM1;		
		
		while (true)
		{
			int i;
			char c;
			
			str = scan.next();
			arr = str.toCharArray();
			
			if (str.equals("exit") )
				break;
			
			for (i=0; i < arr.length; i++)
			{
				c = arr[i];
				if (proc(c) != SUCCESS)
					break;
			}
			
			proc(' ');
		}
		
		System.out.println("\nExit Calc\n");	
	}
	
	public static int proc(char c)
	{
		int ret = SUCCESS;
		
		switch (state)
		{
			case STATE_NUM1:
				if (Character.isDigit(c))
				{
					num1 = num1 * pos1 + (double)(c - '0');
					pos1 = pos1 * 10;
				}
				else
				{
					if (pos1 == 1)
					{
						if (c == '-')
						{
							if (neg1 == 0)
							{
								neg1 = -1;
							} else {
								state = STATE_END;
								op = OP_UNKNOWN;							
							}
						}
						else if (c == '+')
						{
							if (neg1 == 0)
							{
								neg1 = 1;
							} else {
								state = STATE_END;
								op = OP_UNKNOWN;							
							}					
						}
						else if (c != ' ') 
						{
							state = STATE_END;
							op = OP_UNKNOWN;
						}
					}
					else
					{
						if (c == '+')
						{
							op = OP_PLUS;
							state = STATE_NUM2;
						}
						else if (c == '-')
						{
							op = OP_MINUS;
							state = STATE_NUM2;
						}
						else if (c == '/')
						{
							op = OP_DIV;
							state = STATE_NUM2;
						}
						else if (c == '*')
						{
							op = OP_MULT;
							state = STATE_NUM2;
						}
						else if (c == ' ')
						{
							state = STATE_OP;
						}
						else
						{
							state = STATE_END;
							op = OP_UNKNOWN;
						}										
					}
				}
				break;
				
			case STATE_OP:
				{
					if (c == '+')
					{
						op = OP_PLUS;
						state = STATE_NUM2;
					}
					else if (c == '-')
					{
						op = OP_MINUS;
						state = STATE_NUM2;
					}
					else if (c == '/')
					{
						op = OP_DIV;
						state = STATE_NUM2;
					}
					else if (c == '*')
					{
						op = OP_MULT;
						state = STATE_NUM2;
					}
					else if (c != ' ')
					{
						state = STATE_END;
						op = OP_UNKNOWN;
					}	
				}	
				break;
				
			case STATE_NUM2:
				if (Character.isDigit(c))
				{
					num2 = num2 * pos2 + (double)(c - '0');
					pos2 = pos2 * 10;
				}
				else
				{
					if (pos2 == 1)
					{
						if (c == '-')
						{
							if (neg2 == 0)
							{
								neg2 = -1;
							} else {
								state = STATE_END;
								op = OP_UNKNOWN;							
							}
						}
						else if (c == '+')
						{
							if (neg2 == 0)
							{
								neg2 = 1;
							} else {
								state = STATE_END;
								op = OP_UNKNOWN;							
							}					
						}
						else if (c != ' ') 
						{
							state = STATE_END;
							op = OP_UNKNOWN;
						}
					}
					else
					{
						if ((c == ' ') || (c == '='))
						{
							state = STATE_END;
						}
						else
						{
							state = STATE_END;
							op = OP_UNKNOWN;
						}										
					}
				}
				break;
		}	
		
		if (state == STATE_END)
		{
			double res = 0;
			
			//System.out.println("num1=" + num1);			
			//System.out.println("num2=" + num2);			
			//System.out.println("op=" + op);
			
			if (neg1 == 0)
				neg1 = 1;
			
			if (neg2 == 0)
				neg2 = 1;
			
			num1 = num1 * neg1;
			num2 = num2 * neg2;
			
			switch (op)
			{
				case OP_PLUS:
					res = num1 + num2;
					break;
					
				case OP_MINUS:
					res = num1 - num2;
					break;
					
				case OP_DIV:
					res = num1 / num2;
					break;
				
				case OP_MULT:
					res = num1 * num2;
					break;
			}	
			
			if (op != OP_UNKNOWN)
			{
				System.out.println(res);
			}
			else
			{
				System.out.println("Error");
				ret = FAIL;
			}
			
			num1 = 0;
			num2 = 0;
			pos1 = 1;
			pos2 = 1;
			neg1 = 0;
			neg2 = 0;
			
			op = OP_UNKNOWN;
			state = STATE_NUM1;	
		}
		
		return ret;
	}
}
