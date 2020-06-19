


class c2193301 {
public MyHelperClass writeParameters(OutputStream o0, Map o1, String o2){ return null; }
public MyHelperClass inputStream;
	public MyHelperClass EMPTY_MAP;
	public MyHelperClass proxy;
	public MyHelperClass logger;

    public void HttpURLHandler(URL url, String requestMethod, Map parameters, String outputEncoding) throws IOException {
        logger.debug("Creating http url handler for: " + url + "; using method: " + requestMethod + "; with parameters: " + parameters);
        if (url == null) throw new IllegalArgumentException("Null pointer in url");
        if (!"http".equals(url.getProtocol()) && !"https".equals(url.getProtocol())) throw new IllegalArgumentException("Illegal url protocol: \"" + url.getProtocol() + "\"; must be \"http\" or \"https\"");
        if (requestMethod == null) throw new IllegalArgumentException("Null pointer in requestMethod");
        if (!"GET".equals(requestMethod) && !"POST".equals(requestMethod)) throw new IllegalArgumentException("Illegal request method: " + requestMethod + "; must be \"GET\" or \"POST\"");
        if (parameters == null) throw new IllegalArgumentException("Null pointer in parameters");
        HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection(proxy);
        connection.setRequestMethod(requestMethod);
        connection.setUseCaches(false);
        if (EMPTY_MAP.equals(parameters)) {
            connection.setDoOutput(false);
        } else {
            connection.setDoOutput(true);
            OutputStream out =(OutputStream)(Object) connection.getOutputStream();
            writeParameters(out, parameters, outputEncoding);
            out.close();
        }
        inputStream = connection.getInputStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(MyHelperClass o0){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class Map {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}
