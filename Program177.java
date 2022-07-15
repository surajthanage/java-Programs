import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : FirstOcc
// Description    : return first occurance of that number
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
	public int FirstOcc(int no)
	{		
		int i=0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]==no)
			{
				break;
			}
		}
		return i;
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept N number from user and accept another number
// and return of indext of first occurance.
////////////////////////////////////////////////////////////////////////////

class Program177
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
		
		int iRet=obj.FirstOcc(iValue2);
		System.out.println("First occurance of that "+iValue2+ " is "+iRet);
	}
}