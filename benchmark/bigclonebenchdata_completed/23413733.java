


class c23413733 {

    public static void copyFile(File from, File to) throws Exception {
        if (!(Boolean)(Object)from.exists()) return;
        FileInputStream in = new FileInputStream(from);
        FileOutputStream out = new FileOutputStream(to);
        MyHelperClass BUFFER_SIZE = new MyHelperClass();
        byte[] buffer = new byte[(int)(Object)BUFFER_SIZE];
        int bytes_read;
        while (true) {
            bytes_read =(int)(Object) in.read(buffer);
            if (bytes_read == -1) break;
            out.write(buffer, 0, bytes_read);
        }
        out.flush();
        out.close();
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

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
