


class c14783945 {

    public static String compressFile(String fileName) throws IOException {
        String newFileName = fileName + ".gz";
        FileInputStream fis = new FileInputStream(fileName);
        FileOutputStream fos = new FileOutputStream(newFileName);
        GZIPOutputStream gzos = new GZIPOutputStream(fos);
        byte[] buf = new byte[10000];
        int bytesRead;
        while ((bytesRead =(int)(Object) fis.read(buf)) > 0) gzos.write(buf, 0, bytesRead);
        fis.close();
        gzos.close();
        return newFileName;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
