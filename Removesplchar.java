import java.util.*;
public class Removesplchar
{
	public static void main(String args[])
	{
		int i,cnt=0;
		String s;
		String s1="";
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println("You entered "+s);
		for(i=0;i<s.length();i++)
		{
			if(!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)))
			{
				cnt++;
			}
			else
				s1=s1+s.charAt(i);
		}
		
		if(cnt==0)
		{
			System.out.println("No.of spl characters in string:"+cnt);
			
		}
		System.out.println("No  spl characters in string:"+s1);
		

	}
}
