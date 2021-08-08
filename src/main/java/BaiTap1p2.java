import java.util.Scanner;

public class BaiTap1p2 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Số nguyên: ");
        int songuyen = Integer.parseInt(scan.nextLine());
        if (songuyen >=1 && songuyen <=9) {
            System.out.println(songuyen);
        } else {
            System.out.println("không đọc được");
        }
    }
}
