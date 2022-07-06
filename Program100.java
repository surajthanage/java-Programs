import java.lang.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////
// Accept string from user and Display maximum frequency of character frequency
/////////////////////////////////////////////////////////////////////////////////
class Program100
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
		str=str.toLowerCase();			//conver lower case
		
		char arr[]=str.toCharArray();	//convert string to character array
		int Frequency[]=new int[26];
		int i=0;
		
		for(i=0;i<arr.length;i++)
		{
			Frequency[arr[i]-'a']++;
		}
		
		int iMax=0;
		int iPos=0;
		for(i=0;i<Frequency.length;i++)
		{
			if(Frequency[i]>iMax)
			{
				iMax=Frequency[i];
				iPos=i;
			}
		}
		System.out.println((char)(iPos+'a')+ " occurs "+iMax+" Number of the words");
	}
}
///////////////////////////////////////////////////////
//
// Input	:	aaabbbcccc
// output	:	c occurs 4 Number of the words
//////////////////////////////////////////////////////