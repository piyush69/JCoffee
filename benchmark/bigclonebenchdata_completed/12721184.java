


class c12721184 {

    public static int fileCopy(String strSourceFilePath, String strDestinationFilePath, String strFileName) throws IOException {
        String SEPARATOR = System.getProperty("file.separator");
        File dir = new File(strSourceFilePath);
        if (!(Boolean)(Object)dir.exists()) dir.mkdirs();
        File realDir = new File(strDestinationFilePath);
        if (!(Boolean)(Object)realDir.exists()) realDir.mkdirs();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File(strSourceFilePath + SEPARATOR + strFileName));
            fos = new FileOutputStream(new File(strDestinationFilePath + SEPARATOR + strFileName));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(fis, fos);
        } catch (Exception ex) {
            return -1;
        } finally {
            try {
                fos.close();
                fis.close();
            } catch (Exception ex2) {
            }
        }
        return 0;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, FileOutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
