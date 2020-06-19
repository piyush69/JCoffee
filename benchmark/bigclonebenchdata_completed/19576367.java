
import java.io.UncheckedIOException;


class c19576367 {
public MyHelperClass Logger;

    public String getContent(URL url) {
        MyHelperClass Level = new MyHelperClass();
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, "getting content from " + url.toString());
        String content = "";
        try {
            URLConnection httpc;
            httpc =(URLConnection)(Object) url.openConnection();
            httpc.setDoInput(true);
            httpc.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(httpc.getInputStream()));
            String line = "";
            while ((line =(String)(Object) in.readLine()) != null) {
                content = content + line;
            }
            in.close();
        } catch (UncheckedIOException e) {
//            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "Problem writing to " + url,(IOException)(Object) e);
        }
        return content;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
	public MyHelperClass INFO;
public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

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
