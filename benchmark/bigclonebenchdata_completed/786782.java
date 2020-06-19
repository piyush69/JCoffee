
import java.io.UncheckedIOException;


class c786782 {
public MyHelperClass[] _myPlotTypes;
//public MyHelperClass _myPlotTypes;
	public MyHelperClass plotTypeFile;
	public MyHelperClass getDocumentBase(){ return null; }

    public void _getPlotTypes() {
        boolean gotPlots = false;
        while (!gotPlots) {
            try {
                Vector[] _myPlotTypes;// = new Vector[]();
                _myPlotTypes = new Vector[2];
//                MyHelperClass _myPlotTypes = new MyHelperClass();
                _myPlotTypes[0] = new Vector();
//                MyHelperClass _myPlotTypes = new MyHelperClass();
                _myPlotTypes[1] = new Vector();
                URL dataurl = new URL(getDocumentBase(), plotTypeFile);
                BufferedReader readme = new BufferedReader(new InputStreamReader(new GZIPInputStream(dataurl.openStream())));
                while (true) {
                    String S =(String)(Object) readme.readLine();
                    if (S == null) break;
                    StringTokenizer st = new StringTokenizer(S);
                    _myPlotTypes[0].addElement(st.nextToken());
                    if ((boolean)(Object)st.hasMoreTokens()) {
                        _myPlotTypes[1].addElement(st.nextToken());
                    } else {
                        _myPlotTypes[1].addElement((String)(String)(Object) _myPlotTypes[0].lastElement());
                    }
                }
                gotPlots = true;
            } catch (UncheckedIOException e) {
                _myPlotTypes[0].removeAllElements();
                _myPlotTypes[1].removeAllElements();
                gotPlots = false;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass removeAllElements(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(GZIPInputStream o0){}}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(MyHelperClass o0){}}

class StringTokenizer {

StringTokenizer(String o0){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Vector {

public MyHelperClass addElement(String o0){ return null; }
	public MyHelperClass addElement(MyHelperClass o0){ return null; }
	public MyHelperClass lastElement(){ return null; }}
