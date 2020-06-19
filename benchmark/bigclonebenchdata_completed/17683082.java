import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17683082 {
public MyHelperClass Names;
public MyHelperClass url;
	public MyHelperClass connection;
	public MyHelperClass ns;

     c17683082(Path path) throws IOException {
        super(path);
        this.url =(MyHelperClass)(Object) new URL((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)path.toURLString());
        HttpURLConnection.setFollowRedirects(true);
        this.connection =(MyHelperClass)(Object) (HttpURLConnection)(HttpURLConnection)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) url.openConnection();
        this.ns = Names.getNamespace(path);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getNamespace(Path o0){ return null; }}

class Path {

public MyHelperClass toURLString(){ return null; }}

class Object {

Object(Path o0){}
	Object(){}}
