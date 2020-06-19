import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5561642 {
public MyHelperClass catalog;
	public MyHelperClass Debug;
	public MyHelperClass SessionHandler;
	public MyHelperClass Util;
	public MyHelperClass TEMP;

    protected BufferedReader getDataReader()  throws Throwable {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            String line;
            URL url = new URL((String)(Object)this.catalog.getCatalogURL());
            Debug.output("Catalog URL:" + url.toString());
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            File dir = (File)(File)(Object) SessionHandler.getServletContext().getAttribute("javax.servlet.context.tempdir");
            File temp = new File((String)(Object)dir,(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) TEMP);
            Debug.output("Temp file:" + temp.toString());
            out = new PrintWriter(new BufferedWriter(new FileWriter(temp)));
            while ((line = in.readLine()) != null) {
                out.println(line);
            }
            Debug.output("Temp file size:" + temp.length());
            return new BufferedReader(new FileReader(temp));
        } catch (IOException e) {
            throw new SeismoException((String)(Object)e);
        } finally {
            Util.close(in);
            Util.close(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(PrintWriter o0){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass getCatalogURL(){ return null; }
	public MyHelperClass output(String o0){ return null; }
	public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass close(BufferedReader o0){ return null; }}

class SeismoException extends Exception{
	public SeismoException(String errorMessage) { super(errorMessage); }
}
