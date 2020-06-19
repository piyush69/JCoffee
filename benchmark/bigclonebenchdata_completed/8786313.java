import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8786313 {

//    @DeclarePerfMonTimer("SortingTest.bubbleSort")
    private void bubbleSort(int values[])  throws Throwable {
        int len = values.length - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (values[j] > values[j + 1]) {
                    int tmp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = tmp;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class DeclarePerfMonTimer {

}
