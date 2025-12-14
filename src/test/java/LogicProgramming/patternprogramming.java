package LogicProgramming;

public class patternprogramming
{
	public static void main(String[] args) 
	{
//		for(int i=1;i<=4;i++)
//		{
//			System.out.println("*");
//		}
//		for(int i=1;i<=4;i++)
//		{
//			System.out.print("*");
//		}
		//*****
		//*****
		//*****
		
//		for(int i=1;i<=3;i++)
//		{
//			
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//*
	    //**
		//***
		//****
		//*****
		
//		for(int i=1;i<=5;i++)
//		{
//			
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//			
//		}
		
		//*****
		//****
		//***
		//**
		//*
//		for(int i=1;i<=5;i++)
//		{
//			
//			for(int j=i;j<=5;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//			
//		}
		
	
	//*****
	// ****
	//  ***
	//   **
	//    *
		
//		int star=5;
//		int space=0;
//		for(int i=1;i<=5;i++)
//		{
//			for(int k=1;k<=space;k++)
//			{
//				System.out.print(" ");
//				
//			}
//			for(int j=1;j<=star;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//			star--;
//			space++;
//			
//		}
		//    *
		//   **
		//  ***
		// ****
		//*****	
		
		int space1=4;
		int star1=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space1--;
			star1++;
		}
		
	//*******
	// *****
	//  ***
	//   *	
		
		int star2=7;
		int space2=0;
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=space2;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star2;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			star2=star2-2;
			space2++;
		}
		
		//   *
		//  ***
		// *****
		//*******
		int space3=3;
		int star3=1;
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=space3;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star3;j++)
			{
				System.out.print("*");
			}			
			System.out.println();
			space3--;
			star3=star3+2;			
		}
		
		//   *
		//  * *
		// * * *
		//* * * *
		
		int star4=1;
		int space4=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space4;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star4;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star4++;
			space4--;
		}
		//* * * * * * *
		// * * * * *
		//   * * *
		//    * * 
		//     *
		
		int star5=5;
		int space5=0;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=space5;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star5;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			star5--;
			space5++;
		}
		
		 //*****
		 //****
		 //***
		 //**
		 //*
		 //**
		 //***
		 //****
		 //*****
		
		
		
		
		int a=5;
		
		for(int i=1;i<=9;i++)
		{
			for(int i1=1;i1<=a;i1++)
			{
				System.out.print("*");
			}
			if(i<5)
			{
				a--;
			}
			else
			{
				a++;
			}
			System.out.println();
		}
		
		 //*
		 //**
		 //***
		 //****
		 //*****
		 //****
		 //***
		 //**
		 //*
		
		int b=1;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=b;j++)
			{
				System.out.print("*");
			}
			if(i<5)
			{
				b++;
			}
			else
			{
				b--;
			}
			System.out.println();
		}
		
		
		int sc=1;
		int d=9;
		int se=1;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=sc;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=d;k++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=se;l++)
			{
				System.out.print("*");
			}
			if(i<5)
			{
				se++;
				sc++;
				d=d-2;
			}
			else
			{
				se--;
				sc--;
				d=d+2;
			}
			
			System.out.println();
			
		}
		
		
	}
	
	
}



