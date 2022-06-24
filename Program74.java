import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name : CountBit
// Description   : use to perfrom of 1 number common ON bit 
// Input	      : Integer
// Output	      : Integer
// Date	          : 3/06/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class Bitwise
{
	public int CountBit(int iNo1,int iNo2)
	{
		int iMask=0X00000001;
		int iResult1=0,iResult2=0,iCnt=0,i=0;
		
		for(i=1;i<=32;i++)
		{
			iResult1=iNo1&iMask;
			iResult2=iNo2&iMask;
			if((iResult1==iResult2)&(iResult1!=0)&(iResult2!=0))
			{
				iCnt++;
			}
			iMask=iMask<<1;
		}
		return iCnt;
	}
}

/////////////////////////////////////////////////////////////////////////
// Write a program which accept one number and position from user and
// Common ON bit.return modified number.
/////////////////////////////////////////////////////////////////////////

class Program74
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr  first number");
		int iValue1=sobj.nextInt();
		
		System.out.println("Enetr  second number");
		int iValue2=sobj.nextInt();
		
		Bitwise bobj=new Bitwise();
		int iRet=bobj.CountBit(iValue1,iValue2);
		System.out.println("Common of ON bit  is : "+iRet);
		
		
	}
}


///////////////////////////////////////////////////////
//
// Input	:	10	15
// output	:	2
//
///////////////////////////////////////////////////////