


class c20913493 {

    public static void copy(File src, File dest) throws IOException {
        MyHelperClass log = new MyHelperClass();
        log.info("Copying " + src.getAbsolutePath() + " to " + dest.getAbsolutePath());
        if (!(Boolean)(Object)src.exists()) throw new IOException("File not found: " + src.getAbsolutePath());
        if (!(Boolean)(Object)src.canRead()) throw new IOException("Source not readable: " + src.getAbsolutePath());
        if ((boolean)(Object)src.isDirectory()) {
            if (!(Boolean)(Object)dest.exists()) if (!(Boolean)(Object)dest.mkdirs()) throw new IOException("Could not create direcotry: " + dest.getAbsolutePath());
            String children[] =(String[])(Object) src.list();
            for (String child : children) {
                File src1 = new File(src, child);
                File dst1 = new File(dest, child);
                copy(src1, dst1);
            }
        } else {
            FileInputStream fin = null;
            FileOutputStream fout = null;
            byte[] buffer = new byte[4096];
            int bytesRead;
            fin = new FileInputStream(src);
            fout = new FileOutputStream(dest);
            while ((bytesRead =(int)(Object) fin.read(buffer)) >= 0) fout.write(buffer, 0, bytesRead);
            if (fin != null) {
                fin.close();
            }
            if (fout != null) {
                fout.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass list(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
