import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : ThreeDigitNo
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
		Arr=new int[iSize];
	}
	
	public void Accept()
	{
		int iCnt=0;
		
		Scanner sobj =new Scanner(System.in);
		
		System.out.println("Enetr element is :");
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.print(" Enetr "+(iCnt+1)+" Element is: ");
			Arr[iCnt]=sobj.nextInt();
		}
	}
	public void Display()
	{
		int iCnt=0;
		System.out.println("Enetred element is :");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.print(" "+Arr[iCnt]);
		}
		System.out.println(" ");
	}
	
	public void ThreeDigitNo()
	{
		int iDigit=0,iDigiCnt=0;
		int iCnt=0;
		int iNo=0;
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			iDigiCnt=0;
			iNo=Arr[iCnt];
			
			while(iNo!=0)
			{
				iDigit=iNo%10;
				iDigiCnt++;
				iNo=iNo/10;
			}
			if(iDigiCnt==3)
			{
				System.out.print(" "+Arr[iCnt]);
			}
		}
		System.out.println(" ");
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
		System.out.println("Three digit number is ;");
		obj.ThreeDigitNo();
		
	}
}

///////////////////////////////////////////////////////
//
// Input	:	 N=6
// Element :		666	 25  32	  227	 19	 44
// output	:		666		227
//
///////////////////////////////////////////////////////