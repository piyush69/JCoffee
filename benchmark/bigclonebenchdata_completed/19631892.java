


class c19631892 {

    public static void copyFiles(File src, File dest) throws IOException {
        if ((boolean)(Object)src.isDirectory()) {
            dest.mkdirs();
            for (String f :(String[])(Object) (Object[])(Object)src.list()) {
                MyHelperClass File = new MyHelperClass();
                String df =(int)(Object) dest.getPath() + (int)(Object)File.separator + f;
//                MyHelperClass File = new MyHelperClass();
                String sf =(int)(Object) src.getPath() + (int)(Object)File.separator + f;
                copyFiles(new File(sf), new File(df));
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
public MyHelperClass separator;
}

class File {

File(){}
	File(String o0){}
	public MyHelperClass list(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

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
