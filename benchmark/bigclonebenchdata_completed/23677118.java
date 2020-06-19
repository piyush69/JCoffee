


class c23677118 {

	public static void copyFile5(File srcFile, File destFile) throws IOException {
		InputStream in =(InputStream)(Object) new FileInputStream(srcFile);
		OutputStream out =(OutputStream)(Object) new FileOutputStream(destFile);
  MyHelperClass IOUtils = new MyHelperClass();
		IOUtils.copyLarge(in, out);
		in.close();
		out.close();
	}

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(InputStream o0, OutputStream o1){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
