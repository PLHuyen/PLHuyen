import java.util.Locale;
import java.util.Scanner;

public class BaiTap2p2 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("chữ: ");
        char s1 = (scan.next().charAt(1));
//        char s1 = 'a';
        if (Character.isUpperCase(s1)) {
            System.out.println(String.valueOf(s1).toLowerCase());
        }
        else {
            System.out.println(String.valueOf(s1).toUpperCase());
        }
    }
}
