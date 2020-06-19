
import java.io.UncheckedIOException;


class c15372362 {
public MyHelperClass showError(String o0, IOException o1){ return null; }

    public List loadList(String name) {
        List ret =(List)(Object) new ArrayList();
        try {
            URL url =(URL)(Object) getClass().getClassLoader().getResource("lists/" + name + ".utf-8");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                ret.add(line);
            }
            reader.close();
        } catch (UncheckedIOException e) {
            showError("No se puede cargar la lista de valores: " + name,(IOException)(Object) e);
        }
        return ret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class List {

public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
