package RegexPrograms;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class RegexDemo1 
{

	public static void main(String[] args) 
	{
	   Pattern p=Pattern.compile("n");
	   Matcher m=p.matcher("banana");

	int count=0;
	while(m.find())
	{
		count++;
	}
	System.out.println(count);
	}
 

}
