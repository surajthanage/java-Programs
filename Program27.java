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
		if((a%2==0)||(b%2==0))
		{
			System.out.println("Enter odd number");
			return;
		}
		this.iRow=a;
		this.iCol=b;
	}
	
	public void Display()
	{
		int i=0,j=0;
	
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if((i==(iRow/2)+1)||(j==(iCol/2)+1))
				{
					System.out.print("+\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println(" ");
		}
	}
}

///////////////////////////////////////////////////////////////
//Write a program which perfrom Display the Pattern
///////////////////////////////////////////////////////////////

class Program27
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
// Input	:	R=9		C=9
// output	:	
//						+	
//						+
//						+	
//						+
//		+	+	+	+	+	+	+	+	+
//						+
//						+	
//						+	
//						+
//			
////////////////////////////////////////////////