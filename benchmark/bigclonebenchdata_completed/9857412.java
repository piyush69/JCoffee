


class c9857412 {
public MyHelperClass BackEnd;
	public MyHelperClass Type;
public MyHelperClass fireOnProgressEvent(long o0, long o1){ return null; }

//    @Override
    public void writeData(byte[] data, byte[] options, boolean transferMetaData) throws Throwable {
        long startTime = System.currentTimeMillis();
        long transferredBytesNum = 0;
        long elapsedTime = 0;
        MyHelperClass PropertiesUtils = new MyHelperClass();
        Properties opts =(Properties)(Object) PropertiesUtils.deserializeProperties(options);
        MyHelperClass TRANSFER_OPTION_SERVER = new MyHelperClass();
        String server =(String)(Object) opts.getProperty(TRANSFER_OPTION_SERVER);
        MyHelperClass TRANSFER_OPTION_USERNAME = new MyHelperClass();
        String username =(String)(Object) opts.getProperty(TRANSFER_OPTION_USERNAME);
        MyHelperClass TRANSFER_OPTION_PASSWORD = new MyHelperClass();
        String password =(String)(Object) opts.getProperty(TRANSFER_OPTION_PASSWORD);
        MyHelperClass TRANSFER_OPTION_FILEPATH = new MyHelperClass();
        String filePath =(String)(Object) opts.getProperty(TRANSFER_OPTION_FILEPATH);
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
        MyHelperClass PROTOCOL_PREFIX = new MyHelperClass();
        URL url = new URL(PROTOCOL_PREFIX + username + ":" + password + "@" + server + filePath + ";type=i");
        URLConnection urlc =(URLConnection)(Object) url.openConnection(BackEnd.getProxy(Type.SOCKS));
        MyHelperClass Preferences = new MyHelperClass();
        urlc.setConnectTimeout((int)(Object)Preferences.getInstance().preferredTimeOut * 1000);
//        MyHelperClass Preferences = new MyHelperClass();
        urlc.setReadTimeout((int)(Object)Preferences.getInstance().preferredTimeOut * 1000);
        OutputStream os =(OutputStream)(Object) urlc.getOutputStream();
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        byte[] buffer = new byte[1024];
        int br;
        while ((br =(int)(Object) bis.read(buffer)) > 0) {
            os.write(buffer, 0, br);
            if (!transferMetaData) {
                transferredBytesNum += br;
                elapsedTime = System.currentTimeMillis() - startTime;
                fireOnProgressEvent(transferredBytesNum, elapsedTime);
            }
        }
        bis.close();
        os.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SOCKS;
	public MyHelperClass preferredTimeOut;
public MyHelperClass deserializeProperties(byte[] o0){ return null; }
	public MyHelperClass getProxy(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class Properties {

public MyHelperClass getProperty(MyHelperClass o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(MyHelperClass o0){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
