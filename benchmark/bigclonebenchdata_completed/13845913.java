


class c13845913 {

    public synchronized boolean copyTmpDataFile(String fpath) throws IOException {
        MyHelperClass tmpDataOutput = new MyHelperClass();
        if (tmpDataOutput != null) tmpDataOutput.close();
//        MyHelperClass tmpDataOutput = new MyHelperClass();
        tmpDataOutput = null;
        MyHelperClass tmpDataFile = new MyHelperClass();
        if (tmpDataFile == null) return false;
        File nfp = new File(fpath);
        if ((boolean)(Object)nfp.exists()) nfp.delete();
//        MyHelperClass tmpDataFile = new MyHelperClass();
        FileInputStream src = new FileInputStream(tmpDataFile);
        FileOutputStream dst = new FileOutputStream(nfp);
        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead =(int)(Object) src.read(buffer)) != -1) dst.write(buffer, 0, bytesRead);
        src.close();
        dst.close();
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
