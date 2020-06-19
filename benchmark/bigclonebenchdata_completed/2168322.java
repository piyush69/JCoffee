


class c2168322 {

    public static File unGzip(File infile, boolean deleteGzipfileOnSuccess) throws IOException {
        GZIPInputStream gin = new GZIPInputStream(new FileInputStream(infile));
        File outFile = new File(infile.getParent(), infile.getName().replaceAll("\\.gz$", ""));
        FileOutputStream fos = new FileOutputStream(outFile);
        byte[] buf = new byte[100000];
        int len;
        while ((len =(int)(Object) gin.read(buf)) > 0) fos.write(buf, 0, len);
        gin.close();
        fos.close();
        if (deleteGzipfileOnSuccess) infile.delete();
        return outFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replaceAll(String o0, String o1){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass getName(){ return null; }}

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
