
import java.io.UncheckedIOException;


class c17435276 {
public MyHelperClass IOUtils;
	public MyHelperClass getRecurso(String o0){ return null; }

    public void show(HttpServletRequest request, HttpServletResponse response, String pantalla, Atributos modelos) {
        URL url =(URL)(Object) getRecurso(pantalla);
        try {
            IOUtils.copy(url.openStream(), response.getOutputStream());
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }}

class Atributos {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
