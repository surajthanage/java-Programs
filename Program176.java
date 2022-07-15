import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : Check
// Description    : Check number is present or not
// Input	      : Integer
// Output	      : Integer
// Date	          : 6/07/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class NumberX
{
	public int iNo;
	public int Arr[];
	
	public NumberX(int a)
	{
		this.iNo=a;
		this.Arr=new int[iNo];
	}
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enetr "+iNo+" Element of Array");
		
		 for(int i=0;i<Arr.length;i++)
		 {
			Arr[i]=sobj.nextInt();
		 }
	}
	
	public void Display()
	{
		System.out.println("Element of array is ");
		
		for(int i=0;i<Arr.length;i++)
		{
			System.out.print(" "+Arr[i]);
		}
		System.out.println("");
	}
	public boolean Check(int no)
	{		
		int i=0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]==no)
			{
				break;
			}
		}
		if(i==Arr.length)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept N number from user and accept another number
// and check number is present or not.
////////////////////////////////////////////////////////////////////////////

class Program176
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter size of array ");
		
		int iValue=sobj.nextInt();
		
		NumberX obj=new NumberX(iValue);
		obj.Accept();
		obj.Display();
		System.out.println("Enter number you want to check ");
		
		int iValue2=sobj.nextInt();
		
		boolean bRet=obj.Check(iValue2);
		
		if(bRet==true)
			System.out.println(iValue2+ " is present ");
		else
			System.out.println(iValue2+ " is not present");
	}
}