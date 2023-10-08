
//Time Complexity: O(log n)
//Space Complexity: O(1)
//First set low = 0 and high to last index of array
//Iterate over array till low is smaller or equal to high
//Find the mid-index in every iteration, and check whether element at mid-index is equal to target or not
//If yes, return mid, if no check whether target is less than or greater than the mid-element of array
//Assign low or high variable accordingly to reduce the search space
//If while loop is ended and target is not found, return -1

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(binarySearch(arr , 6));
    }
}

