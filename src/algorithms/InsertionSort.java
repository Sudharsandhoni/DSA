package algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		int[] unsortedArray = {64, 34, 77, 25, 12, 22, 11, 5, 90};
		int[] sortedArray = insertionSort(unsortedArray);
		
		for(int index = 0; index < sortedArray.length; index++) {
			System.out.println(sortedArray[index]);
		}

	}
	
	public static int[] insertionSort(int[] unsortedArray) {
		int[] sortedArray = unsortedArray;
		int operationCount = 0 ;
		int shiftCount = 0;
		
		for(int i = 1; i < sortedArray.length; i++) {
			
			int j = i - 1;
			int currentItemForComparison = sortedArray[i];
			operationCount++;
			while(j >= 0 && currentItemForComparison < sortedArray[j] ) {
				//shift elements right
				sortedArray[j+1] = sortedArray[j];
				j--;
				shiftCount++;
			}
			
			sortedArray[j+1] = currentItemForComparison;
			
		}
		System.out.println("Operation count: "+ operationCount);
		System.out.println("Shift count: "+ shiftCount);
		
		return sortedArray;
	}

}
