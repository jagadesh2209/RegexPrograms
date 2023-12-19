package RegexPrograms;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexInStartEnd 
{

	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile("[a]");
		Matcher m=p.matcher("Ban22a9na");
		
		while(m.find())
		{
			System.out.println(m.start()+"-"+m.end()+":"+m.group());
		}
	}

}
