


class c9481276 {
public MyHelperClass IOUtils;
	public MyHelperClass Config;
	public MyHelperClass getPhysMessageID(){ return null; }
	public MyHelperClass getInternalDate(){ return null; }

    public void save(InputStream is) throws IOException {
        File dest =(File)(Object) Config.getDataFile(getInternalDate(), getPhysMessageID());
        OutputStream os = null;
        try {
            os =(OutputStream)(Object) new FileOutputStream(dest);
            IOUtils.copyLarge(is, os);
        } finally {
            IOUtils.closeQuietly(os);
            IOUtils.closeQuietly(is);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass getDataFile(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass copyLarge(InputStream o0, OutputStream o1){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
