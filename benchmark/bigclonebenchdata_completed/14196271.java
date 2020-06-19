


class c14196271 {
public MyHelperClass ERRORS;
	public MyHelperClass I18NStatusFactory;

    private synchronized File zipTempFile(File tempFile) throws BlogunityException {
        try {
            MyHelperClass BlogunityManager = new MyHelperClass();
            File zippedFile = new File(BlogunityManager.getSystemConfiguration().getTempDir(), tempFile.getName() + ".zip");
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zippedFile));
            byte[] readBuffer = new byte[2156];
            int bytesIn = 0;
            FileInputStream fis = new FileInputStream(tempFile);
            ZipEntry anEntry = new ZipEntry(tempFile.getName());
            zos.putNextEntry(anEntry);
            while ((bytesIn =(int)(Object) fis.read(readBuffer)) != -1) {
                zos.write(readBuffer, 0, bytesIn);
            }
            fis.close();
            zos.close();
            return zippedFile;
        } catch (Exception e) {
            throw new BlogunityException((String)(Object)I18NStatusFactory.create(ERRORS.FEED_ZIP_FAILED, e));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FEED_ZIP_FAILED;
public MyHelperClass getTempDir(){ return null; }
	public MyHelperClass create(MyHelperClass o0, Exception o1){ return null; }
	public MyHelperClass getSystemConfiguration(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass getName(){ return null; }}

class BlogunityException extends Exception{
	public BlogunityException(String errorMessage) { super(errorMessage); }
}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}}
