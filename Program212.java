import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
// Function name  : BiDirectionalSearch
// Description    : Accept n number search another number index
// Input	      : Integer
// Output	      : Integer
// Date	          : 12/07/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class ArrayX
{
	public int iNo;
	public int Arr[];
	
	public ArrayX(int no)
	{
		this.iNo=no;
		this.Arr=new int[iNo];
	}
	protected void finalize()
	{
		Arr=null;
	}
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter "+iNo+" Element");
		for(int i=0;i<Arr.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Element is : ");
			Arr[i]=sobj.nextInt();
		}
	}
	public void Display()
	{
		System.out.println("Element of Array is ");
		
		for(int i=0;i<Arr.length;i++)
		{
			System.out.print(Arr[i]+"\t");
		}
		System.out.println("");
	}
}

class Searching extends ArrayX
{
	public Searching(int no)
	{
		super(no);
	}
	
	public int BiDirectionalSearch(int iNo)
	{
		int iStart=0;
		int iEnd=Arr.length-1;
		int iPos=-1;
		
		while(iStart<=iEnd)
		{
			if(Arr[iStart]==iNo)
			{
				iPos=iStart;
				break;
			}
			if(Arr[iEnd]==iNo)
			{
				iPos=iEnd;
				break;
			}
			iStart++;
			iEnd--;
		}
		return iPos;
	}
	
	public int LinearSearch(int iNo)
	{
		int i=0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]==iNo)
			{
				break;
			}
		}
		if(i==Arr.length)
		{
			return -1;
		}
		else
		{
			return i;
		}
	}
}

///////////////////////////////////////////////////////////////////////////
// Write a program which accept N number and another no number from user 
// and search no number return that number index by BiDirectionalSearch
///////////////////////////////////////////////////////////////////////////

class Program212
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int iValue=sobj.nextInt();
		
		Searching aobj=new Searching(iValue);
		aobj.Accept();
		aobj.Display();
		
		System.out.println("Enetr element that you want to search :");
		int iValue1=sobj.nextInt();
		
		int iRet=aobj.BiDirectionalSearch(iValue1);
		if(iRet==-1)
		{
			System.out.println("There is no such element... ");
		}
		else
		{
			System.out.println("Element is there in the array at index is :"+iRet);
		}
		
		
	}
}

//////////////////////////////////////////////////////////////////////
// Input  : 10	20	30	40	50	60	
// Output :		search 30,		index=2
//			
//////////////////////////////////////////////////////////////////////