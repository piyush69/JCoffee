


class c14410764 {

    private boolean copyToFile(String folder, String fileName) throws StorageException {
        InputStream in =(InputStream)(Object) Thread.currentThread().getContextClassLoader().getResourceAsStream(folder + "/" + fileName);
        if (in == null) {
            return false;
        }
        FileOutputStream out = null;
        try {
            MyHelperClass path = new MyHelperClass();
            out = new FileOutputStream(new File(path, fileName));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, out);
            in.close();
            out.flush();
        } catch (Exception e) {
            throw new StorageException((String)(Object)e);
        } finally {
            if (in != null) {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(in);
            }
            if (out != null) {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(out);
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class StorageException extends Exception{
	public StorageException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass flush(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}}
