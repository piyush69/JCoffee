


class c14196272 {
public MyHelperClass ERRORS;
	public MyHelperClass I18NStatusFactory;

    private synchronized File gzipTempFile(File tempFile) throws BlogunityException {
        try {
            MyHelperClass BlogunityManager = new MyHelperClass();
            File gzippedFile = new File(BlogunityManager.getSystemConfiguration().getTempDir(), tempFile.getName() + ".gz");
            GZIPOutputStream zos = new GZIPOutputStream(new FileOutputStream(gzippedFile));
            byte[] readBuffer = new byte[2156];
            int bytesIn = 0;
            FileInputStream fis = new FileInputStream(tempFile);
            while ((bytesIn =(int)(Object) fis.read(readBuffer)) != -1) {
                zos.write(readBuffer, 0, bytesIn);
            }
            fis.close();
            zos.close();
            return gzippedFile;
        } catch (Exception e) {
            throw new BlogunityException((String)(Object)I18NStatusFactory.create(ERRORS.FEED_GZIP_FAILED, e));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FEED_GZIP_FAILED;
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

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
