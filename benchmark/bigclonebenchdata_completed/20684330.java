import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20684330 {
public MyHelperClass NULL;
public MyHelperClass url;
	public MyHelperClass Environment;
public MyHelperClass mAbsolutePath;
	public MyHelperClass TAG;
	public MyHelperClass Log;
	public MyHelperClass HTTPUtils;
	public MyHelperClass done(){ return null; }

    public String downloadToSdCard(String localFileName, String suffixFromHeader, String extension)  throws Throwable {
        InputStream in = null;
        FileOutputStream fos = null;
        String absolutePath = null;
        try {
            MyHelperClass TAG = new MyHelperClass();
            Log.i(TAG, "Opening URL: " + url);
            MyHelperClass url = new MyHelperClass();
            StreamAndHeader inAndHeader =(StreamAndHeader)(Object) HTTPUtils.openWithHeader(url, suffixFromHeader);
            if (inAndHeader == null || inAndHeader.mStream == null) {
                return null;
            }
            in =(InputStream)(Object) inAndHeader.mStream;
            String sdcardpath =(String)(Object) Environment.getExternalStorageDirectory().getAbsolutePath();
            String headerValue = suffixFromHeader == null || inAndHeader.mHeaderValue == null ? "" : inAndHeader.mHeaderValue;
            headerValue = headerValue.replaceAll("[-:]*\\s*", "");
            String filename = sdcardpath + "/" + localFileName + headerValue + (extension == null ? "" : extension);
            int mSize =(int)(Object) NULL; //new int();
            mSize = in.available();
//            MyHelperClass TAG = new MyHelperClass();
            Log.i(TAG, "Downloading " + filename + ", size: " + mSize);
            fos = new FileOutputStream(new File(filename));
            int buffersize = 1024;
            byte[] buffer = new byte[buffersize];
            int readsize = buffersize;
            int mCount =(int)(Object) NULL; //new int();
            mCount = 0;
            while (readsize != -1) {
                readsize = in.read(buffer, 0, buffersize);
                if (readsize > 0) {
//                    MyHelperClass TAG = new MyHelperClass();
                    Log.i(TAG, "Read " + readsize + " bytes...");
                    fos.write(buffer, 0, readsize);
//                    MyHelperClass mCount = new MyHelperClass();
                   (int)(Object) mCount += readsize;
                }
            }
            fos.flush();
            fos.close();
            FileInputStream controlIn = new FileInputStream(filename);
            int mSavedSize =(int)(Object) NULL; //new int();
            mSavedSize = controlIn.available();
//            MyHelperClass TAG = new MyHelperClass();
            Log.v(TAG, "saved size: " + mSavedSize);
            String mAbsolutePath =(String)(Object) NULL; //new String();
            mAbsolutePath = filename;
            done();
        } catch (Exception e) {
            Log.e(TAG, "LoadingWorker.run", e);
        } finally {
            HTTPUtils.close(in);
        }
        return(String)(Object) mAbsolutePath;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass v(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass openWithHeader(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass close(InputStream o0){ return null; }
	public MyHelperClass getExternalStorageDirectory(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass i(MyHelperClass o0, String o1){ return null; }}

class StreamAndHeader {
public MyHelperClass mHeaderValue;
	public MyHelperClass mStream;
}
