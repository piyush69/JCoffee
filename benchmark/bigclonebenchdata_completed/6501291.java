


class c6501291 {

    public static void extractFile(String input, String output) throws ZipException, IOException {
        FileReader reader = new FileReader(input);
        InputStream in =(InputStream)(Object) reader.getInputStream();
        OutputStream out =(OutputStream)(Object) new FileOutputStream(new File(output));
        byte[] buf = new byte[512];
        int len;
        while ((len =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, len);
        reader.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ZipException extends Exception{
	public ZipException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileReader {

FileReader(String o0){}
	FileReader(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class File {

File(String o0){}
	File(){}}
