import java.lang.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////
// Accept string from user and display largest word 
/////////////////////////////////////////////////////////////////////////////////
class Program93
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
		String newstr=str.replaceAll("\\s+"," ");
		String newstr2=newstr.trim();
		String arr[]=newstr2.split(" ");
		
		int iMax=0;
		int iPos=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>=iMax)
			{
				iMax=arr[i].length();
				iPos=i;
			}
		}
		System.out.println("Largest length is : "+iMax);
		System.out.println("Largest word is : "+arr[iPos]);
	}
}
///////////////////////////////////////////////////////
//
// Input	:	India is  my country
// output	:	country
///////////////////////////////////////////////////////