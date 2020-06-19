import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18778697 {
public MyHelperClass resources;
	public MyHelperClass locale;
	public MyHelperClass getResourceList(){ return null; }
	public MyHelperClass initResouce(){ return null; }

//    @Override
    public void configure()  throws Throwable {
        initResouce();
        if (this.locale == null) {
            this.locale =(MyHelperClass)(Object) Locale.getDefault();
        }
        InputStream[] ins = new InputStream[(int)(Object)getResourceList().size()];
        try {
            int i = 0;
            for (URL url :(URL[])(Object) (Object[])(Object)getResourceList()) {
                ins[i++] = url.openStream();
            }
            this.resources =(MyHelperClass)(Object) new ValidatorResources(ins);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ValidatorResources {

ValidatorResources(){}
	ValidatorResources(InputStream[] o0){}}
