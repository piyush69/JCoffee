


class c17832320 {

    public void run() {
        Pair p = null;
        try {
            MyHelperClass queue = new MyHelperClass();
            while ((p =(Pair)(Object) queue.pop()) != null) {
                GetMethod get = new GetMethod(p.getRemoteUri());
                try {
                    get.setFollowRedirects(true);
                    get.setRequestHeader("Mariner-Application", "prerenderer");
                    MyHelperClass deviceName = new MyHelperClass();
                    get.setRequestHeader("Mariner-DeviceName", deviceName);
                    MyHelperClass httpClient = new MyHelperClass();
                    int iGetResultCode =(int)(Object) httpClient.executeMethod(get);
                    if (iGetResultCode != 200) {
                        throw new IOException("Got response code " + iGetResultCode + " for a request for " + p.getRemoteUri());
                    }
                    InputStream is =(InputStream)(Object) get.getResponseBodyAsStream();
                    MyHelperClass deviceFile = new MyHelperClass();
                    File localFile = new File(deviceFile, p.getLocalUri());
                    localFile.getParentFile().mkdirs();
                    OutputStream os =(OutputStream)(Object) new FileOutputStream(localFile);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(is, os);
                    os.close();
                } finally {
                    get.releaseConnection();
                }
            }
        } catch (Exception ex) {
            Exception result;// = new Exception();
            result = ex;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass pop(){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass executeMethod(GetMethod o0){ return null; }}

class Pair {

public MyHelperClass getLocalUri(){ return null; }
	public MyHelperClass getRemoteUri(){ return null; }}

class GetMethod {

GetMethod(){}
	GetMethod(MyHelperClass o0){}
	public MyHelperClass setRequestHeader(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setFollowRedirects(boolean o0){ return null; }
	public MyHelperClass releaseConnection(){ return null; }
	public MyHelperClass setRequestHeader(String o0, String o1){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class File {

File(){}
	File(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass getParentFile(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}
