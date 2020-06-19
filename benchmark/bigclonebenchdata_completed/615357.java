


class c615357 {

    public static void compressFile(File orig) throws IOException {
        MyHelperClass INPUT = new MyHelperClass();
        File file = new File(INPUT + orig.toString());
        MyHelperClass OUTPUT = new MyHelperClass();
        File target = new File(OUTPUT + orig.toString().replaceAll(".xml", ".xml.gz"));
        System.out.println("    Compressing \"" + file.getName() + "\" into \"" + target + "\"");
        long l =(long)(Object) file.length();
        FileInputStream fileinputstream = new FileInputStream(file);
        GZIPOutputStream gzipoutputstream = new GZIPOutputStream(new FileOutputStream(target));
        byte abyte0[] = new byte[1024];
        int i;
        while ((i =(int)(Object) fileinputstream.read(abyte0)) != -1) gzipoutputstream.write(abyte0, 0, i);
        fileinputstream.close();
        gzipoutputstream.close();
        long l1 =(long)(Object) target.length();
        System.out.println("    Initial size: " + l + "; Compressed size: " + l1 + ".");
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
