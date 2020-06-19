


class c4407823 {
public static MyHelperClass iLog;
//public MyHelperClass iLog;

    public static void copyFolderStucture(String strPath, String dstPath) throws IOException {
        iLog.LogInfoLine("copying " + strPath);
        File src = new File(strPath);
        File dest = new File(dstPath);
        if ((boolean)(Object)src.isDirectory()) {
            dest.mkdirs();
            String list[] =(String[])(Object) src.list();
            for (int i = 0; i < list.length; i++) {
                String dest1 = dest.getAbsolutePath() + "\\" + list[i];
                String src1 = src.getAbsolutePath() + "\\" + list[i];
                copyFolderStucture(src1, dest1);
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

public MyHelperClass LogInfoLine(String o0){ return null; }}

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
