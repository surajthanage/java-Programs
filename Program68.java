import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name : Checkbit
// Description   : use to perfrom of 1 number Toggle Bit 
// Input	      : Integer
// Output	      : Boolean
// Date	          : 3/06/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class Bitwise
{
	public boolean CheckBit(int iNo,int iPos)
	{
		int iMask=0X00000001;
		int iResult=0;
		iMask=iMask<<iPos-1;
		iResult=iNo&iMask;
		
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
// Write a program which accept one number from user and enter 
// cheeck position and check bit on or off that number
/////////////////////////////////////////////////////////////////////////

class Program68
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr number");
		int iValue=sobj.nextInt();
		
		System.out.println("Enetr postion to chech bit is :");
		int iNo=sobj.nextInt();
		
		Bitwise bobj=new Bitwise();
		boolean bRet=bobj.CheckBit(iValue,iNo);
		if(bRet==true)
		{
			System.out.println("Bit is on");
		}
		else
		{
			System.out.println("Bit is off");
		}
		
	}
}


///////////////////////////////////////////////////////
//
// Input	:	10		2		
// output	:	true
//
///////////////////////////////////////////////////////