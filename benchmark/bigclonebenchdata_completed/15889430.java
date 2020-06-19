


class c15889430 {

    public Parameters getParameters(HttpExchange http) throws IOException {
        ParametersImpl params = new ParametersImpl();
        String query = null;
        if ((boolean)(Object)http.getRequestMethod().equalsIgnoreCase("GET")) {
            query =(String)(Object) http.getRequestURI().getRawQuery();
        } else if ((boolean)(Object)http.getRequestMethod().equalsIgnoreCase("POST")) {
            InputStream in =(InputStream)(Object) new MaxInputStream(http.getRequestBody());
            if (in != null) {
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copyTo(in, bytes);
                query = new String((String)(Object)bytes.toByteArray());
                in.close();
            }
        } else {
            throw new IOException("Method not supported " + http.getRequestMethod());
        }
        if (query != null) {
            for (String s : query.split("[&]")) {
                s = s.replace('+', ' ');
                int eq = s.indexOf('=');
                if (eq > 0) {
                    MyHelperClass URLDecoder = new MyHelperClass();
                    params.add(URLDecoder.decode(s.substring(0, eq), "UTF-8"), URLDecoder.decode(s.substring(eq + 1), "UTF-8"));
                }
            }
        }
        return (Parameters)(Object)params;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getRawQuery(){ return null; }
	public MyHelperClass copyTo(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass decode(String o0, String o1){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }}

class HttpExchange {

public MyHelperClass getRequestBody(){ return null; }
	public MyHelperClass getRequestURI(){ return null; }
	public MyHelperClass getRequestMethod(){ return null; }}

class Parameters {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ParametersImpl {

public MyHelperClass add(MyHelperClass o0, MyHelperClass o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class MaxInputStream {

MaxInputStream(MyHelperClass o0){}
	MaxInputStream(){}}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}
