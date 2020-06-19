


class c10254165 {
public MyHelperClass getSubFiles(File o0){ return null; }
public MyHelperClass CryptionControl;
	public MyHelperClass getAbsFileName(String o0, File o1){ return null; }

    public void zipFile(String baseDir, String fileName, boolean encrypt) throws Exception {
        List fileList =(List)(Object) getSubFiles(new File(baseDir));
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(fileName + ".temp"));
        ZipEntry ze = null;
        MyHelperClass BUFFER = new MyHelperClass();
        byte[] buf = new byte[(int)(Object)BUFFER];
        MyHelperClass encrypLength = new MyHelperClass();
        byte[] encrypByte = new byte[(int)(Object)encrypLength];
        int readLen = 0;
        for (int i = 0; i < (int)(Object)fileList.size(); i++) {
            MyHelperClass stopZipFile = new MyHelperClass();
            if ((boolean)(Object)stopZipFile) {
                zos.close();
                File zipFile = new File(fileName + ".temp");
                if ((boolean)(Object)zipFile.exists()) zipFile.delete();
                break;
            }
            File f = (File)(File)(Object) fileList.get(i);
            if (f.getAbsoluteFile().equals(fileName + ".temp")) continue;
            ze = new ZipEntry(getAbsFileName(baseDir, f));
            ze.setSize(f.length());
            ze.setTime(f.lastModified());
            zos.putNextEntry(ze);
            InputStream is =(InputStream)(Object) new BufferedInputStream(new FileInputStream(f));
//            MyHelperClass BUFFER = new MyHelperClass();
            readLen =(int)(Object) is.read(buf, 0, BUFFER);
            if (encrypt) {
//                MyHelperClass encrypLength = new MyHelperClass();
                if (readLen >= (int)(Object)encrypLength) {
//                    MyHelperClass encrypLength = new MyHelperClass();
                    System.arraycopy(buf, 0, encrypByte, 0,(int)(Object) encrypLength);
                } else if (readLen > 0) {
                    MyHelperClass Arrays = new MyHelperClass();
                    Arrays.fill(encrypByte, (byte) 0);
                    System.arraycopy(buf, 0, encrypByte, 0, readLen);
//                    MyHelperClass encrypLength = new MyHelperClass();
                    readLen =(int)(Object) encrypLength;
                }
                MyHelperClass rootKey = new MyHelperClass();
                byte[] temp =(byte[])(Object) CryptionControl.getInstance().encryptoECB(encrypByte, rootKey);
//                MyHelperClass encrypLength = new MyHelperClass();
                System.arraycopy(temp, 0, buf, 0,(int)(Object) encrypLength);
            }
            while (readLen != -1) {
                zos.write(buf, 0, readLen);
//                MyHelperClass BUFFER = new MyHelperClass();
                readLen =(int)(Object) is.read(buf, 0, BUFFER);
            }
            is.close();
        }
        zos.close();
        File zipFile = new File(fileName + ".temp");
        if ((boolean)(Object)zipFile.exists()) zipFile.renameTo(new File(fileName + ".zip"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fill(byte[] o0, byte o1){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass encryptoECB(byte[] o0, MyHelperClass o1){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsoluteFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}
	public MyHelperClass setTime(MyHelperClass o0){ return null; }
	public MyHelperClass setSize(MyHelperClass o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
