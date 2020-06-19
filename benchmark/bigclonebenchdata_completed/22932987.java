
import java.io.UncheckedIOException;


class c22932987 {

    protected String readContent(URL url, int width) {
        StringBuffer content = new StringBuffer("");
        String line = "";
        try {
            BufferedReader f = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((line =(String)(Object) f.readLine()) != null) content.append(line + "\n");
            f.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        if (width >= 0) {
            String width_old = "width=\"xxx\"";
            String width_new = "width=\"" + width + "\"";
            int v0 = content.indexOf(width_old);
            int v1 = v0 + width_old.length();
            content.replace(v0, v1, width_new);
        }
        return content.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

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
