import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Testing
{
	private static Map<String, Function<Comparable, Comparable>> commands;
	public static void main(String[] args){
		Integer[] arr = new Integer[1024];
		Random rand = new Random();
		for(int i = 0;i<arr.length;i++){
			arr[i] = rand.nextInt();
		}
		
		buildCommands();
	}

	//TODO: Implement
	private static void buildCommands()
	{
		commands = new HashMap<>();
		throw new NotImplementedException();
	}
}
