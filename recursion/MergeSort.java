import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        // compare the left half and right half of array
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // traverse the remaining left halves and copy the rest elements as it is
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // traverse the remaining right halves and copy the rest elements as it is
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // replace the temp array with the original array
        for (int i = low; i <= high; i++) {
            // make sure to retrieve correct element from temp otherwise will end up in
            // ArrayOutOfBoundsException error.
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        // divide only until we get to the middle element
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        // call for [low...mid]
        mergeSort(arr, low, mid);

        // call for [mid+1...right]
        mergeSort(arr, mid + 1, high);

        // finally call merge for each halves
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = { 12, 6, 2, 68, 24 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
