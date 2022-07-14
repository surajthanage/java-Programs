import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : AddColumn
// Description    : Addition of each column
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
		
		for(int i=0;i<iCol;i++)
		{
			for(int j=0;j<iRow;j++)
			{
				Arr[i][j]=sobj.nextInt();
			}
		}
	}
	public void Display()
	{
		int i=0,j=0;
		System.out.println("Element of matrix is :");
		
		for(i=0;i<iCol;i++)
		{
			for(j=0;j<iRow;j++)
			{
				System.out.print(" "+Arr[i][j]);
			}
			System.out.println(" ");
		}
	}
	
	public void AddColumn()
	{
		int i=0,j=0,iSum=0;
		
		for(i=0;i<iCol;i++)
		{
			for(j=0;j<iRow;j++)
			{
				
				iSum+=Arr[j][i];
			}
			System.out.println(" "+iSum);
			iSum=0;
		}
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept matrix from user and return 
// maximum  number of both diagonal
////////////////////////////////////////////////////////////////////////////

class Program154
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
		
		mobj.AddColumn();
	}
}

