import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13602813 {
public MyHelperClass NULL;
public MyHelperClass FileUtils;

//    @Before
    public void setUp() throws Throwable, IOException {
        final URL url = getClass().getResource("maventest.properties.xml");
        File workdir =(File)(Object) NULL; //new File();
        workdir = new File(new File(url.getPath()).getParentFile(), "workdir");
        final Properties properties = new Properties();
        properties.load(url.openStream());
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            MyHelperClass jobParams = new MyHelperClass();
            jobParams.put(entry.getKey() + "", entry.getValue() + "");
        }
//        MyHelperClass workdir = new MyHelperClass();
        FileUtils.deleteDirectory(workdir);
//        MyHelperClass workdir = new MyHelperClass();
        workdir.mkdirs();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass deleteDirectory(File o0){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }}

class Before {

}
