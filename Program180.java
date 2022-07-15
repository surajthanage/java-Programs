import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : ProductOdd
// Description    : product of all odd number
// Input	      : Integer
// Output	      : Integer
// Date	          : 6/07/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class NumberX
{
	public int iNo;
	public int Arr[];
	
	public NumberX(int a)
	{
		this.iNo=a;
		this.Arr=new int[iNo];
	}
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enetr "+iNo+" Element of Array");
		
		 for(int i=0;i<Arr.length;i++)
		 {
			Arr[i]=sobj.nextInt();
		 }
	}
	
	public void Display()
	{
		System.out.println("Element of array is ");
		
		for(int i=0;i<Arr.length;i++)
		{
			System.out.print(" "+Arr[i]);
		}
		System.out.println("");
	}
	public int ProductOdd()
	{		
		int iMult=1;
		for(int i=0;i<Arr.length;i++)
		{
			
			if(Arr[i]%2!=0)
			{
				iMult*=Arr[i];
			}
		}
		return iMult;
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept N number from user and 
// return produt of all odd number.
////////////////////////////////////////////////////////////////////////////

class Program180
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter size of array ");
		
		int iValue=sobj.nextInt();
		
		NumberX obj=new NumberX(iValue);
		obj.Accept();
		obj.Display();
		int iRet=obj.ProductOdd();
		System.out.println("Product of all number is :"+iRet);
	}
}