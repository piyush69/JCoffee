
import java.io.UncheckedIOException;


class c12138255 {
public static MyHelperClass messages;
	public static MyHelperClass Logger;
	public static MyHelperClass format(String o0){ return null; }
public MyHelperClass states;
//	public MyHelperClass Logger;
//	public MyHelperClass messages;
//	public MyHelperClass format(String o0){ return null; }

    public static void loadPoFile(URL url) {
        MyHelperClass states = new MyHelperClass();
        states state =(states)(Object) states.IDLE;
        String msgCtxt = "";
        String msgId = "";
        String msgStr = "";
        try {
            if (url == null) return;
            InputStream in =(InputStream)(Object) url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF8"));
            String strLine;
            while ((strLine =(String)(Object) br.readLine()) != null) {
                if (strLine.startsWith("msgctxt")) {
//                    MyHelperClass states = new MyHelperClass();
                    if (state != (states)(Object)states.MSGCTXT) msgCtxt = "";
//                    MyHelperClass states = new MyHelperClass();
                    state =(states)(Object) states.MSGCTXT;
                    strLine = strLine.substring(7).trim();
                }
                if (strLine.startsWith("msgid")) {
//                    MyHelperClass states = new MyHelperClass();
                    if (state != (states)(Object)states.MSGID) msgId = "";
//                    MyHelperClass states = new MyHelperClass();
                    state =(states)(Object) states.MSGID;
                    strLine = strLine.substring(5).trim();
                }
                if (strLine.startsWith("msgstr")) {
//                    MyHelperClass states = new MyHelperClass();
                    if (state != (states)(Object)states.MSGSTR) msgStr = "";
//                    MyHelperClass states = new MyHelperClass();
                    state =(states)(Object) states.MSGSTR;
                    strLine = strLine.substring(6).trim();
                }
                if (!strLine.startsWith("\"")) {
//                    MyHelperClass states = new MyHelperClass();
                    state =(states)(Object) states.IDLE;
                    msgCtxt = "";
                    msgId = "";
                    msgStr = "";
                } else {
//                    MyHelperClass states = new MyHelperClass();
                    if (state == (states)(Object)states.MSGCTXT) {
                        msgCtxt += format(strLine);
                    }
                    if (state == (states)(Object)states.MSGID) {
                        if (msgId.isEmpty()) {
                            if (!msgCtxt.isEmpty()) {
                                msgId = msgCtxt + "|";
                                msgCtxt = "";
                            }
                        }
                        msgId += format(strLine);
                    }
                    if (state == (states)(Object)states.MSGSTR) {
                        msgCtxt = "";
                        msgStr += format(strLine);
                        if (!msgId.isEmpty()) messages.setProperty(msgId, msgStr);
                    }
                }
            }
            in.close();
        } catch (UncheckedIOException e) {
            Logger.logError((IOException)(Object)e, "Error loading message.po.");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MSGSTR;
	public MyHelperClass IDLE;
	public MyHelperClass MSGID;
	public MyHelperClass MSGCTXT;
public MyHelperClass logError(IOException o0, String o1){ return null; }
	public MyHelperClass setProperty(String o0, String o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class states {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
