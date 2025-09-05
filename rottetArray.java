import java.util.Arrays;

public class rottetArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int k = 9;
        int n = arr.length;

        // ✅ Correct formula
        k = k % n;

        System.out.println("Original: " + Arrays.toString(arr));

        // Reverse steps
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        // ✅ Print final rotated array here
        System.out.println("Rotated: " + Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
