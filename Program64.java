import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name : Checkbit
// Description   : use to perfrom of 1 number off Bit 
// Input	      : Integer
// Output	      : Integer
// Date	          : 1/06/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

// 1000		0000	0000	0000	0000	0000	0100	0000
//	8		 0		 0		  0	  	 0		 2		4         0
class Bitwise
{
	public int CheckBit(int iNo)
	{
		int iMark=0X00000240;
		int iResult=0;
		
		iResult=iNo^iMark;
		
		return iResult;
		
	}
}

/////////////////////////////////////////////////////////////////////////
// Write a program which accept one number from user and
// off 7th and 10th bit of that number if it is on
/////////////////////////////////////////////////////////////////////////

class Program64
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enetr number");
		int iValue = sobj.nextInt();
		
		Bitwise obj=new Bitwise();
		int iRet=obj.CheckBit(iValue);
		System.out.println("Updated number is :"+iRet);
		
	}
}


///////////////////////////////////////////////////////
//
// Input	:	577		
// output	:	1
//
///////////////////////////////////////////////////////