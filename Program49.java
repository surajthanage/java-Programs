import java.lang.*;
import java.util.*;

///////////////////////////////////////////////////////////////
//
// Function name : Display
// Description   : use to perfrom of 2 numbers
// Input	      : Integer,Integer
// Output	      : Pattern
// Date	          : 25/04/2022
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
		int i=0,j=0,iCnt=0;
		
		for(i=0;i<iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				System.out.print("\t"+(j+i));
			}
			System.out.println("\n");
		}
	}
}

/////////////////////////////////////////////////////////////
//Accept row and column from user and display pattern
/////////////////////////////////////////////////////////////

class Program49
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
//			1	2	3	4
//			2	3	4	5
//			3	4	5	6
//			4	5	6	7
//			
////////////////////////////////////////////////