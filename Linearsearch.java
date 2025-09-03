
import java.util.Scanner;

public class Linearsearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter theterget element");

        int x = sc.nextInt();

        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enetr the elememet of Array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Element found");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}
