public  class twoSum{
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9};

        int value = 7;

        for (int i = 0;i<arr.length;i++) {
            for (int j = i+1; j<arr.length; j++) {
                 if(arr[i] + arr[j] == value){
                    System.out.println(arr[i]+ "," +arr[j]);
                 }
            }
        }
    }
}