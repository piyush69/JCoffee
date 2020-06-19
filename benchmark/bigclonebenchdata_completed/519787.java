import java.io.*;
import java.lang.*;
import java.util.*;



class c519787 {

    public InputStream unZip(URL url) throws Exception {
        ZipInputStream zipped = new ZipInputStream(url.openStream());
        System.out.println("unzipping: " + url.getFile());
        ZipEntry zip =(ZipEntry)(Object) zipped.getNextEntry();
        byte[] b = new byte[4096];
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        for (int iRead =(int)(Object) zipped.read(b); iRead != -1; iRead =(int)(Object) zipped.read(b)) {
            bOut.write(b, 0, iRead);
        }
        zipped.close();
        ByteArrayInputStream bIn = new ByteArrayInputStream(bOut.toByteArray());
        return (InputStream) bIn;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass getFile(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class ZipInputStream {

ZipInputStream(MyHelperClass o0){}
	ZipInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

}
