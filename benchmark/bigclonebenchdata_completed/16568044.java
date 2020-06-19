import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16568044 {
public MyHelperClass content;

    public void setContentAsStream(final InputStream input) throws Throwable, IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(input, output);
        } finally {
            output.close();
        }
        this.content =(MyHelperClass)(Object) output.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}
