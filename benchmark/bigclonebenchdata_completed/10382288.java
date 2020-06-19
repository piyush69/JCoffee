


class c10382288 {
public static MyHelperClass showUpdateNotification(String o0, String o1){ return null; }
public static MyHelperClass compare(String o0, String o1){ return null; }
//public MyHelperClass compare(String o0, String o1){ return null; }
//	public MyHelperClass showUpdateNotification(String o0, String o1){ return null; }

    public static void checkForUpdate(String version) {
        try {
            MyHelperClass WiimoteWhiteboard = new MyHelperClass();
            URL url = new URL(WiimoteWhiteboard.getProperty("updateURL"));
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            final String current =(String)(Object) in.readLine();
            if ((boolean)(Object)compare(version, current)) showUpdateNotification(version, current);
            in.close();
        } catch (Exception e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getProperty(String o0){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
