/* q0005
 * Write a Java program to remove duplicates from an unsorted linked list 
Input : 5 10 10 11 16 11 5 16 
Output: 5 10 11 16
 */
import java.util.*;
public class q0005 {
	
		static node head;
		class node
		{
			int data;
			node next;
			node(int d)
			{
				data=d;
				next=null;
			}
		}
		public void insert(int d)
		{
			int f1=0;
			node n1=new node(d);
			if(head==null)
			{
				head=n1;
			}
			else
			{
				node temp1=head;
				while(temp1!=null)
				{
					if(temp1.data==d)
					{
						f1=1;
						break;
					}
					temp1=temp1.next;
				}
				if(f1==0)
				{
					node temp2=head;
					while(temp2.next!=null)
					{
						temp2=temp2.next;
					}
					temp2.next=n1;
				}
			    }
		}
		public void display()
		{
			node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		public static void main(String arg[])
		{
			Scanner in=new Scanner(System.in);
			q0005 obj=new q0005();
			int size=in.nextInt();
			for(int i=0;i<size;i++)
			{
				int a=in.nextInt();
				obj.insert(a);
			}
			obj.display();
		}
		}