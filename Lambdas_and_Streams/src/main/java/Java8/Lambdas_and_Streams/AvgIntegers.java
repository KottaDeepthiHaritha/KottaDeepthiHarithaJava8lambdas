package Java8.Lambdas_and_Streams;
import java.util.*; 
public class AvgIntegers{
	private static Object List;
	public static void main(String[] args) 
    {
        List<Integer> numbers = Arrays.asList(3,4,5,6,7,8,1,1,3,2);
        OptionalDouble num=numbers.stream().mapToInt(Integer::intValue).average();
        System.out.println("The average of list of Integers: "+num.getAsDouble());
    }

}