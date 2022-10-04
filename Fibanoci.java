import java.util.*;
public class Fibanoci
{
	public static void main(String args[])
	{
		int a=0;
		int b=1;
		int i,n,c;
		System.out.println("Enter range n:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(a+"\n"+b);
		for(i=2;i<n;i++)
		{
		   c=a+b;
		   System.out.println(c);
		   a=b;
		   b=c;
		}
		
		
	}
}
