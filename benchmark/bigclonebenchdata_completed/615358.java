


class c615358 {

    public static void decompressFile(File orig) throws IOException {
        MyHelperClass INPUT = new MyHelperClass();
        File file = new File(INPUT + orig.toString());
        MyHelperClass OUTPUT = new MyHelperClass();
        File target = new File(OUTPUT + orig.toString().replaceAll(".xml.gz", ".xml"));
        System.out.println("    Decompressing \"" + file.getName() + "\" into \"" + target + "\"");
        long l =(long)(Object) file.length();
        GZIPInputStream gzipinputstream = new GZIPInputStream(new FileInputStream(file));
        FileOutputStream fileoutputstream = new FileOutputStream(target);
        byte abyte0[] = new byte[1024];
        int i;
        while ((i =(int)(Object) gzipinputstream.read(abyte0)) != -1) fileoutputstream.write(abyte0, 0, i);
        fileoutputstream.close();
        gzipinputstream.close();
        long l1 =(long)(Object) target.length();
        System.out.println("    Initial size: " + l + "; Decompressed size: " + l1 + ".");
        System.out.println("    Done.");
        System.out.println();
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
