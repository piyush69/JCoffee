import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19063414 {
public MyHelperClass NULL;

    public void readData() throws Throwable, IOException {
        int i = NULL; //new int();
        i = 0;
        int j = NULL; //new int();
        j = 0;
        URL url = getClass().getResource("resources/Chrom_623_620.dat");
        InputStream is = url.openStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = NULL; //new String();
        s = br.readLine();
//        MyHelperClass s = new MyHelperClass();
        StringTokenizer st = new StringTokenizer((String)(Object)s);
//        MyHelperClass s = new MyHelperClass();
        s =(String)(Object)(MyHelperClass)(Object) br.readLine();
//        MyHelperClass s = new MyHelperClass();
        st = new StringTokenizer((String)(Object)s);
MyHelperClass[] chrom_x = new MyHelperClass[5];
        chrom_x[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
        MyHelperClass temp_prev = new MyHelperClass();
        temp_prev = chrom_x[(int)(Object)i][j];
MyHelperClass[] chrom_y = new MyHelperClass[5];
        chrom_y[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
        MyHelperClass gridmin = new MyHelperClass();
        gridmin = chrom_x[(int)(Object)i][j];
        MyHelperClass gridmax = new MyHelperClass();
        gridmax = chrom_x[(int)(Object)i][j];
MyHelperClass[] sext1 = new MyHelperClass[5];
        sext1[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
MyHelperClass[] sext2 = new MyHelperClass[5];
        sext2[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
MyHelperClass[] sext3 = new MyHelperClass[5];
        sext3[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
MyHelperClass[] sext4 = new MyHelperClass[5];
        sext4[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
//        MyHelperClass j = new MyHelperClass();
        j++;
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
//            MyHelperClass chrom_x = new MyHelperClass();
            chrom_x[(int)(Object)i][j] = temp_new;
//            MyHelperClass chrom_y = new MyHelperClass();
            chrom_y[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
//            MyHelperClass sext1 = new MyHelperClass();
            sext1[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
//            MyHelperClass sext2 = new MyHelperClass();
            sext2[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
//            MyHelperClass sext3 = new MyHelperClass();
            sext3[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
//            MyHelperClass sext4 = new MyHelperClass();
            sext4[(int)(Object)i][j] = Double.parseDouble(st.nextToken());
            int imax = NULL; //new int();
            imax = i;
            int jmax = NULL; //new int();
            jmax = j;
//            MyHelperClass j = new MyHelperClass();
            j++;
//            MyHelperClass chrom_x = new MyHelperClass();
            if (chrom_x[(int)(Object)i][j] <= gridmin) gridmin = chrom_x[i][j];
//            MyHelperClass chrom_x = new MyHelperClass();
            if (chrom_x[(int)(Object)i][j] >= gridmax) gridmax = chrom_x[i][j];
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] sext1;
	public MyHelperClass[] sext4;
	public MyHelperClass[] sext3;
	public MyHelperClass[] chrom_x;
	public MyHelperClass[] chrom_y;
	public int i;
	public MyHelperClass[] sext2;
	public int j;
}
