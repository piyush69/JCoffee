
import java.io.UncheckedIOException;


class c12687609 {
public MyHelperClass getLog(){ return null; }

    public boolean isWebServerAvaliable(String url) {
        long inicial =(long)(Object) (new Date().getTime());
        HttpURLConnection connection = null;
        try {
            URL urlBase = urlBase = new URL(url);
            getLog().info("Verificando se WebServer esta no ar: " + urlBase.toString());
            connection = (HttpURLConnection)(HttpURLConnection)(Object) urlBase.openConnection();
            connection.connect();
        } catch (Exception e) {
            return false;
        } finally {
            try {
                getLog().info("Resposta do WebServer: " + connection.getResponseCode());
            } catch (UncheckedIOException e) {
                e.printStackTrace();
                return false;
            }
            long tfinal =(long)(Object) (new Date().getTime());
            getLog().info("Tempo esperado: " + ((tfinal - inicial) / 1000) + " segundos!");
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

class Date {

public MyHelperClass getTime(){ return null; }}

class HttpURLConnection {

public MyHelperClass connect(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
