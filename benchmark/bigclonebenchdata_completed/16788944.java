


class c16788944 {

    private void refreshCacheFile(RepositoryFile file, File cacheFile) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(cacheFile);
        InputStream is =(InputStream)(Object) file.getInputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        int count =(int)(Object) IOUtils.copy(is, fos);
        MyHelperClass logger = new MyHelperClass();
        logger.debug("===========================================================> wrote bytes to cache " + count);
        fos.flush();
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly(fos);
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly((FileOutputStream)(Object)file.getInputStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class RepositoryFile {

public MyHelperClass getInputStream(){ return null; }}

class File {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass flush(){ return null; }}

class InputStream {

}
