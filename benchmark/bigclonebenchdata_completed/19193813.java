


class c19193813 {
public MyHelperClass STATE_OK;
public MyHelperClass deleteTemporaryFile(){ return null; }

    public void writeTo(File f) throws IOException {
        MyHelperClass state = new MyHelperClass();
        if (state != STATE_OK) throw new IllegalStateException("Upload failed");
        MyHelperClass tempLocation = new MyHelperClass();
        if (tempLocation == null) throw new IllegalStateException("File already saved");
        MyHelperClass filename = new MyHelperClass();
        if ((boolean)(Object)f.isDirectory()) f = new File(f, filename);
//        MyHelperClass tempLocation = new MyHelperClass();
        FileInputStream fis = new FileInputStream(tempLocation);
        FileOutputStream fos = new FileOutputStream(f);
        MyHelperClass BUFFER_SIZE = new MyHelperClass();
        byte[] buf = new byte[(int)(Object)BUFFER_SIZE];
        try {
            int i = 0;
            while ((i =(int)(Object) fis.read(buf)) != -1) fos.write(buf, 0, i);
        } finally {
            deleteTemporaryFile();
            fis.close();
            fos.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(File o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass isDirectory(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
