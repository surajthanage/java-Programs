import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : Check
// Description   : use to perfrom of N numbers
// Input	      : Integer,Integer
// Output	      : TRUE or FALSE
// Date	          : 6/04/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////

class ArrayX
{
	private int Arr[];
	private int iNo;
	
	public ArrayX(int iSize)
	{
		Arr=new int[iSize];
	}
	
	public void Accept()
	{
		int iCnt=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr the element\n");
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.print(" Enter "+(iCnt+1)+" Element is :  ");
			Arr[iCnt]=sobj.nextInt();
		}
		
		System.out.println("Enter  another  check number of element\n");
		this.iNo=sobj.nextInt();
	}
	
	public void Display()
	{
		System.out.println("entered element is : ");
		
		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.print(" "+Arr[iCnt]);
		}
		
		System.out.println("Your  Check number is :"+iNo);
	}
	
	public boolean Check()
	{
		int iCnt=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]==iNo)
			{
				break;
			}
		}
		if(Arr[iCnt]==iNo)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

/////////////////////////////////////////////////////////////////////////
// Accept N number from user and check another number iNo present or not
/////////////////////////////////////////////////////////////////////////

class Program2
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr number of Element ");
		int iValue=sobj.nextInt();
		
		ArrayX obj=new ArrayX(iValue);
		obj.Accept();
		obj.Display();
		
		boolean iRet=obj.Check();
		if(iRet==true)
		{
			System.out.println("number is present");
		}
		else
		{
			System.out.println("Number is not present");
		}
	}
}


///////////////////////////////////////////////////////
//
// Input	:	N = 6	 ;	iNo	= 66
// Element :	85	66	3	66	93	88	
// output	:		true
//
///////////////////////////////////////////////////////