


class c4787102 {
public MyHelperClass IOUtils;
	public MyHelperClass cachedContent;
	public MyHelperClass dfosFile;
	public MyHelperClass getOutputStream(){ return null; }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        OutputStream output =(OutputStream)(Object) getOutputStream();
        if (cachedContent != null) {
            output.write(cachedContent);
        } else {
            FileInputStream input = new FileInputStream(dfosFile);
            IOUtils.copy(input, output);
            dfosFile.delete();
            dfosFile = null;
        }
        output.close();
        cachedContent = null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass delete(){ return null; }}

class ObjectInputStream {

public MyHelperClass defaultReadObject(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}
