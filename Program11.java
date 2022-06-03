import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : CountEven
// Description   : use to perfrom of N numbers
// Input	      : Integer
// Output	      : Integer
// Date	          : 8/04/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////

class ArrayX
{
	private int Arr[];
	
	public ArrayX(int iSize)
	{
		Arr= new int[iSize];
	}
	
	public void Accept()
	{
		int iCnt=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr element of array is :");
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.print("Enter "+(iCnt+1)+" Element is : ");
			Arr[iCnt]=sobj.nextInt();
		}
	}
	
	public void Display()
	{
		int iCnt=0;
		System.out.println("Entered element is :");
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.print(" "+Arr[iCnt]);
		}
			System.out.println(" ");		
	}
	
	public int CountEven()
	{
		int iCnt=0;
		int iEvenCnt=0;
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]%2==0)
			{
				iEvenCnt++;
			}
		}
		return iEvenCnt;
	}
}

/////////////////////////////////////////////////////////////////////////
// Accept n number and count frequncy of even number
/////////////////////////////////////////////////////////////////////////

class Program11
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr size of array ");
		int iValue=sobj.nextInt();
		
		ArrayX obj=new ArrayX(iValue);
		
		obj.Accept();
		obj.Display();
		
		int iRet=obj.CountEven();
		System.out.println("Frequncy of even number is : "+iRet);
		
	}
}

///////////////////////////////////////////////////////
//
// Input	:	 N=6
// Element :		66	25	32	27	19	44
// output	:		3
//
///////////////////////////////////////////////////////