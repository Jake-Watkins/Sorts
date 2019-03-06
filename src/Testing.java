import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.function.Function;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Testing
{
	private static Map<String, Function<Comparable[], Comparable[]>> commands;
	private static Integer[] scrambled;
	private static Integer[] sorted;
	public static void main(String[] args)
	{
		buildArray();
		buildCommands();
		testFunctions();
	}

	private static void testFunctions()
	{
		for (Map.Entry<String, Function<Comparable[], Comparable[]>> entry : commands.entrySet())
		{
			try
			{
				Integer[] output = (Integer[]) entry.getValue().apply(scrambled);
				if(compareOutputs(output, sorted)){
					System.out.printf("%s returned correctly%n",entry.getKey());
				}
				else{

					System.out.printf("%s returned incorrectly%n",entry.getKey());
				}
			}
			catch (NotImplementedException e){
				System.out.printf("%s not implemented%n",entry.getKey());
			}
		}
	}

	private static boolean compareOutputs(Integer[] output, Integer[] sorted)
	{
		for(int i = 0;i<output.length;i++){
			if(!Objects.equals(output[i], sorted[i])){
				return false;
			}
		}
		return true;
	}

	private static void buildArray()
	{
		scrambled = new Integer[1024];
		Random rand = new Random();
		for (int i = 0; i < scrambled.length; i++)
		{
			scrambled[i] = rand.nextInt();
		}
		sorted = scrambled.clone();
		Arrays.sort(sorted);
	}

	private static void buildCommands()
	{
		commands = new HashMap<>();
		commands.put("selectionSort",(Comparable[] input) -> Sorting.selectionSort(input));
		commands.put("bubbleSort",(Comparable[] input) -> Sorting.bubbleSort(input));
		commands.put("recursiveBubbleSort",(Comparable[] input) -> Sorting.recursiveBubbleSort(input));
		commands.put("insertionSort",(Comparable[] input) -> Sorting.insertionSort(input));
		commands.put("recursiveInsertionSort",(Comparable[] input) -> Sorting.recursiveInsertionSort(input));
		commands.put("mergeSort",(Comparable[] input) -> Sorting.mergeSort(input));
		commands.put("iterativeMergeSort",(Comparable[] input) -> Sorting.iterativeMergeSort(input));
		commands.put("quickSort",(Comparable[] input) -> Sorting.quickSort(input));
		commands.put("iterativeQuickSort",(Comparable[] input) -> Sorting.iterativeQuickSort(input));
		commands.put("heapSort",(Comparable[] input) -> Sorting.heapSort(input));
		commands.put("countingSort",(Comparable[] input) -> Sorting.countingSort(input));
		commands.put("radixSort",(Comparable[] input) -> Sorting.radixSort(input));
		commands.put("bucketSort",(Comparable[] input) -> Sorting.bucketSort(input));
		commands.put("shellSort",(Comparable[] input) -> Sorting.shellSort(input));
		commands.put("timSort",(Comparable[] input) -> Sorting.timSort(input));
		commands.put("combSort",(Comparable[] input) -> Sorting.combSort(input));
		commands.put("pigeonSort",(Comparable[] input) -> Sorting.pigeonSort(input));
		commands.put("cycleSort",(Comparable[] input) -> Sorting.cycleSort(input));
		commands.put("cocktailSort",(Comparable[] input) -> Sorting.cocktailSort(input));
		commands.put("strandSort",(Comparable[] input) -> Sorting.strandSort(input));
		commands.put("bitonicSort",(Comparable[] input) -> Sorting.bitonicSort(input));
		commands.put("pancakeSort",(Comparable[] input) -> Sorting.pancakeSort(input));
		commands.put("binaryInsertionSort",(Comparable[] input) -> Sorting.binaryInsertionSort(input));
		commands.put("bogoSort",(Comparable[] input) -> Sorting.bogoSort(input));
		commands.put("gnomeSort",(Comparable[] input) -> Sorting.gnomeSort(input));
		commands.put("sleepSort",(Comparable[] input) -> Sorting.sleepSort(input));
		commands.put("stoogeSort",(Comparable[] input) -> Sorting.stoogeSort(input));
		commands.put("treeSort",(Comparable[] input) -> Sorting.treeSort(input));
		commands.put("cartesianTreeSort",(Comparable[] input) -> Sorting.cartesianTreeSort(input));
		commands.put("brickSort",(Comparable[] input) -> Sorting.brickSort(input));
		commands.put("threeWayQuickSort",(Comparable[] input) -> Sorting.threeWayQuickSort(input));
		commands.put("threeWayMergeSort",(Comparable[] input) -> Sorting.threeWayMergeSort(input));
	}
}
