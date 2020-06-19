import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10606028 {

    public void bubble()  throws Throwable {
        boolean test = false;
        int kars = 0, tas = 0;
        while (true) {
            MyHelperClass dizi = new MyHelperClass();
            for (int j = 0; j < dizi.length - 1; j++) {
                kars++;
                MyHelperClass dizi = new MyHelperClass();
                if (dizi[j] > dizi[j + 1]) {
                    MyHelperClass dizi = new MyHelperClass();
                    int temp = dizi[j];
                    MyHelperClass dizi = new MyHelperClass();
                    dizi[j] = dizi[j + 1];
                    MyHelperClass dizi = new MyHelperClass();
                    dizi[j + 1] = temp;
                    test = true;
                    tas++;
                }
            }
            if (!test) {
                break;
            } else {
                test = false;
            }
        }
        System.out.print(kars + " " + tas);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
