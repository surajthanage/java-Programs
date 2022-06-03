// Accept number of Row and number of column from user and display below pattern is it;
// r=4		c=4
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
// Date	          : 27/04/2022
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
		int i=0;
		int j=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=iCol;j>=1;j--)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}
	}
}

/////////////////////////////////////////////////////////////
//Accept row and column from user and display pattern
/////////////////////////////////////////////////////////////

class Program42
{
	public static void main(String Arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number of row");
		int iValue1=s.nextInt();
		
		System.out.println("Enter number of column");
		int iValue2=s.nextInt();
		
		PatternX p=new PatternX(iValue1,iValue2);
		p.Display();
	}
}

///////////////////////////////////////////////
//
// Input	:	 R=5		C=5
// output	:	   
//			5 4 3 2 1
//			5 4 3 2 1
//			5 4 3 2 1
//			5 4 3 2 1
//			
////////////////////////////////////////////////