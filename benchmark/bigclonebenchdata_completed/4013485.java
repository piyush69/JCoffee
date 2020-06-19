


class c4013485 {
public MyHelperClass localClient;

    void copyFileOnPeer(String path, RServerInfo peerserver, boolean allowoverwrite) throws IOException {
        RFile file = new RFile(path);
        OutputStream out = null;
        FileInputStream in = null;
        try {
            MyHelperClass fileManager = new MyHelperClass();
            in =(FileInputStream)(Object) fileManager.openFileRead(path);
            MyHelperClass WriteMode = new MyHelperClass();
            out =(OutputStream)(Object) localClient.openWrite(file, false, WriteMode.TRANSACTED, 1, peerserver, !allowoverwrite);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(in, out);
            out.close();
            out = null;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Throwable t) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (Throwable t) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TRANSACTED;
public MyHelperClass openFileRead(String o0){ return null; }
	public MyHelperClass openWrite(RFile o0, boolean o1, MyHelperClass o2, int o3, RServerInfo o4, boolean o5){ return null; }
	public MyHelperClass copyLarge(FileInputStream o0, OutputStream o1){ return null; }}

class RServerInfo {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class RFile {

RFile(String o0){}
	RFile(){}}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

public MyHelperClass close(){ return null; }}
