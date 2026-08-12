import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int arr[] = { 40, 100, 5, 60, 10, 80 };
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
        }
        System.out.print(sum + 1);

    }
}
