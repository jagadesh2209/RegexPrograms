package RegexPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SapreteNumberGivenString 
{

	public static void main(String[] args) 
	{
		String regex=("[0-9][0-9]");
		String str="a45b3c59d66abg6"; //its compare the double number.cannot show the single digit
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str);
		
		while(m.find())
		{
			System.out.print(m.group());
		}
	}

}
