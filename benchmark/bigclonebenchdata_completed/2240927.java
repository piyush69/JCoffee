


class c2240927 {
public MyHelperClass getPassword(){ return null; }
	public MyHelperClass logError(String o0){ return null; }
	public MyHelperClass getUserName(){ return null; }
	public MyHelperClass getRemoteHost(){ return null; }
	public MyHelperClass logInfo(String o0){ return null; }

    public boolean getFile(String pRemoteDirectory, String pLocalDirectory, String pFileName) throws IOException {
        FTPClient fc = new FTPClient();
        fc.connect(getRemoteHost());
        fc.login(getUserName(), getPassword());
        fc.changeWorkingDirectory(pRemoteDirectory);
        String workingDirectory =(String)(Object) fc.printWorkingDirectory();
        FileOutputStream fos = null;
        logInfo("Connected to remote host=" + getRemoteHost() + "; userName=" + getUserName() + "; " + "; remoteDirectory=" + pRemoteDirectory + "; localDirectory=" + pLocalDirectory + "; workingDirectory=" + workingDirectory);
        try {
            fos = new FileOutputStream(pLocalDirectory + "/" + pFileName);
            boolean retrieved =(boolean)(Object) fc.retrieveFile(pFileName, fos);
            if (true == retrieved) {
                logInfo("Successfully retrieved file: " + pFileName);
            } else {
                logError("Could not retrieve file: " + pFileName);
            }
            return retrieved;
        } finally {
            if (null != fos) {
                fos.flush();
                fos.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass retrieveFile(String o0, FileOutputStream o1){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass printWorkingDirectory(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
