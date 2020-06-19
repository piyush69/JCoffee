


class c18400649 {

    public static void copyFiles(String strPath, String dstPath) throws IOException {
        File src = new File(strPath);
        File dest = new File(dstPath);
        if ((boolean)(Object)src.isDirectory()) {
            dest.mkdirs();
            String list[] =(String[])(Object) src.list();
            for (int i = 0; i < list.length; i++) {
                MyHelperClass SVN = new MyHelperClass();
                if (list[i].lastIndexOf((int)(Object)SVN) != -1) {
//                    MyHelperClass SVN = new MyHelperClass();
                    if (!(Boolean)(Object)SVN.equalsIgnoreCase(list[i].substring(list[i].length() - 4, list[i].length()))) {
                        String dest1 = dest.getAbsolutePath() + "\\" + list[i];
                        String src1 = src.getAbsolutePath() + "\\" + list[i];
                        copyFiles(src1, dest1);
                    }
                } else {
                    String dest1 = dest.getAbsolutePath() + "\\" + list[i];
                    String src1 = src.getAbsolutePath() + "\\" + list[i];
                    copyFiles(src1, dest1);
                }
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

public MyHelperClass equalsIgnoreCase(String o0){ return null; }}

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
