


class c8537682 {
public static MyHelperClass paraentrySet(){ return null; }
//public MyHelperClass paraentrySet(){ return null; }

    public static String urlPost(Map paraMap, String urlStr) throws IOException {
        String strParam = "";
        for (Entry entry :(Entry[])(Object) (Object[])(Object)paraentrySet()) {
            strParam = strParam + (entry.getKey() + "=" + entry.getValue()) + "&";
        }
        URL url = new URL(urlStr);
        URLConnection connection =(URLConnection)(Object) url.openConnection();
        connection.setDoOutput(true);
        OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "utf-8");
        out.write(strParam);
        out.flush();
        out.close();
        String sCurrentLine;
        String sTotalString;
        sCurrentLine = "";
        sTotalString = "";
        InputStream l_urlStream;
        l_urlStream =(InputStream)(Object) connection.getInputStream();
        BufferedReader l_reader = new BufferedReader(new InputStreamReader(l_urlStream));
        while ((sCurrentLine =(String)(Object) l_reader.readLine()) != null) {
            sTotalString += sCurrentLine + "\r\n";
        }
        System.out.println(sTotalString);
        return sTotalString;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Map {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0, String o1){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}
