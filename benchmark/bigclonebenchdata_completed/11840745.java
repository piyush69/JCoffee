import java.io.*;
import java.lang.*;
import java.util.*;



class c11840745 {
public MyHelperClass FLAT_PACK_HEADER;

    public final void close() throws IOException {
        MyHelperClass dataStream = new MyHelperClass();
        if (dataStream == null) throw new NullPointerException("Write stream is null.");
//        MyHelperClass dataStream = new MyHelperClass();
        dataStream.flush();
//        MyHelperClass dataStream = new MyHelperClass();
        dataStream.close();
//        MyHelperClass dataStream = new MyHelperClass();
        dataStream = null;
        MyHelperClass packPath = new MyHelperClass();
        File tmpFile = new File(packPath + ".tmp");
//        MyHelperClass packPath = new MyHelperClass();
        FileOutputStream packStream = new FileOutputStream((String)(Object)packPath);
        try {
            MyHelperClass currentNbFiles = new MyHelperClass();
            String nbFiles = Long.toString((long)(Object)currentNbFiles) + "\0";
            MyHelperClass Charsets = new MyHelperClass();
            packStream.write((int)(Object)FLAT_PACK_HEADER.getBytes(Charsets.ISO_8859_1));
            MyHelperClass structBufferWriter = new MyHelperClass();
            structBufferWriter.flush();
//            MyHelperClass structBufferWriter = new MyHelperClass();
            structBufferWriter.close();
            MyHelperClass structBuffer = new MyHelperClass();
            int headerSize =(int)(Object) structBuffer.size() + nbFiles.length();
//            MyHelperClass Charsets = new MyHelperClass();
            packStream.write(Integer.toString(headerSize).getBytes((String)(Object)Charsets.ISO_8859_1));
            packStream.write('\0');
//            MyHelperClass Charsets = new MyHelperClass();
            packStream.write(nbFiles.getBytes((String)(Object)Charsets.ISO_8859_1));
//            MyHelperClass structBuffer = new MyHelperClass();
            structBuffer.writeTo(packStream);
//            MyHelperClass structBufferWriter = new MyHelperClass();
            structBufferWriter = null;
//            MyHelperClass structBuffer = new MyHelperClass();
            structBuffer = null;
            FileInputStream in = new FileInputStream(tmpFile);
            try {
                MyHelperClass FILE_COPY_BUFFER_LEN = new MyHelperClass();
                byte[] buffer = new byte[(int)(Object)FILE_COPY_BUFFER_LEN];
                int read;
                while ((read = in.read(buffer)) > 0) packStream.write(buffer, 0, read);
                packStream.flush();
                packStream.close();
            } finally {
                MyHelperClass Utilities = new MyHelperClass();
                Utilities.closeStream(in);
            }
        } finally {
            MyHelperClass Utilities = new MyHelperClass();
            Utilities.closeStream(packStream);
        }
        MyHelperClass Utilities = new MyHelperClass();
        if (tmpFile.isFile()) Utilities.deleteFile(tmpFile);
//        MyHelperClass packPath = new MyHelperClass();
        packPath = null;
        MyHelperClass structBuffer = new MyHelperClass();
        structBuffer = null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ISO_8859_1;
public MyHelperClass closeStream(FileOutputStream o0){ return null; }
	public MyHelperClass getBytes(MyHelperClass o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass deleteFile(File o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass writeTo(FileOutputStream o0){ return null; }
	public MyHelperClass closeStream(FileInputStream o0){ return null; }}
