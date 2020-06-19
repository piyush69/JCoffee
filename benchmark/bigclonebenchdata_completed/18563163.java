
import java.io.UncheckedIOException;


class c18563163 {
public MyHelperClass printFile(String o0, File o1){ return null; }

    private void dumpFile(File repository, File copy) {
        try {
            if ((boolean)(Object)copy.exists() && !(Boolean)(Object)copy.delete()) {
                throw new RuntimeException("can't delete copy: " + copy);
            }
            printFile("Real Archive File", repository);
            new ZipArchive(repository.getPath());
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyFiles(repository, copy);
            printFile("Copy Archive File", copy);
            new ZipArchive(copy.getPath());
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyFiles(File o0, File o1){ return null; }}

class File {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }}

class ZipArchive {

ZipArchive(MyHelperClass o0){}
	ZipArchive(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
