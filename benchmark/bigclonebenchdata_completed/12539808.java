


class c12539808 {

    public void jsFunction_extract(ScriptableFile outputFile) throws IOException, FileSystemException, ArchiveException {
        MyHelperClass file = new MyHelperClass();
        InputStream is =(InputStream)(Object) file.jsFunction_createInputStream();
        OutputStream output =(OutputStream)(Object) outputFile.jsFunction_createOutputStream();
        BufferedInputStream buf = new BufferedInputStream(is);
        MyHelperClass ScriptableZipArchive = new MyHelperClass();
        ArchiveInputStream input =(ArchiveInputStream)(Object) ScriptableZipArchive.getFactory().createArchiveInputStream(buf);
        try {
            long count = 0;
            while (input.getNextEntry() != null) {
                MyHelperClass offset = new MyHelperClass();
                if (count == (long)(Object)offset) {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(input, output);
                    break;
                }
                count++;
            }
        } finally {
            input.close();
            output.close();
            is.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createArchiveInputStream(BufferedInputStream o0){ return null; }
	public MyHelperClass jsFunction_createInputStream(){ return null; }
	public MyHelperClass getFactory(){ return null; }
	public MyHelperClass copy(ArchiveInputStream o0, OutputStream o1){ return null; }}

class ScriptableFile {

public MyHelperClass jsFunction_createOutputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileSystemException extends Exception{
	public FileSystemException(String errorMessage) { super(errorMessage); }
}

class ArchiveException extends Exception{
	public ArchiveException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}}

class ArchiveInputStream {

public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }}
