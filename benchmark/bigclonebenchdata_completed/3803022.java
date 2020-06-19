
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3803022 {
public static MyHelperClass encodeUrl(MyHelperClass o0){ return null; }
//public MyHelperClass encodeUrl(MyHelperClass o0){ return null; }

    public static String validateSession(String sessionid, String servicekey, HttpServletRequest request) {
        if (sessionid == null) {
            return "error";
        }
        MyHelperClass SSOFilter = new MyHelperClass();
        String loginapp =(String)(Object) SSOFilter.getLoginapp();
        MyHelperClass SSOUtil = new MyHelperClass();
        String u =(String)(Object) SSOUtil.addParameter(loginapp + "/api/validatesessionid", "sessionid", sessionid);
//        MyHelperClass SSOUtil = new MyHelperClass();
        u =(String)(Object) SSOUtil.addParameter(u, "servicekey", servicekey);
//        MyHelperClass SSOUtil = new MyHelperClass();
        u =(String)(Object) SSOUtil.addParameter(u, "ip",(String)(Object) request.getRemoteHost());
//        MyHelperClass SSOUtil = new MyHelperClass();
        u =(String)(Object) SSOUtil.addParameter(u, "url",(String)(Object) encodeUrl(request.getRequestURI()));
//        MyHelperClass SSOUtil = new MyHelperClass();
        u =(String)(Object) SSOUtil.addParameter(u, "useragent",(String)(Object) request.getHeader("User-Agent"));
        String response = "error";
        try {
            URL url = new URL(u);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                response = line.trim();
            }
            reader.close();
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
        if ("error".equals(response)) {
            return "error";
        } else {
            return response;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addParameter(String o0, String o1, String o2){ return null; }
	public MyHelperClass getLoginapp(){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }
	public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getRemoteHost(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
