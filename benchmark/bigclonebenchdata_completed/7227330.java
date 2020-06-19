import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7227330 {
public MyHelperClass[] dateien;
public MyHelperClass size;
//	public MyHelperClass dateien;

    private void sort() {
        boolean unsortiert = true;
        Datei tmp = null;
        while (unsortiert) {
            unsortiert = false;
            for (int i = 0; i <(int)(Object) this.size - 1; i++) {
                if (dateien[i] != null && dateien[i + 1] != null) {
                    if ((int)(Object)dateien[i].compareTo(dateien[i + 1]) < 0) {
                        tmp =(Datei)(Object) dateien[i];
                        dateien[i] = dateien[i + 1];
                        dateien[i + 1] =(MyHelperClass)(Object) tmp;
                        unsortiert = true;
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compareTo(MyHelperClass o0){ return null; }}

class Datei {

}
