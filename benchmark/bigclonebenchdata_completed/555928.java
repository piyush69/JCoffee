


class c555928 {

    private static File copyFileTo(File file, File directory) throws IOException {
        File newFile = new File(directory, file.getName());
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream(newFile);
            byte buff[] = new byte[1024];
            int val;
            while ((val =(int)(Object) fis.read(buff)) > 0) fos.write(buff, 0, val);
        } finally {
            if (fis != null) fis.close();
            if (fos != null) fos.close();
        }
        return newFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(File o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass getName(){ return null; }}

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
