public class ReplaceElementsWithGreater {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int temp = arr[n-1], cur = 0;

        for (int i=n-2; i>=0; i--) {
            // store current element in cur
            cur = arr[i]; // 6 4 5 18 17

            max = Math.max(max, temp); // 1 6 6 6 18
            arr[i] = max; 

            temp = cur;
        }

        arr[n-1] = -1;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        arr = replaceElements(arr);

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    } 
}