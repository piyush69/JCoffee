


class c22542860 {

    public static void storeRemote(String sourceLocation, SourceDetail targetSourceDetail, String targetlocation, boolean isBinary) throws Exception {
        FTPClient client = new FTPClient();
        client.connect(targetSourceDetail.getHost());
        client.login(targetSourceDetail.getUser(), targetSourceDetail.getPassword());
        MyHelperClass FTPClient = new MyHelperClass();
        if (isBinary) client.setFileType(FTPClient.BINARY_FILE_TYPE);
        File file = new File(sourceLocation);
        if ((boolean)(Object)file.isDirectory()) {
            client.makeDirectory(targetlocation);
            FileInputStream in = null;
            for (File myFile :(File[])(Object) (Object[])(Object)file.listFiles()) {
                if ((boolean)(Object)myFile.isDirectory()) {
                    storeRemote((String)(Object)myFile.getAbsolutePath(), targetSourceDetail, targetlocation + "/" + myFile.getName(), isBinary);
                } else {
                    in = new FileInputStream((String)(Object)myFile.getAbsolutePath());
                    if (!targetlocation.endsWith("/")) client.storeFile(targetlocation + "/" + myFile.getName(), in); else client.storeFile(targetlocation + myFile.getName(), in);
                    in.close();
                }
            }
        } else {
            FileInputStream in = new FileInputStream(sourceLocation);
            client.storeFile(targetlocation, in);
            in.close();
        }
        client.disconnect();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
}

class SourceDetail {

public MyHelperClass getUser(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class FTPClient {

public MyHelperClass storeFile(String o0, FileInputStream o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass makeDirectory(String o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}
