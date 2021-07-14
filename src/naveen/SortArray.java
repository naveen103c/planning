package naveen;

public class SortArray {

    public static void main(String[] args) {
        SortArray obj = new SortArray();
        int arr[] = {2, 8, 1, 4, 5, 45, 4, 54, 4, 1, 21, 21, 8};
         System.out.println(String.valueOf(arr));  
        System.out.println("Original Array");
        for (int i : arr) {
            System.out.println(i);
        }

        sortArrayDesc(arr, arr.length);
        System.out.println("After Desc sort");
        for (int i : arr) {
            System.out.println(i);
        }
        sortArrayAsc(arr, arr.length);
        System.out.println("After Asc sort");
        for (int i : arr) {
            System.out.println(i);
        }        
    }

    private static void sortArrayAsc(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            int j = i;
            System.out.println("");
            while (j > 0) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                j--;
            }
        }
    }

    private static void sortArrayDesc(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            int j = i;
            System.out.println("");
            while (j > 0) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                j--;
            }
        }
    }

}
