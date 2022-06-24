


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

// 0000		0000	0000	0000	0000	0000	0000	0000
//	0		 0		 0		  2	  	  0	     0		 1      0
class Bitwise
{
	public boolean CheckBit(int iNo)
	{
		int iMark=0X00020010;
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
// Write a program which check whether 5th and 18th bit is on or of
/////////////////////////////////////////////////////////////////////////

class Program59
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
// Input	:	16384			131088	
// output	:	Bit is of		Bit is on
//
///////////////////////////////////////////////////////