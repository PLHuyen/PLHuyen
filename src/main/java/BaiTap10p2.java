import java.util.Scanner;

public class BaiTap10p2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập năm : ");
        int year = scan.nextInt();
        if (year >= 0) {
            if ((year % 400 == 0) || (year % 4 == 0) && (year %100 != 0)) {
                System.out.println("Là năm nhuận ");
            } else {
                System.out.println("Không là năm nhuận ");
            }
        } else {
            System.out.println("Lỗi ");
        }
    }
}
