import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3167055 {
public MyHelperClass IOUtils;
	public MyHelperClass NULL;

//    @Before
    public void setUp() throws Throwable, IOException {
        File testSbk =(File)(Object) NULL; //new File();
        testSbk = File.createTempFile("songbook", "sbk");
//        MyHelperClass testSbk = new MyHelperClass();
        IOUtils.copy(Thread.currentThread().getContextClassLoader().getResourceAsStream("test.sbk"), new FileOutputStream((String)(Object)testSbk));
        File test1Sbk =(File)(Object) NULL; //new File();
        test1Sbk = File.createTempFile("songbook", "sbk");
//        MyHelperClass test1Sbk = new MyHelperClass();
        IOUtils.copy(Thread.currentThread().getContextClassLoader().getResourceAsStream("test1.sbk"), new FileOutputStream((String)(Object)test1Sbk));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class Before {

}
