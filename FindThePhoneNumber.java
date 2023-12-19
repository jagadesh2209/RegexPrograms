package RegexPrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindThePhoneNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the phone number ");
		String phoneNum=scn.next();
		Matcher m=Pattern.compile("([6-9][0-9]{9})").matcher(phoneNum);
		System.out.println(m.matches());//its shows only the boolean values like enter the number true and fales;
		

	}

}
