


class c17999564 {

    public static void decompressFile(File f) throws IOException {
        File target = new File(f.toString().substring(0, f.toString().length() - 3));
        System.out.print("Decompressing: " + f.getName() + ".. ");
        long initialSize =(long)(Object) f.length();
        GZIPInputStream in = new GZIPInputStream(new FileInputStream(f));
        FileOutputStream fos = new FileOutputStream(target);
        byte[] buf = new byte[1024];
        int read;
        while ((read =(int)(Object) in.read(buf)) != -1) {
            fos.write(buf, 0, read);
        }
        System.out.println("Done.");
        fos.close();
        in.close();
        long endSize =(long)(Object) target.length();
        System.out.println("Initial size: " + initialSize + "; Decompressed size: " + endSize);
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

class GZIPInputStream {

GZIPInputStream(FileInputStream o0){}
	GZIPInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
