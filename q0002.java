/* q0002  :
Given a string, that contains special character together with alphabets.Reverse the string in a way that special characters are not affected.

Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
*/


import java.util.*;

public class q0002 {
	
	static void reverse(String str)
	{
		
		char ch[]=str.toCharArray();
          int size=0;
		char ar1[]=new char[str.length()];
		char ar[]=new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
					if ((ch[i] >= 48 && ch[i] <= 57) || (ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122))
        {
        	ar1[size]=ch[i];
        	size++;
        }
		}
        
		
		int m=size-1;
		
		for(int l=0;l<size;l++)
		{
			ar[l]=ar1[m];
			
			
			m--;
		}
		
		
		int l=0;
		for(int i=0;i<str.length();i++)
		{
		  if ((ch[i] >= 48 && ch[i] <= 57) || (ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122))
		     {
				 System.out.print(ar[l]);
				 l++;
				 
			}
		  else
		  {
			  System.out.print(ch[i]);
			 
		  }
	
		}
		
       
	}
	
		

		
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string :");
		String str=sc.nextLine();
		
		reverse(str);
		
		
		
	}

}
