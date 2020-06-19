


class c18076450 {
public MyHelperClass close(InputStreamReader o0){ return null; }
	public MyHelperClass close(InputStream o0){ return null; }
	public MyHelperClass close(OutputStream o0){ return null; }
	public MyHelperClass close(OutputStreamWriter o0){ return null; }

    public void fetch(URL url, HTTPMethod method, String payload, WithResponse wr) throws IOException {
        System.out.println("fetchin' " + url.toString() + " with GAE fetch service");
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setInstanceFollowRedirects(false);
            connection.setReadTimeout(10000);
            connection.setRequestMethod(method.name());
            System.out.println(method.name().toString());
            connection.setRequestProperty("Connection", "close");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            if (wr != null) {
                connection.setDoOutput(true);
            }
            connection.connect();
            System.out.println(connection.toString());
            if (payload != null) {
                OutputStream out = null;
                OutputStreamWriter outWriter = null;
                try {
                    out =(OutputStream)(Object) connection.getOutputStream();
                    outWriter = new OutputStreamWriter(out, "UTF-8");
                    outWriter.write(payload);
                    System.out.println(out.toString());
                } finally {
                    close(outWriter);
                    close(out);
                }
            }
            if (wr != null) {
                InputStream in = null;
                InputStreamReader reader = null;
                StringBuilder sb = new StringBuilder();
                try {
                    in =(InputStream)(Object) connection.getInputStream();
                    reader = new InputStreamReader(in);
                    BufferedReader bufReader = new BufferedReader(reader);
                    String line;
                    while ((line =(String)(Object) bufReader.readLine()) != null) {
                        sb.append(line).append('\n');
                    }
                    System.out.println(line);
                } finally {
                    close(reader);
                    close(in);
                }
            }
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class HTTPMethod {

public MyHelperClass name(){ return null; }}

class WithResponse {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setInstanceFollowRedirects(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass setRequestMethod(MyHelperClass o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class OutputStream {

}

class OutputStreamWriter {

OutputStreamWriter(OutputStream o0, String o1){}
	OutputStreamWriter(){}
	public MyHelperClass write(String o0){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}
