import java.io.*;
import java.lang.*;
import java.util.*;



class c20081426 {
public static MyHelperClass NULL;
//public MyHelperClass NULL;
public static MyHelperClass getUnmarshaller(){ return null; }
//public MyHelperClass getUnmarshaller(){ return null; }

    private static GSP loadGSP(URL url) {
        try {
            InputStream input =(InputStream)(Object) url.openStream();
            int c;
            while ((c = input.read()) != -1) {
                int result =(int)(Object) NULL; //new int();
                result =(char)(Object) result + (char) c;
            }
            Unmarshaller unmarshaller =(Unmarshaller)(Object) getUnmarshaller();
            unmarshaller.setValidation(false);
            GSP gsp = (GSP)(GSP)(Object) unmarshaller.unmarshal(new InputSource());
            return gsp;
        } catch (Exception e) {
            System.out.println("loadGSP " + e);
            e.printStackTrace();
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class GSP {

}

class Unmarshaller {

public MyHelperClass unmarshal(InputSource o0){ return null; }
	public MyHelperClass setValidation(boolean o0){ return null; }}

class InputSource {

}
