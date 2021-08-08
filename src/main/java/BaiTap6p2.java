import java.util.Scanner;

public class BaiTap6p2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("số a : ");
        int a = scan.nextInt();
        System.out.println("số b : ");
        int b = scan.nextInt();
        System.out.println("số c : ");
        int c = scan.nextInt();
        System.out.println("số d : ");
        int d = scan.nextInt();
        sort(a, b, c, d);
    }
    public static void sort(int a, int b, int c, int d) {
        int number1, number2, number3, number4;
        if (a < b && b < c && c < d) {
            number1 = a;
            number2 = b;
            number3 = c;
            number4 = d;
        } else if (a < c && a < d ) {
            number1 = a;
            number2 = c;
            number3 = d;
        }
    }
}


