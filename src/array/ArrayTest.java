package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		
		int[] numberArray = {9, 4, 78, 2, 5, 56, -9, 0, 20 };
		
		System.out.println("Lowest Value in a array is: " + findLowestValue(numberArray));

	}
	/* (O)perations
	 *    |    /
	 *    |   /
	 *    |  /
	 *    | /
	 *    |/________________
	 *    Values (n)
	 *    
	 *    irrespective of the position below algorithm must to visit every index/element to find the lowest value
	 *    so the Time Complexity for the below algorithm is O(n)
	 */
	public static int findLowestValue(int[] numberArray) {
		int lowestValue = numberArray[0];
		
		for(int index =1; index< numberArray.length; index++) {
			if(numberArray[index] < lowestValue) {
				lowestValue = numberArray[index];
			}
		}
		
		return lowestValue;
	}

}
