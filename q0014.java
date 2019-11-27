/*
 * Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X.
I/p : 5 5 9
1 2 4 5 7
5 6 3 4 8

I/p : 2 2 3
0 2
1 3

O/p : 1 8, 4 5, 5 4
O/p :  0 3, 2 1
 
 */
import java.util.*;

public class q0014 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Size of array 1:");
		int size1=sc.nextInt();
		
		int arr1[]=new int[size1];
		
		
		System.out.println("enter your arr 1 :");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.print("Size of array 2:");
		
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
			
		System.out.println("enter your arr 2 :");
		
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
			
		}
		
		System.out.println("enter the sum");
		int sum=sc.nextInt();
		
		int sum1=0;
		int sum2=0;

		System.out.println("for array 1");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]+arr1[j]==sum)
				{
					System.out.print(arr1[i]+" "+arr1[j]+",");
				}
			}
		}
		System.out.println("for array 2");
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=i+1;j<arr2.length;j++)
			{
				if(arr2[i]+arr2[j]==sum)
				{
					System.out.print(arr2[i]+" "+arr2[j]+",");
				}
			}
		}
		
	}

}
