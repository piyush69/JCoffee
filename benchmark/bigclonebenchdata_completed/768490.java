import java.io.*;
import java.lang.*;
import java.util.*;



class c768490 {
public static MyHelperClass doVersionCheck(View o0, String o1, String o2){ return null; }
//public MyHelperClass doVersionCheck(View o0, String o1, String o2){ return null; }

    public static void doVersionCheck(View view) {
        view.showWaitCursor();
        try {
            MyHelperClass jEdit = new MyHelperClass();
            URL url = new URL(jEdit.getProperty("version-check.url"));
            InputStream in =(InputStream)(Object) url.openStream();
            BufferedReader bin = new BufferedReader(new InputStreamReader(in));
            String line;
            String develBuild = null;
            String stableBuild = null;
            while ((line = bin.readLine()) != null) {
                if (line.startsWith(".build")) develBuild = line.substring(6).trim(); else if (line.startsWith(".stablebuild")) stableBuild = line.substring(12).trim();
            }
            bin.close();
            if (develBuild != null && stableBuild != null) {
                doVersionCheck(view, stableBuild, develBuild);
            }
        } catch (IOException e) {
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
	public MyHelperClass getProperty(String o0){ return null; }}

class View {

public MyHelperClass showWaitCursor(){ return null; }
	public MyHelperClass hideWaitCursor(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}
