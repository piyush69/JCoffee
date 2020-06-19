import java.io.*;
import java.lang.*;
import java.util.*;



class c6219126 {
public static MyHelperClass getMessage(String o0, String o1, String o2){ return null; }
public static MyHelperClass Kit;
	public static MyHelperClass Context;
//	public MyHelperClass getMessage(String o0, String o1, String o2){ return null; }
	public static MyHelperClass getMessage(String o0, String o1){ return null; }
//public MyHelperClass Kit;
//	public MyHelperClass Context;
//	public MyHelperClass getMessage(String o0, String o1){ return null; }

    private static Object readFileOrUrl(String path, boolean convertToString) throws IOException {
        URL url = null;
        if (path.indexOf(':') >= 2) {
            try {
                url = new URL(path);
            } catch (UncheckedIOException ex) {
            }
        }
        InputStream is = null;
        int capacityHint = 0;
        if (url == null) {
            File file = new File(path);
            capacityHint = (int) file.length();
            try {
                is = new FileInputStream(file);
            } catch (IOException ex) {
                Context.reportError(getMessage("msg.couldnt.open", path));
                throw ex;
            }
        } else {
            try {
                URLConnection uc =(URLConnection)(Object) url.openConnection();
                is =(InputStream)(Object) uc.getInputStream();
                capacityHint =(int)(Object) uc.getContentLength();
                if (capacityHint > (1 << 20)) {
                    capacityHint = -1;
                }
            } catch (UncheckedIOException ex) {
                Context.reportError(getMessage("msg.couldnt.open.url", url.toString(), ex.toString()));
                throw ex;
            }
        }
        if (capacityHint <= 0) {
            capacityHint = 4096;
        }
        byte[] data;
        try {
            try {
                is = new BufferedInputStream(is);
                data =(byte[])(Object) Kit.readStream(is, capacityHint);
            } finally {
                is.close();
            }
        } catch (IOException ex) {
            Context.reportError(ex.toString());
            throw ex;
        }
        Object result;
        if (convertToString) {
            result = new String(data);
        } else {
            result = data;
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass reportError(String o0){ return null; }
	public MyHelperClass readStream(InputStream o0, int o1){ return null; }
	public MyHelperClass reportError(MyHelperClass o0){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
