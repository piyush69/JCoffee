


class c9801258 {

    public InetSocketAddress getServerAddress() throws IOException {
        MyHelperClass ADDRESS_SERVER_URL = new MyHelperClass();
        URL url = new URL(ADDRESS_SERVER_URL);
        HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        con.setRequestMethod("GET");
        con.setDoOutput(true);
        con.setReadTimeout(2000);
        con.connect();
        BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String line =(String)(Object) rd.readLine();
        if (line == null) throw new IOException("Cannot read address from address server");
        String addr[] = line.split(" ", 2);
        return new InetSocketAddress(addr[0], Integer.valueOf(addr[1]));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InetSocketAddress {

InetSocketAddress(){}
	InetSocketAddress(String o0, Integer o1){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
