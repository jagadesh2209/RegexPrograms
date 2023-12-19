package RegexPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumNumberByREgexMEthod {

	public static void main(String[] args)
	{
		String s="adsmns632afjuf457a";
		Matcher m=Pattern.compile("[0-9]").matcher(s); //when we use the "[0-9]+" like this its calculate the number not the digit.
		
		int sum=0;
		while(m.find())
		{
			sum+=Integer.parseInt(m.group());
		}
		System.out.println(sum);
	}

}
