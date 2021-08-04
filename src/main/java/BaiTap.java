import java.util.Scanner;

public class BaiTap {
    public static void main (String [] args) {
//        Scanner input = new Scanner(System.in);
        int namsinh;
        namsinh = 1996;
//        System.out.println("Nhập năm sinh : ");
//        namsinh = input.nextInt();
        int namhientai;
        namhientai = 2021;
        int tuoihientai;
        tuoihientai = namhientai - namsinh;
        System.out.println("namsinh : " + namsinh);
        System.out.println("namhientai : " + namhientai);
        System.out.println("tuoihientai : " + tuoihientai);
    }
}
