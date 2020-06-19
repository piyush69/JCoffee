


class c11986970 {

    public void Copy() throws IOException {
        MyHelperClass FileDestination = new MyHelperClass();
        if (!(Boolean)(Object)FileDestination.exists()) {
//            MyHelperClass FileDestination = new MyHelperClass();
            FileDestination.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        try {
            MyHelperClass FileSource = new MyHelperClass();
            source =(FileChannel)(Object) (new FileInputStream(FileSource).getChannel());
//            MyHelperClass FileDestination = new MyHelperClass();
            destination =(FileChannel)(Object) (new FileOutputStream(FileDestination).getChannel());
            destination.transferFrom(source, 0, source.size());
        } finally {
            if (source != null) {
                source.close();
            }
            if (destination != null) {
                destination.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}
