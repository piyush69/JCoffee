import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21682038 {
public MyHelperClass frinikaFileName;
public MyHelperClass fileSize;
	public MyHelperClass frinikaFile;
	public MyHelperClass progressBar;
	public MyHelperClass BUFSIZE;
	public MyHelperClass showMessage(String o0){ return null; }

    public void downloadFrinika() throws Throwable, Exception {
        MyHelperClass frinikaFile = new MyHelperClass();
        if (!(Boolean)(Object)frinikaFile.exists()) {
            MyHelperClass remoteURLPath = new MyHelperClass();
            String urlString =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) remoteURLPath + (int)(Object)frinikaFileName;
            showMessage("Connecting to " + urlString);
            URLConnection uc = new URL(urlString).openConnection();
            progressBar.setIndeterminate(false);
            showMessage("Downloading from " + urlString);
            progressBar.setValue(0);
            progressBar.setMinimum(0);
            progressBar.setMaximum(fileSize);
            InputStream is = uc.getInputStream();
            FileOutputStream fos = new FileOutputStream((String)(Object)frinikaFile);
            byte[] b = new byte[(int)(Object)BUFSIZE];
            int c;
            while ((c = is.read(b)) != -1) {
                fos.write(b, 0, c);
                progressBar.setValue((int)(Object)progressBar.getValue() + c);
            }
            fos.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getValue(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass setMaximum(MyHelperClass o0){ return null; }
	public MyHelperClass setValue(int o0){ return null; }
	public MyHelperClass setMinimum(int o0){ return null; }
	public MyHelperClass setIndeterminate(boolean o0){ return null; }}
