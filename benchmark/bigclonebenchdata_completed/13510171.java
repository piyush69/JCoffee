
import java.io.UncheckedIOException;


class c13510171 {
public MyHelperClass Utilities;

        private String readCreditsHtml(IApplication app) {
            final URL url =(URL)(Object) app.getResources().getCreditsURL();
            StringBuffer buf = new StringBuffer(2048);
            if (url != null) {
                try {
                    BufferedReader rdr = new BufferedReader(new InputStreamReader(url.openStream()));
                    try {
                        String line = null;
                        while ((line =(String)(Object) rdr.readLine()) != null) {
                            MyHelperClass s_stringMgr = new MyHelperClass();
                            String internationalizedLine =(String)(Object) Utilities.replaceI18NSpanLine(line, s_stringMgr);
                            buf.append(internationalizedLine);
                        }
                    } finally {
                        rdr.close();
                    }
                } catch (UncheckedIOException ex) {
                    MyHelperClass s_stringMgr = new MyHelperClass();
                    String errorMsg =(String)(Object) s_stringMgr.getString("AboutBoxDialog.error.creditsfile");
                    MyHelperClass s_log = new MyHelperClass();
                    s_log.error(errorMsg,(IOException)(Object) ex);
                    buf.append(errorMsg + ": " + ex.toString());
                }
            } else {
                MyHelperClass s_stringMgr = new MyHelperClass();
                String errorMsg =(String)(Object) s_stringMgr.getString("AboutBoxDialog.error.creditsfileurl");
                MyHelperClass s_log = new MyHelperClass();
                s_log.error(errorMsg);
                buf.append(errorMsg);
            }
            return buf.toString();
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replaceI18NSpanLine(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getCreditsURL(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class IApplication {

public MyHelperClass getResources(){ return null; }}

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
