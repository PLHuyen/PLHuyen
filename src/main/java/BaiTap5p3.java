import java.util.Scanner;

public class BaiTap5p3 {
    public static void main(String[] args) {
        int num, reverse = 0, original;
        Scanner scan = new Scanner(System.in);
        System.out.print("Số nguyên dương: ");
        int num = scan.nextInt();
        original = num;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.format("Số đảo ngược: ", original, reverse);
    }
}
