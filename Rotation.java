import java.util.Scanner;
public class Rotation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter string 1:");
		s1=sc.nextLine();
		System.out.println("Enter String 2:");
		s2=sc.nextLine();
		if(s1.length()!=s2.length())
			System.out.println("Cant be Rotation of each other");
		else
		{
		s1=s1+s1;
		
		if(s1.contains(s2))
		{
			System.out.println("Rotation of each other");
		}
		else
		{
		 System.out.println("NOT Rotation of each other");

		}
		
		}
		

	}
}
