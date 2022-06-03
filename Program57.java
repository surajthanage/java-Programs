import java.lang.*;
import java.io.*;

///////////////////////////////////////////////////////////////
//
// Function name : Display
// Description   : use to perfrom of 2 numbers
// Input	      : Integer,Integer
// Output	      : Pattern
// Date	          : 20/04/2022
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
		int i=0,j=0,k=0;
		
		for(i=1;i<=iRow;i++)
		{
			for(j=1,k=1;j<=iCol;j++,k++)
			{
				if(i%2!=0)
				{
					System.out.print(" "+(j*2));
				}
				else 
				{
					System.out.print(" "+k);
					k++;
				}
			}
			System.out.println("\n");
		}
	}
}

/////////////////////////////////////////////////////////////
//Accept row and column from user and display pattern
/////////////////////////////////////////////////////////////

class Program55
{
	public static void main(String Arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number of row is :");
		int iValue1=Integer.parseInt(br.readLine());
		
		System.out.println("Enetr number of column is :");
		int iValue2=Integer.parseInt(br.readLine());
		
		PatternX p=new PatternX(iValue1,iValue2);
		p.Display();
	}
}

///////////////////////////////////////////////
//
// Input	:	 R=4		C=4
// output	:	    2 4 6 8 
//					1 3 5 7
//					2 4 6 8
//					1 3 5 7
//			
////////////////////////////////////////////////