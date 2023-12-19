package RegexPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberInGivenString {

	public static void main(String[] args) 
	{
		String st="abjhdf6634598990"; // it takes only the 10digit only 
		String regex="[6-9][0-9]{9}";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(st);
		while(m.find())
		{
			System.out.println(m.group());
		
		}
	}

}
