import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4599372 {
public MyHelperClass IOUtils;
	public MyHelperClass createLimitedInputStream(int o0){ return null; }
	public MyHelperClass createRuntimeException(IOException o0){ return null; }

//    @Override
    public String readFixString(final int len)  throws Throwable {
        if (len < 1) {
            MyHelperClass StringUtils = new MyHelperClass();
            return(String)(Object) StringUtils.EMPTY;
        }
        final StringWriter sw = new StringWriter();
        try {
            IOUtils.copy(createLimitedInputStream(len), sw, null);
        } catch (UncheckedIOException e) {
            throw(Throwable)(Object) createRuntimeException((IOException)(Object)e);
        }
        return sw.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EMPTY;
public MyHelperClass copy(MyHelperClass o0, StringWriter o1, Object o2){ return null; }}
