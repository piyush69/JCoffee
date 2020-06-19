import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10095821 {
public MyHelperClass fsManager;

//    @Test(dependsOnMethods = { "getSize" })
    public void download() throws Throwable, IOException {
        MyHelperClass bucketName = new MyHelperClass();
        FileObject typica =(FileObject)(Object) fsManager.resolveFile("s3://" + bucketName + "/jonny.zip");
        File localCache = File.createTempFile("vfs.", ".s3-test");
        FileOutputStream out = new FileOutputStream(localCache);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(typica.getContent().getInputStream(), out);
        MyHelperClass Assert = new MyHelperClass();
        Assert.assertEquals(localCache.length(), typica.getContent().getSize());
        localCache.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass assertEquals(long o0, MyHelperClass o1){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass resolveFile(String o0){ return null; }}

class Test {

}

class FileObject {

public MyHelperClass getContent(){ return null; }}
