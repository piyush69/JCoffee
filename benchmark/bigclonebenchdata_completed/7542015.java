
import java.io.UncheckedIOException;


class c7542015 {

    public static String[] parseM3U(String strURL, Context c) {
        URL url;
        URLConnection urlConn = null;
        String TAG = "parseM3U";
        Vector radio = new Vector();
        final String filetoken = "http";
        try {
            url = new URL(strURL);
            urlConn =(URLConnection)(Object) url.openConnection();
            MyHelperClass Log = new MyHelperClass();
            Log.d(TAG, "Got data");
        } catch (UncheckedIOException ioe) {
            MyHelperClass Log = new MyHelperClass();
            Log.e(TAG, "Could not connect to " + strURL);
        }
        try {
            DataInputStream in = new DataInputStream(urlConn.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine =(String)(Object) br.readLine()) != null) {
                String temp = strLine.toLowerCase();
                MyHelperClass Log = new MyHelperClass();
                Log.d(TAG, strLine);
                if (temp.startsWith(filetoken)) {
                    radio.add(temp);
//                    MyHelperClass Log = new MyHelperClass();
                    Log.d(TAG, "Found audio " + temp);
                }
            }
            br.close();
            in.close();
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e(TAG, "Trouble reading file: " + e.getMessage());
        }
        String[] t = new String[0];
        String[] r = null;
        if ((int)(Object)radio.size() != 0) {
            r = (String[])(String[])(Object) radio.toArray(t);
            MyHelperClass Log = new MyHelperClass();
            Log.d(TAG, "Found total: " + String.valueOf(r.length));
        }
        return r;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass e(String o0, String o1){ return null; }
	public MyHelperClass d(String o0, String o1){ return null; }}

class Context {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class Vector {

public MyHelperClass toArray(String[] o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DataInputStream {

DataInputStream(MyHelperClass o0){}
	DataInputStream(){}
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(DataInputStream o0){}
	InputStreamReader(){}}
