package BaiTap.BaiTap3;

public class DieuKien {
    public static void Nhap (int n)
    {
        if (n == 0)
        {
        }
        else if (n>0)
        {
            System.out.println("N là số nguyên dương");
        }
        else
        {
            System.out.println("N là số nguyên âm");
        }
    }
    public static void main(String[] args) {
        Nhap(-98);
    }
}

