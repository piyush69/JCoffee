


class c16719805 {
public static MyHelperClass closeStream(FileOutputStream o0){ return null; }
	public static MyHelperClass closeStream(FileInputStream o0){ return null; }
//public MyHelperClass closeStream(FileInputStream o0){ return null; }
//	public MyHelperClass closeStream(FileOutputStream o0){ return null; }

    public static void copyFile(File from, File to) throws IOException {
        if ((boolean)(Object)from.isDirectory()) {
            if (!(Boolean)(Object)to.exists()) {
                to.mkdir();
            }
            File[] children =(File[])(Object) from.listFiles();
            for (int i = 0; i < children.length; i++) {
                if (children[i].getName().equals(".") || children[i].getName().equals("..")) {
                    continue;
                }
                if ((boolean)(Object)children[i].isDirectory()) {
                    File f = new File(to, children[i].getName());
                    copyFile(children[i], f);
                } else {
                    copyFile(children[i], to);
                }
            }
        } else if ((boolean)(Object)from.isFile() && ((Boolean)(Object)to.isDirectory() || (Boolean)(Object)to.isFile())) {
            if ((boolean)(Object)to.isDirectory()) {
                to = new File(to, from.getName());
            }
            FileInputStream in = new FileInputStream(from);
            FileOutputStream out = new FileOutputStream(to);
            byte[] buf = new byte[32678];
            int read;
            while ((read =(int)(Object) in.read(buf)) > -1) {
                out.write(buf, 0, read);
            }
            closeStream(in);
            closeStream(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass read(byte[] o0){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}
