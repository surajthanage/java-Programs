import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : Display
// Description   : use to perfrom of 2 numbers
// Input	      : Integer,Integer
// Output	      : Pattern
// Date	          : 8/04/2022
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
		this.iCol=a;
	}
	
	public void Display()
	{
		int i=0,j=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if(i%2==0)
				{
					System.out.print(""+(-j)+"\t");
				}
				else
				{
					System.out.print(" "+j+"\t");
				}
			}
			System.out.println(" ");
		}
	}
}

/////////////////////////////////////////////////
// Accept  number and Display pattern
////////////////////////////////////////////////

class Program14
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of row ");
		int iNo1=sobj.nextInt();
		
		System.out.println("Enter number of column ");
		int iNo2=sobj.nextInt();
		
		PatternX obj=new PatternX(iNo1,iNo2);
		
		obj.Display();
	}
}

///////////////////////////////////////////////
//
// Input	:	 4
// output	:	   1    2	 3	 4 	 5
//				  -1	-2	-3	-4	-5
//				   1	 2	 3	 4	 5
//				  -1	-2	-3	-4	-5
//					
////////////////////////////////////////////////