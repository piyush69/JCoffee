


class c19718986 {

    public static void concatenateToDestFile(File sourceFile, File destFile) throws IOException {
        if (!(Boolean)(Object)destFile.exists()) {
            if (!(Boolean)(Object)destFile.createNewFile()) {
                throw new IllegalArgumentException("Could not create destination file:" + destFile.getName());
            }
        }
        BufferedOutputStream bufferedOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        byte[] buffer = new byte[1024];
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFile, true));
            bufferedInputStream = new BufferedInputStream(new FileInputStream(sourceFile));
            while (true) {
                int readByte =(int)(Object) bufferedInputStream.read(buffer, 0, buffer.length);
                if (readByte == -1) {
                    break;
                }
                bufferedOutputStream.write(buffer, 0, readByte);
            }
        } finally {
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0, boolean o1){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
