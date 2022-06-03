import java.lang.*;
import java.util.*;

///////////////////////////////////////////////////////////////
//
// Function name : Display
// Description   : use to perfrom of 1 numbers
// Input	      : Integer
// Output	      : Pattern
// Date	          : 29/04/2022
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
		for(int i=1;i<=iNo;i++)
		{
			System.out.print(" "+iNo+"\t#\t");
		}
	}
}

/////////////////////////////////////////////////////////////
//Accept number from user and display pattern
/////////////////////////////////////////////////////////////

class Program41
{
	public static void main(String Arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number");
		int iValue=s.nextInt();
		
		PatternX p=new PatternX(iValue);
		p.Display();
	}
}

///////////////////////////////////////////////
//
// Input	:	N=5
// output	:	   
//				5 # 4 # 3 # 2 # 1 #
//			
////////////////////////////////////////////////