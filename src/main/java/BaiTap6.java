public class BaiTap6 {
    public static void main (String [] args) {
        String dienthoai;
        int soluong, dongia, tien, thuegiatrigiatang;
        soluong = 6;
        dongia = 10000000;
        tien = soluong * dongia;
        thuegiatrigiatang = tien * 10 / 100;
        System.out.println("tiền : " + tien);
        System.out.println("thuế : " + thuegiatrigiatang);
    }
}
