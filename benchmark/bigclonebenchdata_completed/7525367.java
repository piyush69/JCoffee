


class c7525367 {

    public static void streamCopyFile(File srcFile, File destFile) {
        try {
            FileInputStream fi = new FileInputStream(srcFile);
            FileOutputStream fo = new FileOutputStream(destFile);
            byte[] buf = new byte[1024];
            int readLength = 0;
            while (readLength != -1) {
                readLength =(int)(Object) fi.read(buf);
                if (readLength != -1) {
                    fo.write(buf, 0, readLength);
                }
            }
            fo.close();
            fi.close();
        } catch (Exception e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
