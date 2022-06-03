import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : Display
// Description   : use to perfrom of 2 numbers
// Input	      : Integer,Integer
// Output	      : Pattern
// Date	          : 12/04/2022
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
		int i=0,j=0;
	
		for(i=1;i<=iRow;i++)
		{
			for(j=iCol;j>=i;j--)
			{
				System.out.print("\t"+j);
			}
			System.out.println(" ");
		}
	}
}

///////////////////////////////////////////////////////////////
//Write a program which perfrom Display the Pattern
///////////////////////////////////////////////////////////////

class Program26
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
//		5	4	3	2	1
//		5	4	3	2	
//		5	4	3	
//		5	4
//		5
//			
////////////////////////////////////////////////