import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19652200 {
public MyHelperClass IOUtils;
	public MyHelperClass NULL;
public MyHelperClass FileUtils;
	public MyHelperClass LOCATION;

//    @Before
    public void init() throws Throwable, IOException {
        File file =(File)(Object) NULL; //new File();
        file = new File((String)(Object)LOCATION);
        URL url =(URL)(Object) NULL; //new URL();
        url = file.toURI().toURL();
        InputStream stream =(InputStream)(Object) NULL; //new InputStream();
        stream = url.openStream();
        MyHelperClass byteArray = new MyHelperClass();
        byteArray = IOUtils.toByteArray(new FileInputStream((String)(Object)file));
        MyHelperClass content = new MyHelperClass();
        content = FileUtils.readFileToString(file);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toByteArray(FileInputStream o0){ return null; }
	public MyHelperClass readFileToString(File o0){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass toURI(){ return null; }}

class Before {

}
