


class c20023016 {

    private void copy(File from, File to) throws IOException {
        InputStream in =(InputStream)(Object) new FileInputStream(from);
        OutputStream out =(OutputStream)(Object) new FileOutputStream(to);
        byte[] line = new byte[16384];
        int bytes = -1;
        while ((bytes =(int)(Object) in.read(line)) != -1) out.write(line, 0, bytes);
        in.close();
        out.close();
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

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
