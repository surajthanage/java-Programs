import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : Range
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
	private int iNo1;
	private int iNo2;
	
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
		System.out.println("Enetr starting point is : ");
		this.iNo1=sobj.nextInt();
		
		System.out.println("Enetr ending point is : ");
		this.iNo2=sobj.nextInt();
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
		System.out.println("Enetr starting point is : "+iNo1);
		System.out.println("Enetr ending point is : "+iNo2);

	}
	
	public void Range()
	{
		int iCnt=0;
		int iCount=0;
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if((Arr[iCnt]>iNo1)&&(Arr[iCnt]<iNo2))
			{
				System.out.print(" "+Arr[iCnt]);
			}
		}
		System.out.print(" ");
	}
}

/////////////////////////////////////////////////////////////////////////
// Accept n number and count frequncy of another number no
/////////////////////////////////////////////////////////////////////////

class Program12
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr size of array ");
		int iValue=sobj.nextInt();
		
		ArrayX obj=new ArrayX(iValue);
		
		obj.Accept();
		obj.Display();
		
		obj.Range();
		
	}
}

///////////////////////////////////////////////////////
//
// Input	:	 N=6
// Element :		66	25	32	27	19	44
// output	:		3
//
///////////////////////////////////////////////////////