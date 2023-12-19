package RegexPrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckThePassword {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the password");
		String pass=scn.next();
		
		String regex= "(?=.*[!@%#^&*])(?=.*[0-9])(?=.*[A-Z]).{5,10}";
		Matcher m=Pattern.compile(regex).matcher(pass);
		System.out.println(m.matches());
	}
}
