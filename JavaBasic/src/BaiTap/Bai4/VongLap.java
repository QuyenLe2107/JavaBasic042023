package BaiTap.Bai4;

public class VongLap {

    public static void main(String[] args) {
        int a[]= new int [26];
        //
        //

        int z = 0;
//                for (int j = 0; j < a.length; j++) {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                a[z] = i;
                z++;
//                        System.out.println("Ki tu lan luot là " + i);
//
//                    }
            }
        }

//              System.out.println("selenium");
        for (int j =0; j <a.length; j++)
        {
            System.out.println( "ky tu : " + a[j]);
        }



    }

}