import java.io.*;
import java.lang.*;
import java.util.*;



class c9857413 {
public MyHelperClass BackEnd;
	public MyHelperClass Type;
	public MyHelperClass DEFAULT_PORT;
public MyHelperClass fireOnProgressEvent(long o0, long o1){ return null; }

//    @Override
    public byte[] readData(byte[] options, boolean transferMetaData) throws Throwable {
        long startTime = System.currentTimeMillis();
        long transferredBytesNum = 0;
        long elapsedTime = 0;
        MyHelperClass PropertiesUtils = new MyHelperClass();
        Properties opts =(Properties)(Object) PropertiesUtils.deserializeProperties(options);
        MyHelperClass TRANSFER_OPTION_SERVER = new MyHelperClass();
        String server = opts.getProperty((String)(Object)TRANSFER_OPTION_SERVER);
        MyHelperClass TRANSFER_OPTION_USERNAME = new MyHelperClass();
        String username = opts.getProperty((String)(Object)TRANSFER_OPTION_USERNAME);
        MyHelperClass TRANSFER_OPTION_PASSWORD = new MyHelperClass();
        String password = opts.getProperty((String)(Object)TRANSFER_OPTION_PASSWORD);
        MyHelperClass TRANSFER_OPTION_FILEPATH = new MyHelperClass();
        String filePath = opts.getProperty((String)(Object)TRANSFER_OPTION_FILEPATH);
        if (transferMetaData) {
            MyHelperClass PATH_SEPARATOR = new MyHelperClass();
            int idx = filePath.lastIndexOf((int)(Object)PATH_SEPARATOR);
            if (idx != -1) {
                MyHelperClass META_DATA_FILE_SUFIX = new MyHelperClass();
                String fileName = filePath.substring(idx + 1) + META_DATA_FILE_SUFIX;
                filePath = filePath.substring(0, idx);
//                MyHelperClass PATH_SEPARATOR = new MyHelperClass();
                filePath = filePath + PATH_SEPARATOR + fileName;
            } else {
                MyHelperClass META_DATA_FILE_SUFIX = new MyHelperClass();
                filePath += META_DATA_FILE_SUFIX;
            }
        }
        MyHelperClass PORT_SEPARATOR = new MyHelperClass();
        if (!server.contains((CharSequence)(Object)PORT_SEPARATOR)) {
//            MyHelperClass PORT_SEPARATOR = new MyHelperClass();
            server +=(int)(Object) PORT_SEPARATOR + (int)(Object)DEFAULT_PORT;
        }
        MyHelperClass PROTOCOL_PREFIX = new MyHelperClass();
        URL url = new URL(PROTOCOL_PREFIX + username + ":" + password + "@" + server + filePath + ";type=i");
        URLConnection urlc =(URLConnection)(Object) url.openConnection(BackEnd.getProxy(Type.SOCKS));
        MyHelperClass Preferences = new MyHelperClass();
        urlc.setConnectTimeout((int)(Object)Preferences.getInstance().preferredTimeOut * 1000);
//        MyHelperClass Preferences = new MyHelperClass();
        urlc.setReadTimeout((int)(Object)Preferences.getInstance().preferredTimeOut * 1000);
        ByteArrayOutputStream baos = null;
        try {
            InputStream is =(InputStream)(Object) urlc.getInputStream();
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int br;
            while ((br = is.read(buffer)) > 0) {
                baos.write(buffer, 0, br);
                if (!transferMetaData) {
                    transferredBytesNum += br;
                    elapsedTime = System.currentTimeMillis() - startTime;
                    fireOnProgressEvent(transferredBytesNum, elapsedTime);
                }
            }
            baos.close();
            is.close();
        } catch (FileNotFoundException fnfe) {
        }
        return baos != null ? baos.toByteArray() : null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass preferredTimeOut;
	public MyHelperClass SOCKS;
public MyHelperClass getProxy(MyHelperClass o0){ return null; }
	public MyHelperClass deserializeProperties(byte[] o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(MyHelperClass o0){ return null; }}

class URLConnection {

public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }}
