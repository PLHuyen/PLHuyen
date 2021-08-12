import java.util.Scanner;

public class BTarray2c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int a = scan.nextInt();
        System.out.println("Nhập số: ");
        int b = scan.nextInt();
        System.out.println("Nhập số: ");
        int c = scan.nextInt();
        int[] arr = {a,b,c};
        if (isArrayincrease(arr)){
            System.out.println("Mảng tăng dần");
        }
        else
            System.out.println("Mảng không tăng dần");
    }
    public static boolean isArrayincrease (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

