import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13031564 {
public MyHelperClass startActivity(Intent o0){ return null; }
public MyHelperClass Log;
	public MyHelperClass showImage(){ return null; }

        public void viewFile(int file_nx)  throws Throwable {
            FTPClient ftp = new FTPClient();
            boolean error = false;
            try {
                int reply;
                ftp.connect("tgftp.nws.noaa.gov");
                ftp.login("anonymous", "");
                MyHelperClass Log = new MyHelperClass();
                Log.d("WXDroid", "Connected to tgftp.nws.noaa.gov.");
//                MyHelperClass Log = new MyHelperClass();
                Log.d("WXDroid",(String)(Object) ftp.getReplyString());
                reply =(int)(Object) ftp.getReplyCode();
                MyHelperClass FTPReply = new MyHelperClass();
                if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                    ftp.disconnect();
                    System.err.println("FTP server refused connection.");
                    System.exit(1);
                }
                ftp.changeWorkingDirectory("fax");
//                MyHelperClass Log = new MyHelperClass();
                Log.d("WXDroid", "working directory: " + ftp.printWorkingDirectory());
                MyHelperClass FTPClient = new MyHelperClass();
                ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
                InputStream img_file =(InputStream)(Object) ftp.retrieveFileStream("PYAA10.gif");
                Intent intent = new Intent();
                intent.setClass(WXdroid.this, showProgressFTP.class);
                startActivity(intent);
                MyHelperClass Environment = new MyHelperClass();
                String storage_state =(String)(Object) Environment.getExternalStorageState();
                if (storage_state.contains("mounted")) {
//                    MyHelperClass Environment = new MyHelperClass();
                    String filepath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/NOAAWX/";
                    File imageDirectory = new File(filepath);
                    File local_file = new File(filepath + "PYAA10.gif");
                    OutputStream out = new FileOutputStream(local_file);
                    byte[] buffer = new byte[1024];
                    int count;
                    while ((count = img_file.read(buffer)) != -1) {
                        if (Thread.interrupted() == true) {
                            String functionName = Thread.currentThread().getStackTrace()[2].getMethodName() + "()";
                            throw new InterruptedException("The function " + functionName + " was interrupted.");
                        }
                        out.write(buffer, 0, count);
                    }
                    showImage();
                    out.flush();
                    out.close();
                    img_file.close();
                    Log.d("WXDroid", "file saved: " + filepath + " " + local_file);
                } else {
                    Log.d("WXDroid", "The SD card is not mounted");
                }
                ftp.logout();
                ftp.disconnect();
            } catch (IOException e) {
                error = true;
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if ((boolean)(Object)ftp.isConnected()) {
                    try {
                        ftp.disconnect();
                    } catch (IOException ioe) {
                    }
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass d(String o0, String o1){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass getExternalStorageDirectory(){ return null; }
	public MyHelperClass getExternalStorageState(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class FTPClient {

public MyHelperClass printWorkingDirectory(){ return null; }
	public MyHelperClass retrieveFileStream(String o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }}

class Intent {

}

class WXdroid {

}

class showProgressFTP {

}
