package Java8.Lambdas_and_Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class FilterStrings {
	public static void main(String args[]) {
		List<String> strings= Arrays.asList("ant","apple","bat","amu","amul","all","age","cat");
		List<String> strs=FilterStrings.filterList(strings,(String str)->str.length()==3 && str.startsWith("a"));
		System.out.println("The List of Strings after filtering: "+strs);
	}
	public static List filterList(List<String> list,Predicate<String> predicate) {
		List<String> finalList=new ArrayList<>();
		for(String s:list) {
			if(predicate.test(s)) {
				finalList.add(s);
			}
		}
		return finalList;
	}
}
