
import java.io.UncheckedIOException;


class c131318 {
public MyHelperClass siteFile;
	public MyHelperClass getDocumentBase(){ return null; }

    public Vector _getSiteNames() {
        Vector _mySites = new Vector();
        boolean gotSites = false;
        while (!gotSites) {
            try {
                URL dataurl = new URL(getDocumentBase(), siteFile);
                BufferedReader readme = new BufferedReader(new InputStreamReader(new GZIPInputStream(dataurl.openStream())));
                while (true) {
                    String S =(String)(Object) readme.readLine();
                    if (S == null) break;
                    StringTokenizer st = new StringTokenizer(S);
                    _mySites.addElement(st.nextToken());
                }
                gotSites = true;
            } catch (UncheckedIOException e) {
                _mySites.removeAllElements();
                gotSites = false;
            }
        }
        return (_mySites);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Vector {

public MyHelperClass removeAllElements(){ return null; }
	public MyHelperClass addElement(MyHelperClass o0){ return null; }}

class URL {

URL(MyHelperClass o0, MyHelperClass o1){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(GZIPInputStream o0){}}

class GZIPInputStream {

GZIPInputStream(MyHelperClass o0){}
	GZIPInputStream(){}}

class StringTokenizer {

StringTokenizer(String o0){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
