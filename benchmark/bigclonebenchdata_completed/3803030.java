
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3803030 {

    public static String getRolesString(HttpServletRequest hrequest, HttpServletResponse hresponse, String username, String servicekey) {
        MyHelperClass SSOFilter = new MyHelperClass();
        String registerapp =(String)(Object) SSOFilter.getRegisterapp();
        MyHelperClass SSOUtil = new MyHelperClass();
        String u =(String)(Object) SSOUtil.addParameter(registerapp + "/api/getroles", "username", username);
//        MyHelperClass SSOUtil = new MyHelperClass();
        u =(String)(Object) SSOUtil.addParameter(u, "servicekey", servicekey);
        String roles = "";
        try {
            URL url = new URL(u);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                roles = line.trim();
            }
            reader.close();
        } catch (UncheckedIOException e) {
            return null;
        } catch (ArithmeticException e) {
            return null;
        }
        if ("error".equals(roles)) {
            return "";
        }
        return roles.trim();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getRegisterapp(){ return null; }
	public MyHelperClass addParameter(String o0, String o1, String o2){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

}

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
