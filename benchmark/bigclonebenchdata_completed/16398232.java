
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16398232 {

    int responseTomcat(InetAddress dest, int port, String request, boolean methodPost, StringBuffer response, int timeout) {
        int methodGetMaxSize = 250;
        int methodPostMaxSize = 32000;
        if (request == null || response == null) return -1;
        String fullRequest;
        if (methodPost) {
            String resource;
            String queryStr;
            int qIdx = request.indexOf('?');
            if (qIdx == -1) {
                resource = request;
                queryStr = "";
            } else {
                resource = request.substring(0, qIdx);
                queryStr = request.substring(qIdx + 1);
            }
            fullRequest = "POST " + resource + " HTTP/1.1\nHost: " + dest.getHostName() + ":" + (new Integer(port)).toString() + "\n\n" + queryStr;
        } else {
            fullRequest = "GET " + request + " HTTP/1.1\nHost: " + dest.getHostName() + ":" + (new Integer(port)).toString() + "\n\n";
        }
        if (methodPost && fullRequest.length() > methodPostMaxSize) {
            response.setLength(0);
            response.append("Complete POST request longer than maximum of " + methodPostMaxSize);
            return -5;
        } else if ((!methodPost) && fullRequest.length() > methodGetMaxSize) {
            response.setLength(0);
            response.append("Complete GET request longer than maximum of " + methodGetMaxSize);
            return -6;
        }
        String inputLine = "";
        request = "http://" + dest.getHostName() + ":" + (new Integer(port).toString()) + request;
        try {
            URL urlAddress = new URL(request);
            URLConnection urlC =(URLConnection)(Object) urlAddress.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(urlC.getInputStream()));
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                response = response.append(inputLine).append("\n");
            }
        } catch (UncheckedIOException e) {
            return -4;
        } catch (ArithmeticException e) {
            return -3;
        }
        return 200;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InetAddress {

public MyHelperClass getHostName(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
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
