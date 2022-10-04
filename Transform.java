import java.util.*;
public class Transform
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s="This is java This is java";
		int len=s.length()/2;
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			if(i<len)
			{
				s1=s1+Character.toLowerCase(s.charAt(i));
			}
			if(i>len)
			{
				s2=s2+Character.toUpperCase(s.charAt(i));
			}
		}
		System.out.println(s1+" "+s2);
		
	}
}
