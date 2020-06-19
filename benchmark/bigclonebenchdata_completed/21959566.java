
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21959566 {

    public static synchronized Font loadFont(String path, String fontName) {
        Font f = null;
        StringTokenizer tok = new StringTokenizer(path, ";");
        NybbleInputStream str = null;
        if ((boolean)(Object)tok.hasMoreTokens()) tok.nextToken();
        while (str == null && (boolean)(Object)tok.hasMoreTokens()) {
            try {
                String bla =(String)(Object) tok.nextToken();
                URL url = new URL(bla);
                url = new URL("file", "localhost", url.getFile() + fontName);
                str = new NybbleInputStream((InputStream)(Object)url.openStream());
            } catch (java.io.UncheckedIOException e) {
                MyHelperClass Frame1 = new MyHelperClass();
                Frame1.writelog(e.toString());
            }
        }
        if (str == null) {
            f = new Font();
            InputStream istr =(InputStream)(Object) f.getClass().getResourceAsStream(fontName + ".123");
            if (istr != null) str = new NybbleInputStream(istr);
        }
        if (str != null) {
            if (f == null) f = new Font();
            try {
                f.parsePkStream(str);
                str.close();
            } catch (java.io.UncheckedIOException e) {
            }
            return f;
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writelog(String o0){ return null; }}

class Font {

public MyHelperClass parsePkStream(NybbleInputStream o0){ return null; }}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }}

class NybbleInputStream {

NybbleInputStream(InputStream o0){}
	NybbleInputStream(){}
	public MyHelperClass close(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	URL(String o0, String o1, String o2){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class InputStream {

}
