import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c2982747 {
public MyHelperClass inStream;
	public MyHelperClass urlconn;
	public MyHelperClass size;
	public MyHelperClass type;
	public MyHelperClass inFile;
	public MyHelperClass bufReader;

    public void FileParse(String fileStr, String type) throws MalformedURLException, IOException {
        this.inFile =(MyHelperClass)(Object) fileStr;
        this.type =(MyHelperClass)(Object) type;
        System.out.println("File str " + fileStr);
        if (fileStr.indexOf("http://") == 0) {
            URL url = new URL(fileStr);
            urlconn =(MyHelperClass)(Object) url.openConnection();
            inStream = urlconn.getInputStream();
            bufReader =(MyHelperClass)(Object) new BufferedReader(new InputStreamReader((InputStream)(Object)inStream));
        } else if (type.equals("File")) {
            File inFile = new File(fileStr);
            size =(MyHelperClass)(Object) inFile.length();
            inStream =(MyHelperClass)(Object) new FileInputStream(inFile);
            bufReader =(MyHelperClass)(Object) new BufferedReader(new InputStreamReader((InputStream)(Object)inStream));
        } else if (type.equals("URL")) {
            URL url = new URL(fileStr);
            urlconn =(MyHelperClass)(Object) url.openConnection();
            inStream = urlconn.getInputStream();
            bufReader =(MyHelperClass)(Object) new BufferedReader(new InputStreamReader((InputStream)(Object)inStream));
        } else if (type.equals("URLZip")) {
            URL url = new URL(fileStr);
            inStream =(MyHelperClass)(Object) new GZIPInputStream(url.openStream(), 16384);
            InputStreamReader zis = new InputStreamReader((InputStream)(Object)inStream);
            bufReader =(MyHelperClass)(Object) new BufferedReader(zis, 16384);
        } else {
            System.out.println("Unknown FileParse inType " + type);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }}

class GZIPInputStream {

GZIPInputStream(InputStream o0, int o1){}
	GZIPInputStream(){}}
