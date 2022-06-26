import java.lang.*;
import java.util.*;

///////////////////////////////////////////////////////////////
//
// Function name  : strConcat
// Description    : use to perfrom of two string concatination
// Input	      : String
// Output	      : String
// Date	          : 14/04/2022
// Author	      : Suraj Sanjay Thanage
//
//////////////////////////////////////////////////////////////

class StringX
{
	public String StrConcat(String str1,String str2)
	{
		String str3=" ";
		
		str3=str1+str2;
		
		return str3;
	}
}

/////////////////////////////////////////////////////////////////////////
// Accept two string from user and that string are concatination
/////////////////////////////////////////////////////////////////////////

class Program80
{
	public static void main(String Arg[])
	{		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter first string");
		String str1=sobj.nextLine();
		
		System.out.println("Enter second string");
		String str2=sobj.nextLine();
		
		StringX obj=new StringX();
		
		String sRet=obj.StrConcat(str1,str2);
		
		System.out.println("Concatination string are : "+sRet);
	
		
	}
}
///////////////////////////////////////////////////////
//
// Input	:	 NITIN  NIKITA
// output	:	 NITINNIKITA
//				
///////////////////////////////////////////////////////