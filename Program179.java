import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : DisplayRange
// Description    : Display all element  from that range
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
	public void DisplayRange(int no1,int no2)
	{		
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]>no1&&Arr[i]<no2)
			{
				System.out.print(" "+Arr[i]);
			}
		}
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept N number from user and accept range
// Display all elementfrom that range.
////////////////////////////////////////////////////////////////////////////

class Program179
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter size of array ");
		
		int iValue=sobj.nextInt();
		
		NumberX obj=new NumberX(iValue);
		obj.Accept();
		obj.Display();
		
		System.out.println("Enter starting point ");	
		int iStart=sobj.nextInt();
		System.out.println("Enter ending point ");	
		int iEnd=sobj.nextInt();
		
		obj.DisplayRange(iStart,iEnd);
	}
}