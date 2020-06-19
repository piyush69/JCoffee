import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17999474 {
public static MyHelperClass randomizeFileName(MyHelperClass o0){ return null; }
public static MyHelperClass getFileNameFromDigObject(DigitalObject o0, Object o1){ return null; }
//	public MyHelperClass randomizeFileName(MyHelperClass o0){ return null; }
	public static MyHelperClass getFolderNameFromDigObject(DigitalObject o0){ return null; }
//public MyHelperClass getFolderNameFromDigObject(DigitalObject o0){ return null; }
//	public MyHelperClass getFileNameFromDigObject(DigitalObject o0, Object o1){ return null; }

    private static File getZipAsFile(DigitalObject digOb)  throws Throwable {
        String folderName =(String)(Object) randomizeFileName(getFolderNameFromDigObject(digOb));
        MyHelperClass utils_tmp = new MyHelperClass();
        File tmpFolder = new File((String)(Object)utils_tmp, folderName);
        File zip = null;
        try {
            MyHelperClass FileUtils = new MyHelperClass();
            FileUtils.forceMkdir(tmpFolder);
            zip = new File((String)(Object)tmpFolder,(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) getFileNameFromDigObject(digOb, null));
            FileOutputStream out = new FileOutputStream(zip);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(digOb.getContent().getInputStream(), out);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return zip;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass forceMkdir(File o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DigitalObject {

public MyHelperClass getContent(){ return null; }}
