


class c23119494 {

//    @Override
    public void handle(HttpExchange http) throws IOException {
        Headers reqHeaders =(Headers)(Object) http.getRequestHeaders();
        Headers respHeader =(Headers)(Object) http.getResponseHeaders();
        respHeader.add("Content-Type", "text/plain");
        http.sendResponseHeaders(200, 0);
        PrintWriter console = new PrintWriter((PrintStream)(Object)System.err);
        PrintWriter web = new PrintWriter((PrintStream)(Object)http.getResponseBody());
        PrintWriter out = new PrintWriter((PrintStream)(Object)new YWriter(web, console));
        out.println("### " + new Date() + " ###");
        out.println("Method: " + http.getRequestMethod());
        out.println("Protocol: " + http.getProtocol());
        out.println("RemoteAddress.HostName: " + http.getRemoteAddress().getHostName());
        for (String key :(String[])(Object) (Object[])(Object)reqHeaders.keySet()) {
            out.println("* \"" + key + "\"");
            for (String v :(String[])(Object) (Object[])(Object)reqHeaders.get(key)) {
                out.println("\t" + v);
            }
        }
        InputStream in =(InputStream)(Object) http.getRequestBody();
        if (in != null) {
            out.println();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyTo(new InputStreamReader(in), out);
            in.close();
        }
        out.flush();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getHostName(){ return null; }
	public MyHelperClass copyTo(InputStreamReader o0, PrintWriter o1){ return null; }}

class HttpExchange {

public MyHelperClass getRequestHeaders(){ return null; }
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass sendResponseHeaders(int o0, int o1){ return null; }
	public MyHelperClass getResponseBody(){ return null; }
	public MyHelperClass getResponseHeaders(){ return null; }
	public MyHelperClass getRemoteAddress(){ return null; }
	public MyHelperClass getRequestBody(){ return null; }
	public MyHelperClass getRequestMethod(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Headers {

public MyHelperClass add(String o0, String o1){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(PrintStream o0){}
	public MyHelperClass println(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class YWriter {

YWriter(PrintWriter o0, PrintWriter o1){}
	YWriter(){}}

class Date {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class PrintStream {

}
