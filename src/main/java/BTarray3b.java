import java.util.Scanner;

public class BTarray3b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố: ");
        int a = scan.nextInt();
        System.out.println("Nhập số nguyên tố: ");
        int b = scan.nextInt();
        System.out.println("Nhập số nguyên tố: ");
        int c = scan.nextInt();
        int[] arr = {a, b, c};
        sumPrimenumber(arr);
    }
    public static void sumPrimenumber(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(BTarray2b.isPrimeNumber(arr[i])){
                sum = sum + arr[i];
            }
        }
        System.out.format("Tổng các số nguyên tố trong mảng là: ", sum);;
    }
}
