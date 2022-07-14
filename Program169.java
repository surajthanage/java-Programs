import java.lang.*;
import java.util.*;


/////////////////////////////////////////////////////////////////////////
//
// Function name  : DisplayD
// Description    : Display Divisible by 3 and 5
// Input	      : Number
// Input	      : Number
// Output	      : Integer
// Date	          : 4/07/2022
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
	public void DisplayD()
	{		
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]%5==0&&Arr[i]%3==0)
			{
				System.out.print(" "+Arr[i]);
			}
		}
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept N number from user and Display
// Divisible by 5 and 3.
////////////////////////////////////////////////////////////////////////////

class Program169
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter size of array ");
		
		int iValue=sobj.nextInt();
		
		NumberX obj=new NumberX(iValue);
		obj.Accept();
		obj.Display();
		obj.DisplayD();
	}
}