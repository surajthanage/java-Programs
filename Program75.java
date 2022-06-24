import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name : CheckBit
// Description   : use to perfrom of 1 number check ON bit 
// Input	      : Integer
// Output	      : Integer
// Date	          : 4/06/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class Bitwise
{
	public boolean CheckBit(int iNo1)
	{
		int iMask=0X00000900;
		int iResult=0;
		iResult=iNo1&iMask;
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
// Write a program which accept one number and position from user and
// Check bit ON or OFF bit.return modified number.
/////////////////////////////////////////////////////////////////////////

class Program75
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr  first number");
		int iValue1=sobj.nextInt();
		
		
		Bitwise bobj=new Bitwise();
		boolean bRet=bobj.CheckBit(iValue1);
		if(bRet==true)
		{
			System.out.println("Bit is ON");
		}
		else
		{
			System.out.println("Bit is OFF");
		}
	}
}


///////////////////////////////////////////////////////
//
// Input	:	257
// output	:	true
//
///////////////////////////////////////////////////////