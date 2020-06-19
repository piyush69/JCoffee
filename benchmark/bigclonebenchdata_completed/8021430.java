import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c8021430 {
public MyHelperClass baseUrl;
	public MyHelperClass load(BufferedInputStream o0, URL o1){ return null; }

//    @Override
    public Scene load(URL url) throws FileNotFoundException, IncorrectFormatException, ParsingErrorException {
        URL baseUrl =(URL)(Object) this.baseUrl;
        if (this.baseUrl == null) {
            baseUrl = url;
        }
        InputStream in;
        try {
            in = url.openStream();
        } catch (IOException ex) {
            throw new FileNotFoundException("Can't read " + url);
        }
        return(Scene)(Object) load(new BufferedInputStream(in), baseUrl);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Scene {

}

class IncorrectFormatException extends Exception{
	public IncorrectFormatException(String errorMessage) { super(errorMessage); }
}

class ParsingErrorException extends Exception{
	public ParsingErrorException(String errorMessage) { super(errorMessage); }
}
