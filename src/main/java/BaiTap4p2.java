import java.util.Scanner;

public class BaiTap4p2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("số a : ");
        float a = scan.nextFloat();
        System.out.print("số b : ");
        float b = scan.nextFloat();
        System.out.print("số c : ");
        float c = scan.nextFloat();
        giaiPTBac2(a, b, c);
    }
    public static void giaiPTBac2(float a, float b, float c) {
        if (a != 0) {
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("pt vô nghiệm ");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("pt có nghiệm kép x1 = x2 =  " + x);
            } else if (delta > 0) {
                float x1 = (float) ((-b + Math.sqrt(delta)) / 2 * a);
                float x2 = (float) ((-b - Math.sqrt(delta)) / 2 * a);
                System.out.println("pt có 2 nghiệm phân biệt x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}
