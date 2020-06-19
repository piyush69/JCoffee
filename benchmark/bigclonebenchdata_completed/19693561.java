import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19693561 {

    public Model read(String uri, String base, String lang)  throws Throwable {
        try {
            URL url = new URL(uri);
            return read((String)(Object)url.openStream(), base, lang);
        } catch (IOException e) {
            throw new OntologyException("I/O error while reading from uri " + uri);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Model {

}

class OntologyException extends Exception{
	public OntologyException(String errorMessage) { super(errorMessage); }
}
