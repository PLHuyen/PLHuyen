import java.util.Scanner;

public class BaiTap4p3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Số nguyên tố: ");
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (isPrimeNumber(i)) {
                sum += i;
            }
        }
    }

    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        } else {
            int square = (int) (Math.sqrt(num));
            for (int i = 2; i <= square; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}