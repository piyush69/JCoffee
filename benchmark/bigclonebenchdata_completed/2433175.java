


class c2433175 {

    private void copyFile(File orig, File dest) {
        byte[] buffer = new byte[1024];
        try {
            FileInputStream fis = new FileInputStream(orig);
            FileOutputStream fos = new FileOutputStream(dest, true);
            int readBytes = 0;
            do {
                readBytes =(int)(Object) fis.read(buffer);
                if (readBytes > 0) fos.write(buffer, 0, readBytes);
            } while (readBytes > 0);
            fos.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
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

FileOutputStream(File o0, boolean o1){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
