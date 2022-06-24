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
	public boolean CheckBit(int iNo1,int iPos1,int iPos2)
	{
		int iMask=0X00000001;
		int iResult=0;
		int iMask1=iMask<<iPos1-1;
		int iMask2=iMask<<iPos2-1;
		int iMask3=iMask1+iMask2;
		iResult=iNo1&iMask3;
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
// Write a program which accept one number and two position from user and
// Check bit ON or OFF bit.return modified number.
/////////////////////////////////////////////////////////////////////////

class Program76
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr  first number");
		int iValue1=sobj.nextInt();
		
		System.out.println("Enetr  first position number");
		int i1=sobj.nextInt();
		
		System.out.println("Enetr  second position number");
		int i2=sobj.nextInt();
		
		
		Bitwise bobj=new Bitwise();
		boolean bRet=bobj.CheckBit(iValue1,i1,i2);
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
// Input	:	10	3	7
// output	:	true
//
///////////////////////////////////////////////////////