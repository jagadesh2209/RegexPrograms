package RegexPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo8 
{
	public static void main(String[] args) 
		{
			Pattern p=Pattern.compile("[a-z]");
			Matcher m=p.matcher("Ban22a9na");
			
			while(m.find())
			{
				System.out.println(m.start()+"-"+m.end()+":"+m.group());
			}
		}
		   

	}


