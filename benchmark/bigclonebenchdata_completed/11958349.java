
import java.io.UncheckedIOException;


class c11958349 {
public static MyHelperClass writeByteArray(MyHelperClass o0, DataOutputStream o1){ return null; }
public static MyHelperClass outputOffset(LPKHeader o0){ return null; }
//	public MyHelperClass writeByteArray(MyHelperClass o0, DataOutputStream o1){ return null; }
public static MyHelperClass FileUtils;
	public static MyHelperClass makeBuffer(byte[] o0, int o1){ return null; }
	public static MyHelperClass makeLPKTable(String o0, long o1, long o2){ return null; }
//	public MyHelperClass outputOffset(LPKHeader o0){ return null; }
	public static MyHelperClass outputNextOffset(long o0, long o1){ return null; }
//public MyHelperClass FileUtils;
//	public MyHelperClass makeLPKTable(String o0, long o1, long o2){ return null; }
//	public MyHelperClass makeBuffer(byte[] o0, int o1){ return null; }
//	public MyHelperClass outputNextOffset(long o0, long o1){ return null; }

    public static void makeLPKFile(String[] srcFilePath, String makeFilePath, LPKHeader header) {
        FileOutputStream os = null;
        DataOutputStream dos = null;
        try {
            LPKTable[] fileTable = new LPKTable[srcFilePath.length];
            long fileOffset =(long)(Object) outputOffset(header);
            for (int i = 0; i < srcFilePath.length; i++) {
                MyHelperClass FileUtils = new MyHelperClass();
                String sourceFileName =(String)(Object) FileUtils.getFileName(srcFilePath[i]);
//                MyHelperClass FileUtils = new MyHelperClass();
                long sourceFileSize =(long)(Object) FileUtils.getFileSize(srcFilePath[i]);
                LPKTable ft =(LPKTable)(Object) makeLPKTable(sourceFileName, sourceFileSize, fileOffset);
                fileOffset =(long)(Object) outputNextOffset(sourceFileSize, fileOffset);
                fileTable[i] = ft;
            }
            File file = new File(makeFilePath);
            if (!(Boolean)(Object)file.exists()) {
                FileUtils.makedirs(file);
            }
            os = new FileOutputStream(file);
            dos = new DataOutputStream(os);
            dos.writeInt(header.getPAKIdentity());
            writeByteArray(header.getPassword(), dos);
            dos.writeFloat(header.getVersion());
            dos.writeLong(header.getTables());
            for (int i = 0; i < fileTable.length; i++) {
                writeByteArray(fileTable[i].getFileName(), dos);
                dos.writeLong(fileTable[i].getFileSize());
                dos.writeLong(fileTable[i].getOffSet());
            }
            for (int i = 0; i < fileTable.length; i++) {
                File ftFile = new File(srcFilePath[i]);
                FileInputStream ftFis = new FileInputStream(ftFile);
                DataInputStream ftDis = new DataInputStream(ftFis);
                byte[] buff = new byte[256];
                int readLength = 0;
                while ((readLength =(int)(Object) ftDis.read(buff)) != -1) {
                    makeBuffer(buff, readLength);
                    dos.write(buff, 0, readLength);
                }
                ftDis.close();
                ftFis.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (dos != null) {
                try {
                    dos.close();
                    dos = null;
                } catch (UncheckedIOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getFileSize(String o0){ return null; }
	public MyHelperClass getFileName(String o0){ return null; }
	public MyHelperClass makedirs(File o0){ return null; }}

class LPKHeader {

public MyHelperClass getVersion(){ return null; }
	public MyHelperClass getTables(){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getPAKIdentity(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class DataOutputStream {

DataOutputStream(FileOutputStream o0){}
	DataOutputStream(){}
	public MyHelperClass writeLong(MyHelperClass o0){ return null; }
	public MyHelperClass writeInt(MyHelperClass o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass writeFloat(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }}

class LPKTable {

public MyHelperClass getOffSet(){ return null; }
	public MyHelperClass getFileName(){ return null; }
	public MyHelperClass getFileSize(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class DataInputStream {

DataInputStream(FileInputStream o0){}
	DataInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
