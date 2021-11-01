package text;
import java.util.Scanner;
public class temp {
	public static int Partition(int array[], int low, int high){

        int m = low + (high - low) / 2;
        if (array[low]>array[high])  
            swap(array, low, high);
        if (array[m] > array[high]) 
            swap(array, high, m);
        if (array[m] > array[low])
            swap(array, m, low);  

        int pivotkey = array[low];
     
        int i = low, j = high;
        while(i<j) 
        {
            while (array[j] >= pivotkey&&i<j){
                j--;
            }
            while (array[i] <= pivotkey&&i<j){
                i++;
            }
            if (i<j)
            {
                swap(array, i, j);
            }	
        }

        swap(array, low, i);
        return i;           
    }
    public static void QSort(int array[], int low, int high){
        int pivot;
        if (low<high)
        {
            pivot = Partition(array, low, high);
            QSort(array, low, pivot - 1);     
            QSort(array, pivot + 1, high);     
        }
    }

    public static void QuickSort(int array[], int n){
        QSort(array, 0, n - 1);
    }

    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        QuickSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }



}