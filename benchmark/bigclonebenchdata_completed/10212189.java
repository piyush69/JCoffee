import java.io.*;
import java.lang.*;
import java.util.*;



class c10212189 {

    public String getXML(String servletURL, String request) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            MyHelperClass URLEncoder = new MyHelperClass();
            String encodedRequest =(String)(Object) URLEncoder.encode(request, "UTF-8");
            URL url = new URL(servletURL + request);
            BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                stringBuffer.append(inputLine);
            }
            in.close();
        } catch (UncheckedIOException ex) {
            return null;
        } catch (UnsupportedEncodingException ex) {
            return null;
        } catch (IOException ex) {
            return null;
        }
        return stringBuffer.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
