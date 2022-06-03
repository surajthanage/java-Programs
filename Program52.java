// Accept number of row and column from user and  display below pattern is it;
// r 4    c 4
/*
	
*/

import java.lang.*;
import java.util.*;

///////////////////////////////////////////////////////////////
//
// Function name : Display
// Description   : use to perfrom of 2 numbers
// Input	      : Integer,Integer
// Output	      : Pattern
// Date	          : 20/04/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////

class PatternX
{
	private int iRow;
	private int iCol;
	
	public PatternX(int a,int b)
	{
		this.iRow=a;
		this.iCol=b;
	}
	public void Display()
	{
		int i=0,j=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if((i==j)||(i==1)||(i==iRow)||(j==1)||(j==iCol))
				{
					System.out.print("\t"+j);
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
	}
}

/////////////////////////////////////////////////////////////
//Accept row and column from user and display pattern
/////////////////////////////////////////////////////////////

class Program52
{
	public static void main(String Arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number of row :");
		int iValue1=s.nextInt();
		
		System.out.println("Enter number of column :");
		int iValue2=s.nextInt();
		
		PatternX p=new PatternX(iValue1,iValue2);
		p.Display();
	}
}

///////////////////////////////////////////////
//
// Input	:	 R=4		C=4
// output	:	   
//		1	2	3  4
//		1 	2	   4
//		1	  	3  4	
//		1  2   3  4
//			
////////////////////////////////////////////////