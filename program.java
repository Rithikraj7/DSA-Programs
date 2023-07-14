package new1;

import java.util.Arrays;

public class program {
	
	
	public static void rotateArray(int[] arr, int rotationCount) {
	    if (arr == null || arr.length == 0 || rotationCount <= 0) {
	        return; 
	    }
	    
	    int n = arr.length;
	    rotationCount %= n; // normalize rotationCount to be within array length
	    
	    reverseArray(arr, 0, n - 1); // reverse the entire array
	    reverseArray(arr, 0, rotationCount - 1); // reverse the first part 
	    reverseArray(arr, rotationCount, n - 1); // reverse the second part 
	}

	private static void reverseArray(int[] arr, int start, int end) {
	    while (start < end) {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    }
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int rotationCount = 2;
		rotateArray(arr, rotationCount);
		System.out.println(Arrays.toString(arr));
		
	}
}
