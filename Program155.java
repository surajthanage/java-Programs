import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : SwapRow
// Description    : Swap Row
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
	public int Arr[][];
	
	public Matrix(int a,int b)
	{
		this.iRow=a;
		this.iCol=b;
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
	
	public void SwapRow()
	{
		int i=0,j=0,Temp=0;
		
		for(i=0;i<iRow-1;i+=2)
		{
			for(j=0;j<iCol;j++)
			{
				Temp=Arr[i][j];
				Arr[i][j]=Arr[i+1][j];
				Arr[i+1][j]=Temp;
			}
		}
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept matrix from user and  
// Swap the Row
////////////////////////////////////////////////////////////////////////////

class Program155
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int X=sobj.nextInt();
		
		System.out.println("Enter number of column");
		int Y=sobj.nextInt();
	
		Matrix mobj=new Matrix(X,Y);
		mobj.Accept();
		mobj.Display();	
		System.out.println("After swaping Row");
		mobj.SwapRow();
		mobj.Display();
	}
}
