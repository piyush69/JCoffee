


class c3156435 {

    public static void fileCopy(File src, File dst) throws FileNotFoundException, IOException {
        if ((boolean)(Object)src.isDirectory() && (!(Boolean)(Object)dst.exists() || (boolean)(Object)dst.isDirectory())) {
            if (!(Boolean)(Object)dst.exists()) {
                if (!(Boolean)(Object)dst.mkdirs()) throw new IOException("unable to mkdir " + dst);
            }
            File dst1 = new File(dst, src.getName());
            if (!(Boolean)(Object)dst1.exists() && !(Boolean)(Object)dst1.mkdir()) throw new IOException("unable to mkdir " + dst1);
            dst = dst1;
            File[] files =(File[])(Object) src.listFiles();
            for (File f : files) {
                if ((boolean)(Object)f.isDirectory()) {
                    dst1 = new File(dst, f.getName());
                    if (!(Boolean)(Object)dst1.exists() && !(Boolean)(Object)dst1.mkdir()) throw new IOException("unable to mkdir " + dst1);
                } else {
                    dst1 = dst;
                }
                fileCopy(f, dst1);
            }
            return;
        } else if ((boolean)(Object)dst.isDirectory()) {
            dst = new File(dst, src.getName());
        }
        FileChannel ic =(FileChannel)(Object) (new FileInputStream(src).getChannel());
        FileChannel oc =(FileChannel)(Object) (new FileOutputStream(dst).getChannel());
        ic.transferTo(0, ic.size(), oc);
        ic.close();
        oc.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
