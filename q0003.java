/*
 * q0003  Given an expression string exp , write a program to examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.

Input: exp = “[()]{}{[()()]()}”
Output: Balanced

Input: exp = “[(])”
Output: Not Balanced
 
 
 */


import java.util.*;
public class q0003 {

		public static void main(String[] args) {
			Stack<Character> s=new Stack<Character>();
			String c=new String();
			Scanner sc=new Scanner(System.in);
			c=sc.next();
			int g=0;
			for(int i=0;i<c.length();i++)
			{
				if(c.charAt(i)=='('||c.charAt(i)=='['||c.charAt(i)=='{')
				{
					s.push(c.charAt(i));
				}
				else if(c.charAt(i)==')')
				{
					char ch=s.pop();
							if(ch!='(')
								{g=1;
								break;
								}
				}
				else if(c.charAt(i)=='}')
				{
					char ch=s.pop();
							if(ch!='{')
								{g=1;
								break;
								}
				}
				else if(c.charAt(i)==']')
				{
					char ch=s.pop();
							if(ch!='[')
								{g=1;
								break;
								}
				}
			}
			if(g==0 && s.isEmpty())
				System.out.println("Balanced");
			else
				System.out.println("Not Balanced");
			

		}

	}

