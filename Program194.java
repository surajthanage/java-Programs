import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
// Function name  : DisplayPattern
// Description    : Accept row and col and display pattern
// Output	      : Integer
// Date	          : 9/07/2022
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
		for(i=1;i<=iRow;i++)
		{
			for(j=iCol;j>=1;j--)
			{
				if(j%2==0)
				System.out.print("# \t");
			else
				System.out.print("* \t");
			}
			System.out.println(" ");
		}
	}	
}

/////////////////////////////////////////////////////////////////////////
// Write a program which accept number of row and column from user and 
// Dsplay pattern
/////////////////////////////////////////////////////////////////////////

class Program194
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
// Input  : Row= 3	Col=4
// Output :		
//			*	#	*	#
//			*	#	*	#
//			*	#	*	#
//////////////////////////////////////////////////////////////////////