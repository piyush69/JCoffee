


class c14864066 {

    protected boolean downloadFile(TestThread thread, ActionResult result) {
        MyHelperClass remoteFile = new MyHelperClass();
        result.setRequestString("download file " + remoteFile);
        InputStream input = null;
        OutputStream output = null;
        OutputStream target = null;
        boolean status = false;
        MyHelperClass ftpClient = new MyHelperClass();
        ftpClient.enterLocalPassiveMode();
        try {
            MyHelperClass localFile = new MyHelperClass();
            if (localFile != null) {
//                MyHelperClass localFile = new MyHelperClass();
                File lcFile = new File(localFile);
//                MyHelperClass remoteFile = new MyHelperClass();
                if ((Boolean)(Object)lcFile.exists() && (Boolean)(Object)lcFile.isDirectory()) output =(OutputStream)(Object) new FileOutputStream(new File(lcFile, remoteFile)); else output =(OutputStream)(Object) new FileOutputStream(lcFile);
                target = output;
            } else {
//                MyHelperClass remoteFile = new MyHelperClass();
                target =(OutputStream)(Object) new FileOutputStream(remoteFile);
            }
//            MyHelperClass remoteFile = new MyHelperClass();
            input =(InputStream)(Object) ftpClient.retrieveFileStream(remoteFile);
            MyHelperClass IOUtils = new MyHelperClass();
            long bytes =(long)(Object) IOUtils.copy(input, target);
            status = bytes > 0;
            if (status) {
                result.setResponseLength(bytes);
            }
        } catch (Exception e) {
            MyHelperClass config = new MyHelperClass();
            result.setException(new TestActionException(config, e));
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(input);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(output);
        }
        return status;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass retrieveFileStream(MyHelperClass o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }}

class TestThread {

}

class ActionResult {

public MyHelperClass setException(TestActionException o0){ return null; }
	public MyHelperClass setRequestString(String o0){ return null; }
	public MyHelperClass setResponseLength(long o0){ return null; }}

class InputStream {

}

class OutputStream {

}

class File {

File(){}
	File(MyHelperClass o0){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	FileOutputStream(MyHelperClass o0){}}

class TestActionException extends Exception{
	public TestActionException(String errorMessage) { super(errorMessage); }
	TestActionException(){}
	TestActionException(MyHelperClass o0, Exception o1){}
}
