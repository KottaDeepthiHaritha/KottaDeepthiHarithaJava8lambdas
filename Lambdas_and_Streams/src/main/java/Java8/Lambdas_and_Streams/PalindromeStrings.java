package Java8.Lambdas_and_Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class PalindromeStrings {
	public static void main(String args[]) {
		List<String> strings= Arrays.asList("abba","ccvvdvvcc","llkkll","aas","jjii","iiuoouii");
		List<String> palindromes=PalindromeStrings.Palindrome(strings,(str)->PalindromeStrings.isPalindrome((String) str));
		System.out.println("The List of Strings which are palindromes: "+palindromes);
	}
	public static List<String> Palindrome(List<String> list,Predicate<String> predicate) {
		List<String> finalList=new ArrayList<String>();
		for(String s:list) {
			if(predicate.test(s)) {
				finalList.add(s);
			}
		}
		return finalList;
	}
	public static boolean isPalindrome(String str) {
		StringBuffer p=new StringBuffer();
		for(int i=str.length()-1;i>=0;i--) {
			p=p.append(str.charAt(i));
		}
		if(str.equalsIgnoreCase(p.toString())) {
			return true;
		}
		else {
			return false;
		}
		
	}
}