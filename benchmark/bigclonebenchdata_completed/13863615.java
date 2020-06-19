import java.io.*;
import java.lang.*;
import java.util.*;



class c13863615 {

    protected String getLibJSCode() throws IOException {
        MyHelperClass cachedLibJSCode = new MyHelperClass();
        if (cachedLibJSCode == null) {
            MyHelperClass JS_LIB_FILE = new MyHelperClass();
            InputStream is = getClass().getResourceAsStream((String)(Object)JS_LIB_FILE);
            StringWriter output = new StringWriter();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, output);
//            MyHelperClass cachedLibJSCode = new MyHelperClass();
            cachedLibJSCode =(MyHelperClass)(Object) output.toString();
        }
//        MyHelperClass cachedLibJSCode = new MyHelperClass();
        return (String)(Object)cachedLibJSCode;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }}
