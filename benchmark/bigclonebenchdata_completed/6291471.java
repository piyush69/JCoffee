


class c6291471 {

    private void copyFile(File f) throws IOException {
        MyHelperClass destdir = new MyHelperClass();
        File newFile = new File(destdir + "/" + f.getName());
        newFile.createNewFile();
        FileInputStream fin = new FileInputStream(f);
        FileOutputStream fout = new FileOutputStream(newFile);
        int c;
        while ((c =(int)(Object) fin.read()) != -1) fout.write(c);
        fin.close();
        fout.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

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
