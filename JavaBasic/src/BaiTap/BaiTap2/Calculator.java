package BaiTap.BaiTap2;

public class Calculator {
        public static int TinhTong (int a, int b)
        {
            return a+b;
        }
        public static float TinhTich (float c, float d)
        {
            return d * c;
        }

        public static void main(String[] args) {
            float Tich = TinhTich (5,6);
            int Tong = TinhTong(7,8);
            System.out.println("Tổng của 2 số là " + Tong);
            System.out.println("Tich của 2 số là " + Tich);
        }
}
