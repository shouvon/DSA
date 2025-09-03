public class MaxInArray{
    public static void main(String[] args){
        int[] arr = {1,4,9,6,8};
        // int val = Integer.MIN_VALUE;
        int val = arr[0];

        for (int i = 0; i<arr.length;i++) {
            if (val < arr[i]) {
                val = arr[i];
            }
        }
            System.err.println("Max value is : " + val);
    }
}