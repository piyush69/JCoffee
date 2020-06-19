


class c13733915 {

    public static void contentTrans(String contents, String urlString, String urlString2, String serverIp, int port) {
        try {
            URL url = new URL(urlString);
            url.openStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            MyHelperClass InetAddress = new MyHelperClass();
            Socket server = new Socket(InetAddress.getByName(serverIp), port);
            OutputStream outputStream =(OutputStream)(Object) server.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(contents);
            bufferedWriter.flush();
            bufferedWriter.close();
            server.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            URL url2 = new URL(urlString2);
            url2.openStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getByName(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class Socket {

Socket(MyHelperClass o0, int o1){}
	Socket(){}
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(OutputStream o0, String o1){}
	OutputStreamWriter(){}}
