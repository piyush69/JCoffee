


class c18681935 {

    public static void copyFromOffset(long offset, File exe, File cab) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream(exe));
        FileOutputStream out = new FileOutputStream(cab);
        byte[] buffer = new byte[4096];
        int bytes_read;
        in.skipBytes((int) offset);
        while ((bytes_read =(int)(Object) in.read(buffer)) != -1) out.write(buffer, 0, bytes_read);
        in.close();
        out.close();
        in = null;
        out = null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DataInputStream {

DataInputStream(){}
	DataInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass skipBytes(int o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
