


class c17984760 {

    public byte[] loadRaw(String ontologyUrl) throws IOException {
        URL url = new URL(ontologyUrl);
        InputStream is =(InputStream)(Object) url.openStream();
        final int BUFFER_SIZE = 1024;
        byte[] buffer = new byte[BUFFER_SIZE];
        ByteArrayOutputStream ontologyBytes = new ByteArrayOutputStream();
        for (; ; ) {
            int bytesRead =(int)(Object) is.read(buffer);
            if (bytesRead <= 0) break;
            ontologyBytes.write(buffer, 0, bytesRead);
        }
        return(byte[])(Object) ontologyBytes.toByteArray();
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

public MyHelperClass read(byte[] o0){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
