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

// 0000		1000	0001	0000	0100	0000	0100	0000
//	0		 8		 1  	  0	  	 4		 0		  4       0
class Bitwise
{
	public boolean CheckBit(int iNo)
	{
		int iMark=0X08104040;
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

/////////////////////////////////////////////////////////////////////////////
// Write a program which check whether 7th,15th,21th and 9th bit is on or of
/////////////////////////////////////////////////////////////////////////////

class Program60
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