


class c2240926 {
public MyHelperClass logInfo(String o0){ return null; }
	public MyHelperClass getUserName(){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getRemoteHost(){ return null; }

    public boolean getFiles(String pRemoteDirectory, String pLocalDirectory) throws IOException {
        final String methodSignature = "boolean getFiles(String,String): ";
        FTPClient fc = new FTPClient();
        fc.connect(getRemoteHost());
        fc.login(getUserName(), getPassword());
        fc.changeWorkingDirectory(pRemoteDirectory);
        FTPFile[] files =(FTPFile[])(Object) fc.listFiles();
        boolean retrieved = false;
        logInfo("Listing Files: ");
        int retrieveCount = 0;
        File tmpFile = null;
        for (int i = 0; i < files.length; i++) {
            tmpFile = new File(files[i].getName());
            if (!(Boolean)(Object)tmpFile.isDirectory()) {
                FileOutputStream fos = new FileOutputStream(pLocalDirectory + "/" + files[i].getName());
                retrieved =(boolean)(Object) fc.retrieveFile(files[i].getName(), fos);
                if (false == retrieved) {
                    logInfo("Unable to retrieve file: " + files[i].getName());
                } else {
                    logInfo("Successfully retrieved file: " + files[i].getName());
                    retrieveCount++;
                }
                if (null != fos) {
                    fos.flush();
                    fos.close();
                }
            }
        }
        logInfo("Retrieve count: " + retrieveCount);
        if (retrieveCount > 0) {
            return true;
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass retrieveFile(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}

class FTPFile {

public MyHelperClass getName(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass isDirectory(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
