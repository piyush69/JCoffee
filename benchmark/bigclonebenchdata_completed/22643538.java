import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c22643538 {

    InputStream createInputStream(FileInfo fi) throws IOException, MalformedURLException {
        if (fi.inputStream != null) return(InputStream)(Object) fi.inputStream; else if (fi.url != null && !fi.url.equals("")) return new URL((String)(Object)(int)(Object)fi.url + (int)(Object)fi.fileName).openStream(); else {
            File f = new File((String)(Object)(int)(Object)fi.directory + (int)(Object)fi.fileName);
            if (f == null || f.isDirectory()) return null; else {
                InputStream is = new FileInputStream(f);
                MyHelperClass FileInfo = new MyHelperClass();
                if ((int)(Object)fi.compression >= (int)(Object)FileInfo.LZW) is =(InputStream)(Object) new RandomAccessStream(is);
                return is;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LZW;
}

class FileInfo {
public MyHelperClass inputStream;
	public MyHelperClass compression;
	public MyHelperClass directory;
	public MyHelperClass url;
	public MyHelperClass fileName;
}

class RandomAccessStream {

RandomAccessStream(InputStream o0){}
	RandomAccessStream(){}}
