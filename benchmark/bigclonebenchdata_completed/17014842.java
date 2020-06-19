


class c17014842 {

    private String createDefaultRepoConf() throws IOException {
        MyHelperClass REPO_CONF_PATH = new MyHelperClass();
        InputStream confIn =(InputStream)(Object) getClass().getResourceAsStream((String)(Object)REPO_CONF_PATH);
        MyHelperClass File = new MyHelperClass();
        File tempConfFile =(File)(Object) File.createTempFile("repository", "xml");
        tempConfFile.deleteOnExit();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(confIn, new FileOutputStream(tempConfFile));
        return(String)(Object) tempConfFile.getAbsolutePath();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
