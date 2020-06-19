
import java.io.UncheckedIOException;


class c18248438 {

    private ByteArrayInputStream fetchUrl(String urlString, Exception[] outException) {
        URL url;
        try {
            url = new URL(urlString);
            InputStream is = null;
            int inc = 65536;
            int curr = 0;
            byte[] result = new byte[inc];
            try {
                is =(InputStream)(Object) url.openStream();
                int n;
                while ((n =(int)(Object) is.read(result, curr, result.length - curr)) != -1) {
                    curr += n;
                    if (curr == result.length) {
                        byte[] temp = new byte[curr + inc];
                        System.arraycopy(result, 0, temp, 0, curr);
                        result = temp;
                    }
                }
                return new ByteArrayInputStream(result, 0, curr);
            } finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (UncheckedIOException e) {
                    }
                }
            }
        } catch (Exception e) {
            outException[0] = e;
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ByteArrayInputStream {

ByteArrayInputStream(byte[] o0, int o1, int o2){}
	ByteArrayInputStream(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
