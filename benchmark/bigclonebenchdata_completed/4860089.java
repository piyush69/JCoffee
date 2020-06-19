import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4860089 {
public MyHelperClass[] data;
public MyHelperClass data;
	public MyHelperClass column;
	public MyHelperClass ascending;
	public MyHelperClass nrows;

    public int[] sort()  throws Throwable {
        int i, tmp;
        MyHelperClass nrows = new MyHelperClass();
        int[] newIndex = new int[(int)(Object)nrows];
//        MyHelperClass nrows = new MyHelperClass();
        for (i = 0; i < (int)(Object)nrows; i++) {
            newIndex[i] = i;
        }
        boolean change = true;
        if ((boolean)(Object)this.ascending) {
            if (data[0][(int)(Object)column] instanceof Comparable) {
                while (change) {
                    change = false;
                    for (i = 0; i <(int)(Object) nrows - 1; i++) {
                        if (((Comparable) data[newIndex[i]][column]).compareTo((Comparable) data[newIndex[i + 1]][(int)(Object)column]) > 0) {
                            tmp = newIndex[i];
                            newIndex[i] = newIndex[i + 1];
                            newIndex[i + 1] = tmp;
                            change = true;
                        }
                    }
                }
                return newIndex;
            }
            if (data[0][(int)(Object)column] instanceof String || data[0][column] instanceof ClassLabel) {
                while (change) {
                    change = false;
                    for (i = 0; i <(int)(Object) nrows - 1; i++) {
                        if ((data[newIndex[i]][(int)(Object)column].toString()).compareTo(data[newIndex[i + 1]][column].toString()) > 0) {
                            tmp = newIndex[i];
                            newIndex[i] = newIndex[i + 1];
                            newIndex[i + 1] = tmp;
                            change = true;
                        }
                    }
                }
            }
            return newIndex;
        }
        if (!(Boolean)(Object)this.ascending) {
            if (data[0][(int)(Object)column] instanceof Comparable) {
                while (change) {
                    change = false;
                    for (i = 0; i <(int)(Object) nrows - 1; i++) {
                        if (((Comparable) data[newIndex[i]][column]).compareTo((Comparable) data[newIndex[i + 1]][(int)(Object)column]) < 0) {
                            tmp = newIndex[i];
                            newIndex[i] = newIndex[i + 1];
                            newIndex[i + 1] = tmp;
                            change = true;
                        }
                    }
                }
                return newIndex;
            }
            if (data[0][(int)(Object)column] instanceof String || data[0][column] instanceof ClassLabel) {
                while (change) {
                    change = false;
                    for (i = 0; i <(int)(Object) nrows - 1; i++) {
                        if ((data[newIndex[i]][(int)(Object)column].toString()).compareTo(data[newIndex[i + 1]][column].toString()) < 0) {
                            tmp = newIndex[i];
                            newIndex[i] = newIndex[i + 1];
                            newIndex[i + 1] = tmp;
                            change = true;
                        }
                    }
                }
            }
            return newIndex;
        } else return newIndex;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ClassLabel {

}
