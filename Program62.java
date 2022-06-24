import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name : Checkbit
// Description   : use to perfrom of 1 number Check Bit on or of
// Input	      : Integer
// Output	      : Boolean
// Date	          : 1/06/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

// 0000		0000	0000	0000	0000	0001	1100	0000
//	0		 0		 0		  0	  	 0		 1		C      0
class Bitwise
{
	public boolean CheckBit(int iNo)
	{
		int iMark=0X000001C0;
		int iResult=0;
		iResult=iNo&iMark;
		if(iResult==0)
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
}

/////////////////////////////////////////////////////////////////////////
// Write a program which check whether 1st and last bit is on or of
/////////////////////////////////////////////////////////////////////////

class Program62
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enetr number");
		int iValue = sobj.nextInt();
		
		Bitwise obj=new Bitwise();
		boolean bRet=obj.CheckBit(iValue);
		
		if(bRet==true)
		{
			System.out.println("Bit is on");
		}
		else
		{
			System.out.println("Bit is of");
		}
		
	}
}


///////////////////////////////////////////////////////
//
// Input	:	16384				
// output	:	Bit is on
//
///////////////////////////////////////////////////////