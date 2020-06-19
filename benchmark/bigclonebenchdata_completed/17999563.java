


class c17999563 {

    public static void compressFile(File f) throws IOException {
        File target = new File(f.toString() + ".gz");
        System.out.print("Compressing: " + f.getName() + ".. ");
        long initialSize =(long)(Object) f.length();
        FileInputStream fis = new FileInputStream(f);
        GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(target));
        byte[] buf = new byte[1024];
        int read;
        while ((read =(int)(Object) fis.read(buf)) != -1) {
            out.write(buf, 0, read);
        }
        System.out.println("Done.");
        fis.close();
        out.close();
        long endSize =(long)(Object) target.length();
        System.out.println("Initial size: " + initialSize + "; Compressed size: " + endSize);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass length(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
