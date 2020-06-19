


class c7407182 {

    public static void redirect(String strRequest, PrintWriter sortie) throws Exception {
        String level = "info.";
        MyHelperClass ConnectorServlet = new MyHelperClass();
        if ((boolean)(Object)ConnectorServlet.debug) level = "debug.";
        MyHelperClass LogFactory = new MyHelperClass();
        Log log =(Log)(Object) LogFactory.getLog(level + "fr.brgm.exows.gml2gsml.GFI");
        URL url2Request = new URL(strRequest);
        URLConnection conn =(URLConnection)(Object) url2Request.openConnection();
        DataInputStream buffin = new DataInputStream(new BufferedInputStream(conn.getInputStream()));
        String strLine = null;
        while ((strLine =(String)(Object) buffin.readLine()) != null) {
            sortie.println(strLine);
        }
        buffin.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass debug;
public MyHelperClass getLog(String o0){ return null; }}

class PrintWriter {

public MyHelperClass println(String o0){ return null; }}

class Log {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class DataInputStream {

DataInputStream(BufferedInputStream o0){}
	DataInputStream(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}
