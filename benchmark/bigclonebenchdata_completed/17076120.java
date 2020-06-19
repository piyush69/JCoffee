import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17076120 {
public MyHelperClass LOGGER_PREFIX;
	public MyHelperClass textBuffer;

    public String getTextData()  throws Throwable {
        MyHelperClass tempFileWriter = new MyHelperClass();
        if (tempFileWriter != null) {
            try {
//                MyHelperClass tempFileWriter = new MyHelperClass();
                tempFileWriter.flush();
//                MyHelperClass tempFileWriter = new MyHelperClass();
                tempFileWriter.close();
                MyHelperClass tempFile = new MyHelperClass();
                FileReader in = new FileReader((String)(Object)tempFile);
                StringWriter out = new StringWriter();
                int len;
                MyHelperClass BUFSIZ = new MyHelperClass();
                char[] buf = new char[(int)(Object)BUFSIZ];
                while ((len = in.read(buf)) > 0) out.write(buf, 0, len);
                out.close();
                in.close();
                return out.toString();
            } catch (IOException ioe) {
                MyHelperClass Logger = new MyHelperClass();
                Logger.instance().log(Logger.ERROR, LOGGER_PREFIX, "XMLTextData.getTextData", ioe);
                return "";
            }
        MyHelperClass textBuffer = new MyHelperClass();
        } else if (textBuffer != null) return textBuffer.toString(); else return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
public MyHelperClass instance(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass log(MyHelperClass o0, MyHelperClass o1, String o2, IOException o3){ return null; }
	public MyHelperClass close(){ return null; }}
