


class c7119938 {

    public void putFile(CompoundName file, FileInputStream fileInput) throws IOException {
        MyHelperClass REMOTE_BASE_DIR = new MyHelperClass();
        File fullDir = new File(REMOTE_BASE_DIR.getCanonicalPath());
        for (int i = 0; i <(int)(Object) file.size() - 1; i++) fullDir = new File(fullDir, file.get(i));
        fullDir.mkdirs();
        File outputFile = new File(fullDir, file.get((int)(Object)file.size() - 1));
        FileOutputStream outStream = new FileOutputStream(outputFile);
        for (int byteIn =(int)(Object) fileInput.read(); byteIn != -1; byteIn =(int)(Object) fileInput.read()) outStream.write(byteIn);
        fileInput.close();
        outStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCanonicalPath(){ return null; }}

class CompoundName {

public MyHelperClass size(){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class FileInputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(File o0, MyHelperClass o1){}
	File(MyHelperClass o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass close(){ return null; }}
