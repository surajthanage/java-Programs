import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name : Offbit
// Description   : use to perfrom of 1 number return modified number
// Input	      : Integer
// Output	      : Integer
// Date	          : 3/06/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class Bitwise
{
	public int OffBit(int iNo,int iPos)
	{
		int iMask=0X00000001;
		int iResult=0;
		
		iMask=iMask<<iPos-1;
		iResult=iNo&iMask;
		if(iResult==1)
		{
			return iNo;
		}
		else
		{
			iResult=iNo|iMask;
		}
		return iResult;
	}
}

/////////////////////////////////////////////////////////////////////////
// Write a program which accept one number and position from user and
// on that bit.return modified number.
/////////////////////////////////////////////////////////////////////////

class Program70
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr number");
		int iValue=sobj.nextInt();
		
		System.out.println("Enetr postion to chech bit is :");
		int iNo=sobj.nextInt();
		
		Bitwise bobj=new Bitwise();
		int iRet=bobj.OffBit(iValue,iNo);
		System.out.println("Updated number is : "+iRet);
		
		
	}
}


///////////////////////////////////////////////////////
//
// Input	:	10		3
// output	:	14
//
///////////////////////////////////////////////////////