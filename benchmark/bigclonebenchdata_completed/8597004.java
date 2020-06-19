
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8597004 {

    public String getHtmlSource(String url) {
        StringBuffer codeBuffer = null;
        BufferedReader in = null;
        URLConnection uc = null;
        try {
            uc =(URLConnection)(Object) (new URL(url).openConnection());
            uc.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows XP; DigExt)");
            in = new BufferedReader(new InputStreamReader(uc.getInputStream(), "utf-8"));
            codeBuffer = new StringBuffer();
            String tempCode = "";
            while ((tempCode =(String)(Object) in.readLine()) != null) {
                codeBuffer.append(tempCode).append("\n");
            }
            in.close();
            tempCode = null;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            if (null != in) in = null;
            if (null != uc) uc = null;
        }
        return codeBuffer.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
