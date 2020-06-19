


class c11792098 {
public MyHelperClass IOUtils;
	public MyHelperClass FileHelper;
	public MyHelperClass newFileRef(String o0){ return null; }

    public void createNewFile(String filePath, InputStream in) throws IOException {
        FileOutputStream out = null;
        try {
            File file =(File)(Object) newFileRef(filePath);
            FileHelper.createNewFile(file, true);
            out = new FileOutputStream(file);
            IOUtils.copy(in, out);
        } finally {
            IOUtils.closeQuietly(in);
            IOUtils.closeQuietly(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass createNewFile(File o0, boolean o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class File {

}
