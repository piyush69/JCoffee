
import java.io.UncheckedIOException;


class c7044153 {

    private static void sendExceptionToServer(String server, Throwable ex, String config, String prob) {
        try {
            StringBuilder dataSB = new StringBuilder();
            MyHelperClass URLEncoder = new MyHelperClass();
            dataSB.append(URLEncoder.encode("secret", "UTF-8"));
            dataSB.append('=');
//            MyHelperClass URLEncoder = new MyHelperClass();
            dataSB.append(URLEncoder.encode("badsecurity", "UTF-8"));
            dataSB.append('&');
//            MyHelperClass URLEncoder = new MyHelperClass();
            dataSB.append(URLEncoder.encode("version", "UTF-8"));
            dataSB.append('=');
            MyHelperClass BuildInfo = new MyHelperClass();
            dataSB.append(URLEncoder.encode((String)(Object)BuildInfo.revisionNumber, "UTF-8"));
            dataSB.append('&');
//            MyHelperClass URLEncoder = new MyHelperClass();
            dataSB.append(URLEncoder.encode("os", "UTF-8"));
            dataSB.append('=');
//            MyHelperClass URLEncoder = new MyHelperClass();
            dataSB.append(URLEncoder.encode(System.getProperty("os.name") + " " + System.getProperty("os.version"), "UTF-8"));
            dataSB.append('&');
//            MyHelperClass URLEncoder = new MyHelperClass();
            dataSB.append(URLEncoder.encode("user", "UTF-8"));
            dataSB.append('=');
//            MyHelperClass URLEncoder = new MyHelperClass();
            dataSB.append(URLEncoder.encode(System.getProperty("user.name"), "UTF-8"));
            dataSB.append('&');
//            MyHelperClass URLEncoder = new MyHelperClass();
            dataSB.append(URLEncoder.encode("msg", "UTF-8"));
            dataSB.append('=');
//            MyHelperClass URLEncoder = new MyHelperClass();
            dataSB.append(URLEncoder.encode(ex.getMessage(), "UTF-8"));
            ByteArrayOutputStream trace = new ByteArrayOutputStream();
            ex.printStackTrace((java.io.PrintStream)(Object)new PrintStream(trace));
            dataSB.append('&');
//            MyHelperClass URLEncoder = new MyHelperClass();
            dataSB.append(URLEncoder.encode("trace", "UTF-8"));
            dataSB.append('=');
//            MyHelperClass URLEncoder = new MyHelperClass();
            dataSB.append(URLEncoder.encode(trace.toString(), "UTF-8"));
            if (config != null) {
                dataSB.append('&');
//                MyHelperClass URLEncoder = new MyHelperClass();
                dataSB.append(URLEncoder.encode("config", "UTF-8"));
                dataSB.append('=');
//                MyHelperClass URLEncoder = new MyHelperClass();
                dataSB.append(URLEncoder.encode(config, "UTF-8"));
            }
            if (prob != null) {
                dataSB.append('&');
//                MyHelperClass URLEncoder = new MyHelperClass();
                dataSB.append(URLEncoder.encode("problem", "UTF-8"));
                dataSB.append('=');
//                MyHelperClass URLEncoder = new MyHelperClass();
                dataSB.append(URLEncoder.encode(prob, "UTF-8"));
            }
            MyHelperClass errorServerURL = new MyHelperClass();
            URL url = new URL(errorServerURL);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(dataSB.toString());
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String response = null;
            String line = null;
            while ((line =(String)(Object) rd.readLine()) != null) {
                if (response == null) response = line; else System.out.println(line);
            }
            wr.close();
            rd.close();
            if (response.equals("success")) System.out.println("Exception sent to maRla development team"); else System.out.println("Unable to send exception to development team: " + response);
        } catch (UncheckedIOException ex2) {
            System.out.println("Unable to send exception to development team: " + ex2.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass revisionNumber;
public MyHelperClass encode(String o0, String o1){ return null; }}

class ByteArrayOutputStream {

}

class PrintStream {

PrintStream(){}
	PrintStream(ByteArrayOutputStream o0){}}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
