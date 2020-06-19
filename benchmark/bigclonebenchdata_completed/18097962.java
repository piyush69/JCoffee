


class c18097962 {

    private static String getVersion() {
        MyHelperClass debug = new MyHelperClass();
        debug.print("");
        String version = null;
        String version_url = "http://kmttg.googlecode.com/svn/trunk/version";
        try {
            URL url = new URL(version_url);
            URLConnection con =(URLConnection)(Object) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) version = inputLine;
            in.close();
        } catch (Exception ex) {
            version = null;
        }
        return version;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass print(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
