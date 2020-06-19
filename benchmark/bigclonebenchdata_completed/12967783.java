
import java.io.UncheckedIOException;


class c12967783 {
public MyHelperClass print(String o0){ return null; }
public MyHelperClass printError(String o0){ return null; }
	public MyHelperClass getOutFile(StorageFile o0){ return null; }
	public MyHelperClass afterSave(File o0){ return null; }
public MyHelperClass ctx;
	public MyHelperClass IOUtils;
	public MyHelperClass printUsage(){ return null; }

//    @Override
    public void doExecute(String[] args) {
        if (args.length != 2) {
            printUsage();
        } else {
            int fileNo = 0;
            try {
                fileNo = Integer.parseInt(args[1]) - 1;
            } catch (NumberFormatException e) {
                printUsage();
                return;
            }
            if (fileNo < 0) {
                printUsage();
                return;
            }
            StorageFile[] files = (StorageFile[])(StorageFile[])(Object) ctx.getRemoteDir().listFiles();
            try {
                StorageFile file = files[fileNo];
                File outFile =(File)(Object) getOutFile(file);
                FileOutputStream out = new FileOutputStream(outFile);
                InputStream in =(InputStream)(Object) file.openStream();
                IOUtils.copy(in, out);
                IOUtils.closeQuietly(out);
                afterSave(outFile);
                if ((boolean)(Object)outFile.exists()) {
                    print("File written to: " + outFile.getAbsolutePath());
                }
            } catch (UncheckedIOException e) {
                printError("Failed to load file. " + e.getMessage());
            } catch (Exception e) {
                printUsage();
                return;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass getRemoteDir(){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class StorageFile {

public MyHelperClass openStream(){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
