import java.lang.*;
import java.util.*;


///////////////////////////////////////////////////////////////
//
// Function name : Divide
// Description   : use to perfrom of 2 numbers
// Input	      : Integer,Integer
// Output	      : float
// Date	          : 6/04/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////

class NumberX
{
	private int iNo1;
	private int iNo2;
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter first number\n");
		this.iNo1=sobj.nextInt();
		
		System.out.println("Enter Second number\n");
		this.iNo2=sobj.nextInt();
	}
	
	public int Divide()
	{
		if(iNo2==0)
		{
			return -1;
		}
		int iAns=iNo1/iNo2;
		return iAns;
	}
}

///////////////////////////////////////////////////////
// Write a program to perform divided of 2 numbers
//////////////////////////////////////////////////////

class Program1
{
	public static void main(String Arg[])
	{
		NumberX obj=new NumberX();
		
		obj.Accept();
		
		int iRet=obj.Divide();
		System.out.println("Divide ans is :"+iRet);
	}
}


///////////////////////////////////////////////////////
//
// Input	:		15				5
// output	:		3
//
///////////////////////////////////////////////////////
