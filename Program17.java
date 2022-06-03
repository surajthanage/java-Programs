import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : Display
// Description   : use to perfrom of 2 numbers
// Input	      : Integer,Integer
// Output	      : Pattern
// Date	          : 10/04/2022
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
		int iCnt=0;
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				if(j==0)
				{
					System.out.print("\t"+(1+i));
				}
				else if(i==iRow-1)
				{
					System.out.print("\t"+j);
					
				}
				else if(i==0)
				{
					System.out.print("\t"+(1+j));
				}
				else if(j==1)
				{
					System.out.print("\t"+(2+i));
				}
			}
			System.out.println("\t");
		}
	}
}

/////////////////////////////////////////////////
// Accept  number and Display pattern
////////////////////////////////////////////////

class Program17
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of row ");
		int iValue1=sobj.nextInt();
		
		System.out.println("Enter number of column ");
		int iValue2=sobj.nextInt();
		
		
		PatternX obj=new PatternX(iValue1,iValue2);
		
		obj.Display();
	}
}

///////////////////////////////////////////////
//
// Input	:	R=5				C=5
// output	:	
//				1	2	3	4	
//				2	3
//				4	5
//				5	1	2	3
////////////////////////////////////////////////