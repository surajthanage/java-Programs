import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
// Function name  : 1.BubbleSort  2.InsertionSort  3.SelectionSort
// Description    : Accept N number perform sorting operation
// Input	      : Integer
// Output	      : Integer
// Date	          : 12/07/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

interface MarvellousSort
{
	public void Accept();
	public void Display();
	public void BubbleSort();
	
}

class ArrayX implements MarvellousSort
{
	public int Arr[];
	
	public ArrayX(int iSize)
	{
		Arr=new int[iSize];
	}
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enetr element of array");
		
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}
	}
	public void Display()
	{
		
		System.out.println("element of array");
		
		for(int i=0;i<Arr.length;i++)
		{
			System.out.print(Arr[i]+"\t");
		}
		System.out.println("");
	}
	public void BubbleSort()
	{
		int i=0,j=0,temp=0;
		
		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<Arr.length-1;j++)
			{
				if(Arr[j]>Arr[j+1])
				{
					temp=Arr[j];
					Arr[j]=Arr[j+1];
					Arr[j+1]=temp;
				}
			}
		}
	}
	
}


///////////////////////////////////////////////////////////////////////////
// Write a program which accept N number and another no number from user 
// and search no number return that number index where Array is sorted
///////////////////////////////////////////////////////////////////////////

class Program214
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int iValue=sobj.nextInt();
		
		ArrayX aobj=new ArrayX(iValue);
		aobj.Accept();
		aobj.Display();
		aobj.BubbleSort();
		System.out.println("Data after sorting");
		aobj.Display();
		
		
	}
}
