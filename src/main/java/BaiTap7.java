public class BaiTap7 {
    public static void main (String [] args) {
        Double diemthitoan, diemthily, diemthihoa, hesotoan, hesohoa, hesoly, tongdiem, tongheso, diemtrungbinh;
        diemthitoan = 8.0;
        diemthily = 9.0;
        diemthihoa = 7.0;
        hesotoan = 2.0;
        hesohoa = 2.0;
        hesoly = 1.0;
        tongdiem = (diemthitoan * hesotoan) + (diemthily * hesoly) + (diemthihoa * hesohoa);
        tongheso = hesotoan + hesohoa + hesoly;
        diemtrungbinh = tongdiem / tongheso;
        System.out.println("tổng điểm : " + tongdiem);
        System.out.println("tổng hệ số : " + tongheso);
        System.out.println("điểm trung bình : " + diemtrungbinh);


    }
}
