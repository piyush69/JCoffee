


class c2867246 {

    public static void copyFile(File inputFile, File outputFile) throws IOException {
        BufferedInputStream fr = new BufferedInputStream(new FileInputStream(inputFile));
        BufferedOutputStream fw = new BufferedOutputStream(new FileOutputStream(outputFile));
        byte[] buf = new byte[8192];
        int n;
        while ((n =(int)(Object) fr.read(buf)) >= 0) fw.write(buf, 0, n);
        fr.close();
        fw.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
