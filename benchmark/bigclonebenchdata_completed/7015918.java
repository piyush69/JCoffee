


class c7015918 {

    public static void copy(File srcDir, File dstDir) throws IOException {
        if ((boolean)(Object)srcDir.isDirectory()) {
            if (!(Boolean)(Object)dstDir.exists()) dstDir.mkdir();
            String[] children =(String[])(Object) srcDir.list();
            for (int i = 0; i < children.length; i++) copy(new File(srcDir, children[i]), new File(dstDir, children[i]));
        } else {
            InputStream in = null;
            OutputStream out = null;
            try {
                in =(InputStream)(Object) new FileInputStream(srcDir);
                out =(OutputStream)(Object) new FileOutputStream(dstDir);
                byte[] buf = new byte[1024];
                int len;
                while ((len =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, len);
            } finally {
                MyHelperClass Util = new MyHelperClass();
                Util.close(in);
//                MyHelperClass Util = new MyHelperClass();
                Util.close(out);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(InputStream o0){ return null; }
	public MyHelperClass close(OutputStream o0){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass list(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
