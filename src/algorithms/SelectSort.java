package algorithms;

public class SelectSort {

	public static void main(String[] args) {
		
		int[] unsortedArray = {64, 34, 77, 25, 12, 22, 11, 5, 90};
		int[] sortedArray = selectionSort(unsortedArray);
		
		for(int index = 0; index < sortedArray.length; index++) {
			System.out.println(sortedArray[index]);
		}
	}

	public static int[] selectionSort(int[] unsortedArray) {
		int[] sortedArray = unsortedArray;
		boolean swapNeeded;
		int operationCount = 0;
		for(int i = 0; i < sortedArray.length; i++) {
			swapNeeded = false;
			int smallestNumberIndex = i; 
			for(int j = i + 1; j < sortedArray.length; j++) {
				operationCount++;
				if(sortedArray[i] > sortedArray[j]) {
					smallestNumberIndex = j;
					swapNeeded = true;
				}
			}
			
			if(swapNeeded) {
				System.out.println("Swap needed");
				int temp = sortedArray[i];
				sortedArray[i] = sortedArray[smallestNumberIndex];
				sortedArray[smallestNumberIndex] = temp ;
			}

		}
		System.out.println("Arrays length: "+ sortedArray.length +"\nNumber of operations for this sorting: " + operationCount +"\n");
		return sortedArray;
		
		
	}
}
