package week2day2;

import java.util.regex.Pattern;

import org.hamcrest.Matcher;

public class Learnregexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		String pat = "[abc]";
		Pattern p = Pattern.compile(pat);
		java.util.regex.Matcher m = p.matcher(str);
		System.out.println(m);

	}

}
