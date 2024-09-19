package algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		

		int[] unsortedArray = {64, 34, 77, 25, 12, 22, 11, 5, 90};
		int[] sortedArray = bubbleSort(unsortedArray);
		
		for(int index = 0; index < sortedArray.length; index++) {
			System.out.println(sortedArray[index]);
		}
	}

	public static int[] bubbleSort(int[] numberArray) {
		int[] resultArray = numberArray;
		int operationCount = 0;
		boolean swapped;
		
		for(int i = 0; i < resultArray.length; i++) {
			swapped = false;
			for(int j = 0; j< resultArray.length - 1 - i; j++) {
				operationCount++;
				if(resultArray[j] > resultArray[j + 1]) {
					int temp = resultArray[j];
					resultArray[j] = resultArray[j+1];
					resultArray[j+1] = temp;
					swapped = true;
							
				}
				
			}
			if(!swapped) {
				break;
			}
		}
		System.out.println("Arrays length: "+ resultArray.length +"\nNumber of operations for this sorting: " + operationCount +"\n");
		return resultArray;
	} 
	
	
}
