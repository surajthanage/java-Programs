import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : Display
// Description   : use to perfrom of 2 numbers
// Input	      : Integer,Integer
// Output	      : Pattern
// Date	          : 11/04/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////

class NumberX
{
	private int iRow;
	private int iCol;
	
	public NumberX(int a,int b)
	{
		this.iRow=a;
		this.iCol=b;
	}
	
	public void Display()
	{
		int i=0,j=0,iCnt=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=iCol;j>=1;j--)
			{
				if(i>=j)
				{
					iCnt++;
				}
			}
		}
		for(i=1;i<=iRow;i++)
		{
			for(j=iCol;j>=1;j--)
			{
				if(i<=j)
				{
					System.out.print("\t"+iCnt);
					iCnt--;
				}
				else
				{
					System.out.print("\t");					
				}
			}
			System.out.println("" );
		}
		
	}
}

///////////////////////////////////////////////////////////////
//Write a program which perfrom Display the Pattern
///////////////////////////////////////////////////////////////

class Program24
{
	public static void main(String Arg[])
	{
	
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enetr number of row ");
		int iNo1=sobj.nextInt();
		System.out.println("Enetr number of row ");
		int iNo2=sobj.nextInt();
	
		NumberX obj=new NumberX(iNo1,iNo2);
		obj.Display();
	}
}

///////////////////////////////////////////////
//
// Input	:	R=5		C=5
// output	:	
//		15	14	13	12	11
//		10	9	8	7
//		6	5	4
//		3	2
//		1
//			
////////////////////////////////////////////////