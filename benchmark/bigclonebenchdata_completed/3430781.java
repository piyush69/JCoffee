import java.io.*;
import java.lang.*;
import java.util.*;



class c3430781 {
public static MyHelperClass getHeaderParameter(MyHelperClass o0, String o1){ return null; }
public static MyHelperClass Log;
//	public MyHelperClass getHeaderParameter(MyHelperClass o0, String o1){ return null; }
//public MyHelperClass Log;

    public static String getTextFromPart(Part part) {
        try {
            if (part != null && part.getBody() != null) {
                InputStream in =(InputStream)(Object) part.getBody().getInputStream();
                String mimeType =(String)(Object) part.getMimeType();
                MyHelperClass MimeUtility = new MyHelperClass();
                if (mimeType != null && (boolean)(Object)MimeUtility.mimeTypeMatches(mimeType, "text/*")) {
                    ByteArrayOutputStream out = new ByteArrayOutputStream();
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(in, out);
                    in.close();
                    in = null;
                    String charset =(String)(Object) getHeaderParameter(part.getContentType(), "charset");
                    if (charset != null) {
                        MyHelperClass CharsetUtil = new MyHelperClass();
                        charset =(String)(Object) CharsetUtil.toJavaCharset(charset);
                    }
                    if (charset == null) {
                        charset = "ASCII";
                    }
                    String result = out.toString(charset);
                    out.close();
                    return result;
                }
            }
        } catch (OutOfMemoryError oom) {
            MyHelperClass Email = new MyHelperClass();
            Log.e(Email.LOG_TAG, "Unable to getTextFromPart " + oom.toString());
        } catch (Exception e) {
            MyHelperClass Email = new MyHelperClass();
            Log.e(Email.LOG_TAG, "Unable to getTextFromPart " + e.toString());
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOG_TAG;
public MyHelperClass toJavaCharset(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass mimeTypeMatches(String o0, String o1){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1){ return null; }}

class Part {

public MyHelperClass getMimeType(){ return null; }
	public MyHelperClass getBody(){ return null; }
	public MyHelperClass getContentType(){ return null; }}
