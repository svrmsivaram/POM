package week7Day1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		int i =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input String:");
		String str = sc.nextLine();
		String pat ="[ ]";
		Pattern patern = Pattern.compile(pat);
		Matcher match = patern.matcher(str);
		
		while(match.find()){
			i++;
		}
		
		System.out.println("Total no.of Words in the String:"+(i+1));
		sc.close();
	}

}
