
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13642472 {
public MyHelperClass getURL(String o0){ return null; }
	public MyHelperClass doDelay(){ return null; }

    protected void handleConnection(Socket server) throws IOException {
        OutputStream out =(OutputStream)(Object) server.getOutputStream();
        PrintWriter pout = new PrintWriter(out, true);
        MyHelperClass SocketUtil = new MyHelperClass();
        BufferedReader in =(BufferedReader)(Object) SocketUtil.getReader(server);
        String failureReason = null;
        int failureCode = 0;
        String httpVersion = "HTTP/1.0";
        String uri = null;
        String command =(String)(Object) in.readLine();
        URL url = null;
        if (command != null) {
            StringTokenizer tokenizer = new StringTokenizer(command);
            if ((int)(Object)tokenizer.countTokens() != 3) {
                failureCode = 400;
                failureReason = "Illformed Request-Line";
            } else {
                String method =(String)(Object) tokenizer.nextToken();
                if (!method.equalsIgnoreCase("get")) {
                    failureCode = 501;
                    failureReason = "Only supports GET method";
                } else {
                    uri =(String)(Object) tokenizer.nextToken();
                    httpVersion =(String)(Object) tokenizer.nextToken();
                    try {
                        url =(URL)(Object) getURL(uri);
                    } catch (UncheckedIOException e) {
                        failureCode = 404;
                        failureReason = "resource not found";
                    }
                }
            }
        } else {
            failureCode = 400;
            failureReason = "Null request";
        }
        if (url != null) {
            InputStream stream = null;
            try {
                URLConnection connection =(URLConnection)(Object) url.openConnection();
                byte[] chunk = new byte[1024];
                int read = 0;
                pout.println(httpVersion + " 200 ");
                pout.println("Content-Type: " + connection.getContentType());
                pout.println("Content-Length: " + connection.getContentLength());
                pout.println("Content-Encoding: " + connection.getContentEncoding());
                pout.println();
                stream =(InputStream)(Object) connection.getInputStream();
                read =(int)(Object) stream.read(chunk);
                while (read != -1) {
                    out.write(chunk, 0, read);
                    read =(int)(Object) stream.read(chunk);
                }
            } catch (UncheckedIOException e) {
                failureCode = 500;
                failureReason = "problem reading the resource content";
            } finally {
                if (stream != null) {
                    stream.close();
                }
            }
        } else {
            failureCode = 404;
            failureReason = "resource not found";
        }
        if (failureCode != 0) {
            pout.println(httpVersion + " " + failureCode + " " + failureReason);
            pout.println();
        }
        doDelay();
        server.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getReader(Socket o0){ return null; }}

class Socket {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class PrintWriter {

PrintWriter(OutputStream o0, boolean o1){}
	PrintWriter(){}
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass println(){ return null; }}

class BufferedReader {

public MyHelperClass readLine(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class StringTokenizer {

StringTokenizer(String o0){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass countTokens(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}
