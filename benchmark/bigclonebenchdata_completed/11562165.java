import java.io.*;
import java.lang.*;
import java.util.*;



class c11562165 {
public MyHelperClass assertTrue(boolean o0){ return null; }

    private void streamContains(String in, InputStream stream) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(stream, baos);
        byte[] bytes = baos.toByteArray();
        String cmp = new String(bytes, "UTF-8");
        assertTrue(cmp.contains(in));
        baos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}
