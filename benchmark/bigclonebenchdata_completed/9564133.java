


class c9564133 {

    public void copy(File aSource, File aDestDir) throws IOException {
        FileInputStream myInFile = new FileInputStream(aSource);
        FileOutputStream myOutFile = new FileOutputStream(new File(aDestDir, aSource.getName()));
        FileChannel myIn =(FileChannel)(Object) myInFile.getChannel();
        FileChannel myOut =(FileChannel)(Object) myOutFile.getChannel();
        boolean end = false;
        while (true) {
            MyHelperClass theBuffer = new MyHelperClass();
            int myBytes =(int)(Object) myIn.read(theBuffer);
            if (myBytes != -1) {
//                MyHelperClass theBuffer = new MyHelperClass();
                theBuffer.flip();
//                MyHelperClass theBuffer = new MyHelperClass();
                myOut.write(theBuffer);
//                MyHelperClass theBuffer = new MyHelperClass();
                theBuffer.clear();
            } else break;
        }
        myIn.close();
        myOut.close();
        myInFile.close();
        myOutFile.close();
        long myEnd = System.currentTimeMillis();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass clear(){ return null; }
	public MyHelperClass flip(){ return null; }}

class File {

File(File o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass read(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}
