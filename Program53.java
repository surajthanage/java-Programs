import java.lang.*;
import java.io.*;

///////////////////////////////////////////////////////////////
//
// Function name : Display
// Description   : use to perfrom of 1 numbers
// Input	      : Integer
// Output	      : Pattern
// Date	          : 20/04/2022
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
		int i=0;
		for(i=iNo;i>=1;i--)
		{
			System.out.print(" "+i+"\t*\t");
		}
	}
}

/////////////////////////////////////////////////////////////
//Accept number from user and display pattern
/////////////////////////////////////////////////////////////

class Program53
{
	public static void main(String Arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number");
		int iValue=Integer.parseInt(br.readLine());
		
		PatternX p=new PatternX(iValue);
		p.Display();
		
	}
}

///////////////////////////////////////////////
//
// Input	:	 N=5
// output	:	   
//				5 * 4 * 3 * 2 * 1 * 
//			
////////////////////////////////////////////////