import java.util.Scanner;

public class CountFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int max=0;
		for(int i=0;i<n;i++)
		{     
			arr[i]=sc.nextInt();
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		int arr1[]=new int[max+1];
		for(int i=0;i<n;i++)
		{
			arr1[arr[i]]++;
		}
		
		for(int i=0;i<n;i++)
		{
			if(arr1[arr[i]]!=0)
			{
				System.out.println(arr[i]+" "+arr1[arr[i]]);
				arr1[arr[i]]=0;
			}
		}
		
		
		
		
		

	}

}
