import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : Display
// Description   : use to perfrom of 1 numbers
// Input	      : Integer
// Output	      : Pattern
// Date	          : 8/04/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////

class PatternX
{
	private int iNo;

	public PatternX(int a)
	{
		this.iNo=a;
	}
	
	public void Display()
	{
		int i=0;
		int iCnt=1;
		for(i=1;i<=iNo;i++)
		{
			
			System.out.print(" "+(2*i));
		}
	}
}

/////////////////////////////////////////////////
// Accept  number and Display pattern
////////////////////////////////////////////////

class Program15
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number  ");
		int iValue=sobj.nextInt();
		
		
		PatternX obj=new PatternX(iValue);
		
		obj.Display();
	}
}

///////////////////////////////////////////////
//
// Input	:	 8
// output	:	  2	 4	6	8	10	12	14	16 
//			
////////////////////////////////////////////////