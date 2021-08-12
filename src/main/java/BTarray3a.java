import java.util.Scanner;

public class BTarray3a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int a = scan.nextInt();
        System.out.println("Nhập số: ");
        int b = scan.nextInt();
        System.out.println("Nhập số: ");
        int c = scan.nextInt();
        int[] arr = {a, b, c};
        checkNum3a(arr);
    }
    public static void checkNum3a(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++){
            if (((arr[i] % 4 ==0) && (arr[i] % 5 != 0))){
                num = num + 1 ;
            }
        }
        System.out.format("Có số chia hết cho 4 và không chia hết cho 5", num);
    }
}

