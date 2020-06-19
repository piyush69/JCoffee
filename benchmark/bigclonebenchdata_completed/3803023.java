
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3803023 {

    public static String callApi(String api, String paramname, String paramvalue) {
        MyHelperClass SSOFilter = new MyHelperClass();
        String loginapp =(String)(Object) SSOFilter.getLoginapp();
        MyHelperClass SSOUtil = new MyHelperClass();
        String u =(String)(Object) SSOUtil.addParameter(loginapp + "/api/" + api, paramname, paramvalue);
//        MyHelperClass SSOFilter = new MyHelperClass();
        u =(String)(Object) SSOUtil.addParameter(u, "servicekey",(String)(Object) SSOFilter.getServicekey());
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

public MyHelperClass getServicekey(){ return null; }
	public MyHelperClass addParameter(String o0, String o1, String o2){ return null; }
	public MyHelperClass getLoginapp(){ return null; }}

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
