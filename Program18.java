import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : MultFact
// Description   : use to perfrom of 1 numbers
// Input	      : Integer
// Output	      : Integer
// Date	          : 10/04/2022
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
	
	public int MultFact()
	{
		int iCnt=0,iFact=1;
		for(iCnt=1;iCnt<iNo;iCnt++)
		{
			if(iNo%iCnt==0)
			{
				iFact=iFact*iCnt;
			}
		}
		return iFact;
	}
}

/////////////////////////////////////////////////
// Accept  number to perfrom factorial
////////////////////////////////////////////////

class Program18
{
	public static void main(String Arg[])
	{
		NumberX obj=new NumberX();
		obj.Accept();
		int iRet=obj.MultFact();
		System.out.println(" Factoriay is : "+iRet);
	}
}

///////////////////////////////////////////////
//
// Input	:	12
// output	:	(1*2*3*4*6) 144
//			
////////////////////////////////////////////////