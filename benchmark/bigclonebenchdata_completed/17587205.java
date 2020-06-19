


class c17587205 {

    public static void main(String[] s) throws Exception {
        System.setProperty("http.proxyHost", "ser");
        System.setProperty("http.proxyPort", "3128");
        URL url = new URL("http", "me", 80, "/");
        HttpURLConnection urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        MyHelperClass Authenticator = new MyHelperClass();
        Authenticator.setDefault(new TestAuthenticator());
        System.out.println("usingproxy status - " + urlConn.usingProxy());
        System.out.println("Class name - " + urlConn.getClass().getName());
        InputStream in =(InputStream)(Object) url.openStream();
        BufferedReader theReader = new BufferedReader(new InputStreamReader(url.openStream()));
        final int kMaxSizeHTML = 100000;
        char readBuffer[] = new char[kMaxSizeHTML];
        int countRead =(int)(Object) theReader.read(readBuffer, 0, kMaxSizeHTML);
        String contentStr = "";
        String tmpStr;
        BufferedWriter wr = new BufferedWriter(new FileWriter("c:\\opt1\\auth-proxy.txt"));
        while ((countRead != -1) && (countRead != 0) && (contentStr.length() < kMaxSizeHTML)) {
            wr.write(readBuffer, 0, countRead);
            tmpStr = new String(readBuffer, 0, countRead);
            contentStr += tmpStr;
            countRead =(int)(Object) theReader.read(readBuffer, 0, kMaxSizeHTML);
        }
        wr.flush();
        wr.close();
        wr = null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDefault(TestAuthenticator o0){ return null; }}

class URL {

URL(String o0, String o1, int o2, String o3){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass usingProxy(){ return null; }}

class TestAuthenticator {

}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass read(char[] o0, int o1, int o2){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}
