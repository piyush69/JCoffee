import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15510198 {
public static MyHelperClass openConnection(URL o0){ return null; }
//public MyHelperClass openConnection(URL o0){ return null; }

    protected static Parser buildParser(URL url) throws IOException, ParserException {
        Parser parser;
        URLConnection connection =(URLConnection)(Object) openConnection(url);
        if (!(connection instanceof HttpURLConnection) || ((HttpURLConnection) connection).getResponseCode() == 200) {
            parser = new Parser(connection);
        } else {
            parser = null;
        }
        return parser;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Parser {

Parser(URLConnection o0){}
	Parser(){}}

class ParserException extends Exception{
	public ParserException(String errorMessage) { super(errorMessage); }
}
