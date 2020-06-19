


class c4579205 {

    public static void copyFile(String source, String destination) throws IOException {
        File srcDir = new File(source);
        File[] files =(File[])(Object) srcDir.listFiles();
        FileChannel in = null;
        FileChannel out = null;
        for (File file : files) {
            try {
                in =(FileChannel)(Object) (new FileInputStream(file).getChannel());
                File outFile = new File(destination, file.getName());
                out =(FileChannel)(Object) (new FileOutputStream(outFile).getChannel());
                in.transferTo(0, in.size(), out);
            } finally {
                if (in != null) in.close();
                if (out != null) out.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	File(String o0, MyHelperClass o1){}
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
