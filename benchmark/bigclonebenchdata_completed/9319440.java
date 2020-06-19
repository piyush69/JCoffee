
import java.io.UncheckedIOException;


class c9319440 {

    public static String load(String id) {
        String xml = "";
        if (id.length() < 5) return "";
        try {
            boolean working;// = new boolean();
            working = true;
            URL url = new URL("http://pastebin.com/download.php?i=" + id);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            xml = "";
            String str;
            while ((str =(String)(Object) reader.readLine()) != null) {
                xml += str;
            }
            reader.close();
//            MyHelperClass working = new MyHelperClass();
            working = false;
            return xml.toString();
        } catch (UncheckedIOException ex) {
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(null, " Load error");
        }
        boolean working;// = new boolean();
        working = false;
        return xml;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass showMessageDialog(Object o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class URLConnection {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
