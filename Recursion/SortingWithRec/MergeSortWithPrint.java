import java.util.Arrays;

public class MergeSortWithPrint {
    
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;

            // Split into left and right
            int[] left = Arrays.copyOfRange(arr, l, mid + 1);
            int[] right = Arrays.copyOfRange(arr, mid + 1, r + 1);

            System.out.println("Left: " + Arrays.toString(left));
            System.out.println("Right: " + Arrays.toString(right));
            System.out.println("-------------");

            // Recursively sort the halves
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            // Merge them back
            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("=============================");
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("=============================");
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
