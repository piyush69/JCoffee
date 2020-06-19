import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10093209 {
public MyHelperClass urlString;

//    @Override
    public InitResult init(String name)  throws Throwable {
        this.urlString =(MyHelperClass)(Object) name;
        URL url;
        URLConnection con;
        try {
            url = new URL((String)(Object)urlString);
            con = url.openConnection();
            int size = con.getContentLength();
            char[] characters = new char[size];
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            in.read(characters);
            in.close();
            return new InitResult(0, size, characters);
        } catch (Exception e) {
            throw new ParserException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InitResult {

InitResult(int o0, int o1, char[] o2){}
	InitResult(){}}

class ParserException extends Exception{
	public ParserException(String errorMessage) { super(errorMessage); }
}
