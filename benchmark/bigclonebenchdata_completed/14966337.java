
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14966337 {
public MyHelperClass jEdit;

    private Date fetchLastModifiedDate(String archName) {
        Date modifdate = null;
        URL url = null;
        try {
            MyHelperClass OOO_DICTS_PROP = new MyHelperClass();
            url = new URL(jEdit.getProperty(OOO_DICTS_PROP) + archName + ".zip");
        } catch (UncheckedIOException mfue) {
            MyHelperClass Log = new MyHelperClass();
            Log.log(Log.ERROR, HunspellDictsManager.class, "Invalid archive name : " + archName);
            MyHelperClass GUIUtilities = new MyHelperClass();
            GUIUtilities.error(null, "spell-check-hunspell-error-fetch", new String[] { mfue.getMessage() });
        }
        if (url != null) {
            try {
                URLConnection connect =(URLConnection)(Object) url.openConnection();
                connect.connect();
                if ((int)(Object)connect.getLastModified() == 0) {
                    MyHelperClass Log = new MyHelperClass();
                    Log.log(Log.ERROR, HunspellDictsManager.class, "no lastModifiedDate for " + archName);
                } else {
                    modifdate = new Date(connect.getLastModified());
                    MyHelperClass DateFormat = new MyHelperClass();
                    System.out.println("Modif date :" + DateFormat.getInstance().format(modifdate));
                    return modifdate;
                }
            } catch (UncheckedIOException ioe) {
                MyHelperClass GUIUtilities = new MyHelperClass();
                GUIUtilities.error(null, "spell-check-hunspell-error-fetch", new String[] { ioe.getMessage() });
                ioe.printStackTrace();
            }
        }
        return modifdate;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
public MyHelperClass log(MyHelperClass o0, Class<HunspellDictsManager> o1, String o2){ return null; }
	public MyHelperClass error(Object o0, String o1, String[] o2){ return null; }
	public MyHelperClass format(Date o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getProperty(MyHelperClass o0){ return null; }}

class Date {

Date(MyHelperClass o0){}
	Date(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass connect(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HunspellDictsManager {

}
