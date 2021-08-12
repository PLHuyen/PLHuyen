import java.util.Scanner;

public class BTarray2b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố: ");
        int a = scan.nextInt();
        System.out.println("Nhập số nguyên tố: ");
        int b = scan.nextInt();
        System.out.println("Nhập số nguyên tố: ");
        int c = scan.nextInt();
        int[] arr = {a,b,c};
        if (isPrimenumber(arr)){
            System.out.println("Mảng toàn số nguyên tố");
        }else{
            System.out.println("Mảng không phải là số nguyên tố");
        }
    }
    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        } else {
            int square = (int) (Math.sqrt(num));
            for (int i = 2; i <= square; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean isPrimenumber(int[] arr){
        for(int i = 0;i < arr.length; i++){
            if(!isPrimeNumber(arr[i])) {
                return false;
            }
        }
        return true;
    }
}

