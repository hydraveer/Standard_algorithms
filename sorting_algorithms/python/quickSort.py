def quick_sort(arr):
    # Base case: If the array is empty or has only one element, it's already sorted.
    if len(arr) <= 1:
        return arr

    # Choose a pivot element (typically the last element).
    pivot = arr[-1]

    # Initialize left and right sublists.
    left = []
    right = []

    # Partition the array into elements less than and greater than the pivot.
    for i in range(len(arr) - 1):
        if arr[i] < pivot:
            left.append(arr[i])
        else:
            right.append(arr[i])

    # Recursively sort the left and right sublists.
    left_sorted = quick_sort(left)
    right_sorted = quick_sort(right)

    # Combine the sorted left sublist, pivot, and sorted right sublist.
    return left_sorted + [pivot] + right_sorted

# Example usage:
arr = [38, 27, 43, 3, 9, 82, 10]
sorted_arr = quick_sort(arr)
print(sorted_arr)


#QUICK SORT

#Quick sort is a fast sorting algorithm that works by choosing a "pivot" element from the array and then partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. This process is repeated recursively for each sub-array until the entire array is sorted. It's efficient and widely used for sorting large datasets.