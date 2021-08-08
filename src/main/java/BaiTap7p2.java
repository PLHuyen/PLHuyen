import java.util.Scanner;

public class BaiTap7p2 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Km : ");
        int distance = scan.nextInt();
        if (distance == 1) {
            int taxi = (int) (distance * 15000);
            System.out.println("Giá : " + taxi + "đ");
        } else if (distance >= 2 && distance <= 5) {
            int taxi = (int) (distance * 13500);
            System.out.println("Giá : " + taxi + "đ");
        } else if (distance >= 6 && distance >= 120) {
            int taxi = (int) ((int) (distance * 11000) - ((distance * 11000) / 10));
            System.out.println("Giá : " + taxi + "đ");
        } else {
            System.out.println("Sai tiền : ");
        }
    }
}
