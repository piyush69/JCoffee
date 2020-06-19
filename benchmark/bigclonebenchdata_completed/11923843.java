
import java.io.UncheckedIOException;


class c11923843 {

    public String getLastVersion() {
        try {
            MyHelperClass icescrum2Properties = new MyHelperClass();
            String server = icescrum2Properties.get("check.url").toString();
//            MyHelperClass icescrum2Properties = new MyHelperClass();
            Boolean useProxy = new Boolean(icescrum2Properties.get("proxy.active").toString());
//            MyHelperClass icescrum2Properties = new MyHelperClass();
            Boolean authProxy = new Boolean(icescrum2Properties.get("proxy.auth.active").toString());
            URL url = new URL(server);
            if (useProxy) {
//                MyHelperClass icescrum2Properties = new MyHelperClass();
                String proxy = icescrum2Properties.get("proxy.url").toString();
//                MyHelperClass icescrum2Properties = new MyHelperClass();
                String port = icescrum2Properties.get("proxy.port").toString();
                Properties systemProperties =(Properties)(Object) System.getProperties();
                systemProperties.setProperty("http.proxyHost", proxy);
                systemProperties.setProperty("http.proxyPort", port);
            }
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            if (authProxy) {
//                MyHelperClass icescrum2Properties = new MyHelperClass();
                String username = icescrum2Properties.get("proxy.auth.username").toString();
//                MyHelperClass icescrum2Properties = new MyHelperClass();
                String password = icescrum2Properties.get("proxy.auth.password").toString();
                String login = username + ":" + password;
                MyHelperClass Base64 = new MyHelperClass();
                String encodedLogin =(String)(Object) Base64.base64Encode(login);
                connection.setRequestProperty("Proxy-Authorization", "Basic " + encodedLogin);
            }
//            MyHelperClass icescrum2Properties = new MyHelperClass();
            connection.setConnectTimeout(Integer.parseInt(icescrum2Properties.get("check.timeout").toString()));
            InputStream input =(InputStream)(Object) connection.getInputStream();
            StringWriter writer = new StringWriter();
            InputStreamReader streamReader = new InputStreamReader(input);
            BufferedReader buffer = new BufferedReader(streamReader);
            String value = "";
            while (null != (value =(String)(Object) buffer.readLine())) {
                writer.write(value);
            }
            return writer.toString();
        } catch (UncheckedIOException e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass base64Encode(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class Properties {

public MyHelperClass setProperty(String o0, String o1){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class InputStream {

}

class StringWriter {

public MyHelperClass write(String o0){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
