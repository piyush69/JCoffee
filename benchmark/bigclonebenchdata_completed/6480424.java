import java.io.*;
import java.lang.*;
import java.util.*;



class c6480424 {
public MyHelperClass[] anIntArray774;
//public MyHelperClass anIntArray774;

    public void method31() {
        boolean flag = true;
        while (flag) {
            flag = false;
            MyHelperClass anInt772 = new MyHelperClass();
            for (int i = 0; i <(int)(Object) anInt772 - 1; i++) if ((int)(Object)anIntArray774[i] < (int)(Object)anIntArray774[i + 1]) {
MyHelperClass[] anIntArray774 = new MyHelperClass[5];
                int j =(int)(Object) anIntArray774[i];
//                MyHelperClass anIntArray774 = new MyHelperClass();
                anIntArray774[i] = anIntArray774[i + 1];
//                MyHelperClass anIntArray774 = new MyHelperClass();
                anIntArray774[i + 1] =(MyHelperClass)(Object) j;
MyHelperClass[] aLongArray773 = new MyHelperClass[5];
                long l =(long)(Object) aLongArray773[i];
//                MyHelperClass aLongArray773 = new MyHelperClass();
                aLongArray773[i] = aLongArray773[i + 1];
//                MyHelperClass aLongArray773 = new MyHelperClass();
                aLongArray773[i + 1] =(MyHelperClass)(Object) l;
                flag = true;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] anIntArray774;
	public MyHelperClass[] aLongArray773;
}
