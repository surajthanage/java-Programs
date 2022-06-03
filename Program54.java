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
	
	public Pattern(int a,int b)
	{
		this.iRow=a;
		this.iCol=b;
	}
	public void Display()
	{
		int i=0,j=0;
		char ch1='\0',ch2='\0';

		for(j=1;j<=iCol;j++)
		{
			
			for(i=1,ch1='A',ch2='a';i<=iRow;i++,ch1++,ch2++)
			{
				if(j%2!=0)
				{
					System.out.print("\t"+ch1);
				}
				else
				{
					System.out.print("\t"+ch2);
				}
			}
			System.out.println("\n");
		}
	}
}

/////////////////////////////////////////////////////////////
//Accept row and column from user and display pattern
/////////////////////////////////////////////////////////////

class Program54
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
//		A B C D
//		a b c d
//		A B C D
//		a b c d
//			
////////////////////////////////////////////////