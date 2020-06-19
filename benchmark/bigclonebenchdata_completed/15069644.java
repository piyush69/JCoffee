import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15069644 {

    public String elementsSearch()  throws Throwable {
        int index = 0;
        for (int i1 = 0; i1 < 6; i1++) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (index < 5) {
                    MyHelperClass initialMatrix = new MyHelperClass();
                    if (initialMatrix[i1][i2] > 0) {
                        MyHelperClass finalMatrix = new MyHelperClass();
                        finalMatrix[index] = initialMatrix[i1][i2];
                        index++;
                    }
                } else break;
            }
        }
        int temp;
        MyHelperClass finalMatrix = new MyHelperClass();
        for (int i = 0; i < finalMatrix.length; i++) {
            MyHelperClass finalMatrix = new MyHelperClass();
            for (int j = 0; j < finalMatrix.length - 1; j++) {
                MyHelperClass finalMatrix = new MyHelperClass();
                if (finalMatrix[j] < finalMatrix[j + 1]) {
                    MyHelperClass finalMatrix = new MyHelperClass();
                    temp = finalMatrix[j];
                    MyHelperClass finalMatrix = new MyHelperClass();
                    finalMatrix[j] = finalMatrix[j + 1];
                    MyHelperClass finalMatrix = new MyHelperClass();
                    finalMatrix[j + 1] = temp;
                }
            }
        }
        String result = "";
        MyHelperClass finalMatrix = new MyHelperClass();
        for (int k : finalMatrix) result += k + " ";
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
