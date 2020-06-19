import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13669409 {
public MyHelperClass log(String o0){ return null; }

    protected void runTest(URL pBaseURL, String pName, String pHref) throws Throwable, Exception {
        URL url = new URL(pBaseURL, pHref);
        XSParser parser = new XSParser();
        parser.setValidating(false);
        InputSource isource = new InputSource(url.openStream());
        isource.setSystemId(url.toString());
        String result;
        try {
            parser.parse(isource);
            MyHelperClass numOk = new MyHelperClass();
            ++numOk;
            result = "Ok";
        } catch (Exception e) {
            MyHelperClass numFailed = new MyHelperClass();
            ++numFailed;
            result = e.getMessage();
        }
        log("Running test " + pName + " with URL " + url + ": " + result);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int numFailed;
	public int numOk;
}

class XSParser {

public MyHelperClass parse(InputSource o0){ return null; }
	public MyHelperClass setValidating(boolean o0){ return null; }}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}
	public MyHelperClass setSystemId(String o0){ return null; }}
