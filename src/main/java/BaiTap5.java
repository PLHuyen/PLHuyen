import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BaiTap5 {
        public static void main (String [] args) {
//                DecimalFormat df = new DecimalFormat("#,###.##");
                NumberFormat df = new DecimalFormat("0.000");
                Double a, b, tong, hieu, nhan;
                Double thuong;
                a = 11.0;
                b = 12.0;
                tong = a + b;
                hieu = a - b;
                nhan = a * b;
                thuong = a / b;
                System.out.println("tong : " + tong);
                System.out.println("hieu : " + hieu);
                System.out.println("nhan : " + nhan);
                System.out.println("thuong : " + df.format(thuong));
        }
}
