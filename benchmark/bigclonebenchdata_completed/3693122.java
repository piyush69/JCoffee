
import java.io.UncheckedIOException;


class c3693122 {

    private static byte[] get256RandomBits() throws IOException {
        URL url = null;
        try {
            MyHelperClass SRV_URL = new MyHelperClass();
            url = new URL(SRV_URL);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        HttpsURLConnection hu = (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
        hu.setConnectTimeout(2500);
        InputStream is =(InputStream)(Object) hu.getInputStream();
        byte[] content = new byte[(int)(Object)is.available()];
        is.read(content);
        is.close();
        hu.disconnect();
        byte[] randomBits = new byte[32];
        String line = new String(content);
        MyHelperClass DETAIL = new MyHelperClass();
        Matcher m =(Matcher)(Object) DETAIL.matcher(line);
        if ((boolean)(Object)m.find()) {
            for (int i = 0; i < 32; i++) randomBits[i] = (byte) (Integer.parseInt((String)(Object)m.group(1).substring(i * 2, i * 2 + 2), 16) & 0xFF);
        }
        return randomBits;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass matcher(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class HttpsURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass available(){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}
