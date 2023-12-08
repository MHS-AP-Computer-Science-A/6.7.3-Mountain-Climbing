
public class MountainClimbing {

	public static void main(String[] args) {
		int[] test1 = {1, 2, 4, 5, 3, 0};
		int[] test2 = {-5, 2, 3, 6, 11, 0};
		int[] test3 = {1, 2, 1, 0, -2, -6};
		int[] test4 = {1, 2, 5, 5, 3, 0};
		int[] test5 = {-5, 2, 3, 6, 11, 12};
		int[] test6 = {1, 2, 1, 3, -2, -6};
		int[] test7 = {1, 2, 2, 3, 2, 1};
		int[] test8 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6};
		int[] test9 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 8};
		
		//Test isIncreasing
		System.out.println("isIncreasing(test1, 0, 3) should return true and returns " + isIncreasing(test1, 0, 3));
		System.out.println("isIncreasing(test1, 1, 4) should return false and returns " + isIncreasing(test1, 1, 4) + "\n\n");
		
		//Test isDecreasing
		System.out.println("isDecreasing(test1, 3, 5) should return true and returns " + isDecreasing(test1, 3, 5));
		System.out.println("isDecreasing(test1, 2, 5) should return false and returns " + isDecreasing(test1, 2, 5) + "\n\n");
		
		
		
		//Test isMountatin
		System.out.println("Test 1 should be true with peak 5: " + isMountain(test1));
		System.out.println("Test 2 should be true with peak 11: " + isMountain(test2));
		System.out.println("Test 3 should be true with peak 2: " + isMountain(test3));
		System.out.println("Test 4 should be false: " + isMountain(test4));
		System.out.println("Test 5 should be false: " + isMountain(test5));
		System.out.println("Test 6 should be false: " + isMountain(test6));
		System.out.println("Test 7 should be false: " + isMountain(test7));
		System.out.println("Test 8 should be true with peak 10: " + isMountain(test8));
		System.out.println("Test 9 should be false: " + isMountain(test9));
		

	}
	
	
	//Post: Displays the peak value and returns true if arr is a mountain 
	//      Returns false otherwise
	public static boolean isMountain(int[] arr) {
		//TODO

		return false;
	}
	
	//Post: Returns true if the array is increasing from indexes start to end 
	//      and false otherwise
	public static boolean isIncreasing(int[] arr, int start, int end) {
		//TODO

		return true;
	}
	
	
	//Post: Returns true if the array is decreasing from indexes start to end 
	//      and false otherwise
	public static boolean isDecreasing(int[] arr, int start, int end) {
		//TODO

		return true;
	}

}
