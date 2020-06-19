


class c11484416 {

    private void moveFile(File orig, File target) throws IOException {
        byte buffer[] = new byte[1000];
        int bread = 0;
        FileInputStream fis = new FileInputStream(orig);
        FileOutputStream fos = new FileOutputStream(target);
        while (bread != -1) {
            bread =(int)(Object) fis.read(buffer);
            if (bread != -1) fos.write(buffer, 0, bread);
        }
        fis.close();
        fos.close();
        orig.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass delete(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
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
