import java.util.Arrays;
import java.util.List;


public class ListForEach{
	public static void main(String[] args){
		List<String> names = Arrays.asList("James", "Larry", "Tom");
		
		for(String name : names) {
			System.out.println(name + ", ");
		}
	}
}