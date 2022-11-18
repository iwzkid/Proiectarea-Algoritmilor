/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cloud.elix.sem_1_5;

/**
 * @author lidia
 */
public class Sem_1_5 {
    
    public void sort(int arr[]) {
        // Get the number of elements.
        int length = arr.length;
 
        // Build max-heap binary tree.
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(arr, length, i);
        }
 
        // One by one extract an element from heap.
        for (int i = length - 1; i > 0; i--) {
            // Move current root to end.
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // Call max heapify on the reduced heap.
            heapify(arr, i, 0);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap.
    void heapify(int arr[], int N, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }
 
    /* A utility function to print array of size n. */
    // Printing function is simple, just iterate & print.
    static void printArray(int arr[]) {
        int length = arr.length;
 
        for (int i = 0; i < length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
 
    // Driver's code.
    public static void main(String args[]) {
        // The array to sort.
        int arr[] = { 12, 11, 13, 5, 6, 7 };
 
        // Function call
        Sem_1_5 ob = new Sem_1_5();
        ob.sort(arr);
 
        System.out.println("Sorted array is");
        printArray(arr);
    }
    
}
