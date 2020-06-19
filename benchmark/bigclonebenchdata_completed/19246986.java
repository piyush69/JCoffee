import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19246986 {

    private List<String> readDescriptor(URL url)  throws Throwable {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            List<String> lines = new ArrayList<String>();
            String line = reader.readLine();
            while (line != null) {
                line = line.trim();
                if (line.length() > 0 && !line.startsWith("#")) lines.add(line);
                line = reader.readLine();
            }
            return lines;
        } catch (IOException e) {
            throw new ExtensionException("Failed to read extension descriptor '%s'", e).withArgs(url);
        } finally {
            MyHelperClass IoUtil = new MyHelperClass();
            IoUtil.closeQuietly(reader);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(BufferedReader o0){ return null; }}

class ExtensionException extends Exception{
	public ExtensionException(String errorMessage) { super(errorMessage); }
	ExtensionException(String o0, IOException o1){}
	ExtensionException(){}
}
