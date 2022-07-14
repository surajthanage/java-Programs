import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : DiffSumEvenOdd
// Description    : Difference between summation even and odd number
// Input	      : Number
// Output	      : Integer
// Date	          : 4/07/2022
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
	public int DiffSumEvenOdd()
	{
		int iSumEven=0,iSumOdd=0,iDiff=0;
		
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]%2==0)
			{
				iSumEven+=Arr[i];
			}
			else if(Arr[i]%2!=0)
			{
				iSumOdd+=Arr[i];
			}
		}
		iDiff=iSumEven-iSumOdd;
		return iDiff;
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept N number from user and return  difference
// between summation of even and odd number.
////////////////////////////////////////////////////////////////////////////

class Program166
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter size of array ");
		
		int iValue=sobj.nextInt();
		
		NumberX obj=new NumberX(iValue);
		obj.Accept();
		obj.Display();
		int iRet=obj.DiffSumEvenOdd();
		System.out.println("Difference between summation of even and odd number is : "+iRet);
	}
}