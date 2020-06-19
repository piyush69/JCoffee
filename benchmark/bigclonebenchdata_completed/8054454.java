import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8054454 {

    public void sortIndexes()  throws Throwable {
        int i, j, count;
        int t;
        MyHelperClass m_ItemIndexes = new MyHelperClass();
        count = m_ItemIndexes.length;
        for (i = 1; i < count; i++) {
            for (j = 0; j < count - i; j++) {
                MyHelperClass m_ItemIndexes = new MyHelperClass();
                if (m_ItemIndexes[j] > m_ItemIndexes[j + 1]) {
                    MyHelperClass m_ItemIndexes = new MyHelperClass();
                    t = m_ItemIndexes[j];
                    MyHelperClass m_ItemIndexes = new MyHelperClass();
                    m_ItemIndexes[j] = m_ItemIndexes[j + 1];
                    MyHelperClass m_ItemIndexes = new MyHelperClass();
                    m_ItemIndexes[j + 1] = t;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
