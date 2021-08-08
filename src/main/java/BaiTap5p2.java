import java.util.Scanner;

public class BaiTap5p2 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("số a : ");
        int a = scan.nextInt();
        System.out.println("số b : ");
        int b = scan.nextInt();
        System.out.println("số c : ");
        int c = scan.nextInt();
        System.out.println("số d : ");
        int d = scan.nextInt();
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min >= c) {
            min = c;
        }
        if (min >= d) {
            min = d;
        }
        System.out.println("Min = " + min);
    }
}
