
import java.io.UncheckedIOException;


class c7343430 {
public MyHelperClass ccnNameToFilePath(MyHelperClass o0){ return null; }
public MyHelperClass VersioningProfile;

    protected boolean writeFile(Interest outstandingInterest) throws IOException {
        File fileToWrite =(File)(Object) ccnNameToFilePath(outstandingInterest.name());
        MyHelperClass Log = new MyHelperClass();
        Log.info("CCNFileProxy: extracted request for file: " + fileToWrite.getAbsolutePath() + " exists? ", fileToWrite.exists());
        if (!(Boolean)(Object)fileToWrite.exists()) {
//            MyHelperClass Log = new MyHelperClass();
            Log.warning("File {0} does not exist. Ignoring request.", fileToWrite.getAbsoluteFile());
            return false;
        }
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileToWrite);
        } catch (UncheckedIOException fnf) {
//            MyHelperClass Log = new MyHelperClass();
            Log.warning("Unexpected: file we expected to exist doesn't exist: {0}!", fileToWrite.getAbsolutePath());
            return false;
        }
        CCNTime modificationTime = new CCNTime(fileToWrite.lastModified());
        MyHelperClass _prefix = new MyHelperClass();
        ContentName versionedName =(ContentName)(Object) VersioningProfile.addVersion(new ContentName(_prefix, outstandingInterest.name().postfix(_prefix).components()), modificationTime);
        MyHelperClass _handle = new MyHelperClass();
        CCNFileOutputStream ccnout = new CCNFileOutputStream(versionedName, _handle);
        ccnout.addOutstandingInterest(outstandingInterest);
        MyHelperClass BUF_SIZE = new MyHelperClass();
        byte[] buffer = new byte[(int)(Object)BUF_SIZE];
        int read =(int)(Object) fis.read(buffer);
        while (read >= 0) {
            ccnout.write(buffer, 0, read);
            read =(int)(Object) fis.read(buffer);
        }
        fis.close();
        ccnout.close();
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addVersion(ContentName o0, CCNTime o1){ return null; }
	public MyHelperClass info(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass postfix(MyHelperClass o0){ return null; }
	public MyHelperClass warning(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass components(){ return null; }}

class Interest {

public MyHelperClass name(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

public MyHelperClass lastModified(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getAbsoluteFile(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class CCNTime {

CCNTime(MyHelperClass o0){}
	CCNTime(){}}

class ContentName {

ContentName(MyHelperClass o0, MyHelperClass o1){}
	ContentName(){}}

class CCNFileOutputStream {

CCNFileOutputStream(ContentName o0, MyHelperClass o1){}
	CCNFileOutputStream(){}
	public MyHelperClass addOutstandingInterest(Interest o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
