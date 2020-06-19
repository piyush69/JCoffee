
import java.io.UncheckedIOException;


class c14167176 {
public static MyHelperClass P_HEAD;
	public static MyHelperClass log;
	public static MyHelperClass DEBUG;
	public static MyHelperClass appendSlash(String o0){ return null; }
//public MyHelperClass DEBUG;
//	public MyHelperClass log;
//	public MyHelperClass P_HEAD;
//	public MyHelperClass appendSlash(String o0){ return null; }

    public static byte[] findHead(String url) {
        byte[] result = new byte[0];
        InputStream in = null;
        try {
            in =(InputStream)(Object) (new URL(appendSlash(url)).openStream());
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len =(int)(Object) in.read(buffer)) != -1) {
                byte[] temp = new byte[result.length + len];
                System.arraycopy(result, 0, temp, 0, result.length);
                System.arraycopy(buffer, 0, temp, result.length, len);
                result = temp;
                if ((boolean)(Object)DEBUG) {
                    log.debug(String.format("len=%d, result.length=%d", len, result.length));
                }
                if (result.length > 4096) {
                    break;
                }
                if (result.length > 1024) {
                    String s = new String(result).replaceAll("\\s+", " ");
                    Matcher m =(Matcher)(Object) P_HEAD.matcher(s);
                    if ((boolean)(Object)m.find()) {
                        break;
                    }
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        } finally {
            try {
                if (null != in) in.close();
            } catch (UncheckedIOException e) {
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass matcher(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
