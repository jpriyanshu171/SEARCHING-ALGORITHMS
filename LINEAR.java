// Linear Search is defined as a sequential search algorithm that starts at one end and goes through each element of a list until the desired element is found, otherwise the search continues till the end of the data set.

import java.util.Scanner;
public class LINEAR {
    public static int linearSearch(int a[], int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={23,45,12,56,10};
        int key=10;
        int index=linearSearch(a,key);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at "+index+" position");
        }
    }
}
/*
Time Complexity:

* Best Case: In the best case, the key might be present at the first index. So the best case complexity is O(1)
* Worst Case: In the worst case, the key might be present at the last index i.e., opposite to the end from which the search has started in the list. So the worst-case complexity is O(N) where N is the size of the list.
* Average Case: O(N)

Advantages of Linear Search:

* Linear search can be used irrespective of whether the array is sorted or not. It can be used on arrays of any data type.
* Does not require any additional memory.
* It is a well-suited algorithm for small datasets.

Drawbacks of Linear Search:

* Linear search has a time complexity of O(N), which in turn makes it slow for large datasets.
* Not suitable for large arrays.

When to use Linear Search:

* When we are dealing with a small dataset.
* When you are searching for a dataset stored in contiguous memory.
*/