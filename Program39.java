import java.lang.*;
import java.util.*;

///////////////////////////////////////////////////////////////
//
// Function name : Pattern
// Description   : use to perfrom of 2 numbers
// Input	      : Integer,Integer
// Output	      : Pattern
// Date	          : 29/04/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////

class Display
{
	public int iRow;
	public int iCol;
	Display(int a,int b)
	{
		this.iRow=a;
		this.iCol=b;
	}
	public void Pattern()
	{
		int i=0;
		int j=0;
		
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if(i>j)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}
}

/////////////////////////////////////////////////////////////
//Accept row and column from user and display pattern
/////////////////////////////////////////////////////////////

class Program39
{
	public static void main(String Arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of row");
		int iValue1=s.nextInt();
		
		System.out.println("Enter number of row");
		int iValue2=s.nextInt();
		
		Display d=new Display(iValue1,iValue2);
		d.Pattern();
	}
}

///////////////////////////////////////////////
//
// Input	:	 R=4		C=4
// output	:	   
//				*
//				* * 
//				* * *
//				* * * *
//			
////////////////////////////////////////////////