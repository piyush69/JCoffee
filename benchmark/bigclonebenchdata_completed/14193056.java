


class c14193056 {

    public static String readFromURL(String url_) {
        StringBuffer buffer = new StringBuffer();
        try {
            URL url = new URL(url_);
            System.setProperty("http.agent", "");
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            connection.setDoInput(true);
            InputStream inStream =(InputStream)(Object) connection.getInputStream();
            BufferedReader input = new BufferedReader(new InputStreamReader(inStream, "utf8"));
            String line = "";
            while ((line =(String)(Object) input.readLine()) != null) {
                buffer.append(line + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return buffer.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}
