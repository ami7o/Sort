# Sort

Includes various sorting algorithms.

- Bubble Sort: Swaps two adjacent elements if they are in a wrong order. Worst case O(n^2). It is easy to implement, can detect if the list is sorted to optimize, and very slow for large dataset.
- Selection Sort: Finds the smallest elements from the unsorted part. Worst case O(n^2).
- Insertion Sort: Inserts each element to the sorted list. Worst case O(n^2). It has O(n) runtime if the list is already sorted. It is stable and faster than merge sort when the input is small.
- Merge Sort: Splits the list to half, calls itself on both sublists, and merges them. Worst case O(nlogn). It is stable, has consistent running time, and space complexity is (O(n)).
- Quick Sort: Picks an element as pivot and partitions the array. Worst case O(n). The choice of pivot is important and it can be faster than merge sort when the array is small. Sorting is done in place while space complexity is O(logn) due to its recursive nature.
- Heap Sort: Uses heap structure to get minimum value in O(logn) time. Worst case O(nlogn). It doesn't require additional space as the heap is represented as an array. However, it is unstable, has expensive constant factors, doesn't work well for larger dataset.
- Tim Sort: Uses Insertion Sort and Merge Sort efficiently. Worst case O(nlogn). This is stable and efficiency sorting algorithm, so is used in java and python.
- Counting Sort: Counts the number of each element and use it to determine the position the elements should be. Worst case O(n+k) where k is the range of the input. It is good for input that is within a small range.
- Radix Sort: Does digit by digit sort starting from the least significant digit. It uses counting sort to sort each digit. Worst case O((n+b)*log_b(k)). The time complexity can be better than comparison based sorting algorithms, but it has expensive constant factors, bad cache usage, and needs extra space for counting sort.
- Bucket Sort: Creates buckets, insert each element to the buckets, sorts each bucket, and concatenates all buckets. Worst case O(n^2). It is useful when input is uniformly distributed over a range.