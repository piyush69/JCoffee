


class c19922657 {

    protected static boolean copyFile(File src, File dest) {
        try {
            if (!(Boolean)(Object)dest.exists()) {
                dest.createNewFile();
            }
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest);
            byte[] temp = new byte[1024 * 8];
            int readSize = 0;
            do {
                readSize =(int)(Object) fis.read(temp);
                fos.write(temp, 0, readSize);
            } while (readSize == temp.length);
            temp = null;
            fis.close();
            fos.flush();
            fos.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
