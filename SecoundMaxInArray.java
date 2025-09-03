
public class SecoundMaxInArray {

    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 6, 8};
        int val = Integer.MIN_VALUE;
        int valTwo = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (val < arr[i]) {
                val = arr[i];
            }
        }
        System.err.println("Max value is : " + val);
        for (int i = 0; i < arr.length; i++) {
            if (valTwo < arr[i] && arr[i] != val) {
                valTwo = arr[i];
            }
        }
        System.err.println("Secound Max value is : " + valTwo);
    }
}
