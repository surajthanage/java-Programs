import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
// Function name  : DisplayPattern
// Description    : Accept row and col and display pattern
// Output	      : Integer
// Date	          : 8/07/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class PatternX
{
	public int iRow;
	public int iCol;
	
	public PatternX(int a,int b)
	{
		this.iRow=a;
		this.iCol=b;
	}
	
	
	public void DisplayPattern()
	{
		int i=0,j=0;
		char ch='A';
		
		for(i=1,ch='A';i<=iRow;i++,ch++)
		{
			for(j=1;j<=iCol;j++)
			{
				System.out.print(" "+ch);
			}
			System.out.println(" ");
		}
	}	
}

/////////////////////////////////////////////////////////////////////////
// Write a program which accept number of row and column from user and 
// Dsplay pattern
/////////////////////////////////////////////////////////////////////////

class Program188
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int X=sobj.nextInt();
		System.out.println("Enter number of column");
		int Y=sobj.nextInt();
		
		PatternX pobj=new PatternX(X,Y);

		pobj.DisplayPattern();
		
		
	}
}

//////////////////////////////////////////////////////////////////////
// Input  : Row= 3		Col=3
// Output :		
//			A  A  A
//			B  B  B
//			C  C  C
//////////////////////////////////////////////////////////////////////