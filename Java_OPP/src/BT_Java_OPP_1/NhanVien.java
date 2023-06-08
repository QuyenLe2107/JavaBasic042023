package BT_Java_OPP_1;

public class NhanVien {
    private int age;
    private String hoten;
// constructor
    public NhanVien(String hoten,int age) {
        this.hoten = hoten;
        this.age = age;

    }
    public NhanVien() {
        this.hoten = hoten;
    }

    public int getAge() {
        return age;
    }
    //

    public void setAge(int age) {
        this.age = age;
    }
}
