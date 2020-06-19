
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21905202 {

    private boolean hasPackageInfo(URL url) {
        if (url == null) return false;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line =(String)(Object) br.readLine()) != null) {
                if (line.startsWith("Specification-Title: ") || line.startsWith("Specification-Version: ") || line.startsWith("Specification-Vendor: ") || line.startsWith("Implementation-Title: ") || line.startsWith("Implementation-Version: ") || line.startsWith("Implementation-Vendor: ")) return true;
            }
        } catch (UncheckedIOException ioe) {
        } finally {
            if (br != null) try {
                br.close();
            } catch (UncheckedIOException e) {
            }
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
