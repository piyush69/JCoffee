


class c22117571 {
public MyHelperClass IOUtils;
public MyHelperClass remoteHostClient;
	public MyHelperClass getFtpServerHome(){ return null; }
	public MyHelperClass isPrompt(){ return null; }
	public MyHelperClass isAscii(){ return null; }

    public void copyFileFromLocalMachineToRemoteMachine(InputStream source, File destination) throws Exception {
        String fileName =(String)(Object) destination.getPath();
        File f = new File(getFtpServerHome(), "" + System.currentTimeMillis());
        f.deleteOnExit();
        IOUtils.copy(source, new FileOutputStream(f));
        remoteHostClient.setAscii(isAscii());
        remoteHostClient.setPromptOn(isPrompt());
        remoteHostClient.copyFileFromLocalMachineToRemoteClient(f.getName(), fileName);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyFileFromLocalMachineToRemoteClient(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass setAscii(MyHelperClass o0){ return null; }
	public MyHelperClass setPromptOn(MyHelperClass o0){ return null; }}

class InputStream {

}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
