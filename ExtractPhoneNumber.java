package RegexPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPhoneNumber 
{

	public static void main(String[] args) 
	{
		String regex="[6-9][0-9]{9}";
		String str="abchgdhv9354451340hsvcv5432468438164";
		Matcher m=Pattern.compile(regex).matcher(str);
		while(m.find())
		{
			System.out.println(m.group());
		}
	}

}
