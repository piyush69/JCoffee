


class c7846688 {

    public void postData(String protocol, String host, String form, String data) throws Exception {
        if ((protocol == null) || (protocol.equals(""))) {
            MyHelperClass DEFAULT_PROTOCOL = new MyHelperClass();
            protocol =(String)(Object) DEFAULT_PROTOCOL;
        }
        if ((host == null) || (host.equals(""))) {
            MyHelperClass DEFAULT_HOST = new MyHelperClass();
            host =(String)(Object) DEFAULT_HOST;
        }
        if (form == null) {
            MyHelperClass DEFAULT_FORM = new MyHelperClass();
            form =(String)(Object) DEFAULT_FORM;
        }
        if (data == null) {
            throw new IllegalArgumentException("Invalid data");
        }
        URL url = new URL(protocol, host, form);
        URLConnection con =(URLConnection)(Object) url.openConnection();
        con.setDoOutput(true);
        con.setDoInput(true);
        con.setUseCaches(false);
        con.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
        con.setRequestProperty("Content-length", String.valueOf(data.length()));
        PrintStream out = new PrintStream(con.getOutputStream(), true);
        out.print(data);
        out.close();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        while (in.readLine() != null) {
        }
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0, String o1, String o2){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class PrintStream {

PrintStream(){}
	PrintStream(MyHelperClass o0, boolean o1){}
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
