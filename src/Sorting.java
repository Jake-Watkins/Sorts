import sun.reflect.generics.reflectiveObjects.NotImplementedException;

class Sorting
{
	static Comparable[] selectionSort(Comparable[] arr)
	{
		Comparable minValue;
		int index;
		for(int i = 0;i<arr.length;i++){
			minValue = arr[i];
			index = i;

			//find i-th minimum value
			for(int j = i+1;j<arr.length;j++){
				if(minValue.compareTo(arr[j])>=0){
					minValue = arr[j];
					index = j;
				}
			}

			//swap ith minimum value into ith position
			arr[index] = arr[i];
			arr[i] = minValue;
		}
		return arr;
	}

	static Comparable[] bubbleSort(Comparable[] arr)
	{
		Comparable temp;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length - i - 1; j++)
			{
				if (arr[j].compareTo(arr[j + 1]) >= 0)
				{
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	static Comparable[] recursiveBubbleSort(Comparable[] arr)
	{
		return recursiveBubbleSort(arr, arr.length);
	}

	private static Comparable[] recursiveBubbleSort(Comparable[] arr, int index)
	{
		//base case
		if (index == 1)
		{
			return arr;
		}

		//recursive case
		//starts with the largest number and each call finds the length - indexth largest number
		Comparable temp;
		for (int i = 0; i < index - 1; i++)
		{
			if (arr[i].compareTo(arr[i + 1]) >= 0)
			{
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		return recursiveBubbleSort(arr, index - 1);
	}

	//TODO: Implement insertionSort
	static Comparable[] insertionSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement recursiveInsertionSort
	static Comparable[] recursiveInsertionSort(Comparable[] arr)
	{
		return recursiveInsertionSort(arr, arr.length - 1);
	}

	private static Comparable[] recursiveInsertionSort(Comparable[] arr, int index)
	{
		//base case
		if (index == 1)
		{
			return arr;
		}
		//recursive case
		arr = recursiveInsertionSort(arr, index - 1);

		//sort the next element
		Comparable next = arr[index];

		//sort into range 0 to index - 2
		int j = index - 1;
		while (j >= 0 && next.compareTo(arr[j]) < 0)
		{
			arr[j + 1] = arr[j];
			j = j - 1;
		}

		//j+1 since j could be -1 in the case it is the first element
		arr[j + 1] = next;
		return arr;
	}

	//TODO: Implement mergeSort
	static Comparable[] mergeSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement iterativeMergeSort
	static Comparable[] iterativeMergeSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement quickSort
	static Comparable[] quickSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement iterativeQuickSort
	static Comparable[] iterativeQuickSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement heapSort
	static Comparable[] heapSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement countingSort
	static Comparable[] countingSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement radixSort
	static Comparable[] radixSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement bucketSort
	static Comparable[] bucketSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement shellSort
	static Comparable[] shellSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement timSort
	static Comparable[] timSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement combSort
	static Comparable[] combSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement pigeonSort
	static Comparable[] pigeonSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement cycleSort
	static Comparable[] cycleSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement cocktailSort
	static Comparable[] cocktailSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement strandSort
	static Comparable[] strandSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement bitonicSort
	static Comparable[] bitonicSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement pancakeSort
	static Comparable[] pancakeSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement binaryInsertionSort
	static Comparable[] binaryInsertionSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement bogoSort
	static Comparable[] bogoSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement gnomeSort
	static Comparable[] gnomeSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement sleepSort
	static Comparable[] sleepSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement stoogeSort
	static Comparable[] stoogeSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement treeSort
	static Comparable[] treeSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement cartesianTreeSort
	static Comparable[] cartesianTreeSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement brickSort
	static Comparable[] brickSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement threeWayQuickSort
	static Comparable[] threeWayQuickSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}

	//TODO: Implement threeWayMergeSort
	static Comparable[] threeWayMergeSort(Comparable[] arr)
	{
		throw new NotImplementedException();
	}
}
