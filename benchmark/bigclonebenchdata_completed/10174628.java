import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10174628 {

//    @Override
    public T[] sort(T[] values)  throws Throwable {
        MyHelperClass compareTimes = new MyHelperClass();
//        MyHelperClass compareTimes = new MyHelperClass();
//        MyHelperClass compareTimes = new MyHelperClass();
//        MyHelperClass compareTimes = new MyHelperClass();
//        MyHelperClass compareTimes = new MyHelperClass();
//        MyHelperClass compareTimes = new MyHelperClass();
//        MyHelperClass compareTimes = new MyHelperClass();
//        MyHelperClass compareTimes = new MyHelperClass();
//        MyHelperClass compareTimes = new MyHelperClass();
        MyHelperClass compareTimes = new MyHelperClass();
        super.compareTimes = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
//                MyHelperClass compareTimes = new MyHelperClass();
//                MyHelperClass compareTimes = new MyHelperClass();
//                MyHelperClass compareTimes = new MyHelperClass();
//                MyHelperClass compareTimes = new MyHelperClass();
//                MyHelperClass compareTimes = new MyHelperClass();
//                MyHelperClass compareTimes = new MyHelperClass();
//                MyHelperClass compareTimes = new MyHelperClass();
//                MyHelperClass compareTimes = new MyHelperClass();
//                MyHelperClass compareTimes = new MyHelperClass();
                MyHelperClass compareTimes = new MyHelperClass();
                super.compareTimes++;
                if ((int)(Object)values[j].compareTo(values[j + 1]) > 0) {
                    T temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        return values;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class T {

public MyHelperClass compareTo(T o0){ return null; }}
