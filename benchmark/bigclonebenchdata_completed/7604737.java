


class c7604737 {

    public String get(String url) {
        String buf = null;
        StringBuilder resultBuffer = new StringBuilder(512);
        MyHelperClass debug = new MyHelperClass();
        if ((boolean)(Object)debug.DEBUG) debug.logger("gov.llnl.tox.util.href", "get(url)>> " + url);
        try {
            URL theURL = new URL(url);
            URLConnection urlConn =(URLConnection)(Object) theURL.openConnection();
            urlConn.setDoOutput(true);
            MyHelperClass timeOut = new MyHelperClass();
            urlConn.setReadTimeout(timeOut);
            BufferedReader urlReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            do {
                buf =(String)(Object) urlReader.readLine();
                if (buf != null) {
                    resultBuffer.append(buf);
                    resultBuffer.append("\n");
                }
            } while (buf != null);
            urlReader.close();
//            MyHelperClass debug = new MyHelperClass();
            if ((boolean)(Object)debug.DEBUG) debug.logger("gov.llnl.tox.util.href", "get(output)>> " + resultBuffer.toString());
            int xmlNdx = resultBuffer.lastIndexOf("?>");
            String result;// = new String();
            if (xmlNdx == -1) result = resultBuffer.toString(); else result = resultBuffer.substring(xmlNdx + 2);
        } catch (Exception e) {
            MyHelperClass result = new MyHelperClass();
            result = debug.logger("gov.llnl.tox.util.href", "error: get >> ", e);
        }
        MyHelperClass result = new MyHelperClass();
        return ((String)(Object)result);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEBUG;
public MyHelperClass logger(String o0, String o1, Exception o2){ return null; }
	public MyHelperClass logger(String o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}
