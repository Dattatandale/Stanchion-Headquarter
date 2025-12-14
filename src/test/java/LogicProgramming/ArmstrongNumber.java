package LogicProgramming;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int a=5;
		int b=7;
		int mult=0;
		for(int i=1;i<=a;i++)
		{
			mult=mult+b;
		}
		System.out.println(mult);
		
		String org="NEC Corporation";
		String rev="";
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
		
		if(a%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
		int d=7;
		int num=0;
		for(int i=d;i>0;i=i/10)
		{
			int rem=i%10;
			num=num+(rem*rem*rem);
		}
		System.out.println(num);	
		
		int fact=1;
		for(int l=d;l>=1;l--)
		{
			fact=fact*l;
		}
		System.out.println(fact);
		
		String wname="D A T T A";
		int count=0;
		for(int j=1;j<=wname.length()-1;j++)
		{
			char wname1=wname.charAt(j);
			if(wname1==' ')
			{
				count++;
				
			}
		}
		System.out.println(count);
	}
	
	
}
