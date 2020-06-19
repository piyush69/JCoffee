
import java.io.UncheckedIOException;


class c13651921 {

    public static void main(String[] arg) throws IOException {
        XmlPullParserFactory PULL_PARSER_FACTORY;
        try {
            MyHelperClass XmlPullParserFactory = new MyHelperClass();
            PULL_PARSER_FACTORY =(XmlPullParserFactory)(Object) XmlPullParserFactory.newInstance(System.getProperty((String)(Object)XmlPullParserFactory.PROPERTY_NAME), null);
            PULL_PARSER_FACTORY.setNamespaceAware(true);
            DasParser dp = new DasParser(PULL_PARSER_FACTORY);
            URL url = new URL("http://www.ebi.ac.uk/das-srv/uniprot/das/uniprot/features?segment=P05067");
            InputStream in =(InputStream)(Object) url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String aLine, xml = "";
            while ((aLine =(String)(Object) br.readLine()) != null) {
                xml += aLine;
            }
            WritebackDocument wbd =(WritebackDocument)(Object) dp.parse(xml);
            System.out.println("FIN" + wbd);
        } catch (UncheckedIOException xppe) {
            throw new IllegalStateException("Fatal Exception thrown at initialisation.  Cannot initialise the PullParserFactory required to allow generation of the DAS XML.", xppe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PROPERTY_NAME;
public MyHelperClass newInstance(String o0, Object o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class XmlPullParserFactory {

public MyHelperClass setNamespaceAware(boolean o0){ return null; }}

class DasParser {

DasParser(XmlPullParserFactory o0){}
	DasParser(){}
	public MyHelperClass parse(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class WritebackDocument {

}

class XmlPullParserException extends Exception{
	public XmlPullParserException(String errorMessage) { super(errorMessage); }
}
