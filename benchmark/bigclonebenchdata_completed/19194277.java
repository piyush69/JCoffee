


class c19194277 {

    public void create() throws IOException {
        MyHelperClass sourceFile = new MyHelperClass();
        FileChannel fc =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
        MyHelperClass array = new MyHelperClass();
        for (RangeArrayElement element :(RangeArrayElement[])(Object) (Object[])(Object)array) {
            FileChannel fc_ =(FileChannel)(Object) fc.position(element.starting());
            MyHelperClass destinationDirectory = new MyHelperClass();
            File part = new File(destinationDirectory, "_0x" + Long.toHexString((long)(Object)element.starting()) + ".partial");
            FileChannel partfc =(FileChannel)(Object) (new FileOutputStream(part).getChannel());
            partfc.transferFrom(fc_, 0, element.getSize());
            partfc.force(true);
            partfc.close();
        }
        fc.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass force(boolean o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass position(MyHelperClass o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class RangeArrayElement {

public MyHelperClass getSize(){ return null; }
	public MyHelperClass starting(){ return null; }}
