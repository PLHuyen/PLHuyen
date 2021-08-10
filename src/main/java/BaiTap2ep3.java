import java.util.Scanner;

public class BaiTap2ep3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Số nguyên dương: ");
        int num = scan.nextInt();

        System.out.format("num+ ", sumfactorial(num));
    }
    public static int sumfactorial(int num) {
        int sumfactorial = 0;
        for (int i = 1; i <=num; i++) {
                sumfactorial = sumfactorial + factorial(i);
            }
            return sumfactorial;
        }
    }


