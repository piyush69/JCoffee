


class c15183953 {

        private byte[] cacheInputStream(URL url) throws IOException {
            InputStream ins =(InputStream)(Object) url.openStream();
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            byte[] buf = new byte[256];
            while (true) {
                int n =(int)(Object) ins.read(buf);
                if (n == -1) break;
                bout.write(buf, 0, n);
            }
            return(byte[])(Object) bout.toByteArray();
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

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
