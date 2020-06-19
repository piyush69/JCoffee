
import java.io.UncheckedIOException;


class c1442217 {
public MyHelperClass extractValue(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
public MyHelperClass STATUS_CAPTURE;
public MyHelperClass saved;
	public MyHelperClass extractPath(String o0){ return null; }

//    @Override
    protected URLConnection openConnection(URL url) throws IOException {
        final String urlPath =(String)(Object) url.getPath();
        final int status;
        final String path;
        MyHelperClass STATUS_REGEX = new MyHelperClass();
        String statusAsString =(String)(Object) extractValue(urlPath, STATUS_REGEX, STATUS_CAPTURE);
        status = statusAsString == null ? 200 : Integer.parseInt(statusAsString);
        path =(String)(Object) extractPath(urlPath);
        if (saved.get(url.toString()) == null) {
            saved.put(url.toString(), new ArrayList());
        }
        return (URLConnection)(Object)new HttpsURLConnection(url) {

//            @Override
            public int getResponseCode() throws IOException {
                return status;
            }

//            @Override
            public InputStream getInputStream() throws IOException {
                if (errorStatus()) throw new IOException("fake server returned a fake error");
                if (path == null) {
                    return (InputStream)(Object)new ByteArrayInputStream(new byte[0]);
                } else {
                    return (InputStream)(Object)new FileInputStream(path);
                }
            }

//            @Override
            public InputStream getErrorStream() {
                if (errorStatus()) {
                    try {
                        return (InputStream)(Object)new FileInputStream(path);
                    } catch (UncheckedIOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    return null;
                }
            }

//            @Override
            public OutputStream getOutputStream() throws IOException {
                final ByteArrayOutputStream out = new ByteArrayOutputStream();
                saved.get(url.toString()).add(out);
                return (OutputStream)(Object)out;
            }

//            @Override
            public String getContentType() {
                return "test/plain";
            }

//            @Override
            public void connect() throws IOException {
            }

//            @Override
            public boolean usingProxy() {
                return false;
            }

//            @Override
            public void disconnect() {
            }

            private boolean errorStatus() {
                return status >= 500 && status <= 599;
            }

//            @Override
            public String getCipherSuite() {
                return null;
            }

//            @Override
            public Certificate[] getLocalCertificates() {
                return null;
            }

//            @Override
            public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
                return null;
            }
        };
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass put(String o0, ArrayList o1){ return null; }
	public MyHelperClass add(ByteArrayOutputStream o0){ return null; }}

class URL {

public MyHelperClass getPath(){ return null; }}

class URLConnection {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

}

class ByteArrayOutputStream {

}

class HttpsURLConnection {

HttpsURLConnection(){}
	HttpsURLConnection(URL o0){}}

class InputStream {

}

class OutputStream {

}

class Certificate {

}

class SSLPeerUnverifiedException extends Exception{
	public SSLPeerUnverifiedException(String errorMessage) { super(errorMessage); }
}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
