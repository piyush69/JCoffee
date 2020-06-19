


class c7599114 {

    private static byte[] readBytes(URL url) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[8192];
        InputStream in =(InputStream)(Object) url.openStream();
        try {
            int readlen;
            while ((readlen =(int)(Object) in.read(buf)) > 0) bos.write(buf, 0, readlen);
        } finally {
            in.close();
        }
        return(byte[])(Object) bos.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
