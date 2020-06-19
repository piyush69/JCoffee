


class c2033320 {

    public static void gunzip(File gzippedFile, File destinationFile) throws IOException {
        int buffer = 2048;
        FileInputStream in = new FileInputStream(gzippedFile);
        GZIPInputStream zipin = new GZIPInputStream(in);
        byte[] data = new byte[buffer];
        FileOutputStream out = new FileOutputStream(destinationFile);
        int length;
        while ((length =(int)(Object) zipin.read(data, 0, buffer)) != -1) out.write(data, 0, length);
        out.close();
        zipin.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class GZIPInputStream {

GZIPInputStream(FileInputStream o0){}
	GZIPInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
