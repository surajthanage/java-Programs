import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
// Function name  : StrNCatX
// Description    : concat tow string
// Input	      : String
// Output	      : String
// Date	          : 7/07/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////////////////

class StringX
{
	public String str1;
	public String str2;
	public int iNo;
	
	public StringX(String src,String dest,int a)
	{
		this.str1=src;
		this.str2=dest;
		this.iNo=a;
	}
	
	public String StrNCatX()
	{		
		char Arr[]=str1.toCharArray();
		
		int i=0;
		for(i=0;i<iNo;i++)
		{
			
			sb.append(Arr[i]);
			
		}
		String str=str1+sb.toString();
		return (str);
	}
}

////////////////////////////////////////////////////////////////////////////
// Write a program which accept two string from user and concat N charcter
// of second string after first string.
////////////////////////////////////////////////////////////////////////////

class Program181
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter first string");
		String str1=sobj.nextLine();
		
		System.out.println("Enter second string");
		String str2=sobj.nextLine();
		
		System.out.println("Enter  number you want to concat no of string chracter");
		int iValue=sobj.nextInt();
		
		StringX obj=new StringX(str1,str2,iValue);
		
		String str=obj.StrNCatX();
		System.out.println("Concat string are :"+str);
		
		
	}
}