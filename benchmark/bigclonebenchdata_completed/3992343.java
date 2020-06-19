


class c3992343 {
public MyHelperClass clazz;
	public MyHelperClass IOUtils;
	public MyHelperClass getExtension(MyHelperClass o0){ return null; }

    public File createTemporaryFile() throws IOException {
        MyHelperClass resource = new MyHelperClass();
        URL url =(URL)(Object) clazz.getResource(resource);
        if (url == null) {
            MyHelperClass clazz = new MyHelperClass();
            throw new IOException("No resource available from '" + clazz.getName() + "' for '" + resource + "'");
        }
//        MyHelperClass resource = new MyHelperClass();
        String extension =(String)(Object) getExtension(resource);
        String prefix = "resource-temporary-file-creator";
        MyHelperClass File = new MyHelperClass();
        File file =(File)(Object) File.createTempFile(prefix, extension);
        InputStream input =(InputStream)(Object) url.openConnection().getInputStream();
        FileOutputStream output = new FileOutputStream(file);
        IOUtils.copyAndClose(input, output);
        return file;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass getResource(MyHelperClass o0){ return null; }
	public MyHelperClass copyAndClose(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getName(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class InputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
