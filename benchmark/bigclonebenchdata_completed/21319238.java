import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21319238 {
public MyHelperClass IOUtils;
	public MyHelperClass file;

     void FileCacheInputStreamFountain(FileCacheInputStreamFountainFactory factory, InputStream in) throws IOException {
        file = factory.createFile();
        OutputStream out = new FileOutputStream((String)(Object)file);
        IOUtils.copy(in, out);
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class FileCacheInputStreamFountainFactory {

public MyHelperClass createFile(){ return null; }}
