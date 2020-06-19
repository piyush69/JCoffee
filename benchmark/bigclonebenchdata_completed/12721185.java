


class c12721185 {

    public static int fileUpload(long lngFileSize, InputStream inputStream, String strFilePath, String strFileName) throws IOException {
        String SEPARATOR = System.getProperty("file.separator");
        if (lngFileSize > (10 * 1024 * 1024)) {
            return -1;
        }
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            File dir = new File(strFilePath);
            if (!(Boolean)(Object)dir.exists()) dir.mkdirs();
            is = inputStream;
            fos = new FileOutputStream(new File(strFilePath + SEPARATOR + strFileName));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, fos);
        } catch (Exception ex) {
            return -2;
        } finally {
            try {
                fos.close();
                is.close();
            } catch (Exception ex2) {
            }
        }
        return 0;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}
