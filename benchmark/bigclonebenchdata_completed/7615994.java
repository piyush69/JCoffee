
import java.io.UncheckedIOException;


class c7615994 {
public MyHelperClass url;
	public MyHelperClass file;
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }

    public String[] list() {
        MyHelperClass isURL = new MyHelperClass();
        if ((boolean)(Object)isURL) {
            if (!(Boolean)(Object)isDirectory()) return null;
            try {
                URLConnection c =(URLConnection)(Object) url.openConnection();
                InputStream is =(InputStream)(Object) c.getInputStream();
                boolean foundEnd = false;
                Vector files = new Vector();
                while (!foundEnd) {
                    byte[] b = new byte[(int)(Object)is.available()];
                    String s = new String(b);
                    if (s.toLowerCase().indexOf("</html>") != -1) foundEnd = true;
                    while (s.indexOf("a href") != -1) {
                        int ndx = s.indexOf("a href") + 8;
                        String f = s.substring(ndx, s.indexOf("\"", ndx));
                        s = s.substring(s.indexOf("\"", ndx) + 1);
                        Location check = new Location(getAbsolutePath(), f);
                        if ((boolean)(Object)check.exists()) {
                            files.add(check.getName());
                        }
                    }
                }
                return (String[])(String[])(Object) files.toArray(new String[0]);
            } catch (UncheckedIOException e) {
                return null;
            }
        }
        return(String[])(Object) file.list();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass list(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass available(){ return null; }}

class Vector {

public MyHelperClass toArray(String[] o0){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class Location {

Location(){}
	Location(MyHelperClass o0, String o1){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
