
import java.io.UncheckedIOException;


class c293167 {
public static MyHelperClass newVersionAvailable(View o0, String o1, URL o2){ return null; }
//public MyHelperClass newVersionAvailable(View o0, String o1, URL o2){ return null; }

    public static void doVersionCheck(View view) {
        view.showWaitCursor();
        try {
            MyHelperClass jEdit = new MyHelperClass();
            URL url = new URL(jEdit.getProperty("version-check.url"));
            InputStream in =(InputStream)(Object) url.openStream();
            BufferedReader bin = new BufferedReader(new InputStreamReader(in));
            String line;
            String version = null;
            String build = null;
            while ((line =(String)(Object) bin.readLine()) != null) {
                if (line.startsWith(".version")) version = line.substring(8).trim(); else if (line.startsWith(".build")) build = line.substring(6).trim();
            }
            bin.close();
            if (version != null && build != null) {
//                MyHelperClass jEdit = new MyHelperClass();
                if ((int)(Object)jEdit.getBuild().compareTo(build) < 0) newVersionAvailable(view, version, url); else {
                    MyHelperClass GUIUtilities = new MyHelperClass();
                    GUIUtilities.message(view, "version-check" + ".up-to-date", new String[0]);
                }
            }
        } catch (UncheckedIOException e) {
            MyHelperClass jEdit = new MyHelperClass();
            String[] args = {(String)(Object) jEdit.getProperty("version-check.url"), e.toString() };
            MyHelperClass GUIUtilities = new MyHelperClass();
            GUIUtilities.error(view, "read-error", args);
        }
        view.hideWaitCursor();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(View o0, String o1, String[] o2){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass getBuild(){ return null; }
	public MyHelperClass message(View o0, String o1, String[] o2){ return null; }
	public MyHelperClass compareTo(String o0){ return null; }}

class View {

public MyHelperClass showWaitCursor(){ return null; }
	public MyHelperClass hideWaitCursor(){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
