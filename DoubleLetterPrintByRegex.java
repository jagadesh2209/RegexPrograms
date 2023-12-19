package RegexPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DoubleLetterPrintByRegex {

	public static void main(String[] args) {
		String s="Successs";
		Matcher m=Pattern.compile("([a-z])\\1").matcher(s);//when we use the {a-z])\\1 + on\\1}+ then only it shows the 3 letters other wise its shows only double
		
		while(m.find())
		{
			System.out.print(m.group());
		}

	}

}
