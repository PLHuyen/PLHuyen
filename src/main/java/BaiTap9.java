public class BaiTap9 {
    public static void main (String [] args) {
        String soxe;
        soxe = "23459";
        int so1, so2, so3, so4, so5, sonut;
        so1 = Integer.parseInt(soxe.substring(0,1));
        so2 = Integer.parseInt(soxe.substring(1,2));
        so3 = Integer.parseInt(soxe.substring(2,3));
        so4 = Integer.parseInt(soxe.substring(3,4));
        so5 = Integer.parseInt(soxe.substring(4));
        sonut = so1 + so2 + so3 + so4 + so5;
        System.out.println("số nút : " + String.valueOf(sonut).substring(1));



    }
}
