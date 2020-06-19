


class c4898682 {

    public void run() {
        try {
            MyHelperClass URLEncoder = new MyHelperClass();
            String s = (new StringBuilder()).append("fName=").append(URLEncoder.encode("???", "UTF-8")).append("&lName=").append(URLEncoder.encode("???", "UTF-8")).toString();
            URL url = new URL("http://snoop.minecraft.net/");
            HttpURLConnection httpurlconnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            httpurlconnection.setRequestMethod("POST");
            httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpurlconnection.setRequestProperty("Content-Length", (new StringBuilder()).append("").append(Integer.toString(s.getBytes().length)).toString());
            httpurlconnection.setRequestProperty("Content-Language", "en-US");
            httpurlconnection.setUseCaches(false);
            httpurlconnection.setDoInput(true);
            httpurlconnection.setDoOutput(true);
            DataOutputStream dataoutputstream = new DataOutputStream(httpurlconnection.getOutputStream());
            dataoutputstream.writeBytes(s);
            dataoutputstream.flush();
            dataoutputstream.close();
            java.io.InputStream inputstream =(java.io.InputStream)(Object)(InputStream)(Object) httpurlconnection.getInputStream();
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader((InputStream)(Object)inputstream));
            StringBuffer stringbuffer = new StringBuffer();
            String s1;
            while ((s1 =(String)(Object) bufferedreader.readLine()) != null) {
                stringbuffer.append(s1);
                stringbuffer.append('\r');
            }
            bufferedreader.close();
        } catch (Exception exception) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass writeBytes(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class InputStream {

}
