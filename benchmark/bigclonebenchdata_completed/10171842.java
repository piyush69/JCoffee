


class c10171842 {
public MyHelperClass FileUtils;
public MyHelperClass IOUtils;
	public MyHelperClass file;
	public MyHelperClass tmpFile(String o0){ return null; }
	public MyHelperClass tmpUrl(String o0){ return null; }

    public String upload() throws IOException {
        MyHelperClass docIndex = new MyHelperClass();
        int idx =(int)(Object) docIndex.incrementAndGet();
        MyHelperClass fileFileName = new MyHelperClass();
        String tmpName = "namefinder/doc_" + idx + "__" + fileFileName;
        File tmpFile =(File)(Object) tmpFile(tmpName);
        if ((boolean)(Object)tmpFile.exists()) {
            FileUtils.deleteQuietly(tmpFile);
        }
        FileUtils.touch(tmpFile);
        InputStream fileStream =(InputStream)(Object) new FileInputStream(file);
        OutputStream bos =(OutputStream)(Object) new FileOutputStream(tmpFile);
        IOUtils.copy(fileStream, bos);
        bos.close();
        fileStream.close();
        return(String)(Object) tmpUrl(tmpName);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass deleteQuietly(File o0){ return null; }
	public MyHelperClass touch(File o0){ return null; }
	public MyHelperClass incrementAndGet(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

public MyHelperClass exists(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
