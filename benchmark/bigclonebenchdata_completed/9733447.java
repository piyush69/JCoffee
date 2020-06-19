


class c9733447 {

    public static void unzipFile(File zipFile, File destFile, boolean removeSrcFile) throws Exception {
        ZipInputStream zipinputstream = new ZipInputStream(new FileInputStream(zipFile));
        ZipEntry zipentry =(ZipEntry)(Object) zipinputstream.getNextEntry();
        int BUFFER_SIZE = 4096;
        while (zipentry != null) {
            String entryName =(String)(Object) zipentry.getName();
            MyHelperClass log = new MyHelperClass();
            log.info("<<<<<< ZipUtility.unzipFile - Extracting: " + zipentry.getName());
            File newFile = null;
            if ((boolean)(Object)destFile.isDirectory()) newFile = new File(destFile, entryName); else newFile = destFile;
            MyHelperClass File = new MyHelperClass();
            if ((boolean)(Object)zipentry.isDirectory() || entryName.endsWith(File.separator + ".")) {
                newFile.mkdirs();
            } else {
                MyHelperClass ByteBuffer = new MyHelperClass();
                ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocate(BUFFER_SIZE);
                byte[] bufferArray =(byte[])(Object) buffer.array();
                MyHelperClass FileUtilities = new MyHelperClass();
                FileUtilities.createDirectory(newFile.getParentFile());
                FileChannel destinationChannel =(FileChannel)(Object) (new FileOutputStream(newFile).getChannel());
                while (true) {
                    buffer.clear();
                    int lim =(int)(Object) zipinputstream.read(bufferArray);
                    if (lim == -1) break;
                    buffer.flip();
                    buffer.limit(lim);
                    destinationChannel.write(buffer);
                }
                destinationChannel.close();
                zipinputstream.closeEntry();
            }
            zipentry =(ZipEntry)(Object) zipinputstream.getNextEntry();
        }
        zipinputstream.close();
        if (removeSrcFile) {
            if ((boolean)(Object)zipFile.exists()) zipFile.delete();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass createDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass allocate(int o0){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(FileInputStream o0){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class ByteBuffer {

public MyHelperClass array(){ return null; }
	public MyHelperClass flip(){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass limit(int o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
