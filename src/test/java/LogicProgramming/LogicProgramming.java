package LogicProgramming;

import java.util.Scanner;

public class LogicProgramming
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
//		multiply_2_num_without_multiplication();
//		stringreverse();
//		Find_EvenOdd_No();
//		palindromstring();
		//armstrongnumber();
//		public static void armstrongnumber()
//		{
			int num=351;
			int sum=0;
			for(int i=num;i>=0;i=i/10)
			{
				int rem=i%10;
				sum=sum+(rem*rem*rem);
			}
			System.out.println(sum);
			if(num==sum)
			{
				System.out.println("Given Number is armstrong number");
			}
			else
			{
				System.out.println("Given number is not armstrong number");
			}
		//}
	}
	
	public static void scannerclass()
	    { Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number 1");
		int num1=scan.nextInt();
		System.out.println("Enter Number 2");
		int num2=scan.nextInt();
		System.out.println("Addition="+(num1+num2));
		System.out.println("Enter your name");
		String name=scan.next();
		System.out.println(name);
		}
	public static void multiply_2_num_without_multiplication()
	{
		int a=5;
		int b=6;
		int sum=0;
		for(int i=1;i<=b;i++)
		{
			sum=sum+a;
		}
		System.out.println(sum);
	}

	public static void stringreverse()
	{
		String name="Datta Tandale";
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}
	
	public static void Find_EvenOdd_No()
	{
		System.out.println("Enter Number to be check");
		int number=scan.nextInt();
		if(number%2==0)
		{
			System.out.println(number +" Number is even");
		}
		else
		{
			System.out.println(number +" Number is odd");
		}
	}
	public static void palindromstring()
	{
		System.out.println("Enter the word to be checked as palendrom or not");
		String name=scan.next();
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(name+" Original Name");
		System.out.println(rev+" Reversed name");
		if(name.equals(rev))
		{
			System.out.println(name+ " Its palendrom world");
		}
		else
		{
			System.out.println(name+ " Its not a palendrom world");
		}
	}
	public static void armstrongnumber()
	{
		int num=351;
		int sum=0;
		for(int i=num;i>=0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		System.out.println(sum);
		if(num==sum)
		{
			System.out.println("Given Number is armstrong number");
		}
		else
		{
			System.out.println("Given number is not armstrong number");
		}
	}
}



