


class c20254498 {

    public static void main(String[] args) throws IOException {
        PrintStream filesTxt = new PrintStream(new BufferedOutputStream(new FileOutputStream("temp/index/files.txt")));
        MyHelperClass Constants = new MyHelperClass();
        String[] files =(String[])(Object) (new File(Constants.INDEX_PATH).list());
        for (int i = 0; i < files.length; i++) {
            String f = files[i];
            if (f.equals("deletable") || f.startsWith(".")) continue;
//            MyHelperClass Constants = new MyHelperClass();
            FileInputStream in = new FileInputStream(new File(Constants.INDEX_PATH, f));
            MyHelperClass targetDir = new MyHelperClass();
            FileOutputStream out = new FileOutputStream((String)(Object)new File(targetDir, f + ".t"));
            byte[] buf = new byte[16384];
            int n;
            while ((n =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, n);
            in.close();
            out.close();
            filesTxt.println(f);
        }
        filesTxt.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INDEX_PATH;
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class PrintStream {

PrintStream(){}
	PrintStream(BufferedOutputStream o0){}
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	File(MyHelperClass o0){}
	public MyHelperClass list(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
