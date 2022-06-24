import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name : CountBit
// Description   : use to perfrom of 1 number count ON bit 
// Input	      : Integer
// Output	      : Integer
// Date	          : 3/06/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class Bitwise
{
	public int CountBit(int iNo)
	{
		int iMask=0X00000001;
		int iResult=0,iCnt=0,i=0;
		
		for(i=1;i<=32;i++)
		{
			iResult=iNo&iMask;
			if(iResult!=0)
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
// Count ON bit.return modified number.
/////////////////////////////////////////////////////////////////////////

class Program73
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr number");
		int iValue=sobj.nextInt();
		
		Bitwise bobj=new Bitwise();
		int iRet=bobj.CountBit(iValue);
		System.out.println("Count of ON bit is : "+iRet);
		
		
	}
}


///////////////////////////////////////////////////////
//
// Input	:	11	
// output	:	3
//
///////////////////////////////////////////////////////