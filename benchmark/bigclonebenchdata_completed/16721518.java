
import java.io.UncheckedIOException;


class c16721518 {

    void openTextFile(String urlString, boolean install) {
        StringBuffer sb = null;
        try {
            URL url = new URL(urlString);
            InputStream in =(InputStream)(Object) url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            sb = new StringBuffer();
            String line;
            while ((line =(String)(Object) br.readLine()) != null) sb.append(line + "\n");
            in.close();
        } catch (UncheckedIOException e) {
            MyHelperClass IJ = new MyHelperClass();
            if (!(install && urlString.endsWith("StartupMacros.txt"))) IJ.error("URL Opener", "" + e);
            sb = null;
        }
        if (sb != null) {
            if (install) (new MacroInstaller()).install(new String(sb)); else {
                int index = urlString.lastIndexOf("/");
                if (index != -1 && index <= urlString.length() - 1) urlString = urlString.substring(index + 1);
                (new Editor()).create(urlString, new String(sb));
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, String o1){ return null; }}

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

class MacroInstaller {

public MyHelperClass install(String o0){ return null; }}

class Editor {

public MyHelperClass create(String o0, String o1){ return null; }}
