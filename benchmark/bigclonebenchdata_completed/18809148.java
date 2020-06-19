


class c18809148 {

    public static void moveOutputAsmFile(File inputLocation, File outputLocation) throws Exception {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(inputLocation);
            outputStream = new FileOutputStream(outputLocation);
            byte buffer[] = new byte[1024];
            while ((int)(Object)inputStream.available() > 0) {
                int read =(int)(Object) inputStream.read(buffer);
                outputStream.write(buffer, 0, read);
            }
            inputLocation.delete();
        } finally {
            MyHelperClass IOUtil = new MyHelperClass();
            IOUtil.closeAndIgnoreErrors(inputStream);
//            MyHelperClass IOUtil = new MyHelperClass();
            IOUtil.closeAndIgnoreErrors(outputStream);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeAndIgnoreErrors(FileOutputStream o0){ return null; }
	public MyHelperClass closeAndIgnoreErrors(FileInputStream o0){ return null; }}

class File {

public MyHelperClass delete(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass available(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}
