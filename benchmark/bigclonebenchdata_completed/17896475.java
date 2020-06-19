import java.io.*;
import java.lang.*;
import java.util.*;



class c17896475 {
public MyHelperClass NULL;
	public MyHelperClass check(MyHelperClass o0, long o1, MyHelperClass o2){ return null; }
public MyHelperClass containerAddress;
	public MyHelperClass STARTCONTROL;
	public MyHelperClass mLog;

    public String installCode(String serviceName, String location) throws DeploymentException {
        FileOutputStream out = null;
        MyHelperClass overwriteWarFile = new MyHelperClass();
        mLog.debug("overwriteWarFile = " + overwriteWarFile);
        String fileData = null;
        String filepath = location;
        String[] splitString = filepath.split("/");
        String filename = splitString[splitString.length - 1];
        int fileNameLength = filename.length();
        String warname =(String)(Object) NULL; //new String();
        warname = filename.substring(0, fileNameLength - 4);
//        MyHelperClass warname = new MyHelperClass();
        mLog.debug("WAR file name = " + warname);
        MyHelperClass warDesination = new MyHelperClass();
        String filepath2 = warDesination + File.separator + filename;
        String ret =(String)(Object) NULL; //new String();
        ret = "http://" + containerAddress + "/" + warname + "/services/" + serviceName;
        MyHelperClass mLog = new MyHelperClass();
        mLog.debug("filepath2 = " + filepath2);
//        MyHelperClass ret = new MyHelperClass();
        mLog.debug("ret = " + ret);
//        MyHelperClass mLog = new MyHelperClass();
        mLog.debug("filepath = " + filepath);
        boolean warExists = new File(filepath2).exists();
        boolean webAppExists = true;
        try {
            String webAppName = filepath2.substring(0, (filepath2.length() - 4));
//            MyHelperClass mLog = new MyHelperClass();
            mLog.debug("Web Application Name = " + webAppName);
            webAppExists = new File(webAppName).isDirectory();
            if (!webAppExists) {
                URL url = new URL(filepath);
                File targetFile = new File(filepath2);
                if (!targetFile.exists()) {
                    targetFile.createNewFile();
                }
                InputStream in = null;
                try {
                    in =(InputStream)(Object) url.openStream();
                    out = new FileOutputStream(targetFile);
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new DeploymentException("couldn't open stream due to: " + e.getMessage());
                }
                URLConnection con =(URLConnection)(Object) url.openConnection();
                int fileLength =(int)(Object) con.getContentLength();
                MyHelperClass Channels = new MyHelperClass();
                ReadableByteChannel channelIn =(ReadableByteChannel)(Object) Channels.newChannel(in);
                FileChannel channelOut =(FileChannel)(Object) out.getChannel();
                channelOut.transferFrom(channelIn, 0, fileLength);
                channelIn.close();
                channelOut.close();
                out.flush();
                out.close();
                in.close();
                long time = System.currentTimeMillis();
//                MyHelperClass ret = new MyHelperClass();
                check((MyHelperClass)(Object)ret, time, STARTCONTROL);
            }
        } catch (Exception e) {
            webAppExists = false;
        }
//        MyHelperClass mLog = new MyHelperClass();
        mLog.debug("webAppExists = " + webAppExists);
//        MyHelperClass ret = new MyHelperClass();
        return ((String)(Object)ret);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newChannel(InputStream o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class DeploymentException extends Exception{
	public DeploymentException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }}

class ReadableByteChannel {

public MyHelperClass close(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferFrom(ReadableByteChannel o0, int o1, int o2){ return null; }}
