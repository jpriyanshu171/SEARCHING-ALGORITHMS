// Binary Search is defined as a searching algorithm used in a sorted array by repeatedly dividing the search interval in half. The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(log N).
public class BINARY {
    public static int binarySearch(int a[], int key, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {23, 43, 12, 56, 10};
        int key = 12;
        int index = binarySearch(a, key, 0, a.length - 1);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + index + " position");
        }
    }
}
/*
Time Complexity:

* Best Case: O(1)
* Average Case: O(log N)
* Worst Case: O(log N)
* Auxiliary Space: O(1), If the recursive call stack is considered then the auxiliary space will be O(logN).

Advantages of Binary Search:

* Binary search is faster than linear search, especially for large arrays.
* More efficient than other searching algorithms with a similar time complexity, such as interpolation search or exponential search.
* Binary search is well-suited for searching large datasets that are stored in external memory, such as on a hard drive or in the cloud.

Drawbacks of Binary Search:

* The array should be sorted.
* Binary search requires that the data structure being searched be stored in contiguous memory locations.
* Binary search requires that the elements of the array be comparable, meaning that they must be able to be ordered.
*/
