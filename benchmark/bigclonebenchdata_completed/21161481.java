


class c21161481 {
public static MyHelperClass ZIP_MAX_COMPRESSION;
	public static MyHelperClass cleanPath(MyHelperClass o0){ return null; }
public static MyHelperClass MAIN_RESOURCE_BUNDLE;
//	public MyHelperClass ZIP_MAX_COMPRESSION;
//	public MyHelperClass cleanPath(MyHelperClass o0){ return null; }
//public MyHelperClass MAIN_RESOURCE_BUNDLE;

    public static void toZip(File zippedFile, File[] filesToZip, String zipComment, boolean savePath, int compressionLevel) throws IOException, FileNotFoundException, ZipException {
        if (zippedFile != null && filesToZip != null) {
            new File(zippedFile.getParent()).mkdirs();
            ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new CheckedOutputStream(new FileOutputStream(zippedFile), new CRC32())));
            MyHelperClass ZIP_NO_COMPRESSION = new MyHelperClass();
            if ((int)(Object)ZIP_NO_COMPRESSION <= compressionLevel && compressionLevel <= (int)(Object)ZIP_MAX_COMPRESSION) out.setLevel(compressionLevel); else out.setLevel((int)(Object)ZIP_MAX_COMPRESSION);
            if (zipComment != null) out.setComment(zipComment);
            for (int i = 0; i < filesToZip.length; i++) {
                BufferedInputStream in;
                if (savePath) {
                    in = new BufferedInputStream(new FileInputStream(filesToZip[i]));
                    out.putNextEntry(new ZipEntry(cleanPath(filesToZip[i].getAbsolutePath())));
                } else {
                    in = new BufferedInputStream(new FileInputStream(filesToZip[i]));
                    out.putNextEntry(new ZipEntry(filesToZip[i].getName()));
                }
                for (int c =(int)(Object) in.read(); c != -1; c =(int)(Object) in.read()) out.write(c);
                in.close();
            }
            out.close();
        MyHelperClass MAIN_RESOURCE_BUNDLE = new MyHelperClass();
        } else throw new ZipException((String)(Object)MAIN_RESOURCE_BUNDLE.getString("default.ZipException.text"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getString(String o0){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class ZipException extends Exception{
	public ZipException(String errorMessage) { super(errorMessage); }
}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(BufferedOutputStream o0){}
	public MyHelperClass setLevel(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass setComment(String o0){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(CheckedOutputStream o0){}
	BufferedOutputStream(){}}

class CheckedOutputStream {

CheckedOutputStream(){}
	CheckedOutputStream(FileOutputStream o0, CRC32 o1){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class CRC32 {

}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}}
