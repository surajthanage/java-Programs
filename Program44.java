import java.lang.*;
import java.io.*;

///////////////////////////////////////////////////////////////
//
// Function name : Display
// Description   : use to perfrom of 2 numbers
// Input	      : Integer,Integer
// Output	      : Pattern
// Date	          : 27/04/2022
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
		
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if(i==j)
				{
					System.out.print("@\t");
				}
				else if(i>j)
				{
					System.out.print("#\t");
				}
				else{
					System.out.print("*\t");
				}
			}
			System.out.println("\n");
		}
	}
	
}

/////////////////////////////////////////////////////////////
//Accept row and column from user and display pattern
/////////////////////////////////////////////////////////////

class Program44
{
	public static void main(String Arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Enter number of row ");
		int iNo1=Integer.parseInt(br.readLine());
		
		System.out.println("Enter number of column ");
		int iNo2=Integer.parseInt(br.readLine());
		
		PatternX p=new PatternX(iNo1,iNo2);
		p.Display();
	}
}

///////////////////////////////////////////////
//
// Input	:	 R=4		C=4
// output	:	   
//			@ * * *
//			# @ * *
//			# # @ *
//			# # # @
//			
////////////////////////////////////////////////