


class c3236017 {

    public static void copyFile(String source, String dest) throws IOException {
        FileChannel in = null, out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(new File(source)).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(new File(dest)).getChannel());
            in.transferTo(0, in.size(), out);
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
