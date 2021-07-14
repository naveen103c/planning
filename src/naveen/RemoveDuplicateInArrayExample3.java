package naveen;

import java.util.Arrays;

public class RemoveDuplicateInArrayExample3 {

    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j,k=0;
        int temp[] = new int[n];
        for (j = 0; j < n - 1; j++) {
            if (arr[j+1]!=arr[j]) {
                temp[k++]=arr[j];                            
            }
        }
        temp[k++]=arr[n-1];
        for (int i = 0; i < k; i++) {
            System.out.print(temp[i] + ",");
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = {10, 70, 30, 90, 20, 20, 30, 40, 70, 30, 40, 10, 50};//unsorted array
        Arrays.sort(arr);//sorting array
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        //printing array elements
        for (int i = 0; i < length; i++) {
           // System.out.print(arr[i] + ",");
        }
    }
}
