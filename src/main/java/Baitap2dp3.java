import java.util.Scanner;

public class Baitap2dp3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Số nguyên dương: ");
        int num = scan.nextInt();

        System.out.format("num+ ", factorial(num));
    }
    public static int factorial(int num) {
        int factorial = 1;
        if (num == 0 || num ==1) {
            return 1;
        } else {
            for (int i = 2; i <=num; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
