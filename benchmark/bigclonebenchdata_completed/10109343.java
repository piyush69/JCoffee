import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10109343 {
public MyHelperClass NULL;

    public void readData() throws Throwable, IOException {
        int i = NULL; //new int();
        i = 0;
        int j = NULL; //new int();
        j = 0;
        URL url = getClass().getResource("resources/tuneGridMaster.dat");
        InputStream is = url.openStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = NULL; //new String();
        s = br.readLine();
//        MyHelperClass s = new MyHelperClass();
        StringTokenizer st = new StringTokenizer((String)(Object)s);
MyHelperClass[] tune_x = new MyHelperClass[5];
        tune_x[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
        MyHelperClass gridmin = new MyHelperClass();
        gridmin = tune_x[(int)(Object)i][j];
        MyHelperClass temp_prev = new MyHelperClass();
        temp_prev = tune_x[(int)(Object)i][j];
MyHelperClass[] tune_y = new MyHelperClass[5];
        tune_y[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
MyHelperClass[] kd = new MyHelperClass[5];
        kd[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
MyHelperClass[] kfs = new MyHelperClass[5];
        kfs[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
MyHelperClass[] kfl = new MyHelperClass[5];
        kfl[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
MyHelperClass[] kdee = new MyHelperClass[5];
        kdee[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
MyHelperClass[] kdc = new MyHelperClass[5];
        kdc[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
MyHelperClass[] kfc = new MyHelperClass[5];
        kfc[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
//        MyHelperClass j = new MyHelperClass();
        j++;
        int k = 0;
//        MyHelperClass s = new MyHelperClass();
        while ((s =(String)(Object)(MyHelperClass)(Object) br.readLine()) != null) {
//            MyHelperClass s = new MyHelperClass();
            st = new StringTokenizer((String)(Object)s);
            double temp_new = NULL; //new double();
            temp_new = Double.parseDouble(st.nextToken());
//            MyHelperClass temp_new = new MyHelperClass();
            if (temp_new != (double)(Object)temp_prev) {
//                MyHelperClass temp_prev = new MyHelperClass();
                temp_prev =(MyHelperClass)(Object) temp_new;
//                MyHelperClass i = new MyHelperClass();
                i++;
//                MyHelperClass j = new MyHelperClass();
                j =(int)(Object)(MyHelperClass)(Object) 0;
            }
//            MyHelperClass tune_x = new MyHelperClass();
            tune_x[(int)(Object)i][j] = temp_new;
//            MyHelperClass tune_y = new MyHelperClass();
            tune_y[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
//            MyHelperClass kd = new MyHelperClass();
            kd[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
//            MyHelperClass kfs = new MyHelperClass();
            kfs[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
//            MyHelperClass kfl = new MyHelperClass();
            kfl[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
//            MyHelperClass kdee = new MyHelperClass();
            kdee[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
//            MyHelperClass kdc = new MyHelperClass();
            kdc[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
//            MyHelperClass kfc = new MyHelperClass();
            kfc[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
            int imax = NULL; //new int();
            imax = i;
            int jmax = NULL; //new int();
            jmax = j;
//            MyHelperClass j = new MyHelperClass();
            j++;
            k++;
        }
        MyHelperClass gridmax = new MyHelperClass();
        gridmax = tune_x[(int)(Object)i][j - 1];
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] kd;
	public MyHelperClass[] kdc;
	public MyHelperClass[] kfl;
	public MyHelperClass[] tune_y;
	public MyHelperClass[] kdee;
	public int i;
	public MyHelperClass[] tune_x;
	public MyHelperClass[] kfs;
	public int j;
	public MyHelperClass[] kfc;
}
