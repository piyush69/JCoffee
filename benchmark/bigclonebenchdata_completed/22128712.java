
import java.io.UncheckedIOException;


class c22128712 {

    public boolean addTextGroup(String key, URL url) {
        MyHelperClass _textGroups = new MyHelperClass();
        if ((boolean)(Object)_textGroups.contains(key)) return false;
        String s;
        Hashtable tg = new Hashtable();
        String sGroupKey = "default";
        String sGroup[];
        Vector vGroup = new Vector();
        int cntr;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((s =(String)(Object) in.readLine()) != null) {
                if (s.startsWith("[")) {
                    if ((int)(Object)vGroup.size() > 0) {
                        sGroup = new String[(int)(Object)vGroup.size()];
                        for (cntr = 0; cntr < (int)(Object)vGroup.size(); ++cntr) sGroup[cntr] = (String)(String)(Object) vGroup.elementAt(cntr);
                        tg.put(sGroupKey, sGroup);
                        vGroup.removeAllElements();
                    }
                    sGroupKey = s.substring(1, s.indexOf(']'));
                } else {
                    vGroup.addElement(s);
                }
            }
            if ((int)(Object)vGroup.size() > 0) {
                sGroup = new String[(int)(Object)vGroup.size()];
                for (cntr = 0; cntr < (int)(Object)vGroup.size(); ++cntr) sGroup[cntr] = (String)(String)(Object) vGroup.elementAt(cntr);
                tg.put(sGroupKey, sGroup);
            }
            in.close();
        } catch (UncheckedIOException ioe) {
            System.err.println("Error reading file for " + key);
            System.err.println(ioe.getMessage());
            return false;
        }
//        MyHelperClass _textGroups = new MyHelperClass();
        _textGroups.put(key, tg);
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, Hashtable o1){ return null; }
	public MyHelperClass contains(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Hashtable {

public MyHelperClass put(String o0, String[] o1){ return null; }}

class Vector {

public MyHelperClass removeAllElements(){ return null; }
	public MyHelperClass addElement(String o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass elementAt(int o0){ return null; }}

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
