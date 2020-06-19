import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13883878 {
public MyHelperClass url;
	public MyHelperClass valid;
	public MyHelperClass file;
	public MyHelperClass Registry;
	public MyHelperClass path;

         void PathElement(String path) throws MaxError(Throwable)(Object) {
            this.path =(MyHelperClass)(Object) path;
            if (path.startsWith("http:")) {
                try {
                    url =(MyHelperClass)(Object) new URL(path);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    con.setRequestMethod("HEAD");
                    valid = ((MyHelperClass)(Object)con.getResponseCode() == HttpURLConnection.HTTP_OK);
                } catch (Exception e) {
                    valid =(MyHelperClass)(Object) false;
                }
            } else {
                if (path.startsWith("jmax:")) file =(MyHelperClass)(Object) new File(Registry.resolveJMaxURI(path)); else file = new File(path);
                valid = file.exists();
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass exists(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass resolveJMaxURI(String o0){ return null; }}

class MaxError {

}
