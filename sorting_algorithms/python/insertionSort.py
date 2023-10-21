def insertion_sort(arr):
    # Traverse through the entire array starting from the second element (index 1).
    for i in range(1, len(arr)):
        # Store the current element to be inserted into the sorted part of the array.
        current_element = arr[i]
        
        # Start comparing the current element with the elements in the sorted part of the array.
        j = i - 1
        while j >= 0 and current_element < arr[j]:
            # If the current element is smaller than the element at index j, shift the element at j to the right.
            arr[j + 1] = arr[j]
            j -= 1
        
        # Place the current element in its correct position within the sorted part of the array.
        arr[j + 1] = current_element

# Example usage:
arr = [38, 27, 43, 3, 9, 82, 10]
insertion_sort(arr)
print(arr)


#INSERTION SORT

#Insertion sort is an elementary sorting algorithm that builds the final sorted array one item at a time. It is efficient for small datasets or nearly sorted datasets but less efficient for large datasets compared to more advanced sorting algorithms like quicksort or mergesort.