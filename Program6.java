import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : Display
// Description   : use to perfrom of 2 numbers
// Input	      : Integer,Integer
// Output	      : Pattern
// Date	          : 6/04/2022
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
		char ch='\0';
		
		for(i=1;i<=iRow;i++)
		{
			for(j=1,ch='A';j<=iCol;j++,ch++)
			{
				System.out.print("\t"+ch);
			}
			System.out.println(" ");
		
		}
	}
}

/////////////////////////////////////////////////////////////////////////
// Accept  row and cloumn from user and display pattern
/////////////////////////////////////////////////////////////////////////

class Program6
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr number  of rows :");
		 int iNo1=sobj.nextInt();
		
		System.out.println("Enetr number of column :");
		int iNo2=sobj.nextInt();
		
		PatternX obj=new PatternX(iNo1,iNo2);
		
		obj.Display();
		
	}
}


///////////////////////////////////////////////////////
//
// Input	:	 R=4		C=4
// output	:	A 	B 	C 	D
//				A 	B 	C 	D
//				A 	B 	C 	D
//				A 	B 	C 	D
//
///////////////////////////////////////////////////////