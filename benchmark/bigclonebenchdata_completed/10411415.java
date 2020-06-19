import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10411415 {
public MyHelperClass max;
	public MyHelperClass j;
	public MyHelperClass NULL;

    public void readData(int choice) throws Throwable, IOException {
        int i = NULL; //new int();
        for (i = 0; i < max; i++) for (j = 0; j < max; j++) {
MyHelperClass[] phase_x = new MyHelperClass[5];
            phase_x[(int)(Object)i][j] = 0.0;
MyHelperClass[] phase_y = new MyHelperClass[5];
            phase_y[(int)(Object)i][j] = 0.0;
        }
        URL url;
        InputStream is;
        InputStreamReader isr;
        if (choice == 0) {
            url = getClass().getResource("resources/Phase_623_620_Achromat.dat");
            is = url.openStream();
            isr = new InputStreamReader(is);
        } else {
            url = getClass().getResource("resources/Phase_623_620_NoAchromat.dat");
            is = url.openStream();
            isr = new InputStreamReader(is);
        }
        BufferedReader br = new BufferedReader(isr);
        String s = NULL; //new String();
        s = br.readLine();
//        MyHelperClass s = new MyHelperClass();
        StringTokenizer st = new StringTokenizer((String)(Object)s);
//        MyHelperClass i = new MyHelperClass();
        i =(int)(Object)(MyHelperClass)(Object) 0;
        int j = NULL; //new int();
        j = 0;
MyHelperClass[] phase_x = new MyHelperClass[5];
        phase_x[(int)(Object)i][j] = 4 * Double.parseDouble(st.nextToken());
MyHelperClass[] phase_y = new MyHelperClass[5];
        phase_y[(int)(Object)i][j] = 4 * Double.parseDouble(st.nextToken());
        MyHelperClass xgridmin = new MyHelperClass();
        xgridmin = phase_x[(int)(Object)i][j];
        MyHelperClass ygridmin = new MyHelperClass();
        ygridmin = phase_y[(int)(Object)i][j];
        MyHelperClass temp_prev = new MyHelperClass();
        temp_prev = phase_x[(int)(Object)i][j];
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
            temp_new = 4 * Double.parseDouble(st.nextToken());
//            MyHelperClass temp_new = new MyHelperClass();
            if (temp_new != (double)(Object)temp_prev) {
//                MyHelperClass temp_prev = new MyHelperClass();
                temp_prev =(MyHelperClass)(Object) temp_new;
//                MyHelperClass i = new MyHelperClass();
                i++;
//                MyHelperClass j = new MyHelperClass();
                j =(int)(Object)(MyHelperClass)(Object) 0;
            }
//            MyHelperClass phase_x = new MyHelperClass();
            phase_x[(int)(Object)i][j] = temp_new;
//            MyHelperClass phase_y = new MyHelperClass();
            phase_y[(int)(Object)i][j] = 4 * Double.parseDouble(st.nextToken());
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
        MyHelperClass xgridmax = new MyHelperClass();
        xgridmax = phase_x[(int)(Object)i][j - 1];
        MyHelperClass ygridmax = new MyHelperClass();
        ygridmax = phase_y[i][j - 1];
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] kd;
	public MyHelperClass[] kdc;
	public MyHelperClass[] kfl;
	public MyHelperClass[] phase_y;
	public int i;
	public MyHelperClass[] kdee;
	public MyHelperClass[] kfs;
	public int j;
	public MyHelperClass[] kfc;
	public MyHelperClass[] phase_x;
}
