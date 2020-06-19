


class c16166059 {

    public void transform(File inputMatrixFile, Format inputFormat, File outputMatrixFile) throws IOException {
        FileChannel original =(FileChannel)(Object) (new FileInputStream(inputMatrixFile).getChannel());
        FileChannel copy =(FileChannel)(Object) (new FileOutputStream(outputMatrixFile).getChannel());
        copy.transferFrom(original, 0, original.size());
        original.close();
        copy.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class Format {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
