import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name : ToggleBit
// Description   : use to perfrom of 1 number Toggle bit 
// Input	      : Integer
// Output	      : Integer
// Date	          : 4/06/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class Bitwise
{
	public int ToggleBit(int iNo1,int iStart,int iEnd)
	{
		int iMask=0X00000001;
		int iResult=0;
		iMask=iMask<<iStart-1;
		for(int i=iStart;i<iEnd;i++)
		{
			iResult=iNo1^iMask;
			iMask=iMask<<1;
		}
			return iResult;
	}
}

/////////////////////////////////////////////////////////////////////////
// Write a program which accept one number and range from user and
// Toggle bit up to  range.return modified number.
/////////////////////////////////////////////////////////////////////////

class Program77
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr  first number");
		int iValue1=sobj.nextInt();
		
		System.out.println("Enetr  start position number");
		int i1=sobj.nextInt();
		
		System.out.println("Enetr  end position number");
		int i2=sobj.nextInt();
		
		
		Bitwise bobj=new Bitwise();
		int iRet=bobj.ToggleBit(iValue1,i1,i2);
			System.out.println("Updated number is "+iRet);
	}
}


///////////////////////////////////////////////////////
//
// Input	:	897  9  13
// output	:	2945
//
///////////////////////////////////////////////////////