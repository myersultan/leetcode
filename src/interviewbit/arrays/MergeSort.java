package interviewbit.arrays;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 2, 1, 9, 7};
        mergeSort(arr, 0, 6);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                k++; i++;
            } else {
                temp[k] = arr[j];
                k++; j++;
            }
        }

        while (i <= mid) {
            temp[k] = arr[i];
            k++; i++;
        }

        while (j <= end) {
            temp[k] = arr[j];
            k++; j++;
        }

        for (int l = start; l <= end ; l++) {
            arr[l] = temp[l - start];
        }
    }
}
