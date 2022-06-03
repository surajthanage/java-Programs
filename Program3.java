import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : MaximumNumber
// Description   : use to perfrom of N numbers
// Input	      : Integer,Integer
// Output	      : Integer
// Date	          : 6/04/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////

class ArrayX
{
	private int Arr[];
	public int iMax;
	
	public ArrayX(int iSize)
	{
		Arr=new int[iSize];
	}
	
	public void Accept()
	{
		int iCnt=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter  Element is :");
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.print("Enter "+(iCnt+1)+" Element is : ");
			Arr[iCnt]=sobj.nextInt();
		}
	}
	
	public void Display()
	{
		int iCnt=0;
		System.out.println("Enetred  Element is : ");
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.print("\t"+Arr[iCnt]);
		}
		System.out.println(" ");
	}
	
	public int MaximumNumber()
	{
		int iCnt=0;
		iMax=Arr[0];
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(iMax<Arr[iCnt])
			{
			iMax=Arr[iCnt];
			}
		}
		return iMax;
		
	}
}

/////////////////////////////////////////////////////////////////////////
// Accept N number from user and return largest number
/////////////////////////////////////////////////////////////////////////

class Program3
{
	public static void main(String Arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enetr size of array is :");
		int iValue=sobj.nextInt();
		
		ArrayX obj=new ArrayX(iValue);
		
		obj.Accept();
		obj.Display();
		
		int iRet=obj.MaximumNumber();
		System.out.println("Maximum number is : "+iRet);	
	}
	

}


///////////////////////////////////////////////////////
//
// Input	:	N = 6	 
// Element :	85	66	3	66	93	88	
// output	:		93
//
///////////////////////////////////////////////////////