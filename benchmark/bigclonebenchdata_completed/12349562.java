


class c12349562 {
public MyHelperClass buildURL(String o0){ return null; }

    public byte[] loadResource(String location) throws IOException {
        if ((location == null) || (location.length() == 0)) {
            throw new IOException("The given resource location must not be null and non empty.");
        }
        URL url =(URL)(Object) buildURL(location);
        URLConnection cxn =(URLConnection)(Object) url.openConnection();
        InputStream is = null;
        try {
            byte[] byteBuffer = new byte[2048];
            ByteArrayOutputStream bos = new ByteArrayOutputStream(2048);
            is =(InputStream)(Object) cxn.getInputStream();
            int bytesRead = 0;
            while ((bytesRead =(int)(Object) is.read(byteBuffer, 0, 2048)) >= 0) {
                bos.write(byteBuffer, 0, bytesRead);
            }
            return(byte[])(Object) bos.toByteArray();
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

ByteArrayOutputStream(int o0){}
	ByteArrayOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
