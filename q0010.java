import java.util.*;
public class Main 
{
	int[] arr;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		arr=new int[size];
		int k=sc.nextInt();
		if(k>size)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			int max=0;
			for(int i=0;i<=size-k;i++)
			{
				for(int j=i;j<i+k;j++)
				{
					if(arr[j]>max)
					{
						max=arr[j];
					}
				}
				System.out.print(max+" ");
			}
		}
		
	}
	public static void main(String args[])
	{
		Main o=new Main();
		o.input();
	}

}
