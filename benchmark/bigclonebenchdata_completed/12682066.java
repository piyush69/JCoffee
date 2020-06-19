


class c12682066 {

    public static void decompressGZIP(File gzip, File to, long skip) throws IOException {
        GZIPInputStream gis = null;
        BufferedOutputStream bos = null;
        try {
            bos = new BufferedOutputStream(new FileOutputStream(to));
            FileInputStream fis = new FileInputStream(gzip);
            fis.skip(skip);
            gis = new GZIPInputStream(fis);
            MyHelperClass IO_BUFFER = new MyHelperClass();
            final byte[] buffer = new byte[(int)(Object)IO_BUFFER];
            int read = -1;
            while ((read =(int)(Object) gis.read(buffer)) != -1) {
                bos.write(buffer, 0, read);
            }
        } finally {
            try {
                gis.close();
            } catch (Exception nope) {
            }
            try {
                bos.flush();
            } catch (Exception nope) {
            }
            try {
                bos.close();
            } catch (Exception nope) {
            }
        }
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

class GZIPInputStream {

GZIPInputStream(FileInputStream o0){}
	GZIPInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass skip(long o0){ return null; }}
