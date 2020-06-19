


class c15683090 {
public MyHelperClass assertTrue(boolean o0){ return null; }
	public MyHelperClass assertEquals(int o0, MyHelperClass o1){ return null; }
public MyHelperClass startSinkServer(AtomicInteger o0){ return null; }

    private void doUpload(UploadKind uploadKind, WriteKind writeKind) throws Exception {
        int n = 512 * 1024;
        AtomicInteger total = new AtomicInteger(0);
        ServerSocket ss =(ServerSocket)(Object) startSinkServer(total);
        URL url = new URL("http://localhost:" + ss.getLocalPort() + "/test1");
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        MyHelperClass UploadKind = new MyHelperClass();
        if (uploadKind == (UploadKind)(Object)UploadKind.CHUNKED) {
            conn.setChunkedStreamingMode(-1);
        } else {
            conn.setFixedLengthStreamingMode(n);
        }
        OutputStream out =(OutputStream)(Object) conn.getOutputStream();
        MyHelperClass WriteKind = new MyHelperClass();
        if (writeKind == (WriteKind)(Object)WriteKind.BYTE_BY_BYTE) {
            for (int i = 0; i < n; ++i) {
                out.write('x');
            }
        } else {
//            MyHelperClass WriteKind = new MyHelperClass();
            byte[] buf = new byte[writeKind == (WriteKind)(Object)WriteKind.SMALL_BUFFERS ? 256 : 64 * 1024];
            MyHelperClass Arrays = new MyHelperClass();
            Arrays.fill(buf, (byte) 'x');
            for (int i = 0; i < n; i += buf.length) {
                out.write(buf, 0, Math.min(buf.length, n - i));
            }
        }
        out.close();
        assertTrue((int)(Object)conn.getResponseCode() > 0);
//        MyHelperClass UploadKind = new MyHelperClass();
        assertEquals(uploadKind == (UploadKind)(Object)UploadKind.CHUNKED ? -1 : n, total.get());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CHUNKED;
	public MyHelperClass BYTE_BY_BYTE;
	public MyHelperClass SMALL_BUFFERS;
public MyHelperClass fill(byte[] o0, byte o1){ return null; }}

class UploadKind {

}

class WriteKind {

}

class AtomicInteger {

AtomicInteger(int o0){}
	AtomicInteger(){}
	public MyHelperClass get(){ return null; }}

class ServerSocket {

public MyHelperClass getLocalPort(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setFixedLengthStreamingMode(int o0){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass setChunkedStreamingMode(int o0){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass write(char o0){ return null; }
	public MyHelperClass close(){ return null; }}
