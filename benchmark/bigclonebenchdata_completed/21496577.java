import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21496577 {

    private void regattaBackup()  throws Throwable {
        SwingWorker sw = new SwingWorker() {

            MyHelperClass fRegatta = new MyHelperClass();
            Regatta lRegatta =(Regatta)(Object) fRegatta;

            public Object construct() {
                String fullName =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) lRegatta.getSaveDirectory() + (int)(Object)lRegatta.getSaveName();
                MyHelperClass res = new MyHelperClass();
                MyHelperClass BAK = new MyHelperClass();
                MyHelperClass MessageFormat = new MyHelperClass();
                System.out.println(MessageFormat.format(res.getString("MainMessageBackingUp"), new Object[] { fullName + BAK }));
                try {
                    FileInputStream fis = new FileInputStream(new File(fullName));
//                    MyHelperClass BAK = new MyHelperClass();
                    FileOutputStream fos = new FileOutputStream(new File(fullName + BAK));
                    int bufsize = 1024;
                    byte[] buffer = new byte[bufsize];
                    int n = 0;
                    while ((n = fis.read(buffer, 0, bufsize)) >= 0) fos.write(buffer, 0, n);
                    fos.flush();
                    fos.close();
                } catch (java.io.IOException ex) {
                    MyHelperClass Util = new MyHelperClass();
                    Util.showError(ex, true);
                }
                return null;
            }
        };
        sw.start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass showError(IOException o0, boolean o1){ return null; }
	public MyHelperClass format(MyHelperClass o0, Object[] o1){ return null; }}

class SwingWorker {

public MyHelperClass start(){ return null; }}

class Regatta {

public MyHelperClass getSaveDirectory(){ return null; }
	public MyHelperClass getSaveName(){ return null; }}
