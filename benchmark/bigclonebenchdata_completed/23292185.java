
import java.io.UncheckedIOException;


class c23292185 {

    private List readCredits() {
        MyHelperClass SpriteStore = new MyHelperClass();
        URL url =(URL)(Object) SpriteStore.get().getResourceURL("games/midhedava/client/gui/credits.txt");
        List res =(List)(Object) new LinkedList();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line =(String)(Object) br.readLine();
            while (line != null) {
                res.add(line);
                line =(String)(Object) br.readLine();
            }
            br.close();
        } catch (UncheckedIOException e) {
            res.add(0, "credits.txt not found");
        }
        return res;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResourceURL(String o0){ return null; }
	public MyHelperClass get(){ return null; }}

class List {

public MyHelperClass add(int o0, String o1){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class LinkedList {

}

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
