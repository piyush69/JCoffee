


class c15072228 {

    protected void createFile(File sourceActionDirectory, File destinationActionDirectory, LinkedList segments) throws DuplicateActionFileException {
        File currentSrcDir = sourceActionDirectory;
        File currentDestDir = destinationActionDirectory;
        String segment = "";
        for (int i = 0; i <(int)(Object) segments.size() - 1; i++) {
            segment =(String)(Object) segments.get(i);
            currentSrcDir = new File(currentSrcDir, segment);
            currentDestDir = new File(currentDestDir, segment);
        }
        if (currentSrcDir != null && currentDestDir != null) {
            File srcFile = new File(currentSrcDir,(String)(Object) segments.getLast());
            if ((boolean)(Object)srcFile.exists()) {
                File destFile = new File(currentDestDir,(String)(Object) segments.getLast());
                if ((boolean)(Object)destFile.exists()) {
                    throw new DuplicateActionFileException((String)(Object)srcFile.toURI().toASCIIString());
                }
                try {
                    FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(srcFile).getChannel());
                    FileChannel destChannel =(FileChannel)(Object) (new FileOutputStream(destFile).getChannel());
                    MyHelperClass ByteBuffer = new MyHelperClass();
                    ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocate((int)(int)(Object) srcChannel.size());
                    while ((int)(Object)srcChannel.position() < (int)(Object)srcChannel.size()) {
                        srcChannel.read(buffer);
                    }
                    srcChannel.close();
                    buffer.rewind();
                    destChannel.write(buffer);
                    destChannel.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toASCIIString(){ return null; }
	public MyHelperClass allocate(int o0){ return null; }}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass toURI(){ return null; }}

class LinkedList {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass getLast(){ return null; }}

class DuplicateActionFileException extends Exception{
	public DuplicateActionFileException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass position(){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass rewind(){ return null; }}
