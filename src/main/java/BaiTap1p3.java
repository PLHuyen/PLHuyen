import java.util.Scanner;

public class BaiTap1p3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Số nguyên dương: ");
        int n, reversed = 0, original;
        n = scan.nextInt();
        original = n;
        while(n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        if(reversed == original){
            System.out.println(original+ " là số đối xứng!!");
        }
        else{
            System.out.println(original+ " không phải là số đối xứng!!");
        }
    }
}

