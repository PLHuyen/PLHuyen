import java.util.Scanner;

public class BaiTap9p2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Độ dài cạnh a: ");
        float a = scan.nextFloat();
        System.out.print("Độ dài cạnh b : ");
        float b = scan.nextFloat();
        System.out.print("Độ dài cạnh c : ");
        float c = scan.nextFloat();
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
            System.out.println("Đây là tam giác ");
        } else if ((a == b) || (b == c) || (c == a)) {
            System.out.println("Đây là tam giác cân ");
        } else if ((a == b) && (b == c) && (c == a)) {
            System.out.println("Đây là tam giác đều ");
        } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
            System.out.println("Đây là tam giác vuông ");
        } else {
            System.out.println("Đây không phải tam giác ");
        }
    }
}
