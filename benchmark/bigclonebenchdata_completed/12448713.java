


class c12448713 {

    private void writeGif(String filename, String outputFile) throws IOException {
        File file = new File(filename);
        InputStream in =(InputStream)(Object) new FileInputStream(file);
        FileOutputStream fout = new FileOutputStream(outputFile);
        int totalRead = 0;
        int readBytes = 0;
        int blockSize = 65000;
        long fileLen =(long)(Object) file.length();
        byte b[] = new byte[blockSize];
        while ((long) totalRead < fileLen) {
            readBytes =(int)(Object) in.read(b, 0, blockSize);
            totalRead += readBytes;
            fout.write(b, 0, readBytes);
        }
        in.close();
        fout.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass length(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
