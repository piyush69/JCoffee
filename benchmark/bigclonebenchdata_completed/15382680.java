import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15382680 {

    public static String obterConteudoSite(String u)  throws Throwable {
        URL url;
        try {
            url = new URL(u);
            URLConnection conn = null;
            MyHelperClass proxy = new MyHelperClass();
            if (proxy != null) conn = url.openConnection((Proxy)(Object)proxy.getProxy()); else conn = url.openConnection();
            conn.setDoOutput(true);
            MyHelperClass Charset = new MyHelperClass();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(),(String)(Object) Charset.forName("UTF-8")));
            String line;
            StringBuilder resultado = new StringBuilder();
            while ((line = rd.readLine()) != null) {
                resultado.append(line);
                resultado.append("\n");
            }
            rd.close();
            return resultado.toString();
        } catch (MalformedURLException e) {
            throw new AlfredException("Não foi possível obter contato com o site " + u, e);
        } catch (IOException e) {
            throw new AlfredException("Não foi possível obter contato com o site " + u, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass forName(String o0){ return null; }
	public MyHelperClass getProxy(){ return null; }}

class AlfredException extends Exception{
	public AlfredException(String errorMessage) { super(errorMessage); }
	AlfredException(String o0, IOException o1){}
	AlfredException(){}
	AlfredException(String o0, MalformedURLException o1){}
}
