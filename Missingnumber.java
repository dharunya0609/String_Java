public class Missingnumber
{
	public static void main(String args[])
	{
		int a[]=new int[] {1,2,3,4,5,6,7,9,10};
		int i;
		int asum=0;
		int cnt=0;
		
		for(i=0;i<a.length;i++)
		{
			asum+=a[i];
			cnt++;
		}
		
		int sum=((cnt+1)*(cnt+2))/2;
		System.out.println("Missing number is "+(sum-asum)); 
		
	}
}
