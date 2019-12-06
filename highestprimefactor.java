import java.util.*;


public class HighestPrimeFactor {
    
    public static int checkprime(int number)
    {
        int flag=0;
        for(int i=2;i<number/2;i++)
        {
            if(number%i==0)
            {
                flag=1;
            }
        }
        
        if(flag==1)
        {
            return 1;
        }
        else
            return 0;
    }
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        
        int number=s.nextInt();
        int checker=checkprime(number);
        if(checker==0)
        {
            System.out.println("Prime Factor= "+number);
        }
        else
        {
            for(int i=number-1;i>=2;i--)
            {
                if(number%i==0)
                {
                    checker=checkprime(i);
                    if(checker==0)
                    {
                        System.out.println("Prime Factor= "+i);
                        break;
                    }
                }
            }
        }
    }
    
}
