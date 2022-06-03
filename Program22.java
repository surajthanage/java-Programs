import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : SumFact
// Description   : use to perfrom of 1 numbers
// Input	      : Integer
// Output	      : Integer
// Date	          : 11/04/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////

class NumberX
{
	private int iNo;
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enetr number ");
		this.iNo=sobj.nextInt();
	}
	
	public int SumFact()
	{
		int iCnt=0,iSum=0;
		for(iCnt=1;iCnt<iNo;iCnt++)
		{
			if(iNo%iCnt==0)
			{
				iSum=iSum+iCnt;
			}
		}
		return iSum;
	}
}

/////////////////////////////////////////////////////////
// Accept  number to perfrom Summation of factorial
/////////////////////////////////////////////////////////

class Program22
{
	public static void main(String Arg[])
	{
		NumberX obj=new NumberX();
		obj.Accept();
		int iRet=obj.SumFact();
		System.out.println("Summation of non factor is : "+iRet);
	}
}

///////////////////////////////////////////////
//
// Input	:	12		10
// output	:	16		8
//			
////////////////////////////////////////////////