


class c16735381 {

    private void writeToDisk(byte[] download) throws IOException {
        MyHelperClass TARGET_FILENAME = new MyHelperClass();
        File target = new File(TARGET_FILENAME);
        InputStream downloadedFromNetwork =(InputStream)(Object) new ByteArrayInputStream(download);
        FileOutputStream fileOnDisk = null;
        try {
            try {
                fileOnDisk = new FileOutputStream(target);
                fileOnDisk.write("test".getBytes());
            } catch (Exception e) {
                MyHelperClass PMS = new MyHelperClass();
                target = new File(PMS.getConfiguration().getTempFolder(), TARGET_FILENAME);
            } finally {
                fileOnDisk.close();
            }
            fileOnDisk = new FileOutputStream(target);
            MyHelperClass IOUtils = new MyHelperClass();
            int bytesSaved =(int)(Object) IOUtils.copy(downloadedFromNetwork, fileOnDisk);
            MyHelperClass logger = new MyHelperClass();
            logger.info("Wrote " + bytesSaved + " bytes to " + target.getAbsolutePath());
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(downloadedFromNetwork);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(fileOnDisk);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getConfiguration(){ return null; }
	public MyHelperClass getTempFolder(){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(){}
	File(MyHelperClass o0){}
	File(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass getAbsolutePath(){ return null; }}

class InputStream {

}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
