


class c20676444 {

    protected byte[] bytesFromJar(String path) throws IOException {
        URL url = new URL(path);
        InputStream is =(InputStream)(Object) url.openStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[2048];
        int n;
        while ((n =(int)(Object) is.read(buffer)) >= 0) baos.write(buffer, 0, n);
        is.close();
        return(byte[])(Object) baos.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
