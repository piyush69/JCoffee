


class c17074899 {
public MyHelperClass AudioSystem;
	public MyHelperClass IOUtils;
	public MyHelperClass makeStream(){ return null; }
	public MyHelperClass makeInputStream(){ return null; }

    public void save(File f, Type t) throws IOException {
        if (t.getExtension().equals("raw")) {
            IOUtils.copy(makeInputStream(), new FileOutputStream(f));
        } else {
            AudioSystem.write(makeStream(), t, f);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass write(MyHelperClass o0, Type o1, File o2){ return null; }}

class File {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class Type {

public MyHelperClass getExtension(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
