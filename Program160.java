import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : ChkSparse
// Description    : check sparse matrix or not
// Input	      : Integer
// Output	      : Integer
// Date	          : 2/07/2022
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
	
	public boolean ChkSparse()
	{
		int i=0,j=0,iCnt1=0,iCnt2=0;
		
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{			
				if(Arr[i][j]==0)
				iCnt1++;
				else if(Arr[i][j]!=0)
				iCnt2++;				
			}
		}
		if(iCnt1>iCnt2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept matrix from user and check whether 
// the matrix is sparse matrix or not
////////////////////////////////////////////////////////////////////////////

class Program160
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
		boolean bRet=mobj.ChkSparse();
		if(bRet==true)
		{
			System.out.println("This Matrix is sparse matrix");
		}
		else
		{
			System.out.println("This Matrix is not sparse matrix");
		}
		
	}
}

