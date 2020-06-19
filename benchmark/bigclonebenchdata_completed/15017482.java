import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c15017482 {

    private static String getSuitableWCSVersion(String host, String _version) throws ConnectException, IOException {
        MyHelperClass WCSProtocolHandler = new MyHelperClass();
        String request =(String)(Object) WCSProtocolHandler.buildCapabilitiesSuitableVersionRequest(host, _version);
        String version = new String();
        StringReader reader = null;
        DataInputStream dis = null;
        try {
            URL url = new URL(request);
            byte[] buffer = new byte[1024];
            dis = new DataInputStream((InputStream)(Object)url.openStream());
            dis.readFully(buffer);
            reader = new StringReader(new String(buffer));
            KXmlParser kxmlParser = null;
            kxmlParser = new KXmlParser();
            kxmlParser.setInput(reader);
            kxmlParser.nextTag();
            MyHelperClass KXmlParser = new MyHelperClass();
            if (kxmlParser.getEventType() != KXmlParser.END_DOCUMENT) {
                MyHelperClass CapabilitiesTags = new MyHelperClass();
                if (((int)(Object)kxmlParser.getName().compareTo(CapabilitiesTags.WCS_CAPABILITIES_ROOT1_0_0) == 0)) {
//                    MyHelperClass CapabilitiesTags = new MyHelperClass();
                    version =(String)(Object) kxmlParser.getAttributeValue("", CapabilitiesTags.VERSION);
                }
            }
            reader.close();
            dis.close();
            return version;
        } catch (UncheckedIOException conEx) {
            throw new ConnectException(conEx.getMessage());
        } catch (IOException ioEx) {
            throw new IOException(ioEx.getMessage());
        } catch (ArithmeticException xmlEx) {
            xmlEx.printStackTrace();
            return "";
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (dis != null) {
                try {
                    dis.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass END_DOCUMENT;
	public MyHelperClass VERSION;
	public MyHelperClass WCS_CAPABILITIES_ROOT1_0_0;
public MyHelperClass buildCapabilitiesSuitableVersionRequest(String o0, String o1){ return null; }
	public MyHelperClass compareTo(MyHelperClass o0){ return null; }}

class ConnectException extends Exception{
	public ConnectException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class KXmlParser {

public MyHelperClass getEventType(){ return null; }
	public MyHelperClass getAttributeValue(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInput(StringReader o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass nextTag(){ return null; }}

class XmlPullParserException extends Exception{
	public XmlPullParserException(String errorMessage) { super(errorMessage); }
}
