import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name : Togglebit
// Description   : use to perfrom of 1 number on Bit 
// Input	      : Integer
// Output	      : Integer
// Date	          : 2/06/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

// 1000		0000	0000	0000	0000	0000	0000	1111
//	0		 0		 0		  0	  	 0		0   	0         F
class Bitwise
{
	public int OnBit(int iNo)
	{
		int iMask=0X0000000F;
		int iResult=0;
		iResult=iNo|iMask;
		return iResult;

	}
}

/////////////////////////////////////////////////////////////////////////
// Write a program which accept one number from user and
// toggle 7th and 10th bit of that number.return modified number.
/////////////////////////////////////////////////////////////////////////

class Program67
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr number");
		int iValue=sobj.nextInt();
		
		Bitwise bobj=new Bitwise();
		int iRet=bobj.OnBit(iValue);
		System.out.println("Updated number is : "+iRet);
		
		
	}
}


///////////////////////////////////////////////////////
//
// Input	:	73		
// output	:	79
//
///////////////////////////////////////////////////////