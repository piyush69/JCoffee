


class c13199957 {

    private File copyFile(String fileInClassPath, String systemPath) throws Exception {
        InputStream is =(InputStream)(Object) getClass().getResourceAsStream(fileInClassPath);
        OutputStream os =(OutputStream)(Object) new FileOutputStream(systemPath);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(is, os);
        is.close();
        os.close();
        return new File(systemPath);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class File {

File(String o0){}
	File(){}}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
