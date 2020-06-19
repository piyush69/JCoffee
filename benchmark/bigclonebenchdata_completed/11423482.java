


class c11423482 {
public MyHelperClass defaultBufferSize;
	public MyHelperClass Log;

    protected byte[] retrieveImageData() throws IOException {
        MyHelperClass imageUrl = new MyHelperClass();
        URL url = new URL(imageUrl);
        HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        int fileSize =(int)(Object) connection.getContentLength();
        MyHelperClass LOG_TAG = new MyHelperClass();
        Log.d(LOG_TAG, "fetching image " + imageUrl + " (" + (fileSize <= 0 ? "size unknown" : Integer.toString(fileSize)) + ")");
        BufferedInputStream istream = new BufferedInputStream(connection.getInputStream());
        try {
            if (fileSize <= 0) {
//                MyHelperClass LOG_TAG = new MyHelperClass();
                Log.w(LOG_TAG, "Server did not set a Content-Length header, will default to buffer size of " + defaultBufferSize + " bytes");
                MyHelperClass defaultBufferSize = new MyHelperClass();
                ByteArrayOutputStream buf = new ByteArrayOutputStream(defaultBufferSize);
//                MyHelperClass defaultBufferSize = new MyHelperClass();
                byte[] buffer = new byte[(int)(Object)defaultBufferSize];
                int bytesRead = 0;
                while (bytesRead != -1) {
//                    MyHelperClass defaultBufferSize = new MyHelperClass();
                    bytesRead =(int)(Object) istream.read(buffer, 0, defaultBufferSize);
                    if (bytesRead > 0) buf.write(buffer, 0, bytesRead);
                }
                return(byte[])(Object) buf.toByteArray();
            } else {
                byte[] imageData = new byte[fileSize];
                int bytesRead = 0;
                int offset = 0;
                while (bytesRead != -1 && offset < fileSize) {
                    bytesRead =(int)(Object) istream.read(imageData, offset, fileSize - offset);
                    offset += bytesRead;
                }
                return imageData;
            }
        } finally {
            try {
                istream.close();
                connection.disconnect();
            } catch (Exception ignore) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass d(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass w(MyHelperClass o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(MyHelperClass o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class ByteArrayOutputStream {

ByteArrayOutputStream(MyHelperClass o0){}
	ByteArrayOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
