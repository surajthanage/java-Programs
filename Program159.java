import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : ChkIdentity
// Description    : check identity matrix or not
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
	
	public boolean ChkIdentity()
	{
		int i=0,j=0,iCnt=0,iCnt1=0,iCnt2=0;
		
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				if(i==j)
				{
					if(Arr[i][j]==1)
						iCnt1++;
				}
				else if((i>j)||(i<j))
				{
					if(Arr[i][j]==0)
					iCnt2++;
				}
			}
		}
		iCnt=iCnt1+iCnt2;
		if(iCnt==(Arr.length*iRow))
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
// the matrix is identity matrix or not
////////////////////////////////////////////////////////////////////////////

class Program159
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
		boolean bRet=mobj.ChkIdentity();
		if(bRet==true)
		{
			System.out.println("This Matrix is identity matrix");
		}
		else
		{
			System.out.println("This Matrix is not identity");
		}
		
	}
}

