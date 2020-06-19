
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11467950 {
public MyHelperClass KeepVid;

    public String getMediaURL(String strLink) {
        try {
            String res =(String)(Object) KeepVid.getAnswer(strLink, "aa");
            MyHelperClass NoMuleRuntime = new MyHelperClass();
            if ((boolean)(Object)NoMuleRuntime.DEBUG) System.out.println(res);
            String regexp = "http:\\/\\/[^\"]+\\/get_video[^\"]+";
            MyHelperClass Pattern = new MyHelperClass();
            Pattern p =(Pattern)(Object) Pattern.compile(regexp);
            Matcher m =(Matcher)(Object) p.matcher(res);
            m.find();
            String strRetUrl = res.substring((int)(Object)m.start(),(int)(Object) m.end());
            MyHelperClass URLDecoder = new MyHelperClass();
            strRetUrl =(String)(Object) URLDecoder.decode(strRetUrl, "UTF-8");
            MyHelperClass TRY_HIGH_QUALITY = new MyHelperClass();
            if ((boolean)(Object)TRY_HIGH_QUALITY) {
//                MyHelperClass NoMuleRuntime = new MyHelperClass();
                NoMuleRuntime.showDebug("HIGH_QUALITY");
                strRetUrl += "&fmt=18";
                try {
                    URL url = new URL(strRetUrl);
                    URLConnection conn =(URLConnection)(Object) url.openConnection();
                    InputStream in =(InputStream)(Object) conn.getInputStream();
                    in.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                } catch (ArithmeticException e) {
                    strRetUrl = strRetUrl.substring(0, strRetUrl.length() - 7);
                }
            }
//            MyHelperClass NoMuleRuntime = new MyHelperClass();
            if ((boolean)(Object)NoMuleRuntime.DEBUG) System.out.println(strRetUrl);
            return strRetUrl;
        } catch (UncheckedIOException e) {
            System.out.println("Error in Youtube Media Provider. Encoding is not supported. (How would that happen?!)");
            e.printStackTrace();
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEBUG;
public MyHelperClass getAnswer(String o0, String o1){ return null; }
	public MyHelperClass showDebug(String o0){ return null; }
	public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass decode(String o0, String o1){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass end(){ return null; }
	public MyHelperClass start(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}
