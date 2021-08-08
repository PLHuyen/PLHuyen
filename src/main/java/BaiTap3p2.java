
import java.util.Scanner;

public class BaiTap3p2 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("số a : ");
        int a = scan.nextInt();
        System.out.print("số b : ");
        int b = scan.nextInt();
        if (a == 0) {
            if (b == 0) ;
            System.out.println(" pt vô số nghiệm ");
        } else if (b != 0) {
            System.out.println(" pt vô nghiệm ");
        } else {
            System.out.println(" pt có nghiệm = " + ((-b) / (float) a));
        }
    }
}
