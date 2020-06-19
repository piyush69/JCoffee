


class c9983757 {

    public static void copyFiles(String strPath, String dstPath) throws IOException {
        File src = new File(strPath);
        File dest = new File(dstPath);
        if ((boolean)(Object)src.isDirectory()) {
            dest.mkdirs();
            String list[] =(String[])(Object) src.list();
            for (int i = 0; i < list.length; i++) {
                MyHelperClass File = new MyHelperClass();
                String dest1 =(int)(Object) dest.getAbsolutePath() + (int)(Object)File.separatorChar + list[i];
//                MyHelperClass File = new MyHelperClass();
                String src1 =(int)(Object) src.getAbsolutePath() + (int)(Object)File.separatorChar + list[i];
                copyFiles(src1, dest1);
            }
        } else {
            FileInputStream fin = new FileInputStream(src);
            FileOutputStream fout = new FileOutputStream(dest);
            int c;
            while ((c =(int)(Object) fin.read()) >= 0) fout.write(c);
            fin.close();
            fout.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separatorChar;
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(){}
	File(String o0){}
	public MyHelperClass list(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
