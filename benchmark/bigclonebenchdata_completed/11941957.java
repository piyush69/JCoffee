
import java.io.UncheckedIOException;


class c11941957 {

    String openUrlAsString(String address, int maxLines) {
        StringBuffer sb;
        try {
            URL url = new URL(address);
            InputStream in =(InputStream)(Object) url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            sb = new StringBuffer();
            int count = 0;
            String line;
            while ((line =(String)(Object) br.readLine()) != null && count++ < maxLines) sb.append(line + "\n");
            in.close();
        } catch (UncheckedIOException e) {
            sb = null;
        }
        return sb != null ? new String(sb) : null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
