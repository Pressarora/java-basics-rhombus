import java.util.*;
public class rombus
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rombus(n);
    }
    public static void rombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            
            
            for(int k=1;k<=n;k++)
            {
                if(i==1||i==n||k==1||k==n)
                {
                    System.out.print("#");
                }
                else
                {
                   System.out.print(" "); 
                }
                
                    
            }
            System.out.println();

        }
            
            
            
    }
}
