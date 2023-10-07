
//Time Complexity: O(n)
//Space Complexity: O(1)

//Firstly iterate over the array and check every element with the target element
//If target element is found in the array, return index "i"
//if loop is over and target element is not found, return -1

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

}
