import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : FreqNumber
// Description    : Frequncy of that number
// Input	      : Integer
// Output	      : Integer
// Date	          : 1/07/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class Matrix
{
	public int iRow;
	public int iCol;
	public int iNo;
	public int Arr[][];
	
	public Matrix(int a,int b,int c)
	{
		this.iRow=a;
		this.iCol=b;
		this.iNo=c;
		this.Arr=new int[iRow][iCol];
	}
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter element of matrix ");
		
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++)
			{
				Arr[i][j]=sobj.nextInt();
			}
		}
	}
	public void Display()
	{
		int i=0,j=0;
		System.out.println("Element of matrix is :");
		
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				System.out.print(" "+Arr[i][j]);
			}
			System.out.println(" ");
		}
	}
	
	public int FreqNumber()
	{
		int i=0,j=0,iCnt=0;
		
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				if(iNo==Arr[i][j])
				{
					iCnt++;
				}
			}
		}
		return iCnt;
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept matrix and one number from user and return 
// frequncy of that number 
////////////////////////////////////////////////////////////////////////////

class Program152
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int X=sobj.nextInt();
		
		System.out.println("Enter number of column");
		int Y=sobj.nextInt();
	
		System.out.println("Enter number to search frequncy of that number");
		int iNo=sobj.nextInt();
		
		Matrix mobj=new Matrix(X,Y,iNo);
		mobj.Accept();
		mobj.Display();
		
		int iRet=mobj.FreqNumber();
		System.out.println("Frequency of that number is :"+iRet);
		
	}
}

