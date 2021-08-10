import java.util.Scanner;

public class BaiTap1bp3 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Số kiểm tra: ");
        double num = scan.nextDouble();
        scan.close();
        if (checkPerfectSquare(num))
            System.out.println(num+ " Là số chính phương");
        else
            System.out.println(num+ " Không phải là số chính phương");
    }
    public static boolean checkPerfectSquare(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
}
