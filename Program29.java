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
	
	public NumberX(int a)
	{
		this.iRow=a;
	}
	
	public void Display()
	{
		int i=0,j=0,space=0;
		char ch='\0';
		
		for(i=0;i<=iRow;i++)
		{
			for(space=1;space<=iRow-i;space++)
			{
				System.out.print("\t");
			}
			for(j=1,ch='A';j<=i;j++,ch++)
			{
				System.out.print("\t\t"+ch);
				
			}
			System.out.println(" ");
		}
	
	}	
}

///////////////////////////////////////////////////////////////
//Write a program which perfrom Display the Pattern
///////////////////////////////////////////////////////////////

class Program29
{
	public static void main(String Arg[])
	{
	
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enetr number of row ");
		int iNo1=sobj.nextInt();
	
		NumberX obj=new NumberX(iNo1);
		obj.Display();
	}
}

///////////////////////////////////////////////
//
// Input	:	R=8		
// output	:	
//							
//						A
//					A 		B
//				A		B		C
//			A		B		C		D
//		A		B		C		D		E
//			
////////////////////////////////////////////////