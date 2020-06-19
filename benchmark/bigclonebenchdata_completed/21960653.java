


class c21960653 {

    public void adjustPadding(File file, int paddingSize, long audioStart) throws FileNotFoundException, IOException {
        MyHelperClass logger = new MyHelperClass();
        logger.finer("Need to move audio file to accomodate tag");
        FileChannel fcIn;
        FileChannel fcOut;
        MyHelperClass ByteBuffer = new MyHelperClass();
        ByteBuffer paddingBuffer =(ByteBuffer)(Object) ByteBuffer.wrap(new byte[paddingSize]);
        MyHelperClass File = new MyHelperClass();
        File paddedFile =(File)(Object) File.createTempFile("temp", ".mp3", file.getParentFile());
        fcOut =(FileChannel)(Object) (new FileOutputStream(paddedFile).getChannel());
        fcIn =(FileChannel)(Object) (new FileInputStream(file).getChannel());
        long written = (long)(long)(Object) fcOut.write(paddingBuffer);
//        MyHelperClass logger = new MyHelperClass();
        logger.finer("Copying:" + ((long)(Object)file.length() - audioStart) + "bytes");
        long audiolength =(long)(Object) file.length() - audioStart;
        MyHelperClass MAXIMUM_WRITABLE_CHUNK_SIZE = new MyHelperClass();
        if (audiolength <= (long)(Object)MAXIMUM_WRITABLE_CHUNK_SIZE) {
            long written2 =(long)(Object) fcIn.transferTo(audioStart, audiolength, fcOut);
//            MyHelperClass logger = new MyHelperClass();
            logger.finer("Written padding:" + written + " Data:" + written2);
            if (written2 != audiolength) {
                throw new RuntimeException("Problem adjusting padding, expecting to write:" + audiolength + ":only wrote:" + written2);
            }
        } else {
//            MyHelperClass MAXIMUM_WRITABLE_CHUNK_SIZE = new MyHelperClass();
            long noOfChunks = audiolength / (long)(Object)MAXIMUM_WRITABLE_CHUNK_SIZE;
//            MyHelperClass MAXIMUM_WRITABLE_CHUNK_SIZE = new MyHelperClass();
            long lastChunkSize = audiolength % (long)(Object)MAXIMUM_WRITABLE_CHUNK_SIZE;
            long written2 = 0;
            for (int i = 0; i < noOfChunks; i++) {
//                MyHelperClass MAXIMUM_WRITABLE_CHUNK_SIZE = new MyHelperClass();
                written2 += (long)(Object)fcIn.transferTo(audioStart + (i * (int)(Object)MAXIMUM_WRITABLE_CHUNK_SIZE),(long)(Object) MAXIMUM_WRITABLE_CHUNK_SIZE, fcOut);
                Runtime.getRuntime().gc();
            }
//            MyHelperClass MAXIMUM_WRITABLE_CHUNK_SIZE = new MyHelperClass();
            written2 += (long)(Object)fcIn.transferTo(audioStart + (noOfChunks * (long)(Object)MAXIMUM_WRITABLE_CHUNK_SIZE), lastChunkSize, fcOut);
//            MyHelperClass logger = new MyHelperClass();
            logger.finer("Written padding:" + written + " Data:" + written2);
            if (written2 != audiolength) {
                throw new RuntimeException("Problem adjusting padding in large file, expecting to write:" + audiolength + ":only wrote:" + written2);
            }
        }
        long lastModified =(long)(Object) file.lastModified();
        fcIn.close();
        fcOut.close();
        file.delete();
        paddedFile.renameTo(file);
        paddedFile.setLastModified(lastModified);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass wrap(byte[] o0){ return null; }
	public MyHelperClass finer(String o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1, MyHelperClass o2){ return null; }}

class File {

public MyHelperClass setLastModified(long o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass transferTo(long o0, long o1, FileChannel o2){ return null; }}

class ByteBuffer {

}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
